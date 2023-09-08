package ip0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ip0.e */
public class C87786e extends C87782b {

    /* renamed from: f */
    public OutputStream f254153f;

    /* renamed from: g */
    public C86009m1 f254154g;

    /* renamed from: a */
    public boolean mo122234a(boolean z, byte[] bArr, int i) {
        mo122233b(bArr, i, z);
        try {
            OutputStream outputStream = this.f254153f;
            if (outputStream == null) {
                return true;
            }
            outputStream.write(bArr);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public void close() {
        OutputStream outputStream = this.f254153f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f254153f.close();
            } catch (IOException unused) {
            }
            this.f254153f = null;
        }
    }

    public void flush() {
        mo122233b(new byte[0], 0, true);
    }

    public boolean init(String str, int i, int i2, int i3) {
        try {
            C86009m1 m1Var = new C86009m1(str);
            this.f254154g = m1Var;
            if (m1Var.mo119967g()) {
                this.f254154g.mo119966f();
            }
            this.f254154g.mo119964e();
            this.f254153f = new DataOutputStream(C86013q1.m106429K(str, false));
        } catch (Exception e) {
            Log.printInfoStack("Luggage.PCMAudioEncoder", "", e);
        }
        return true;
    }
}
