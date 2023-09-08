package mc2;

import android.nfc.Tag;
import android.nfc.tech.NfcA;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.ExportErrorStatus;
import kc2.C46686a;
import kc2.C46687b;
import kc2.C46688c;
import nc2.C47222a;
import org.json.JSONObject;

/* renamed from: mc2.c */
public class C46994c implements C46995d {

    /* renamed from: a */
    public NfcA f126352a;

    public C46994c(Tag tag) {
        this.f126352a = NfcA.get(tag);
    }

    /* renamed from: c */
    public static JSONObject m52311c(Tag tag) {
        NfcA nfcA = NfcA.get(tag);
        if (nfcA == null) {
            Log.m105928w("MicroMsg.ApduEngineNfcA", "lo-nfc-getInfoJsonObject: get nfcA null");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("atqa", C47222a.m52527a(nfcA.getAtqa()));
        short sak = nfcA.getSak();
        jSONObject.put("sak", C47222a.m52527a(new byte[]{(byte) ((sak >>> 8) & 255), (byte) (sak & 255)}));
        return jSONObject;
    }

    /* renamed from: a */
    public C46688c mo72183a(C46686a aVar) {
        if (this.f126352a != null) {
            connect();
            C46688c cVar = null;
            while (true) {
                C46688c cVar2 = new C46688c(this.f126352a.transceive((byte[]) aVar.f125688d.clone()));
                byte[] bArr = cVar2.f125690d;
                if (bArr.length == 0) {
                    return cVar;
                }
                if (bArr.length - 2 < 0) {
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
                    byte[] bArr4 = cVar2.f125690d;
                    if (((short) (bArr4[bArr4.length - 1] & ExifInterface.MARKER)) != 0) {
                        aVar = new C46686a((byte[]) C46687b.f125689a.clone());
                    } else {
                        byte[] bArr5 = cVar.f125690d;
                        bArr5[bArr5.length - 1] = (byte) ExportErrorStatus.RENDER_SAMPLE_BUFFER;
                        return cVar;
                    }
                }
            }
        } else {
            Log.m105920e("MicroMsg.ApduEngineNfcA", "[NFC]NfcA is null");
            throw new IllegalStateException("NfcA is null");
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
            if (this.f126352a.isConnected()) {
                this.f126352a.close();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApduEngineNfcA", e, (String) null, new Object[0]);
        }
    }

    public boolean connect() {
        try {
            if (this.f126352a.isConnected()) {
                return true;
            }
            this.f126352a.connect();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApduEngineNfcA", e, (String) null, new Object[0]);
            return false;
        }
    }

    public boolean isConnected() {
        try {
            return this.f126352a.isConnected();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApduEngineNfcA", e, (String) null, new Object[0]);
            return false;
        }
    }
}
