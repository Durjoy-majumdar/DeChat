package androidx.camera.core.impl.utils;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    public final int mLength;
    public int mPosition;

    public ByteOrderedDataInputStream(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public int available() {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    public void mark(int i) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    public int read() {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    public boolean readBoolean() {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    public byte readByte() {
        int i = this.mPosition + 1;
        this.mPosition = i;
        if (i <= this.mLength) {
            int read = this.mDataInputStream.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public char readChar() {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.mPosition + i2;
        this.mPosition = i3;
        if (i3 > this.mLength) {
            throw new EOFException();
        } else if (this.mDataInputStream.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public int readInt() {
        int i = this.mPosition + 4;
        this.mPosition = i;
        if (i <= this.mLength) {
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            int read3 = this.mDataInputStream.read();
            int read4 = this.mDataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.mByteOrder;
                if (byteOrder == LITTLE_ENDIAN) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == BIG_ENDIAN) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.mByteOrder);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    public long readLong() {
        int i = this.mPosition + 8;
        this.mPosition = i;
        if (i <= this.mLength) {
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            int read3 = this.mDataInputStream.read();
            int read4 = this.mDataInputStream.read();
            int read5 = this.mDataInputStream.read();
            int read6 = this.mDataInputStream.read();
            int read7 = this.mDataInputStream.read();
            int read8 = this.mDataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.mByteOrder;
                if (byteOrder == LITTLE_ENDIAN) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read2;
                if (byteOrder == BIG_ENDIAN) {
                    return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.mByteOrder);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public short readShort() {
        int i = this.mPosition + 2;
        this.mPosition = i;
        if (i <= this.mLength) {
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.mByteOrder;
                if (byteOrder == LITTLE_ENDIAN) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == BIG_ENDIAN) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.mByteOrder);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public String readUTF() {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    public int readUnsignedByte() {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return ((long) readInt()) & Util.MAX_32BIT_VALUE;
    }

    public int readUnsignedShort() {
        int i = this.mPosition + 2;
        this.mPosition = i;
        if (i <= this.mLength) {
            int read = this.mDataInputStream.read();
            int read2 = this.mDataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.mByteOrder;
                if (byteOrder == LITTLE_ENDIAN) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == BIG_ENDIAN) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.mByteOrder);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public void seek(long j) {
        int i = this.mPosition;
        if (((long) i) > j) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j -= (long) i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    public int skipBytes(int i) {
        int min = Math.min(i, this.mLength - this.mPosition);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.mDataInputStream.skipBytes(min - i2);
        }
        this.mPosition += i2;
        return i2;
    }

    public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int available = dataInputStream.available();
        this.mLength = available;
        this.mPosition = 0;
        dataInputStream.mark(available);
        this.mByteOrder = byteOrder;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.mDataInputStream.read(bArr, i, i2);
        this.mPosition += read;
        return read;
    }

    public void readFully(byte[] bArr) {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length > this.mLength) {
            throw new EOFException();
        } else if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public ByteOrderedDataInputStream(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr));
    }
}
