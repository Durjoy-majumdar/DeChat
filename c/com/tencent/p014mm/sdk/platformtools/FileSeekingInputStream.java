package com.tencent.p014mm.sdk.platformtools;

import java.io.FileInputStream;
import java.io.FilterInputStream;

/* renamed from: com.tencent.mm.sdk.platformtools.FileSeekingInputStream */
public class FileSeekingInputStream extends FilterInputStream {
    private long mMarkPosition = 0;

    public FileSeekingInputStream(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    public void mark(int i) {
        try {
            this.mMarkPosition = ((FileInputStream) this.in).getChannel().position();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FileSeekingInputStream", e, "Failed seeking FileChannel.", new Object[0]);
        }
    }

    public boolean markSupported() {
        return true;
    }

    public void reset() {
        ((FileInputStream) this.in).getChannel().position(this.mMarkPosition);
    }
}
