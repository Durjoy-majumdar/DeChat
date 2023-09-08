package p820q9;

import android.os.Handler;
import com.p013qq.p793wx.voice.embed.recognizer.Grammar;
import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;

/* renamed from: q9.e */
public class C47785e {

    /* renamed from: a */
    public Grammar f128318a;

    /* renamed from: b */
    public C47787g f128319b;

    /* renamed from: c */
    public byte[] f128320c;

    /* renamed from: d */
    public boolean f128321d;

    /* renamed from: e */
    public boolean f128322e;

    /* renamed from: q9.e$a */
    public class C47786a implements Runnable {
        public C47786a(byte b) {
        }

        public final void run() {
            C47787g gVar;
            int i;
            if (C47785e.this.f128318a.begin() != 0) {
                gVar = C47785e.this.f128319b;
                i = -102;
            } else {
                C47785e eVar = C47785e.this;
                Grammar grammar = eVar.f128318a;
                byte[] bArr = eVar.f128320c;
                if (grammar.recognize(bArr, bArr.length) != 0) {
                    gVar = C47785e.this.f128319b;
                    i = -103;
                } else if (C47785e.this.f128318a.end() != 0) {
                    gVar = C47785e.this.f128319b;
                    i = -104;
                } else {
                    C47780a aVar = new C47780a();
                    if (C47785e.this.f128318a.getResult(aVar) != 0) {
                        C47785e.this.f128319b.mo72565a(ZipJNI.UNZ_CRCERROR);
                    }
                    Handler handler = C47785e.this.f128319b.f128325b;
                    handler.sendMessage(handler.obtainMessage(200, aVar));
                    return;
                }
            }
            gVar.mo72565a(i);
        }
    }

    public C47785e() {
        this.f128318a = null;
        this.f128319b = new C47787g();
        this.f128320c = null;
        this.f128321d = false;
        this.f128322e = false;
        this.f128318a = new Grammar();
    }
}
