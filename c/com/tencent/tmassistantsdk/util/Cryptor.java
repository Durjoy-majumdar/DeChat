package com.tencent.tmassistantsdk.util;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

public class Cryptor {
    public int contextStart;
    public int crypt;
    public boolean header = true;
    public byte[] key;
    public byte[] out;
    public int padding;
    public byte[] plain;
    public int pos;
    public int preCrypt;
    public byte[] prePlain;
    public Random random = new Random();

    private byte[] decipher(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        int i3 = 16;
        try {
            long unsignedInt = getUnsignedInt(bArr2, i2, 4);
            long unsignedInt2 = getUnsignedInt(bArr2, i2 + 4, 4);
            long unsignedInt3 = getUnsignedInt(this.key, 0, 4);
            long unsignedInt4 = getUnsignedInt(this.key, 4, 4);
            long unsignedInt5 = getUnsignedInt(this.key, 8, 4);
            long unsignedInt6 = getUnsignedInt(this.key, 12, 4);
            long j = 3816266640L;
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    unsignedInt2 = (unsignedInt2 - ((((unsignedInt << 4) + unsignedInt5) ^ (unsignedInt + j)) ^ ((unsignedInt >>> 5) + unsignedInt6))) & Util.MAX_32BIT_VALUE;
                    unsignedInt = (unsignedInt - ((((unsignedInt2 << 4) + unsignedInt3) ^ (unsignedInt2 + j)) ^ ((unsignedInt2 >>> 5) + unsignedInt4))) & Util.MAX_32BIT_VALUE;
                    j = (j - 2654435769L) & Util.MAX_32BIT_VALUE;
                    i3 = i4;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) unsignedInt);
                    dataOutputStream.writeInt((int) unsignedInt2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean decrypt8Bytes(byte[] bArr, int i, int i2) {
        this.pos = 0;
        while (true) {
            int i3 = this.pos;
            if (i3 >= 8) {
                byte[] decipher = decipher(this.prePlain);
                this.prePlain = decipher;
                if (decipher == null) {
                    return false;
                }
                this.contextStart += 8;
                this.crypt += 8;
                this.pos = 0;
                return true;
            } else if (this.contextStart + i3 >= i2) {
                return true;
            } else {
                byte[] bArr2 = this.prePlain;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[(this.crypt + i) + i3]);
                this.pos = i3 + 1;
            }
        }
    }

    private byte[] encipher(byte[] bArr) {
        byte[] bArr2 = bArr;
        int i = 16;
        try {
            long unsignedInt = getUnsignedInt(bArr2, 0, 4);
            long unsignedInt2 = getUnsignedInt(bArr2, 4, 4);
            long unsignedInt3 = getUnsignedInt(this.key, 0, 4);
            long unsignedInt4 = getUnsignedInt(this.key, 4, 4);
            long unsignedInt5 = getUnsignedInt(this.key, 8, 4);
            long unsignedInt6 = getUnsignedInt(this.key, 12, 4);
            long j = 0;
            while (true) {
                int i2 = i - 1;
                if (i > 0) {
                    j = (j + 2654435769L) & Util.MAX_32BIT_VALUE;
                    unsignedInt = (unsignedInt + ((((unsignedInt2 << 4) + unsignedInt3) ^ (unsignedInt2 + j)) ^ ((unsignedInt2 >>> 5) + unsignedInt4))) & Util.MAX_32BIT_VALUE;
                    unsignedInt2 = (unsignedInt2 + ((((unsignedInt << 4) + unsignedInt5) ^ (unsignedInt + j)) ^ ((unsignedInt >>> 5) + unsignedInt6))) & Util.MAX_32BIT_VALUE;
                    i = i2;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) unsignedInt);
                    dataOutputStream.writeInt((int) unsignedInt2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private void encrypt8Bytes() {
        this.pos = 0;
        while (true) {
            int i = this.pos;
            if (i >= 8) {
                break;
            }
            if (this.header) {
                byte[] bArr = this.plain;
                bArr[i] = (byte) (bArr[i] ^ this.prePlain[i]);
            } else {
                byte[] bArr2 = this.plain;
                bArr2[i] = (byte) (bArr2[i] ^ this.out[this.preCrypt + i]);
            }
            this.pos = i + 1;
        }
        System.arraycopy(encipher(this.plain), 0, this.out, this.crypt, 8);
        this.pos = 0;
        while (true) {
            int i2 = this.pos;
            if (i2 < 8) {
                byte[] bArr3 = this.out;
                int i3 = this.crypt + i2;
                bArr3[i3] = (byte) (bArr3[i3] ^ this.prePlain[i2]);
                this.pos = i2 + 1;
            } else {
                System.arraycopy(this.plain, 0, this.prePlain, 0, 8);
                int i4 = this.crypt;
                this.preCrypt = i4;
                this.crypt = i4 + 8;
                this.pos = 0;
                this.header = false;
                return;
            }
        }
    }

    private static long getUnsignedInt(byte[] bArr, int i, int i2) {
        int i3 = i2 > 8 ? i + 8 : i2 + i;
        long j = 0;
        while (i < i3) {
            j = (j << 8) | ((long) (bArr[i] & ExifInterface.MARKER));
            i++;
        }
        return (Util.MAX_32BIT_VALUE & j) | (j >>> 32);
    }

    private int rand() {
        return this.random.nextInt();
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return decrypt(bArr, 0, bArr.length, bArr2);
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) {
        return encrypt(bArr, 0, bArr.length, bArr2);
    }

    public byte[] decrypt(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 0;
        this.preCrypt = 0;
        this.crypt = 0;
        this.key = bArr2;
        int i4 = i + 8;
        byte[] bArr3 = new byte[i4];
        if (i2 % 8 != 0 || i2 < 16) {
            return null;
        }
        byte[] decipher = decipher(bArr, i);
        this.prePlain = decipher;
        byte b = decipher[0] & 7;
        this.pos = b;
        int i5 = (i2 - b) - 10;
        if (i5 < 0) {
            return null;
        }
        for (int i6 = i; i6 < i4; i6++) {
            bArr3[i6] = 0;
        }
        this.out = new byte[i5];
        this.preCrypt = 0;
        this.crypt = 8;
        this.contextStart = 8;
        this.pos++;
        this.padding = 1;
        while (true) {
            int i7 = this.padding;
            if (i7 <= 2) {
                int i8 = this.pos;
                if (i8 < 8) {
                    this.pos = i8 + 1;
                    this.padding = i7 + 1;
                }
                if (this.pos == 8) {
                    if (!decrypt8Bytes(bArr, i, i2)) {
                        return null;
                    }
                    bArr3 = bArr;
                }
            } else {
                while (i5 != 0) {
                    int i9 = this.pos;
                    if (i9 < 8) {
                        this.out[i3] = (byte) (bArr3[(this.preCrypt + i) + i9] ^ this.prePlain[i9]);
                        i3++;
                        i5--;
                        this.pos = i9 + 1;
                    }
                    if (this.pos == 8) {
                        this.preCrypt = this.crypt - 8;
                        if (!decrypt8Bytes(bArr, i, i2)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.padding = 1;
                while (this.padding < 8) {
                    int i15 = this.pos;
                    if (i15 < 8) {
                        if ((bArr3[(this.preCrypt + i) + i15] ^ this.prePlain[i15]) != 0) {
                            return null;
                        }
                        this.pos = i15 + 1;
                    }
                    if (this.pos == 8) {
                        this.preCrypt = this.crypt;
                        if (!decrypt8Bytes(bArr, i, i2)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.padding++;
                }
                return this.out;
            }
        }
    }

    public byte[] encrypt(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        byte[] bArr3 = new byte[8];
        this.plain = bArr3;
        this.prePlain = new byte[8];
        this.pos = 1;
        this.padding = 0;
        this.preCrypt = 0;
        this.crypt = 0;
        this.key = bArr2;
        this.header = true;
        int i4 = (i2 + 10) % 8;
        this.pos = i4;
        if (i4 != 0) {
            this.pos = 8 - i4;
        }
        this.out = new byte[(this.pos + i2 + 10)];
        bArr3[0] = (byte) ((rand() & WXWebReporter.KEY_TRY_FIX_DEX_FAILED) | this.pos);
        int i5 = 1;
        while (true) {
            i3 = this.pos;
            if (i5 > i3) {
                break;
            }
            this.plain[i5] = (byte) (rand() & 255);
            i5++;
        }
        this.pos = i3 + 1;
        for (int i6 = 0; i6 < 8; i6++) {
            this.prePlain[i6] = 0;
        }
        this.padding = 1;
        while (this.padding <= 2) {
            int i7 = this.pos;
            if (i7 < 8) {
                byte[] bArr4 = this.plain;
                this.pos = i7 + 1;
                bArr4[i7] = (byte) (rand() & 255);
                this.padding++;
            }
            if (this.pos == 8) {
                encrypt8Bytes();
            }
        }
        while (i2 > 0) {
            int i8 = this.pos;
            if (i8 < 8) {
                byte[] bArr5 = this.plain;
                this.pos = i8 + 1;
                bArr5[i8] = bArr[i];
                i2--;
                i++;
            }
            if (this.pos == 8) {
                encrypt8Bytes();
            }
        }
        this.padding = 1;
        while (true) {
            int i9 = this.padding;
            if (i9 > 7) {
                return this.out;
            }
            int i15 = this.pos;
            if (i15 < 8) {
                byte[] bArr6 = this.plain;
                this.pos = i15 + 1;
                bArr6[i15] = 0;
                this.padding = i9 + 1;
            }
            if (this.pos == 8) {
                encrypt8Bytes();
            }
        }
    }

    private byte[] decipher(byte[] bArr) {
        return decipher(bArr, 0);
    }
}
