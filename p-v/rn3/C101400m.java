package rn3;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import nj3.C76879j;
import p158gt.C98201k;
import p910lj.C76701a;
import qo3.C77398g;
import zh3.C91753f;

/* renamed from: rn3.m */
public class C101400m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ MsgRetransmitUI f297008d;

    /* renamed from: rn3.m$a */
    public class C101401a implements DialogInterface.OnClickListener {
        public C101401a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C98201k.class;
            if (C101400m.this.f297008d.f285390x != null) {
                C97625j3.m125815e().mo123458d(C101400m.this.f297008d.f285390x);
                int i2 = (int) C101400m.this.f297008d.f285390x.f267272h;
                C92836k TO = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127173TO(i2);
                C92839m mVar = (C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi();
                C92836k TO2 = mVar.mo127173TO(i2);
                long j = (long) i2;
                if (TO2.f267374a == j) {
                    C86013q1.m106447h(mVar.mo127174TY(TO2.f267378e, "", "", true));
                    C86013q1.m106447h(mVar.mo127174TY(TO2.f267379f, "", "", true));
                    C86013q1.m106447h(mVar.mo127174TY(TO2.f267383j, "", "", true));
                    C86013q1.m106447h(mVar.mo127174TY(TO2.f267380g, "", "", true));
                    C86013q1.m106447h(mVar.mo127174TY(TO2.f267380g, "", "", true) + "hd");
                    C91753f fVar = mVar.f267423o;
                    String a = C92839m.C92844e.m117105a(j);
                    fVar.delete(a, "id=?", new String[]{"" + i2});
                    if (TO2.mo127145p()) {
                        C92836k TO3 = mVar.mo127173TO(TO2.f267390q);
                        C86013q1.m106447h(mVar.mo127174TY(TO3.f267378e, "", "", true));
                        C86013q1.m106447h(mVar.mo127174TY(TO3.f267379f, "", "", true));
                        C86013q1.m106447h(mVar.mo127174TY(TO3.f267383j, "", "", true));
                        C86013q1.m106447h(mVar.mo127174TY(TO3.f267380g, "", "", true));
                        C86013q1.m106447h(mVar.mo127174TY(TO3.f267380g, "", "", true) + "hd");
                        C91753f fVar2 = mVar.f267423o;
                        String a2 = C92839m.C92844e.m117105a(j);
                        fVar2.delete(a2, "id=?", new String[]{"" + TO3.f267374a});
                    }
                }
                ((C72972g4) C97625j3.m125812b().mo105911z()).mo101125kD(TO.f267387n);
            }
            C76701a.makeText((Context) C101400m.this.f297008d, (int) C0966R.string.gxf, 1).show();
            C101400m.this.f297008d.finish();
        }
    }

    /* renamed from: rn3.m$b */
    public class C101402b implements DialogInterface.OnClickListener {
        public C101402b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77398g gVar = C101400m.this.f297008d.f285386t;
            if (gVar != null) {
                gVar.show();
            }
        }
    }

    public C101400m(MsgRetransmitUI msgRetransmitUI) {
        this.f297008d = msgRetransmitUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C76879j.m92739j(this.f297008d, C0966R.string.gxe, C0966R.string.a3h, C0966R.string.a4h, C0966R.string.f360090a14, new C101401a(), new C101402b());
    }
}
