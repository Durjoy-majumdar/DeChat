package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.ISeekableStream */
public interface ISeekableStream {
    public static final int SEEK_CUR = 1;
    public static final int SEEK_END = 2;
    public static final int SEEK_SET = 0;

    long seek(long j, int i);
}
