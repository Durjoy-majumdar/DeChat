package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kotlin.Metadata;
import ky2.C10432i;
import ky2.C10439o;
import ly2.C10680n;
import ly2.C10682o;
import nj3.C76879j;
import nr3.C89059e;
import ny2.C11310e;
import ny2.C11312g;
import o40.C61926c;
import ob0.C89132b;
import p196ln.C76705f;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/BindGuardianUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lky2/o;", "<init>", "()V", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI */
public final class BindGuardianUI extends MMActivity implements C10439o {

    /* renamed from: g */
    public static final /* synthetic */ int f21444g = 0;

    /* renamed from: d */
    public final C13601g f21445d = C36568h.m40985a(new C5563a(this));

    /* renamed from: e */
    public final C13601g f21446e = C36568h.m40985a(new C5567e(this));

    /* renamed from: f */
    public C72996z1 f21447f = ((C10432i) C86312j.m106911c(C10432i.class)).mo10736BD();

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$a */
    public static final class C5563a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5563a(BindGuardianUI bindGuardianUI) {
            super(0);
            this.f21448d = bindGuardianUI;
        }

        public Object invoke() {
            return (Button) this.f21448d.findViewById(C0966R.C0970id.a95);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$b */
    public static final class C5564b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f21449a;

        /* renamed from: b */
        public final /* synthetic */ BindGuardianUI f21450b;

        /* renamed from: c */
        public final /* synthetic */ String f21451c;

        public C5564b(C89779i0 i0Var, BindGuardianUI bindGuardianUI, String str) {
            this.f21449a = i0Var;
            this.f21450b = bindGuardianUI;
            this.f21451c = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            this.f21449a.dismiss();
            if (cVar.f256794b == 0 && cVar.f256793a == 0) {
                String string = this.f21450b.getString(C0966R.string.a2s);
                C87412m.m108593f(string, "getString(com.tencent.mm…ibmmui.R.string.app_send)");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Tp0(this.f21450b, this.f21451c, this.f21450b.getString(C0966R.string.jvs) + this.f21450b.getString(C0966R.string.jwc), true, string, new C5624a(this.f21450b, this.f21451c, cVar), (DialogInterface.OnDismissListener) null);
            } else {
                BindGuardianUI.m5439H7(this.f21450b, cVar.f256795c);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$c */
    public static final class C5565c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21452d;

        public C5565c(BindGuardianUI bindGuardianUI) {
            this.f21452d = bindGuardianUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21452d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$d */
    public static final class C5566d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5566d(BindGuardianUI bindGuardianUI) {
            super(0);
            this.f21453d = bindGuardianUI;
        }

        public Object invoke() {
            this.f21453d.mo6592I7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$e */
    public static final class C5567e extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5567e(BindGuardianUI bindGuardianUI) {
            super(0);
            this.f21454d = bindGuardianUI;
        }

        public Object invoke() {
            return (Button) this.f21454d.findViewById(C0966R.C0970id.kzo);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$f */
    public static final class C5568f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21455d;

        public C5568f(BindGuardianUI bindGuardianUI) {
            this.f21455d = bindGuardianUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindGuardianUI bindGuardianUI = this.f21455d;
            int i = BindGuardianUI.f21444g;
            bindGuardianUI.getClass();
            Intent intent = new Intent();
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.f219161b & -65);
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", bindGuardianUI.getString(C0966R.string.jw5));
            intent.putExtra("show_too_many_member", false);
            intent.putExtra("without_openim", true);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(C75592q0.m90789s());
            intent.putExtra("block_contact", C110818d0.m150921S(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C11310e.f33263d, 30, (Object) null));
            C88144b.m109802t(bindGuardianUI, ".ui.contact.SelectContactUI", intent, 101);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$g */
    public static final class C5569g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Button f21456d;

        /* renamed from: e */
        public final /* synthetic */ BindGuardianUI f21457e;

        /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$g$a */
        public static final class C5570a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ BindGuardianUI f21458a;

            public C5570a(BindGuardianUI bindGuardianUI) {
                this.f21458a = bindGuardianUI;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                if (z) {
                    BindGuardianUI bindGuardianUI = this.f21458a;
                    C89779i0 Q = C76879j.m92723Q(bindGuardianUI, "", bindGuardianUI.getContext().getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null);
                    Q.show();
                    ((TextView) bindGuardianUI.findViewById(C0966R.C0970id.ckx)).setVisibility(8);
                    C72996z1 z1Var = bindGuardianUI.f21447f;
                    C87412m.m108591d(z1Var);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "guardianContact!!.username");
                    C89059e i = new C10682o(username).mo9225i();
                    i.mo11397F(bindGuardianUI);
                    i.mo123062e(new C11312g(Q, bindGuardianUI));
                }
            }
        }

        public C5569g(Button button, BindGuardianUI bindGuardianUI) {
            this.f21456d = button;
            this.f21457e = bindGuardianUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(this.f21456d.getContext());
            qVar.mo107606r(this.f21457e.getString(C0966R.string.jwf));
            qVar.mo107595g(this.f21457e.getString(C0966R.string.jwe));
            qVar.mo107601m(C0966R.string.jwg);
            qVar.mo107599k(this.f21456d.getContext().getResources().getColor(C0966R.color.a_3));
            qVar.mo107590b(new C5570a(this.f21457e));
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianUI$h */
    public static final class C5571h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21459d;

        public C5571h(BindGuardianUI bindGuardianUI) {
            this.f21459d = bindGuardianUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindGuardianUI bindGuardianUI = this.f21459d;
            ((C10432i) C86312j.m106911c(C10432i.class)).Wq0(bindGuardianUI, 101, Integer.MAX_VALUE, "just_test_key" + System.currentTimeMillis(), "JustTitle", "Just Digest", "\n                        <msg><appmsg appid=\"\" sdkver=\"0\"><title>美团跑腿</title><des></des><username></username><action>view</action><type>0</type><showtype>0</showtype><content></content><url></url><lowurl></lowurl><forwardflag>0</forwardflag><dataurl></dataurl><lowdataurl></lowdataurl><contentattr>0</contentattr><streamvideo><streamvideourl></streamvideourl><streamvideototaltime>0</streamvideototaltime><streamvideotitle></streamvideotitle><streamvideowording></streamvideowording><streamvideoweburl></streamvideoweburl><streamvideothumburl></streamvideothumburl><streamvideoaduxinfo></streamvideoaduxinfo><streamvideopublishid></streamvideopublishid></streamvideo><canvasPageItem><canvasPageXml><![CDATA[]]></canvasPageXml></canvasPageItem><appattach><totallen>0</totallen><attachid></attachid><cdnattachurl></cdnattachurl><emoticonmd5></emoticonmd5><aeskey></aeskey><fileext></fileext><islargefilemsg>0</islargefilemsg></appattach><extinfo></extinfo><androidsource>0</androidsource><thumburl>http://wx.qlogo.cn/mmhead/Q3auHgzwzM5LS29rtX6tAvwm43zm5fkoMRiabdOp2pMBe00bZLZxvFg/96</thumburl><mediatagname></mediatagname><messageaction><![CDATA[]]></messageaction><messageext><![CDATA[]]></messageext><emoticongift><packageflag>0</packageflag><packageid></packageid></emoticongift><emoticonshared><packageflag>0</packageflag><packageid></packageid></emoticonshared><designershared><designeruin>0</designeruin><designername>null</designername><designerrediretcturl>null</designerrediretcturl></designershared><emotionpageshared><tid>0</tid><title>null</title><desc>null</desc><iconUrl>null</iconUrl><secondUrl>null</secondUrl><pageType>0</pageType></emotionpageshared><webviewshared><shareUrlOriginal></shareUrlOriginal><shareUrlOpen></shareUrlOpen><jsAppId></jsAppId><publisherId></publisherId></webviewshared><template_id></template_id><md5></md5><weappinfo><username>gh_c043a7a7fc9e@app</username><appid>wx84d3c06952bb4072</appid><version>178</version><appservicetype>0</appservicetype><secflagforsinglepagemode>0</secflagforsinglepagemode><videopageinfo><thumbwidth>0</thumbwidth><thumbheight>0</thumbheight><fromopensdk>0</fromopensdk></videopageinfo></weappinfo><statextstr></statextstr><musicShareItem><musicDuration>0</musicDuration></musicShareItem><finderLiveProductShare><finderLiveID></finderLiveID><finderUsername></finderUsername><finderObjectID></finderObjectID><finderNonceID></finderNonceID><liveStatus></liveStatus><appId></appId><pagePath></pagePath><productId></productId><coverUrl></coverUrl><productTitle></productTitle><marketPrice><![CDATA[0]]></marketPrice><sellingPrice><![CDATA[0]]></sellingPrice><platformHeadImg></platformHeadImg><platformName></platformName><shopWindowId></shopWindowId></finderLiveProductShare><findernamecard><username></username><avatar><![CDATA[]]></avatar><nickname></nickname><auth_job></auth_job><auth_icon>0</auth_icon><auth_icon_url></auth_icon_url></findernamecard><finderGuarantee><scene><![CDATA[0]]></scene></finderGuarantee><directshare>0</directshare><gamecenter><namecard><iconUrl></iconUrl><name></name><desc></desc><tail></tail><jumpUrl></jumpUrl></namecard></gamecenter><patMsg><chatUser></chatUser><records><recordNum>0</recordNum></records></patMsg><secretmsg><issecretmsg>0</issecretmsg></secretmsg><websearch><rec_category>0</rec_category><channelId>0</channelId></websearch></appmsg></msg>\n                        ", true, (C10432i.C10433a) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static final void m5439H7(BindGuardianUI bindGuardianUI, String str) {
        TextView textView = (TextView) bindGuardianUI.findViewById(C0966R.C0970id.ckx);
        textView.setVisibility(0);
        if (str == null) {
            str = bindGuardianUI.getString(C0966R.string.f7965xp);
            C87412m.m108593f(str, "getString(com.tencent.mm….app_err_server_busy_tip)");
        }
        textView.setText(str);
    }

    /* renamed from: I7 */
    public final void mo6592I7() {
        if (this.f21447f == null) {
            Button button = (Button) ((C36570n) this.f21445d).getValue();
            button.setVisibility(0);
            button.setOnClickListener(new C5568f(this));
        } else {
            Button button2 = (Button) ((C36570n) this.f21446e).getValue();
            button2.setVisibility(0);
            button2.setOnClickListener(new C5569g(button2, this));
        }
        if (this.f21447f != null) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357845c22);
            Object[] objArr = new Object[1];
            C72996z1 z1Var = this.f21447f;
            String str = null;
            objArr[0] = z1Var != null ? z1Var.mo62898f() : null;
            textView.setText(getString(C0966R.string.jw6, objArr));
            ((LinearLayout) findViewById(C0966R.C0970id.a_d)).setVisibility(0);
            C76705f fVar = (C76705f) C86312j.m106911c(C76705f.class);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.esa);
            C72996z1 z1Var2 = this.f21447f;
            fVar.mo106849z(imageView, z1Var2 != null ? z1Var2.getUsername() : null);
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.esd);
            C72996z1 z1Var3 = this.f21447f;
            if (z1Var3 != null) {
                str = z1Var3.mo62898f();
            }
            textView2.setText(str);
            if (BuildInfo.DEBUG) {
                TextView textView3 = (TextView) findViewById(C0966R.C0970id.khi);
                textView3.setVisibility(0);
                textView3.setOnClickListener(new C5571h(this));
                return;
            }
            return;
        }
        ((TextView) findViewById(C0966R.C0970id.f357845c22)).setText(C0966R.string.jwd);
        ((LinearLayout) findViewById(C0966R.C0970id.a_d)).setVisibility(8);
        ((TextView) findViewById(C0966R.C0970id.khi)).setVisibility(8);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8l;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                C89779i0 Q = C76879j.m92723Q(this, "", getContext().getString(C0966R.string.gat), true, false, (DialogInterface.OnCancelListener) null);
                Q.show();
                ((TextView) findViewById(C0966R.C0970id.ckx)).setVisibility(8);
                C87412m.m108591d(stringExtra);
                C89059e i3 = new C10680n(stringExtra).mo9225i();
                i3.mo11397F(this);
                i3.mo123062e(new C5564b(Q, this, stringExtra));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C5565c(this));
        mo6592I7();
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10739MV(this);
    }

    public void onDataChanged() {
        this.f21447f = ((C10432i) C86312j.m106911c(C10432i.class)).mo10736BD();
        C61926c.m72668M(new C5566d(this));
    }

    public void onDestroy() {
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(this);
        super.onDestroy();
    }
}
