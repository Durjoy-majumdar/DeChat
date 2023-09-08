package mc2;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kc2.C46688c;
import lc2.C46846a;
import lc2.C46847b;

/* renamed from: mc2.a */
public class C46992a extends C46847b {

    /* renamed from: e */
    public static C46992a f126348e;

    /* renamed from: c */
    public Set<String> f126349c;

    /* renamed from: d */
    public C46995d f126350d = null;

    /* renamed from: c */
    public static C46992a m52304c() {
        if (f126348e == null) {
            f126348e = new C46992a();
        }
        return f126348e;
    }

    /* renamed from: a */
    public int mo72179a(Context context) {
        int d = mo72181d(context);
        if (d != 3 && d != 2) {
            return d;
        }
        try {
            C46995d dVar = this.f126350d;
            return (dVar == null || !dVar.connect() || !this.f126350d.isConnected()) ? 2 : 3;
        } catch (IOException e) {
            Log.m105920e("MicroMsg.ApduEngine", "[NFC] IOException : " + e.toString());
            return 2;
        }
    }

    /* renamed from: b */
    public boolean mo72180b(C46846a aVar) {
        if (this.f126350d == null) {
            Log.m105920e("MicroMsg.ApduEngine", "[NFC]ApduEngine not ready !");
            throw new IllegalStateException("ApduEngine not ready !");
        } else if (aVar == null || aVar.f126006f == null) {
            Log.m105920e("MicroMsg.ApduEngine", "[NFC]apdu is null !");
            throw new IllegalArgumentException("apdu is null !");
        } else {
            Log.m105924i("MicroMsg.ApduEngine", "[NFC][" + aVar.f126005e + "] do cmd : " + aVar.f126006f.toString());
            C46688c a = this.f126350d.mo72183a(aVar.f126006f);
            aVar.f126007g = a;
            byte[] bArr = a.f125690d;
            if (((short) (((short) (bArr[bArr.length + -1] & ExifInterface.MARKER)) | (a.mo71942b() << 8))) == -28672) {
                Log.m105924i("MicroMsg.ApduEngine", "[NFC][" + aVar.f126005e + "] result==> OK : " + aVar.f126007g.toString());
                return true;
            }
            Log.m105920e("MicroMsg.ApduEngine", "[NFC][" + aVar.f126005e + "] result==> fail : " + aVar.f126007g.toString());
            return false;
        }
    }

    /* renamed from: d */
    public int mo72181d(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null) {
            Log.m105924i("MicroMsg.ApduEngine", "[NFC] No nfc chip !");
            return 0;
        } else if (!defaultAdapter.isEnabled()) {
            return 1;
        } else {
            C46995d dVar = this.f126350d;
            if (dVar == null) {
                return 4;
            }
            if (dVar != null) {
                try {
                    if (dVar.isConnected()) {
                        return 3;
                    }
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.ApduEngine", "[NFC] IOException : " + e.toString());
                }
            }
            return 2;
        }
    }

    /* renamed from: e */
    public boolean mo72182e(Tag tag) {
        this.f126008a = tag;
        if (tag != null) {
            this.f126009b = tag.getId();
        }
        this.f126349c = new HashSet();
        for (String str : tag.getTechList()) {
            Log.m105918d("MicroMsg.ApduEngine", "[NFC]tech : " + str);
            this.f126349c.add(str);
        }
        try {
            C46995d dVar = this.f126350d;
            if (dVar != null && dVar.isConnected()) {
                this.f126350d.close();
            }
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.ApduEngine", e, "", new Object[0]);
            Log.m105920e("MicroMsg.ApduEngine", e.toString());
        }
        if (this.f126349c.contains(IsoDep.class.getName())) {
            this.f126350d = new C46993b(tag);
            return true;
        } else if (this.f126349c.contains(NfcA.class.getName())) {
            this.f126350d = new C46994c(tag);
            return true;
        } else {
            Log.m105924i("MicroMsg.ApduEngine", "[NFC]ApduEngine not support this tag");
            return false;
        }
    }
}
