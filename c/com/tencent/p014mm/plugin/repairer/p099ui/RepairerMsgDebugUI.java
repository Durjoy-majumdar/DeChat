package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bp3.C28360d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116326t0;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fj2.C45798a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import o40.C61926c;
import p158gt.C98201k;
import p278yh.C79117r;
import p280yw.C53586e;
import p606mm.C47080g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C119027c;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClickShowXml", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI */
public final class RepairerMsgDebugUI extends BaseRepairerUI {

    /* renamed from: e */
    public static final /* synthetic */ int f205435e = 0;

    /* renamed from: d */
    public final C13601g f205436d = C36568h.m40985a(new C70978d(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI$a */
    public static final class C70974a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMsgDebugUI f205437d;

        public C70974a(RepairerMsgDebugUI repairerMsgDebugUI) {
            this.f205437d = repairerMsgDebugUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205437d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI$b */
    public static final class C70975b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f205438d;

        public C70975b(C72963f4 f4Var) {
            this.f205438d = f4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StringBuilder sb = new StringBuilder();
            sb.append("\n                MsgId: ");
            sb.append(this.f205438d.getMsgId());
            sb.append("\n                MsgSvrId: ");
            sb.append(this.f205438d.mo108774y2());
            sb.append("\n                MsgIsSender: ");
            sb.append(this.f205438d.mo108769t2());
            sb.append("\n                MsgTalker: ");
            sb.append(this.f205438d.mo108768t());
            sb.append("\n                MsgFlag: ");
            sb.append(Integer.toBinaryString(this.f205438d.mo108762o2()));
            sb.append("\n                MsgType: ");
            sb.append(Integer.toHexString(this.f205438d.getType()));
            sb.append("\n                MsgSource: ");
            sb.append(this.f205438d.f230724G);
            sb.append("\n                MsgPath: ");
            C28360d dVar = C28360d.f78014a;
            String t = this.f205438d.mo108768t();
            C87412m.m108593f(t, "msgInfo.talker");
            sb.append(dVar.mo55933a(t, this.f205438d.getMsgId()));
            sb.append("\n                MsgContent: ");
            sb.append(this.f205438d.getContent());
            sb.append("\n                MsgCreateTime: ");
            sb.append(this.f205438d.getCreateTime());
            sb.append("\n                MsgSvrId: ");
            sb.append(this.f205438d.mo108774y2());
            sb.append("\n            ");
            String b = C66725r.m78728b(sb.toString());
            String format = String.format("msg_info_%s.txt", Arrays.copyOf(new Object[]{Long.valueOf(this.f205438d.getMsgId())}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            byte[] bytes = b.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            ((C47080g) C86312j.m106911c(C47080g.class)).Kt0(format, bytes, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI$c */
    public static final class C70976c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f205439d;

        /* renamed from: e */
        public final /* synthetic */ RepairerMsgDebugUI f205440e;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI$c$a */
        public static final class C70977a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f205441d;

            /* renamed from: e */
            public final /* synthetic */ RepairerMsgDebugUI f205442e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C70977a(C72963f4 f4Var, RepairerMsgDebugUI repairerMsgDebugUI) {
                super(0);
                this.f205441d = f4Var;
                this.f205442e = repairerMsgDebugUI;
            }

            public Object invoke() {
                Class cls = C98201k.class;
                String Ax0 = ((C53586e) C86312j.m106911c(C53586e.class)).Ax0();
                String str = "img_" + this.f205441d.getMsgId() + '_' + C31543z5.m39453c();
                C86009m1 m1Var = new C86009m1(Ax0 + str);
                if (m1Var.mo119967g()) {
                    C86013q1.m106445f(m1Var.mo119971i());
                }
                m1Var.mo119987x();
                C92836k uP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127198uP(this.f205441d);
                if (uP != null) {
                    C72963f4 f4Var = this.f205441d;
                    RepairerMsgDebugUI repairerMsgDebugUI = this.f205442e;
                    String v102 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(f4Var.mo108765s2(), true);
                    if (C86013q1.m106450k(v102)) {
                        C87412m.m108593f(v102, "thumbPath");
                        C86013q1.m106442c(v102, new C86009m1(m1Var, RepairerMsgDebugUI.m83443H7(repairerMsgDebugUI, v102, "thumb")).mo119971i());
                    }
                    String str2 = v102 + "hd";
                    if (C86013q1.m106450k(str2)) {
                        C86013q1.m106442c(str2, new C86009m1(m1Var, RepairerMsgDebugUI.m83443H7(repairerMsgDebugUI, str2, "hdthumb")).mo119971i());
                    }
                    String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(uP.f267378e, "", "", true);
                    if (C86013q1.m106450k(TY)) {
                        C87412m.m108593f(TY, "midPath");
                        C86013q1.m106442c(TY, new C86009m1(m1Var, RepairerMsgDebugUI.m83443H7(repairerMsgDebugUI, TY, "mid")).mo119971i());
                    } else {
                        TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(uP.f267379f, "", "", true);
                        if (C86013q1.m106450k(TY)) {
                            C87412m.m108593f(TY, "midPath");
                            C86013q1.m106442c(TY, new C86009m1(m1Var, RepairerMsgDebugUI.m83443H7(repairerMsgDebugUI, TY, "mid")).mo119971i());
                        }
                    }
                    String TY2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127173TO(uP.f267390q).f267378e, "", "", true);
                    if (C86013q1.m106450k(TY2)) {
                        C87412m.m108593f(TY, "midPath");
                        C86013q1.m106442c(TY2, new C86009m1(m1Var, RepairerMsgDebugUI.m83443H7(repairerMsgDebugUI, TY, "orig")).mo119971i());
                    }
                }
                C86009m1 m1Var2 = new C86009m1(Ax0 + str + ".zip");
                if (m1Var2.mo119967g()) {
                    m1Var2.mo119966f();
                }
                C86013q1.m106439U(m1Var.mo119971i(), m1Var2.mo119971i());
                byte[] O = C86013q1.m106433O(m1Var2.mo119971i(), 0, -1);
                C45798a aVar = C45798a.f123705a;
                RepairerMsgDebugUI repairerMsgDebugUI2 = this.f205442e;
                String i = m1Var2.mo119971i();
                C87412m.m108593f(i, "imgOutputZipFile.absolutePath");
                C87412m.m108593f(O, "fileContent");
                aVar.mo71265a(repairerMsgDebugUI2, i, O);
                return C13598b0.f38549a;
            }
        }

        public C70976c(C72963f4 f4Var, RepairerMsgDebugUI repairerMsgDebugUI) {
            this.f205439d = f4Var;
            this.f205440e = repairerMsgDebugUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61926c.m72656A((String) null, new C70977a(this.f205439d, this.f205440e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI$d */
    public static final class C70978d extends C87413o implements C32224a<C79117r> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMsgDebugUI f205443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70978d(RepairerMsgDebugUI repairerMsgDebugUI) {
            super(0);
            this.f205443d = repairerMsgDebugUI;
        }

        public Object invoke() {
            RepairerMsgDebugUI repairerMsgDebugUI = this.f205443d;
            int i = RepairerMsgDebugUI.f205435e;
            return new C79117r(repairerMsgDebugUI.getContentView());
        }
    }

    /* renamed from: H7 */
    public static final String m83443H7(RepairerMsgDebugUI repairerMsgDebugUI, String str, String str2) {
        String str3;
        repairerMsgDebugUI.getClass();
        C86001b0 n = C86013q1.m106453n(str);
        if (n != null) {
            if (n instanceof C116326t0) {
                str3 = str2 + "_link";
            } else {
                str3 = str2;
            }
            if (str3 != null) {
                return str3;
            }
        }
        return str2 + "_not_exist";
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsx;
    }

    public final void onClickShowXml(View view) {
        C87412m.m108594g(view, "v");
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(getIntent().getLongExtra("Chat_Msg_Id", 0));
        StringBuilder sb = new StringBuilder();
        sb.append("\n                MsgId: ");
        sb.append(b002.getMsgId());
        sb.append("\n                MsgSvrId: ");
        sb.append(b002.mo108774y2());
        sb.append("\n                MsgIsSender: ");
        sb.append(b002.mo108769t2());
        sb.append("\n                MsgTalker: ");
        sb.append(b002.mo108768t());
        sb.append("\n                MsgFlag: ");
        sb.append(Integer.toBinaryString(b002.mo108762o2()));
        sb.append("\n                MsgType: ");
        sb.append(Integer.toHexString(b002.getType()));
        sb.append("\n                MsgSource: ");
        sb.append(b002.f230724G);
        sb.append("\n                MsgPath: ");
        C28360d dVar = C28360d.f78014a;
        String t = b002.mo108768t();
        C87412m.m108593f(t, "msgInfo.talker");
        sb.append(dVar.mo55933a(t, b002.getMsgId()));
        sb.append("\n                MsgContent: ");
        sb.append(b002.getContent());
        sb.append("\n                MsgCreateTime: ");
        sb.append(b002.getCreateTime());
        sb.append("\n                MsgSvrId: ");
        sb.append(b002.mo108774y2());
        sb.append("\n            ");
        ((TextView) findViewById(C0966R.C0970id.opo)).setText(C66725r.m78728b(sb.toString()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("消息调试页面");
        setBackBtn(new C70974a(this));
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(getIntent().getLongExtra("Chat_Msg_Id", 0));
        C79117r rVar = (C79117r) ((C36570n) this.f205436d).getValue();
        if (rVar.f232332c == null) {
            rVar.f232332c = (Button) rVar.f232330a.findViewById(C0966R.C0970id.btm);
        }
        rVar.f232332c.setOnClickListener(new C70975b(b002));
        if (b002.mo100979R3()) {
            ((C79117r) ((C36570n) this.f205436d).getValue()).mo109063a().setVisibility(0);
            ((C79117r) ((C36570n) this.f205436d).getValue()).mo109063a().setOnClickListener(new C70976c(b002, this));
            return;
        }
        ((C79117r) ((C36570n) this.f205436d).getValue()).mo109063a().setVisibility(8);
    }
}
