package com.tencent.p014mm.sdk.platformtools;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.sdk.platformtools.LVBuffer */
public class LVBuffer {

    /* renamed from: BE */
    private static final byte f347903BE = 123;

    /* renamed from: ED */
    private static final byte f347904ED = 125;
    public static final int LENGTH_ALLOC_PER_NEW = 4096;
    public static final int MAX_STRING_LENGTH = 3072;
    private ByteBuffer byteBuffer;
    private boolean isBuildBuffer;

    private int check(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        if (bArr[0] != 123) {
            return -2;
        }
        return bArr[bArr.length + -1] != 125 ? -3 : 0;
    }

    private int checkBuffer(int i) {
        if (this.byteBuffer.limit() - this.byteBuffer.position() > i) {
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.byteBuffer.limit() + 4096);
        allocate.put(this.byteBuffer.array(), 0, this.byteBuffer.position());
        this.byteBuffer = allocate;
        return 0;
    }

    public byte[] buildFinish() {
        if (this.isBuildBuffer) {
            checkBuffer(1);
            this.byteBuffer.put(f347904ED);
            int position = this.byteBuffer.position();
            byte[] bArr = new byte[position];
            System.arraycopy(this.byteBuffer.array(), 0, bArr, 0, position);
            return bArr;
        }
        throw new Exception("Buffer For Parse");
    }

    public boolean checkGetFinish() {
        return this.byteBuffer.limit() - this.byteBuffer.position() <= 1;
    }

    public byte[] getBuffer() {
        if (!this.isBuildBuffer) {
            int i = this.byteBuffer.getShort();
            if (i > 3072) {
                this.byteBuffer = null;
                throw new Exception("Buffer String Length Error");
            } else if (i == 0) {
                return new byte[0];
            } else {
                byte[] bArr = new byte[i];
                this.byteBuffer.get(bArr, 0, i);
                return bArr;
            }
        } else {
            throw new Exception("Buffer For Build");
        }
    }

    public int getInt() {
        if (!this.isBuildBuffer) {
            return this.byteBuffer.getInt();
        }
        throw new Exception("Buffer For Build");
    }

    public long getLong() {
        if (!this.isBuildBuffer) {
            return this.byteBuffer.getLong();
        }
        throw new Exception("Buffer For Build");
    }

    public String getString() {
        if (!this.isBuildBuffer) {
            int i = this.byteBuffer.getShort();
            if (i > 3072) {
                this.byteBuffer = null;
                throw new Exception("Buffer String Length Error");
            } else if (i == 0) {
                return "";
            } else {
                byte[] bArr = new byte[i];
                this.byteBuffer.get(bArr, 0, i);
                return new String(bArr, "UTF-8");
            }
        } else {
            throw new Exception("Buffer For Build");
        }
    }

    public int initBuild() {
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        this.byteBuffer = allocate;
        allocate.put(f347903BE);
        this.isBuildBuffer = true;
        return 0;
    }

    public int initParse(byte[] bArr) {
        if (check(bArr) != 0) {
            this.byteBuffer = null;
            return -1;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.byteBuffer = wrap;
        wrap.position(1);
        this.isBuildBuffer = false;
        return 0;
    }

    public int putBuffer(byte[] bArr) {
        if (this.isBuildBuffer) {
            if (bArr == null) {
                bArr = null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            if (bArr.length <= 3072) {
                checkBuffer(bArr.length + 2);
                this.byteBuffer.putShort((short) bArr.length);
                if (bArr.length > 0) {
                    this.byteBuffer.put(bArr);
                }
                return 0;
            }
            throw new Exception("Buffer String Length Error");
        }
        throw new Exception("Buffer For Parse");
    }

    public int putInt(int i) {
        if (this.isBuildBuffer) {
            checkBuffer(4);
            this.byteBuffer.putInt(i);
            return 0;
        }
        throw new Exception("Buffer For Parse");
    }

    public int putLong(long j) {
        if (this.isBuildBuffer) {
            checkBuffer(8);
            this.byteBuffer.putLong(j);
            return 0;
        }
        throw new Exception("Buffer For Parse");
    }

    public int putString(String str) {
        if (this.isBuildBuffer) {
            byte[] bArr = null;
            if (str != null) {
                bArr = str.getBytes();
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            if (bArr.length <= 3072) {
                checkBuffer(bArr.length + 2);
                this.byteBuffer.putShort((short) bArr.length);
                if (bArr.length > 0) {
                    this.byteBuffer.put(bArr);
                }
                return 0;
            }
            throw new Exception("Buffer String Length Error");
        }
        throw new Exception("Buffer For Parse");
    }

    public void skipPosition(int i) {
        ByteBuffer byteBuffer2 = this.byteBuffer;
        byteBuffer2.position(i + byteBuffer2.position());
    }

    public void skipString() {
        if (!this.isBuildBuffer) {
            short s = this.byteBuffer.getShort();
            if (s > 3072) {
                this.byteBuffer = null;
                throw new Exception("Buffer String Length Error");
            } else if (s != 0) {
                ByteBuffer byteBuffer2 = this.byteBuffer;
                byteBuffer2.position(byteBuffer2.position() + s);
            }
        } else {
            throw new Exception("Buffer For Build");
        }
    }
}
