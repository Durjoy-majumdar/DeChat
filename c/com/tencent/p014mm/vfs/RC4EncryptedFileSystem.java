package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import f40.C86709a0;
import f40.C86718e;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import p823sg.C77710q;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.vfs.RC4EncryptedFileSystem */
public class RC4EncryptedFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<RC4EncryptedFileSystem> CREATOR = new C116238a();

    /* renamed from: e */
    public final FileSystem f348818e;

    /* renamed from: f */
    public final C116281f0.C116284d f348819f;

    /* renamed from: g */
    public final String f348820g;

    /* renamed from: com.tencent.mm.vfs.RC4EncryptedFileSystem$a */
    public class C116238a implements Parcelable.Creator<RC4EncryptedFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new RC4EncryptedFileSystem(parcel, (C116238a) null);
        }

        public Object[] newArray(int i) {
            return new RC4EncryptedFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.RC4EncryptedFileSystem$b */
    public class C116239b extends C116301h2 {

        /* renamed from: f */
        public final Key f348821f;

        public C116239b(FileSystem.C85995c cVar, Key key) {
            super(cVar);
            this.f348821f = key;
        }

        /* renamed from: B */
        public boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
            if (cVar instanceof C116239b) {
                C116239b bVar = (C116239b) cVar;
                RC4EncryptedFileSystem rC4EncryptedFileSystem = RC4EncryptedFileSystem.this;
                C116281f0.C116284d dVar = rC4EncryptedFileSystem.f348819f;
                RC4EncryptedFileSystem rC4EncryptedFileSystem2 = RC4EncryptedFileSystem.this;
                if (dVar == rC4EncryptedFileSystem2.f348819f && rC4EncryptedFileSystem.f348820g.equals(rC4EncryptedFileSystem2.f348820g) && bVar.f348821f.equals(this.f348821f)) {
                    FileSystem.C85995c cVar2 = this.f349014e;
                    if (cVar2 instanceof C116264a) {
                        return ((C116264a) cVar2).mo177582B(str, bVar.f349014e, str2);
                    }
                }
            }
            return super.mo177582B(str, cVar, str2);
        }

        /* renamed from: f */
        public int mo119936f() {
            return this.f349014e.mo119936f() & -19;
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            Key key = this.f348821f;
            if (key == null) {
                throw new FileNotFoundException("Key is not initialized.");
            } else if (!z) {
                try {
                    Cipher instance = Cipher.getInstance("RC4");
                    instance.init(1, key);
                    return new CipherOutputStream(this.f349014e.mo119941m(str, false), instance);
                } catch (GeneralSecurityException e) {
                    throw ((FileNotFoundException) new FileNotFoundException("Failed to initialize cipher: " + e.getMessage()).initCause(e));
                }
            } else {
                throw new FileNotFoundException("Appending encrypted files is not supported.");
            }
        }

        public InputStream openRead(String str) {
            Key key = this.f348821f;
            if (key != null) {
                try {
                    Cipher instance = Cipher.getInstance("RC4");
                    instance.init(2, key);
                    return new CipherInputStream(this.f349014e.openRead(str), instance);
                } catch (GeneralSecurityException e) {
                    throw ((FileNotFoundException) new FileNotFoundException("Failed to initialize cipher: " + e.getMessage()).initCause(e));
                }
            } else {
                throw new FileNotFoundException("Key is not initialized.");
            }
        }

        public String toString() {
            return "rc4 <- " + this.f349014e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return RC4EncryptedFileSystem.this;
        }

        /* renamed from: z */
        public long mo177589z(String str, FileSystem.C85995c cVar, String str2, boolean z) {
            if (cVar instanceof C116239b) {
                C116239b bVar = (C116239b) cVar;
                RC4EncryptedFileSystem rC4EncryptedFileSystem = RC4EncryptedFileSystem.this;
                C116281f0.C116284d dVar = rC4EncryptedFileSystem.f348819f;
                RC4EncryptedFileSystem rC4EncryptedFileSystem2 = RC4EncryptedFileSystem.this;
                if (dVar == rC4EncryptedFileSystem2.f348819f && rC4EncryptedFileSystem.f348820g.equals(rC4EncryptedFileSystem2.f348820g) && bVar.f348821f.equals(this.f348821f)) {
                    FileSystem.C85995c cVar2 = this.f349014e;
                    if (cVar2 instanceof C116264a) {
                        return ((C116264a) cVar2).mo177589z(str, bVar.f349014e, str2, z);
                    }
                }
            }
            return super.mo177589z(str, cVar, str2, z);
        }
    }

    public RC4EncryptedFileSystem(FileSystem fileSystem, String str) {
        C116281f0.C116284d dVar = C116281f0.f348952F;
        this.f348819f = dVar;
        if (dVar != null) {
            this.f348818e = fileSystem;
            this.f348820g = str;
            return;
        }
        throw new RuntimeException("Set global generator by calling setKeyGenerator(...) before initializing FileSystem objects.");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "rc4 <- " + this.f348818e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        SecretKeySpec secretKeySpec;
        C116281f0.C116284d dVar = this.f348819f;
        String str = this.f348820g;
        ((VFSStrategy$$b) dVar).getClass();
        if (map.get("account") == null) {
            secretKeySpec = null;
        } else {
            Log.m105924i("VFS.Debug", "KeyGen.generate: " + str);
            String i = MMApplicationContext.isMainProcess() ? C86709a0.m107523b().mo121111i() : new C77710q(C86718e.m107549h()).toString();
            secretKeySpec = new SecretKeySpec(C90193h.m112879g((i + str).getBytes()), "RC4");
        }
        if (secretKeySpec != null) {
            return new C116239b((FileSystem.C85995c) this.f348818e.mo177578v(map), secretKeySpec);
        }
        throw new RuntimeException("Cannot generate key.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, RC4EncryptedFileSystem.class, 3);
        parcel.writeParcelable(this.f348818e, i);
        parcel.writeString(this.f348820g);
    }

    public RC4EncryptedFileSystem(Parcel parcel, C116238a aVar) {
        C116299g2.m163845a(parcel, RC4EncryptedFileSystem.class, 3);
        C116281f0.C116284d dVar = C116281f0.f348952F;
        this.f348819f = dVar;
        if (dVar != null) {
            this.f348818e = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
            this.f348820g = parcel.readString();
            return;
        }
        throw new RuntimeException("Set global generator by calling setGlobalKeyGenerator(...) before initializing FileSystem objects.");
    }
}
