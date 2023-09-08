package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new BitmapTeleporterCreator();
    private final int zzac;
    private final int zzal;
    private ParcelFileDescriptor zznb;
    private Bitmap zznc;
    private boolean zznd;
    private File zzne;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.zzal = i;
        this.zznb = parcelFileDescriptor;
        this.zzac = i2;
        this.zznc = null;
        this.zznd = false;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.zzal = 1;
        this.zznb = null;
        this.zzac = 0;
        this.zznc = bitmap;
        this.zznd = true;
    }

    private static void zza(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private final FileOutputStream zzcj() {
        File file = this.zzne;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.zznb = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    public Bitmap get() {
        if (!this.zznd) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zznb));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                zza(dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.zznc = createBitmap;
                this.zznd = true;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                zza(dataInputStream);
                throw th;
            }
        }
        return this.zznc;
    }

    public void release() {
        if (!this.zznd) {
            try {
                this.zznb.close();
            } catch (IOException unused) {
            }
        }
    }

    public void setTempDir(File file) {
        if (file != null) {
            this.zzne = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zznb == null) {
            Bitmap bitmap = this.zznc;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(zzcj()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                zza(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                zza(dataOutputStream);
                throw th;
            }
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzal);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zznb, i | 1, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzac);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        this.zznb = null;
    }
}
