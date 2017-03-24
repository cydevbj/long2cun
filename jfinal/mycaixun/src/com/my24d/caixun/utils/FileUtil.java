package com.my24d.caixun.utils;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class FileUtil {
	public static final FileUtil instance = new FileUtil();

    // 随机一个文件名
    public String randomFileName() {
        Date dt = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyMMddHHmmssSSS");
        String fileName = sdf.format(dt);
        return fileName;
    }

    /**
     * 修改文件名
     * @param filePath
     *            eg:D:/gai.jpg
     * @return
     */
    public String changeFileName(String parentPath, String fileName) {
        File file = new File(parentPath, fileName);// 指定文件名及路径
        String newname = randomFileName() + fileName;
        //文件夹位置
         File newFile = new File(parentPath, newname);
        file.renameTo(newFile); // 改名
        URI uri = newFile.toURI();
        System.out.print(uri.toString());
        return newname;
    }

}
