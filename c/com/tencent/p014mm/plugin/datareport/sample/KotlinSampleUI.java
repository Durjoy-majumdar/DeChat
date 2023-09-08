package com.tencent.p014mm.plugin.datareport.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/datareport/sample/KotlinSampleUI;", "Lcom/tencent/mm/ui/MMActivity;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClick", "<init>", "()V", "plugin-data-report_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.datareport.sample.KotlinSampleUI */
public final class KotlinSampleUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public LinearLayout f158280d;

    /* renamed from: e */
    public Button f158281e;

    /* renamed from: f */
    public Button f158282f;

    /* renamed from: g */
    public Button f158283g;

    /* renamed from: h */
    public Button f158284h;

    /* renamed from: i */
    public Button f158285i;

    /* renamed from: com.tencent.mm.plugin.datareport.sample.KotlinSampleUI$a */
    public static final class C55598a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ KotlinSampleUI f158286d;

        public C55598a(KotlinSampleUI kotlinSampleUI) {
            this.f158286d = kotlinSampleUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f158286d.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cw_;
    }

    public void onClick(View view) {
        Class cls = C61212e.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/KotlinSampleUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "view");
        if (view == this.f158281e) {
            HashMap hashMap = new HashMap();
            hashMap.put("visible_item", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("dr_click1", view, hashMap, 24184);
        } else if (view == this.f158282f) {
            ((C61212e) C86312j.m106911c(cls)).mo86161cQ(this, new Intent());
        } else if (view == this.f158283g) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("btn3_custom_params", "btn3_custom_params");
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("btn3_click", view, hashMap2, 24184);
        } else if (view == this.f158284h) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("btn4_custom_params", "btn4_custom_params");
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("btn4_click", view, hashMap3, 24184);
        } else if (view == this.f158285i) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("btn5_custom_params", "btn5_custom_params");
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("btn5_click", view, hashMap4, 24184);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/KotlinSampleUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        setMMTitle("数据上报SDK示例页面");
        setBackBtn(new C55598a(this));
        this.f158280d = (LinearLayout) mo176895$(C0966R.C0970id.n5a);
        LinearLayout linearLayout = (LinearLayout) mo176895$(C0966R.C0970id.n5b);
        this.f158281e = (Button) mo176895$(C0966R.C0970id.anr);
        this.f158282f = (Button) mo176895$(C0966R.C0970id.ans);
        this.f158283g = (Button) mo176895$(C0966R.C0970id.ant);
        this.f158284h = (Button) mo176895$(C0966R.C0970id.anu);
        this.f158285i = (Button) mo176895$(C0966R.C0970id.jby);
        Button button = this.f158281e;
        C87412m.m108591d(button);
        button.setOnClickListener(this);
        Button button2 = this.f158282f;
        C87412m.m108591d(button2);
        button2.setOnClickListener(this);
        Button button3 = this.f158283g;
        C87412m.m108591d(button3);
        button3.setOnClickListener(this);
        Button button4 = this.f158284h;
        C87412m.m108591d(button4);
        button4.setOnClickListener(this);
        Button button5 = this.f158285i;
        C87412m.m108591d(button5);
        button5.setOnClickListener(this);
        ((C61212e) C86312j.m106911c(cls)).mo86163dt(this);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.SampleUI);
        ((C61212e) C86312j.m106911c(cls)).y50(this, "nickname", "菲灵小仙子");
        ((C61212e) C86312j.m106911c(cls)).y50(this, "signture", "记录点点滴滴！感谢有你，希望遇见下一个你");
        ((C61212e) C86312j.m106911c(cls)).y50(this, "finder_username", "v2_060000231003b20faec8c5ea8c1dc6d7ce02e930b0779d6ecdd67f6e73fe2f48401eb2aef3bf@finder");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86131CH(this);
        ((C61212e) C86312j.m106911c(cls)).ea0(this, "channel_id", "1-1-20-2cf48b5d7ab34f5b8ffb59e72530e948");
        ((C61212e) C86312j.m106911c(cls)).ea0(this, "behaviour_session_id", "143_1628342664409#$2_1628342663385#");
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158280d);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158281e);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158282f);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158283g);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158284h);
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158280d, "sample_wrapper");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158281e, "sample_btn1_kt");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158282f, "sample_btn2");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158283g, "sample_btn3");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158284h, "sample_btn4");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158281e, MimeTypes.BASE_TYPE_TEXT, "关注");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158281e, "color", "红色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158282f, MimeTypes.BASE_TYPE_TEXT, "点赞");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158282f, "color", "黄色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158283g, MimeTypes.BASE_TYPE_TEXT, "评论");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158283g, "color", "白色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158284h, MimeTypes.BASE_TYPE_TEXT, "转发");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158284h, "color", "灰色");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158281e, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158282f, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158283g, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158284h, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158285i, 40, 24184);
    }
}
