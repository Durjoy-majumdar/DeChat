package com.tencent.p014mm.plugin.sns.p106ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StorySnsHeaderExposeStruct;
import com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import p196ln.C76705f;
import xv2.C102775d;
import xv2.C102780i;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView */
public class SnsStoryHeaderView extends FrameLayout implements C102780i {

    /* renamed from: x */
    public static final /* synthetic */ int f281281x = 0;

    /* renamed from: d */
    public int f281282d;

    /* renamed from: e */
    public int f281283e;

    /* renamed from: f */
    public List<String> f281284f;

    /* renamed from: g */
    public String f281285g;

    /* renamed from: h */
    public boolean f281286h;

    /* renamed from: i */
    public boolean f281287i;

    /* renamed from: j */
    public View f281288j;

    /* renamed from: n */
    public TextView f281289n;

    /* renamed from: o */
    public StoryAvatarDotsView f281290o;

    /* renamed from: p */
    public TextView f281291p;

    /* renamed from: q */
    public TextView f281292q;

    /* renamed from: r */
    public int f281293r;

    /* renamed from: s */
    public int f281294s;

    /* renamed from: t */
    public int f281295t;

    /* renamed from: u */
    public boolean f281296u;

    /* renamed from: v */
    public boolean f281297v;

    /* renamed from: w */
    public C96256a f281298w;

    /* renamed from: com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$a */
    public interface C96256a {
    }

    public SnsStoryHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo133941a() {
        SnsMethodCalculate.markStartTimeMs("notifyUserListChange", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        mo133944d(false);
        if (((LinkedList) this.f281284f).size() > 0) {
            ((C102775d) C86312j.m106911c(C102775d.class)).mo134168WB((String) ((LinkedList) this.f281284f).get(0), false);
        }
        SnsMethodCalculate.markEndTimeMs("notifyUserListChange", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: b */
    public final void mo133942b() {
        SnsMethodCalculate.markStartTimeMs("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        if (!this.f281296u) {
            View view = this.f281288j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "checkExpose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "checkExpose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            return;
        }
        if (this.f281288j.getVisibility() == 0) {
            int[] iArr = new int[2];
            this.f281288j.getLocationOnScreen(iArr);
            if (iArr[1] <= 0) {
                this.f281287i = false;
            } else if (!this.f281287i) {
                this.f281287i = true;
                SnsMethodCalculate.markStartTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                Log.m105924i("MicroMsg.SnsStoryHeaderView", "reportExpose: ");
                if (((LinkedList) this.f281284f).size() <= 0) {
                    SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (this.f281293r > 0) {
                        sb.append((String) ((LinkedList) this.f281284f).get(0));
                    }
                    for (int i = 1; i < this.f281293r; i++) {
                        sb.append("|");
                        sb.append((String) ((LinkedList) this.f281284f).get(i));
                    }
                    StorySnsHeaderExposeStruct storySnsHeaderExposeStruct = new StorySnsHeaderExposeStruct();
                    storySnsHeaderExposeStruct.f266288d = storySnsHeaderExposeStruct.mo86045b("EnterObjectId", this.f281285g, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    storySnsHeaderExposeStruct.f266289e = storySnsHeaderExposeStruct.mo86045b("SessionId", String.valueOf(99) + "_" + currentTimeMillis, true);
                    storySnsHeaderExposeStruct.f266290f = (long) this.f281293r;
                    storySnsHeaderExposeStruct.f266291g = storySnsHeaderExposeStruct.mo86045b("ExposeUinList", sb.toString(), true);
                    storySnsHeaderExposeStruct.f266292h = (long) this.f281294s;
                    storySnsHeaderExposeStruct.f266293i = (long) this.f281295t;
                    storySnsHeaderExposeStruct.mo86054n();
                    SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                }
            }
            Log.m105925i("MicroMsg.SnsStoryHeaderView", "checkExpose: %s", Boolean.valueOf(this.f281287i));
        }
        SnsMethodCalculate.markEndTimeMs("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: c */
    public final void mo133943c(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f281290o.setIconSize(C76577a.m92151b(getContext(), 26));
        this.f281290o.setIconGap(C76577a.m92151b(getContext(), 16));
        this.f281293r = 0;
        if (list.size() > 0) {
            this.f281290o.setVisibility(0);
            this.f281290o.setIconLayerCount(Math.min(list.size(), 3));
            this.f281293r = this.f281290o.getChildCount();
            for (int i = 0; i < this.f281290o.getChildCount(); i++) {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f281290o.mo136313a(i), list.get(i), 0.5f);
                this.f281290o.mo136313a(i).setBackground(getResources().getDrawable(C0966R.C0969drawable.au5));
                this.f281290o.mo136313a(i).setPadding(C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1));
            }
        } else {
            this.f281290o.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* renamed from: d */
    public final void mo133944d(boolean z) {
        int i;
        int i2;
        int i3;
        Class cls = C102775d.class;
        SnsMethodCalculate.markStartTimeMs("updateView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        Log.m105925i("MicroMsg.SnsStoryHeaderView", "updateView: %s, %s", Boolean.valueOf(z), Boolean.valueOf(this.f281297v));
        if (this.f281297v) {
            SnsMethodCalculate.markEndTimeMs("updateView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            return;
        }
        ((LinkedList) this.f281284f).clear();
        this.f281295t = ((C102775d) C86312j.m106911c(cls)).e10().mo134197b();
        if (this.f281282d != 1 || (i = this.f281283e) == 10000 || i == 10001) {
            View view = this.f281288j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f281287i = false;
        } else if (i == 2) {
            SnsMethodCalculate.markStartTimeMs("initTypeAll", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            List<String> d = ((C102775d) C86312j.m106911c(cls)).e10().mo134199d();
            List<String> c = ((C102775d) C86312j.m106911c(cls)).e10().mo134198c();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((C102775d) C86312j.m106911c(cls)).e10().mo134202g().keySet());
            ((LinkedList) this.f281284f).addAll(d);
            ((LinkedList) this.f281284f).addAll(c);
            ((LinkedList) this.f281284f).addAll(arrayList);
            this.f281289n.setText(getResources().getString(C0966R.string.jhi));
            mo133943c(d);
            SnsMethodCalculate.markEndTimeMs("initTypeAll", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            ((C102775d) C86312j.m106911c(cls)).e10().mo134203h(this);
        } else {
            C115669n nVar = C115669n.INSTANCE;
            C115669n nVar2 = nVar;
            nVar2.mo175913w(1006, 0, 1);
            nVar2.mo175913w(1015, 0, 1);
            SnsMethodCalculate.markStartTimeMs("initTypeNew", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            List<String> d2 = ((C102775d) C86312j.m106911c(cls)).e10().mo134199d();
            List<String> e = ((C102775d) C86312j.m106911c(cls)).e10().mo134200e();
            int size = d2.size() > 0 ? d2.size() : 0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(((C102775d) C86312j.m106911c(cls)).e10().mo134202g().keySet());
            this.f281294s = size;
            ((LinkedList) this.f281284f).addAll(d2);
            ((LinkedList) this.f281284f).addAll(e);
            ((LinkedList) this.f281284f).addAll(arrayList2);
            this.f281289n.setText(getResources().getString(C0966R.string.jhl));
            mo133943c(d2);
            this.f281291p.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("StoryEntranceShouldShowInTimelineOfUnreadCount", 3);
            Log.m105925i("MicroMsg.SnsStoryHeaderView", "initTypeNew %s", Integer.valueOf(b));
            if (d2.size() > 0) {
                i3 = b;
                i2 = size;
                nVar.mo175913w(1015, 1, 1);
            } else {
                i3 = b;
                i2 = size;
                nVar.mo175913w(1015, 2, 1);
            }
            if (((LinkedList) this.f281284f).size() == 0) {
                nVar.mo175913w(1015, 3, 1);
            }
            if (i2 > i3) {
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 4.0f);
                this.f281291p.setPadding(fromDPToPix, 0, fromDPToPix, 0);
                this.f281291p.setText(String.format("%s", new Object[]{Integer.valueOf(i2)}));
            } else {
                this.f281291p.setPadding(0, 0, 0, 0);
                this.f281291p.setText("");
            }
            SnsMethodCalculate.markEndTimeMs("initTypeNew", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            ((C102775d) C86312j.m106911c(cls)).e10().mo134203h(this);
        }
        if (((LinkedList) this.f281284f).size() == 0) {
            View view3 = this.f281288j;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f281287i = false;
        } else {
            View view5 = this.f281288j;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!this.f281286h) {
                mo133942b();
            }
        }
        if (((C102775d) C86312j.m106911c(cls)).e10().mo134202g().isEmpty()) {
            this.f281292q.setVisibility(8);
        } else {
            this.f281292q.setVisibility(0);
            this.f281292q.setText(String.valueOf(this.f281295t));
        }
        SnsMethodCalculate.markEndTimeMs("updateView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setEnterObjectId(String str) {
        SnsMethodCalculate.markStartTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f281285g = str;
        SnsMethodCalculate.markEndTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setSessionId(String str) {
        SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setSnsType(int i) {
        SnsMethodCalculate.markStartTimeMs("setSnsType", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f281282d = i;
        mo133944d(true);
        if (((LinkedList) this.f281284f).size() > 0) {
            ((C102775d) C86312j.m106911c(C102775d.class)).mo134168WB((String) ((LinkedList) this.f281284f).get(0), true);
        }
        SnsMethodCalculate.markEndTimeMs("setSnsType", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setStoryAction(C96256a aVar) {
        SnsMethodCalculate.markStartTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f281298w = aVar;
        SnsMethodCalculate.markEndTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setTopLineVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setTopLineVisibility", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        View findViewById = findViewById(C0966R.C0970id.jwb);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "setTopLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "setTopLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("setTopLineVisibility", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public SnsStoryHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f281283e = 10000;
        this.f281284f = new LinkedList();
        this.f281285g = null;
        this.f281286h = false;
        this.f281287i = false;
        this.f281293r = 0;
        this.f281294s = 0;
        this.f281295t = 0;
        this.f281296u = true;
        this.f281297v = false;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_STORY_SNS_HEADER_TYPE_INT, 0);
        if (j > 0) {
            this.f281283e = j;
        } else {
            this.f281283e = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_story_sns_story_open, 10000);
        }
        if (((C102775d) C86312j.m106911c(C102775d.class)).ge0().f184996d == 1) {
            this.f281283e = 10001;
        }
        Log.m105925i("MicroMsg.SnsStoryHeaderView", "init: headerType %s configType %s", Integer.valueOf(this.f281283e), Integer.valueOf(j));
        View.inflate(getContext(), C0966R.C0971layout.c4c, this);
        this.f281288j = findViewById(C0966R.C0970id.jvz);
        this.f281289n = (TextView) findViewById(C0966R.C0970id.jwa);
        this.f281290o = (StoryAvatarDotsView) findViewById(C0966R.C0970id.jvx);
        this.f281291p = (TextView) findViewById(C0966R.C0970id.f359266jw0);
        this.f281292q = (TextView) findViewById(C0966R.C0970id.f359267jw1);
        this.f281288j.setOnClickListener(new C96257a(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }
}
