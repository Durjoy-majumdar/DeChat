package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.AtContactWidget */
public class AtContactWidget extends LinearLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f276675p = 0;

    /* renamed from: d */
    public Activity f276676d;

    /* renamed from: e */
    public View f276677e;

    /* renamed from: f */
    public WeImageView f276678f;

    /* renamed from: g */
    public TextView f276679g;

    /* renamed from: h */
    public TextView f276680h;

    /* renamed from: i */
    public PreviewContactView f276681i;

    /* renamed from: j */
    public SnsUploadConfigView f276682j;

    /* renamed from: n */
    public List<String> f276683n = new LinkedList();

    /* renamed from: o */
    public boolean f276684o = false;

    public AtContactWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo132064d(context);
    }

    /* renamed from: a */
    public void mo132061a() {
        SnsMethodCalculate.markStartTimeMs("cleanAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f276683n == null) {
            this.f276683n = new LinkedList();
        }
        this.f276683n.clear();
        PreviewContactView previewContactView = this.f276681i;
        if (previewContactView != null) {
            previewContactView.setList(this.f276683n);
        }
        mo132066f();
        TextView textView = this.f276679g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f276680h;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(C0966R.color.a7f));
        }
        SnsMethodCalculate.markEndTimeMs("cleanAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: b */
    public void mo132062b() {
        SnsMethodCalculate.markStartTimeMs("contentDescription", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        StringBuilder sb = new StringBuilder();
        for (String k : this.f276683n) {
            sb.append(C45628s0.m50782k(k).mo62909j3() + ",");
        }
        View view = this.f276677e;
        view.setContentDescription(this.f276680h.getText() + " " + sb);
        SnsMethodCalculate.markEndTimeMs("contentDescription", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: c */
    public final void mo132063c() {
        SnsMethodCalculate.markStartTimeMs("goToSelectTogether", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        Intent intent = new Intent();
        intent.setClassName(this.f276676d, "com.tencent.mm.ui.contact.SnsSelectConversationUI");
        intent.putExtra("Select_Conv_ui_title", this.f276676d.getString(C0966R.string.jje));
        intent.putExtra("Select_Contact", Util.listToString(this.f276683n, ","));
        Activity activity = this.f276676d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(6);
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "goToSelectTogether", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        SnsMethodCalculate.markEndTimeMs("goToSelectTogether", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: d */
    public void mo132064d(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        this.f276676d = (Activity) context;
        View inflate = C85868k2.m106137b(context).inflate(getLayoutResource(), this);
        this.f276677e = inflate;
        this.f276681i = (PreviewContactView) inflate.findViewById(C0966R.C0970id.f6163z3);
        this.f276678f = (WeImageView) this.f276677e.findViewById(C0966R.C0970id.f6164z4);
        this.f276679g = (TextView) this.f276677e.findViewById(C0966R.C0970id.f6166z6);
        this.f276680h = (TextView) this.f276677e.findViewById(C0966R.C0970id.f6167z7);
        int i = 8;
        if (C94847c1.m120213a()) {
            this.f276680h.setText(C0966R.string.jje);
            View findViewById = this.f276677e.findViewById(C0966R.C0970id.f6168z8);
            if (C94847c1.m120214b() || C94847c1.m120215c()) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/AtContactWidget", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = this.f276677e.findViewById(C0966R.C0970id.f6168z8);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/AtContactWidget", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f276677e.setOnClickListener(new AtContactWidget$$b(this));
        this.f276677e.post(new AtContactWidget$$c(this));
        mo132062b();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: e */
    public boolean mo132065e(int i, int i2, Intent intent, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        String stringExtra = intent.getStringExtra("Select_Contact");
        new LinkedList();
        List<String> linkedList = (stringExtra == null || stringExtra.equals("")) ? new LinkedList<>() : Util.stringsToList(stringExtra.split(","));
        if (this.f276683n == null) {
            this.f276683n = new LinkedList();
        }
        this.f276683n.clear();
        for (String str : linkedList) {
            if (!this.f276683n.contains(str)) {
                this.f276683n.add(str);
            }
        }
        PreviewContactView previewContactView = this.f276681i;
        if (previewContactView != null) {
            previewContactView.setList(this.f276683n);
        }
        mo132067g(z);
        TextView textView = this.f276680h;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(linkedList.isEmpty() ? C0966R.color.a7f : C0966R.color.f3536x0));
        }
        if (this.f276684o) {
            SnsMethodCalculate.markStartTimeMs("dealAtNumTv", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            Log.m105918d("MicroMsg.AtContactWiget", "withList count " + this.f276683n.size());
            if (!this.f276684o || this.f276679g == null || this.f276683n.size() <= 0) {
                this.f276679g.setVisibility(8);
            } else {
                this.f276679g.setVisibility(0);
                if (this.f276683n.size() < 100) {
                    TextView textView2 = this.f276679g;
                    textView2.setText(this.f276683n.size() + "");
                    this.f276679g.setBackgroundResource(C45081s1.m49933b(getContext(), this.f276683n.size()));
                } else {
                    this.f276679g.setText("");
                    this.f276679g.setBackgroundResource(C0966R.raw.badge_count_more);
                }
            }
            SnsMethodCalculate.markEndTimeMs("dealAtNumTv", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        }
        mo132066f();
        mo132062b();
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return true;
    }

    /* renamed from: f */
    public final void mo132066f() {
        SnsMethodCalculate.markStartTimeMs("updateLayoutWidth", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f276683n.size() > 0) {
            this.f276678f.mo104518r(getWithDrawableId(), C0966R.color.akw);
        } else {
            this.f276678f.mo104518r(getWithEmptyDrawableId(), C0966R.color.f3598yz);
        }
        SnsMethodCalculate.markEndTimeMs("updateLayoutWidth", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    /* renamed from: g */
    public void mo132067g(boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateWithTaInfo", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f276683n.size() <= 0 || z || !C94847c1.m120213a()) {
            View findViewById = getRootView().findViewById(C0966R.C0970id.jke);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = getRootView().findViewById(C0966R.C0970id.jke);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/AtContactWidget", "updateWithTaInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("updateWithTaInfo", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public List<String> getAtList() {
        SnsMethodCalculate.markStartTimeMs("getAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (this.f276683n == null) {
            this.f276683n = new LinkedList();
        }
        List<String> list = this.f276683n;
        SnsMethodCalculate.markEndTimeMs("getAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return list;
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return C0966R.C0971layout.f6521h4;
    }

    public int getWithDrawableId() {
        SnsMethodCalculate.markStartTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (C94847c1.m120213a()) {
            SnsMethodCalculate.markEndTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            return C0966R.raw.icon_filled_together;
        }
        SnsMethodCalculate.markEndTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return C0966R.raw.album_mention_icon_pressed;
    }

    public int getWithEmptyDrawableId() {
        SnsMethodCalculate.markStartTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (C94847c1.m120213a()) {
            SnsMethodCalculate.markEndTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            return C0966R.raw.icon_outlined_together;
        }
        SnsMethodCalculate.markEndTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        return C0966R.raw.album_mention_icon_normal;
    }

    public void setShowAtList(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShowAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        PreviewContactView previewContactView = this.f276681i;
        if (previewContactView != null) {
            previewContactView.setVisibility(z ? 0 : 8);
        }
        SnsMethodCalculate.markEndTimeMs("setShowAtList", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void setShowAtNum(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setShowAtNum", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        this.f276684o = z;
        SnsMethodCalculate.markEndTimeMs("setShowAtNum", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public void setShowAtTips(boolean z) {
        TextView textView;
        SnsMethodCalculate.markStartTimeMs("setShowAtTips", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (!(this.f276677e == null || (textView = this.f276680h) == null)) {
            textView.setVisibility(z ? 0 : 8);
        }
        SnsMethodCalculate.markEndTimeMs("setShowAtTips", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
    }

    public AtContactWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132064d(context);
    }
}
