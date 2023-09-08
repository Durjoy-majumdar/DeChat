package com.tencent.worddetect;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine;
import com.tencent.worddetect.WordDetectNative;
import java.nio.ByteBuffer;
import wl2.C15520i;
import xl2.C102690c;
import xl2.C23100a;

/* renamed from: com.tencent.worddetect.a */
public class C20118a {

    /* renamed from: a */
    public static boolean f57008a;

    /* renamed from: b */
    public static WordDetectNative f57009b;

    /* renamed from: c */
    public static WordDetectNative.ConfigParam f57010c;

    /* renamed from: d */
    public static C15520i f57011d;

    /* renamed from: com.tencent.worddetect.a$a */
    public interface C20119a {

        /* renamed from: a */
        public static final WordDetectNative.WordDetectDetailResult f57012a = new WordDetectNative.WordDetectDetailResult();
    }

    /* renamed from: com.tencent.worddetect.a$b */
    public interface C20120b {
    }

    /* renamed from: a */
    public static byte[] m21900a(Bitmap bitmap) {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            byte[] bArr = new byte[((array.length / 4) * 3)];
            for (int i = 0; i < array.length / 4; i++) {
                int i2 = i * 3;
                int i3 = i * 4;
                bArr[i2] = array[i3 + 2];
                bArr[i2 + 1] = array[i3 + 1];
                bArr[i2 + 2] = array[i3];
            }
            return bArr;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m21901b(C20120b bVar, WordDetectNative.WordDetectDetailResult wordDetectDetailResult) {
        if (bVar != null) {
            C23100a aVar = (C23100a) bVar;
            if (wordDetectDetailResult != null) {
                aVar.f66375b.f273350f.put(aVar.f66374a, wordDetectDetailResult);
            }
            ImageWordScanDetailEngine.m119539a(aVar.f66375b, aVar.f66374a, new C102690c(wordDetectDetailResult));
        }
    }
}
