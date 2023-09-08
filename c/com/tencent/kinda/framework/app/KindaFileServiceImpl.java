package com.tencent.kinda.framework.app;

import android.content.res.AssetManager;
import com.tencent.kinda.gen.KFileService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class KindaFileServiceImpl implements KFileService {
    public byte[] getData(String str) {
        byte[] bArr = new byte[0];
        try {
            AssetManager assets = MMApplicationContext.getContext().getAssets();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assets.open("kinda-strings/" + str), StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    String sb4 = sb.toString();
                    byte[] bytes = sb4.getBytes();
                    Log.m105918d("kinda KindaFileServiceImpl", "读取kinda的字符串资源文件结果是：" + sb4);
                    return bytes;
                }
            }
        } catch (IOException e) {
            Log.m105920e("kinda KindaFileServiceImpl", "kinda打开json资源文件时出错，错误信息是：" + e.getMessage());
            return bArr;
        }
    }
}
