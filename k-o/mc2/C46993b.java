package mc2;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import kc2.C46686a;
import kc2.C46687b;
import kc2.C46688c;

/* renamed from: mc2.b */
public class C46993b implements C46995d {

    /* renamed from: a */
    public IsoDep f126351a;

    public C46993b(Tag tag) {
        if (tag != null) {
            this.f126351a = IsoDep.get(tag);
        } else {
            Log.m105920e("MicroMsg.ApduEngineIsoDep", "[NFC]tag is null");
            throw new IllegalStateException("tag is null");
        }
    }

    /* renamed from: a */
    public C46688c mo72183a(C46686a aVar) {
        if (this.f126351a != null) {
            connect();
            C46688c cVar = null;
            while (true) {
                C46688c cVar2 = new C46688c(this.f126351a.transceive((byte[]) aVar.f125688d.clone()));
                byte[] bArr = cVar2.f125690d;
                if (bArr.length == 0) {
                    return cVar;
                }
                if (bArr.length - 2 <= 0) {
                    return cVar2;
                }
                if (cVar2.mo71942b() == 108) {
                    byte[] bArr2 = cVar2.f125690d;
                    byte[] bArr3 = aVar.f125688d;
                    bArr3[bArr3.length - 1] = (byte) ((short) (bArr2[bArr2.length - 1] & ExifInterface.MARKER));
                } else {
                    if (cVar == null) {
                        cVar = cVar2;
                    } else {
                        cVar.mo71941a(cVar2);
                    }
                    if (cVar2.mo71942b() != 97) {
                        return cVar;
                    }
                    aVar = new C46686a((byte[]) C46687b.f125689a.clone());
                }
            }
        } else {
            Log.m105920e("MicroMsg.ApduEngineIsoDep", "[NFC]IsoDep is null");
            throw new IllegalStateException("IsoDep is null");
        }
    }

    /* renamed from: b */
    public boolean mo72184b() {
        close();
        connect();
        return true;
    }

    public void close() {
        try {
            if (this.f126351a.isConnected()) {
                this.f126351a.close();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApduEngineIsoDep", e, (String) null, new Object[0]);
        }
    }

    public boolean connect() {
        try {
            if (this.f126351a.isConnected()) {
                return true;
            }
            this.f126351a.connect();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApduEngineIsoDep", e, (String) null, new Object[0]);
            return false;
        }
    }

    public boolean isConnected() {
        try {
            return this.f126351a.isConnected();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApduEngineIsoDep", e, (String) null, new Object[0]);
            return false;
        }
    }
}
