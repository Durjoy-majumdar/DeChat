package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b22.C28250a;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ms2.C61578o;
import ms2.C61579p;
import nj3.C76879j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.sns.ui.RangeWidget */
public class RangeWidget extends BaseRangeWidget {

    /* renamed from: x */
    public static final /* synthetic */ int f277361x = 0;

    /* renamed from: e */
    public Activity f277362e;

    /* renamed from: f */
    public View f277363f;

    /* renamed from: g */
    public SnsUploadConfigView f277364g;

    /* renamed from: h */
    public WeImageView f277365h;

    /* renamed from: i */
    public TextView f277366i;

    /* renamed from: j */
    public TextView f277367j;

    /* renamed from: n */
    public LinearLayout f277368n;

    /* renamed from: o */
    public TextView f277369o;

    /* renamed from: p */
    public View f277370p;

    /* renamed from: q */
    public int f277371q = 0;

    /* renamed from: r */
    public C61578o f277372r = null;

    /* renamed from: s */
    public String f277373s = "";

    /* renamed from: t */
    public String f277374t = "";

    /* renamed from: u */
    public String f277375u = "";

    /* renamed from: v */
    public View.OnClickListener f277376v = null;

    /* renamed from: w */
    public int f277377w = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.RangeWidget$a */
    public class C95400a implements View.OnClickListener {
        public C95400a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/RangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$1");
            RangeWidget rangeWidget = RangeWidget.this;
            int i = RangeWidget.f277361x;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            Activity activity = rangeWidget.f277362e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            Intent intent = new Intent(activity, SnsLabelUI.class);
            RangeWidget rangeWidget2 = RangeWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            int i2 = rangeWidget2.f277371q;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            intent.putExtra("KLabel_range_index", i2);
            RangeWidget rangeWidget3 = RangeWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            String str = rangeWidget3.f277373s;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            intent.putExtra("Klabel_name_list", str);
            RangeWidget rangeWidget4 = RangeWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            String str2 = rangeWidget4.f277374t;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            intent.putExtra("Kother_user_name_list", str2);
            RangeWidget rangeWidget5 = RangeWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            String str3 = rangeWidget5.f277375u;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            intent.putExtra("Kchat_room_name_list", str3);
            intent.putExtra("k_sns_label_ui_style", RangeWidget.this.f277377w);
            intent.putExtra("Kis_with_together", RangeWidget.this.f276688d);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
            RangeWidget rangeWidget6 = RangeWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            Activity activity2 = rangeWidget6.f277362e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(5);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/RangeWidget$1", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = snsReportHelper.f275557n;
            if (timelineGroupUserBehaviorStruct != null) {
                int i3 = timelineGroupUserBehaviorStruct.f266376e;
                if (i3 <= 0) {
                    timelineGroupUserBehaviorStruct.f266376e = 1;
                } else {
                    timelineGroupUserBehaviorStruct.f266376e = i3 + 1;
                }
            }
            SnsMethodCalculate.markEndTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/RangeWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.RangeWidget$b */
    public class C95401b implements View.OnClickListener {
        public C95401b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/RangeWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$2");
            RangeWidget rangeWidget = RangeWidget.this;
            int i = RangeWidget.f277361x;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            View.OnClickListener onClickListener = rangeWidget.f277376v;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            if (onClickListener != null) {
                RangeWidget rangeWidget2 = RangeWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
                View.OnClickListener onClickListener2 = rangeWidget2.f277376v;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.RangeWidget");
                onClickListener2.onClick(view);
                SnsReportHelper.f275506m0.mo131344E().f266378g = 1;
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.RangeWidget$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/RangeWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.RangeWidget$c */
    public class C95402c implements Runnable {
        public C95402c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.RangeWidget$3");
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            RangeWidget rangeWidget = RangeWidget.this;
            int i = RangeWidget.f277361x;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            C61578o oVar = rangeWidget.f277372r;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            snsReportHelper.mo131363X(oVar.f175147d);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.RangeWidget$3");
        }
    }

    public RangeWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo132436c(context);
    }

    /* renamed from: a */
    public void mo132077a(SnsUploadConfigView snsUploadConfigView) {
        SnsMethodCalculate.markStartTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f277364g = snsUploadConfigView;
        SnsMethodCalculate.markEndTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    /* renamed from: b */
    public boolean mo132078b(int i, int i2, Intent intent, AtContactWidget atContactWidget) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f277371q = intent.getIntExtra("Ktag_range_index", 0);
        this.f277373s = intent.getStringExtra("Klabel_name_list");
        this.f277374t = intent.getStringExtra("Kother_user_name_list");
        this.f277375u = intent.getStringExtra("Kchat_room_name_list");
        int maxTagNameLen = getMaxTagNameLen();
        String str = "";
        if (!Util.isNullOrNil(this.f277375u)) {
            str = str + Util.listToString(mo132437d(Arrays.asList(this.f277375u.split(","))), ",");
        }
        if (!Util.isNullOrNil(this.f277373s)) {
            if (str.length() > 0) {
                str = str + "," + this.f277373s;
            } else {
                str = str + this.f277373s;
            }
        }
        if (!Util.isNullOrNil(this.f277374t)) {
            String listToString = Util.listToString(mo132437d(Arrays.asList(this.f277374t.split(","))), ",");
            if (str.length() > 0) {
                str = str + "," + listToString;
            } else {
                str = str + listToString;
            }
        }
        if (!(maxTagNameLen == -1 || str == null || str.length() <= maxTagNameLen)) {
            str = str.substring(0, maxTagNameLen) + "...";
        }
        int i3 = this.f277371q;
        SnsMethodCalculate.markStartTimeMs("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        SpannableString yp02 = ((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str, this.f277367j.getTextSize());
        WeImageView weImageView = this.f277365h;
        if (weImageView != null) {
            weImageView.mo104518r(C0966R.raw.album_group_icon_pressed, C0966R.color.akw);
            this.f277366i.setTextColor(getResources().getColor(C0966R.color.f3536x0));
            this.f277367j.setTextColor(getResources().getColor(C0966R.color.f3536x0));
        }
        SnsUploadConfigView snsUploadConfigView = this.f277364g;
        if (snsUploadConfigView != null) {
            snsUploadConfigView.setPrivated(false);
        }
        if (i3 == 0) {
            WeImageView weImageView2 = this.f277365h;
            if (weImageView2 != null) {
                weImageView2.mo104518r(C0966R.raw.album_group_icon_normal, C0966R.color.f3598yz);
                this.f277366i.setTextColor(getResources().getColor(C0966R.color.a7f));
                this.f277367j.setTextColor(getResources().getColor(C0966R.color.f3288ma));
            }
            this.f277367j.setText(C0966R.string.jdw);
        } else if (i3 == 1) {
            SnsUploadConfigView snsUploadConfigView2 = this.f277364g;
            if (snsUploadConfigView2 != null) {
                snsUploadConfigView2.setPrivated(true);
            }
            if (!(atContactWidget == null || this.f277364g == null || atContactWidget.getAtList().size() <= 0)) {
                C76879j.m92738i(this.f277362e, C0966R.string.jie, C0966R.string.a3h);
                atContactWidget.mo132061a();
                this.f277364g.mo133062b();
            }
            this.f277367j.setText(C0966R.string.jdu);
        } else if (i3 == 2) {
            if (this.f277365h != null) {
                this.f277366i.setText(getResources().getString(C0966R.string.jim));
                if (!Util.isNullOrNil((CharSequence) yp02)) {
                    this.f277366i.setTextColor(getResources().getColor(C0966R.color.f3536x0));
                    this.f277367j.setTextColor(getResources().getColor(C0966R.color.f3536x0));
                } else {
                    this.f277365h.mo104518r(C0966R.raw.album_group_icon_normal, C0966R.color.f3598yz);
                    this.f277366i.setTextColor(getResources().getColor(C0966R.color.a7f));
                    this.f277367j.setTextColor(getResources().getColor(C0966R.color.f3288ma));
                }
            }
            this.f277367j.setText(yp02);
        } else if (i3 == 3) {
            if (this.f277365h != null) {
                this.f277366i.setText(getResources().getString(C0966R.string.f361393ji1));
                if (!Util.isNullOrNil((CharSequence) yp02)) {
                    this.f277365h.setIconColor(-65536);
                    this.f277366i.setTextColor(-65536);
                    this.f277367j.setTextColor(-65536);
                } else {
                    this.f277365h.mo104518r(C0966R.raw.album_group_icon_normal, C0966R.color.f3598yz);
                    this.f277366i.setTextColor(getResources().getColor(C0966R.color.a7f));
                    this.f277367j.setTextColor(getResources().getColor(C0966R.color.f3288ma));
                }
            }
            this.f277367j.setText(yp02);
        }
        SnsMethodCalculate.markEndTimeMs("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return true;
    }

    /* renamed from: c */
    public final void mo132436c(Context context) {
        C61578o oVar;
        LinkedList<C61579p> linkedList;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f277362e = (Activity) context;
        this.f277363f = View.inflate(context, getLayoutResource(), this);
        this.f277372r = C94866e1.gy0().mo131195f();
        this.f277367j = (TextView) this.f277363f.findViewById(C0966R.C0970id.jwl);
        this.f277366i = (TextView) this.f277363f.findViewById(C0966R.C0970id.fmz);
        this.f277365h = (WeImageView) this.f277363f.findViewById(C0966R.C0970id.ic9);
        this.f277368n = (LinearLayout) this.f277363f.findViewById(C0966R.C0970id.jwj);
        this.f277369o = (TextView) this.f277363f.findViewById(C0966R.C0970id.jwi);
        this.f277370p = this.f277363f.findViewById(C0966R.C0970id.icb);
        this.f277363f.setOnClickListener(new C95400a());
        LinearLayout linearLayout = this.f277368n;
        if (!(linearLayout == null || this.f277369o == null || this.f277370p == null)) {
            linearLayout.setOnClickListener(new C95401b());
            int i = 1;
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_last_range_enable, 1) == 1;
            this.f277370p.setBackground((Drawable) null);
            this.f277368n.setVisibility(8);
            if (z && (oVar = this.f277372r) != null && (linkedList = oVar.f175147d) != null && !linkedList.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator<C61579p> it = this.f277372r.f175147d.iterator();
                while (it.hasNext()) {
                    C61579p next = it.next();
                    int i2 = next.f175151e;
                    if (i2 == 1) {
                        String h = ((C67001a) C28250a.m38138a()).mo90970h(next.f175150d);
                        if (h != null) {
                            arrayList.add(h);
                        }
                    } else if (i2 == 2) {
                        C86709a0.m107528h();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next.f175150d);
                        if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                            arrayList.add(next.f175150d);
                        }
                    } else {
                        arrayList.add(next.f175150d);
                    }
                }
                if (!Util.isNullOrNil((List) arrayList)) {
                    this.f277370p.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.bcr));
                    this.f277368n.setVisibility(0);
                    this.f277369o.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), String.format(context.getResources().getString(C0966R.string.f361394ji2), new Object[]{Util.listToString(mo132437d(arrayList), ",")}), this.f277369o.getTextSize()));
                    if (this.f277372r.f175149f) {
                        i = 2;
                    }
                    SnsReportHelper.f275506m0.mo131344E().f266377f = i;
                    C94866e1.ky0().execute(new C95402c());
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    /* renamed from: d */
    public final List<String> mo132437d(List<String> list) {
        SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        LinkedList linkedList = new LinkedList();
        C86709a0.m107528h();
        if (!C86709a0.m107523b().mo121114l()) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        } else if (list == null) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        } else {
            for (String next : list) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next);
                if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                    next = z1Var.mo62898f();
                }
                linkedList.add(next);
            }
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        }
    }

    public int getLabelRange() {
        SnsMethodCalculate.markStartTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        int i = this.f277371q;
        SnsMethodCalculate.markEndTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return i;
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return C0966R.C0971layout.bph;
    }

    public int getMaxTagNameLen() {
        SnsMethodCalculate.markStartTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        SnsMethodCalculate.markEndTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return -1;
    }

    public void setEnablePrivate(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        SnsMethodCalculate.markEndTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    public void setRangeTipClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f277376v = onClickListener;
        SnsMethodCalculate.markEndTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    public RangeWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132436c(context);
    }
}
