package com.linsh.lshutils.utils.Basic;

import android.database.Cursor;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Senh Linsh on 17/1/8.
 * <p>
 * 流对象处理的工具类
 */
public class LshIOUtils {

    /**
     * 关闭流对象
     */
    public static void close(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    /**
     * 关闭多个流对象
     */
    public static void close(Closeable... streams) {
        for (Closeable stream : streams) {
            close(stream);
        }
    }

    /**
     * 关闭流对象, 不打印关闭时抛出的异常
     */
    public static void closeQuietly(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException ignored) {
            }
        }
    }

    /**
     * 关闭多个流对象, 不打印关闭时抛出的异常
     */
    public static void closeQuietly(Closeable... streams) {
        for (Closeable stream : streams) {
            close(stream);
        }
    }
}
