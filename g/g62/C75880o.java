package g62;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import pe3.C47465a;

/* renamed from: g62.o */
public class C75880o {

    /* renamed from: a */
    public int f222527a = -1;

    /* renamed from: b */
    public int f222528b;

    /* renamed from: c */
    public long f222529c;

    /* renamed from: d */
    public int f222530d;

    /* renamed from: e */
    public byte[] f222531e;

    /* renamed from: f */
    public int f222532f;

    /* renamed from: g */
    public long f222533g;

    /* renamed from: h */
    public String f222534h;

    /* renamed from: i */
    public String f222535i;

    /* renamed from: j */
    public C47465a f222536j;

    public C75880o(int i) {
        this.f222530d = i;
    }

    /* renamed from: a */
    public byte[] mo106149a() {
        C47465a aVar;
        if (this.f222531e == null && (aVar = this.f222536j) != null) {
            try {
                this.f222531e = aVar.toByteArray();
            } catch (IOException e) {
                Log.m105920e("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: " + e.getMessage());
            }
        }
        return this.f222531e;
    }

    /* renamed from: b */
    public int mo58568b() {
        return this.f222530d;
    }
}
