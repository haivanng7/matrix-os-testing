package org.example;

import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathUtilsTest {

    @Test
    public void testBuildFilePath() {
        String folder = "config";
        String filename = "settings.xml";

        // Gọi hàm bị lỗi
        String actualPath = PathUtils.buildFilePath(folder, filename);

        // Đường dẫn chuẩn theo hệ điều hành đang chạy test
        String expectedPath = Paths.get(folder, filename).toString();

        // So sánh
        assertEquals(expectedPath, actualPath,
                "Đường dẫn không khớp với tiêu chuẩn của hệ điều hành hiện tại!");
    }
}