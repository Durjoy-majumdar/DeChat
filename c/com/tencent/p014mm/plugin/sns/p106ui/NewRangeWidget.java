package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import ms2.C61578o;
import ms2.C61579p;
import nj3.C76879j;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewRangeWidget */
public class NewRangeWidget extends BaseRangeWidget {

    /* renamed from: z */
    public static final String f276989z = MMApplicationContext.getString(C0966R.string.myx);

    /* renamed from: e */
    public Activity f276990e;

    /* renamed from: f */
    public View f276991f;

    /* renamed from: g */
    public SnsUploadConfigView f276992g;

    /* renamed from: h */
    public WeImageView f276993h;

    /* renamed from: i */
    public TextView f276994i;

    /* renamed from: j */
    public TextView f276995j;

    /* renamed from: n */
    public LinearLayout f276996n;

    /* renamed from: o */
    public TextView f276997o;

    /* renamed from: p */
    public View f276998p;

    /* renamed from: q */
    public int f276999q = 0;

    /* renamed from: r */
    public C61578o f277000r = null;

    /* renamed from: s */
    public String f277001s = "";

    /* renamed from: t */
    public String f277002t = "";

    /* renamed from: u */
    public String f277003u = "";

    /* renamed from: v */
    public ArrayList<String> f277004v = new ArrayList<>();

    /* renamed from: w */
    public View.OnClickListener f277005w = null;

    /* renamed from: x */
    public TextView f277006x;

    /* renamed from: y */
    public TextView f277007y;

    public NewRangeWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo132245d(context);
    }

    /* renamed from: a */
    public void mo132077a(SnsUploadConfigView snsUploadConfigView) {
        SnsMethodCalculate.markStartTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.f276992g = snsUploadConfigView;
        SnsMethodCalculate.markEndTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    /* renamed from: b */
    public boolean mo132078b(int i, int i2, Intent intent, AtContactWidget atContactWidget) {
        String str;
        String str2;
        String str3;
        Intent intent2 = intent;
        Class cls = C76979h.class;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.f276999q = intent2.getIntExtra("Ktag_range_index", 0);
        this.f277001s = intent2.getStringExtra("Klabel_name_list");
        this.f277002t = intent2.getStringExtra("Kother_user_name_list");
        this.f277003u = intent2.getStringExtra("Kchat_room_name_list");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("label_id");
        this.f277004v = stringArrayListExtra;
        Log.m105925i("MicroMsg.NewRangeWidget", "[onActivityResult] by intent LabelIdList:%s", Util.listToString(stringArrayListExtra, ","));
        if (!Util.isNullOrNil(this.f277002t)) {
            List<String> asList = Arrays.asList(this.f277002t.split(","));
            SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            LinkedList linkedList = new LinkedList();
            C86709a0.m107528h();
            if (!C86709a0.m107523b().mo121114l()) {
                SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            } else if (asList == null) {
                SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            } else {
                int i3 = 0;
                for (String str4 : asList) {
                    if (i3 > 20) {
                        break;
                    }
                    String e = mo132246e(str4);
                    if (!TextUtils.isEmpty(e)) {
                        linkedList.add(e);
                    }
                    i3++;
                }
                SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            }
            str = "" + Util.listToString(linkedList, ", ");
        } else {
            str = "";
        }
        if (Util.isNullOrNil((List) this.f277004v) && !Util.isNullOrNil(this.f277001s)) {
            this.f277004v = new ArrayList<>();
            List<String> stringToList = Util.stringToList(this.f277001s, ",");
            for (int i4 = 0; i4 < stringToList.size(); i4++) {
                String str5 = stringToList.get(i4);
                if (!Util.isNullOrNil(str5)) {
                    String f = ((C67001a) C28250a.m38138a()).mo90968f(str5);
                    if (!Util.isNullOrNil(f)) {
                        this.f277004v.add(f);
                    }
                }
            }
        }
        if (!Util.isNullOrNil((List) this.f277004v)) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.f277004v.iterator();
            while (it.hasNext()) {
                String c = mo132244c(it.next());
                if (!Util.isNullOrNil(c)) {
                    arrayList.add(c);
                }
            }
            String listToString = Util.listToString(arrayList, f276989z);
            this.f277001s = listToString;
            Log.m105919d("MicroMsg.NewRangeWidget", "[onActivityResult] by id LabelNameListString:%s", listToString);
        }
        if (!TextUtils.isEmpty(this.f277001s)) {
            str2 = String.format(C76577a.m92166q(getContext(), C0966R.string.mz9), new Object[]{this.f277001s});
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = String.format(C76577a.m92166q(getContext(), C0966R.string.mz8), new Object[]{str});
        } else {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            this.f277006x.setVisibility(0);
            this.f277006x.setText(C96963p0.wx0().mo83004M(MMApplicationContext.getContext(), str2));
            this.f277006x.setPadding(0, 0, 0, 0);
            this.f277007y.setVisibility(0);
            this.f277007y.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), str3, this.f277007y.getTextSize()));
            this.f277007y.setPadding(0, 0, 0, C76577a.m92157h(getContext(), C0966R.dimen.f3736cp));
            this.f276996n.setVisibility(8);
        } else if (!TextUtils.isEmpty(str2)) {
            this.f277006x.setVisibility(0);
            this.f277007y.setVisibility(8);
            this.f277006x.setText(C96963p0.wx0().mo83004M(MMApplicationContext.getContext(), str2));
            this.f277006x.setPadding(0, 0, 0, C76577a.m92157h(getContext(), C0966R.dimen.f3736cp));
            this.f276996n.setVisibility(8);
        } else if (!TextUtils.isEmpty(str3)) {
            this.f277006x.setVisibility(0);
            this.f277007y.setVisibility(8);
            this.f277006x.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), str3, this.f277007y.getTextSize()));
            this.f277006x.setPadding(0, 0, 0, C76577a.m92157h(getContext(), C0966R.dimen.f3736cp));
            this.f276996n.setVisibility(8);
        } else {
            this.f277006x.setVisibility(8);
            this.f277007y.setVisibility(8);
            TextView textView = this.f276997o;
            if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                this.f276996n.setVisibility(0);
            }
        }
        String str6 = this.f277001s;
        int i5 = this.f276999q;
        SnsMethodCalculate.markStartTimeMs("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        WeImageView weImageView = this.f276993h;
        if (weImageView != null) {
            weImageView.mo104518r(C0966R.raw.album_group_icon_pressed, C0966R.color.akw);
            this.f276994i.setTextColor(getResources().getColor(C0966R.color.f3536x0));
            this.f276995j.setTextColor(getResources().getColor(C0966R.color.f3536x0));
        }
        SnsUploadConfigView snsUploadConfigView = this.f276992g;
        if (snsUploadConfigView != null) {
            snsUploadConfigView.setPrivated(false);
        }
        if (i5 == 0) {
            WeImageView weImageView2 = this.f276993h;
            if (weImageView2 != null) {
                weImageView2.mo104518r(C0966R.raw.album_group_icon_normal, C0966R.color.f3598yz);
                this.f276994i.setTextColor(getResources().getColor(C0966R.color.a7f));
                this.f276995j.setTextColor(getResources().getColor(C0966R.color.f3288ma));
            }
            this.f276995j.setText(C0966R.string.jdw);
        } else if (i5 == 1) {
            SnsUploadConfigView snsUploadConfigView2 = this.f276992g;
            if (snsUploadConfigView2 != null) {
                snsUploadConfigView2.setPrivated(true);
            }
            if (!(atContactWidget == null || this.f276992g == null || atContactWidget.getAtList().size() <= 0)) {
                C76879j.m92738i(this.f276990e, C0966R.string.jie, C0966R.string.a3h);
                atContactWidget.mo132061a();
                this.f276992g.mo133062b();
            }
            this.f276995j.setText(C0966R.string.jdu);
        } else if (i5 == 2) {
            if (this.f276993h != null) {
                this.f276994i.setText(getResources().getString(C0966R.string.jim));
                if (!Util.isNullOrNil((CharSequence) str6) || !Util.isNullOrNil((CharSequence) str)) {
                    this.f276994i.setTextColor(getResources().getColor(C0966R.color.f3536x0));
                    this.f276995j.setTextColor(getResources().getColor(C0966R.color.f3536x0));
                } else {
                    this.f276993h.mo104518r(C0966R.raw.album_group_icon_normal, C0966R.color.f3598yz);
                    this.f276994i.setTextColor(getResources().getColor(C0966R.color.a7f));
                    this.f276995j.setTextColor(getResources().getColor(C0966R.color.f3288ma));
                }
            }
            this.f276995j.setText("");
        } else if (i5 == 3) {
            if (this.f276993h != null) {
                this.f276994i.setText(getResources().getString(C0966R.string.f361393ji1));
                if (!Util.isNullOrNil((CharSequence) str6) || !Util.isNullOrNil((CharSequence) str)) {
                    this.f276993h.setIconColor(-65536);
                    this.f276994i.setTextColor(-65536);
                    this.f276995j.setTextColor(-65536);
                } else {
                    this.f276993h.mo104518r(C0966R.raw.album_group_icon_normal, C0966R.color.f3598yz);
                    this.f276994i.setTextColor(getResources().getColor(C0966R.color.a7f));
                    this.f276995j.setTextColor(getResources().getColor(C0966R.color.f3288ma));
                }
            }
            this.f276995j.setText("");
        }
        SnsMethodCalculate.markEndTimeMs("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        TimelineGroupUserBehaviorStruct E = SnsReportHelper.f275506m0.mo131344E();
        E.f266363C = E.mo86045b("SelectedLabelidList", Util.listToString(this.f277004v, ";"), true);
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return true;
    }

    /* renamed from: c */
    public final String mo132244c(String str) {
        SnsMethodCalculate.markStartTimeMs("getDisplayLabelNameByLabelId", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        String h = ((C67001a) C28250a.m38138a()).mo90970h(str);
        if (Util.isNullOrNil(h)) {
            h = "";
        } else if (Util.isNullOrNil(((C67001a) C28250a.m38138a()).mo90973k(str))) {
            SnsMethodCalculate.markEndTimeMs("getDisplayLabelNameByLabelId", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayLabelNameByLabelId", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return h;
    }

    /* renamed from: d */
    public final void mo132245d(Context context) {
        C61578o oVar;
        LinkedList<C61579p> linkedList;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.f276990e = (Activity) context;
        this.f276991f = View.inflate(context, getLayoutResource(), this);
        this.f277006x = (TextView) findViewById(C0966R.C0970id.nn5);
        this.f277007y = (TextView) findViewById(C0966R.C0970id.npi);
        this.f277000r = C94866e1.gy0().mo131195f();
        this.f276995j = (TextView) this.f276991f.findViewById(C0966R.C0970id.jwl);
        this.f276994i = (TextView) this.f276991f.findViewById(C0966R.C0970id.fmz);
        this.f276993h = (WeImageView) this.f276991f.findViewById(C0966R.C0970id.ic9);
        this.f276996n = (LinearLayout) this.f276991f.findViewById(C0966R.C0970id.jwj);
        this.f276997o = (TextView) this.f276991f.findViewById(C0966R.C0970id.jwi);
        this.f276998p = this.f276991f.findViewById(C0966R.C0970id.icb);
        this.f276991f.setOnClickListener(new NewRangeWidget$$a(this));
        LinearLayout linearLayout = this.f276996n;
        if (!(linearLayout == null || this.f276997o == null || this.f276998p == null)) {
            linearLayout.setOnClickListener(new NewRangeWidget$$b(this));
            int i = 1;
            boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_last_range_enable, 1) == 1;
            this.f276998p.setBackground((Drawable) null);
            this.f276996n.setVisibility(8);
            if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SNS_UPLOAD_USED_NEW_GROUP_BOOLEAN_SYNC, false)) {
                Log.m105918d("MicroMsg.NewRangeWidget", "should not show old version Last range info when use new sns group");
                SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
                return;
            } else if (z && (oVar = this.f277000r) != null && (linkedList = oVar.f175147d) != null && !linkedList.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int min = Math.min(this.f277000r.f175147d.size(), 20) - 1; min >= 0; min--) {
                    C61579p pVar = this.f277000r.f175147d.get(min);
                    int i2 = pVar.f175151e;
                    if (i2 == 1) {
                        if (!hashSet.contains(pVar.f175150d) && !Util.isNullOrNil(pVar.f175150d)) {
                            String c = mo132244c(pVar.f175150d);
                            if (!Util.isNullOrNil(c)) {
                                arrayList.add(0, c);
                                hashSet.add(pVar.f175150d);
                            }
                        }
                    } else if (i2 == 2) {
                        C86709a0.m107528h();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(pVar.f175150d);
                        if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                            arrayList.add(pVar.f175150d);
                        }
                    } else {
                        String e = mo132246e(pVar.f175150d);
                        if (!TextUtils.isEmpty(e)) {
                            arrayList.add(e);
                        }
                    }
                }
                if (!Util.isNullOrNil((List) arrayList)) {
                    this.f276998p.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.bcr));
                    this.f276996n.setVisibility(0);
                    this.f276997o.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), String.format(context.getResources().getString(C0966R.string.f361394ji2), new Object[]{Util.listToString(arrayList, f276989z)}), this.f276997o.getTextSize()));
                    if (this.f277000r.f175149f) {
                        i = 2;
                    }
                    SnsReportHelper.f275506m0.mo131344E().f266377f = i;
                    C94866e1.ky0().execute(new NewRangeWidget$$c(this));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    /* renamed from: e */
    public final String mo132246e(String str) {
        SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        String Si = ((C75339i) C86312j.m106911c(C75339i.class)).mo62515Si(str);
        if (!TextUtils.isEmpty(Si)) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            return Si;
        }
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || TextUtils.isEmpty(z1Var.mo62909j3())) {
            SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            return "";
        }
        String j3 = z1Var.mo62909j3();
        SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return j3;
    }

    public int getLabelRange() {
        SnsMethodCalculate.markStartTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        int i = this.f276999q;
        SnsMethodCalculate.markEndTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return i;
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return C0966R.C0971layout.d2q;
    }

    public int getMaxTagNameLen() {
        SnsMethodCalculate.markStartTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        SnsMethodCalculate.markEndTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return -1;
    }

    public void setEnablePrivate(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        SnsMethodCalculate.markEndTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    public void setRangeTipClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.f277005w = onClickListener;
        SnsMethodCalculate.markEndTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    public NewRangeWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132245d(context);
    }
}
