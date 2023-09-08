package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Process;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsEditDraftStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.hardcoder.WXHardCoderJNI;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMOverScrollView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94941r0;
import com.tencent.p014mm.plugin.sns.p106ui.SnsHeader;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C94992f;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.MD5;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f72.C97842b;
import gv2.C98244q;
import h81.C32735h;
import hd0.C98398h0;
import in3.C87771d;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jr2.C76440q;
import jr2.C99014h;
import k20.C9556a;
import k21.C60960c;
import ks2.C99181f;
import ks2.C99198r;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C117747y;
import os2.C100398c0;
import os2.C100399d0;
import os2.C100417r0;
import os2.C35285a0;
import p1029rf.C89940c;
import p182kk.C61104a;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import p447aw.C103918d;
import p761yd.C91441c;
import p995kf.C88146a;
import qo3.C77407n;
import sn0.C90259e;
import te3.C101783gu2;
import vo3.C90852c;
import vr2.C102236a0;
import vr2.C102267u;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import zn2.C26705c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI */
public class SnsUserUI extends MMActivity implements C76440q.C76441a {

    /* renamed from: R */
    public static final /* synthetic */ int f278981R = 0;

    /* renamed from: A */
    public LinearLayout f278982A = null;

    /* renamed from: B */
    public View f278983B;

    /* renamed from: C */
    public int f278984C = 0;

    /* renamed from: D */
    public int f278985D = 0;

    /* renamed from: E */
    public Long f278986E = 0L;

    /* renamed from: F */
    public int f278987F = -1;

    /* renamed from: G */
    public boolean f278988G = false;

    /* renamed from: H */
    public C102267u f278989H = new C102267u();

    /* renamed from: I */
    public Animation f278990I = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);

    /* renamed from: J */
    public Runnable f278991J = new C95691e();

    /* renamed from: K */
    public long f278992K = 0;

    /* renamed from: L */
    public long f278993L = 0;

    /* renamed from: M */
    public View f278994M;

    /* renamed from: N */
    public MenuItem.OnMenuItemClickListener f278995N = new C43094f();

    /* renamed from: P */
    public IListener f278996P;

    /* renamed from: Q */
    public IListener f278997Q;

    /* renamed from: d */
    public C96198r5 f278998d;

    /* renamed from: e */
    public boolean f278999e = false;

    /* renamed from: f */
    public SnsUIAction f279000f;

    /* renamed from: g */
    public C5431p1.C5432a f279001g;

    /* renamed from: h */
    public String f279002h;

    /* renamed from: i */
    public String f279003i;

    /* renamed from: j */
    public boolean f279004j;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: n */
    public boolean f279005n;

    /* renamed from: o */
    public int f279006o;

    /* renamed from: p */
    public int f279007p;

    /* renamed from: q */
    public int f279008q;

    /* renamed from: r */
    public boolean f279009r = false;

    /* renamed from: s */
    public SnsUIAction.C95669n f279010s;

    /* renamed from: t */
    public ImageView f279011t = null;

    /* renamed from: u */
    public FrameLayout f279012u = null;

    /* renamed from: v */
    public RelativeLayout f279013v = null;

    /* renamed from: w */
    public TextView f279014w = null;

    /* renamed from: x */
    public ImageView f279015x = null;

    /* renamed from: y */
    public RelativeLayout f279016y = null;

    /* renamed from: z */
    public RelativeLayout f279017z = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$b */
    public class C43093b implements AdapterView.OnItemClickListener {
        public C43093b(SnsUserUI snsUserUI) {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUserUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$11");
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$11");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUserUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$f */
    public class C43094f implements MenuItem.OnMenuItemClickListener {
        public C43094f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$20");
            SnsUserUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$20");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$g */
    public class C43095g implements DialogInterface.OnClickListener {
        public C43095g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$21");
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SnsUserUI.this.getContext());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$21");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$h */
    public class C43096h implements DialogInterface.OnClickListener {
        public C43096h(SnsUserUI snsUserUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$22");
            dialogInterface.dismiss();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$22");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$a */
    public class C95688a implements r5$$p {
        public C95688a() {
        }

        /* renamed from: a */
        public void mo133110a() {
            int i;
            ListView listView;
            int i2;
            SnsMethodCalculate.markStartTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.SnsUserUI$10");
            if (SnsUserUI.m122458H7(SnsUserUI.this) != null && SnsUserUI.m122458H7(SnsUserUI.this).mo133859w()) {
                if (SnsUserUI.m122458H7(SnsUserUI.this).getCount() == 0) {
                    SnsUserUI snsUserUI = SnsUserUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI.mo133109W7();
                    SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                } else {
                    SnsUserUI snsUserUI2 = SnsUserUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI2.mo133108V7();
                    SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                }
                SnsUIAction Q7 = SnsUserUI.m122467Q7(SnsUserUI.this);
                Q7.getClass();
                SnsMethodCalculate.markStartTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                SnsHeader snsHeader = Q7.f278860p;
                if (snsHeader != null) {
                    i = snsHeader.getMeasuredHeight();
                    SnsMethodCalculate.markEndTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                } else {
                    SnsMethodCalculate.markEndTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    i = 0;
                }
                SnsUserUI snsUserUI3 = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                int i3 = snsUserUI3.f278987F;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                Log.m105919d("MicroMsg.SnsUserUI", "onLoadDataFinish rightSnsId:%s, mCurFetchMode:%s", Long.valueOf(C94897n1.f274989c), Integer.valueOf(i3));
                SnsUserUI snsUserUI4 = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                int i4 = snsUserUI4.f278987F;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                if (i4 == 0) {
                    int f = C75044y4.m89994f(SnsUserUI.this.getContext());
                    SnsUserUI.m122467Q7(SnsUserUI.this).getSnsListView().setSelectionFromTop(SnsUserUI.m122467Q7(SnsUserUI.this).getSnsListView().getHeaderViewsCount(), C74942w4.m89784a(SnsUserUI.this.getContext(), 90) + f + C75044y4.m89989a(SnsUserUI.this.getContext()));
                } else {
                    SnsUserUI snsUserUI5 = SnsUserUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    int i5 = snsUserUI5.f278987F;
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    if (i5 == 1 && C94897n1.f274989c != 0) {
                        ListView snsListView = SnsUserUI.m122467Q7(SnsUserUI.this).getSnsListView();
                        C96198r5 H7 = SnsUserUI.m122458H7(SnsUserUI.this);
                        long j = C94897n1.f274989c;
                        H7.getClass();
                        SnsMethodCalculate.markStartTimeMs("findListPositionBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                        int i6 = 0;
                        while (true) {
                            if (i6 >= ((ArrayList) H7.f281047h).size()) {
                                listView = snsListView;
                                i6 = 0;
                                break;
                            }
                            SnsInfo snsInfo = (SnsInfo) ((ArrayList) H7.f281047h).get(i6);
                            listView = snsListView;
                            if (snsInfo != null && snsInfo.field_snsId == j) {
                                break;
                            }
                            i6++;
                            snsListView = listView;
                        }
                        Iterator it = ((HashMap) H7.f281048i).entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = 0;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((Integer) entry.getValue()).intValue() >= i6) {
                                i2 = ((Integer) entry.getKey()).intValue();
                                break;
                            }
                        }
                        Log.m105925i("MicroMsg.SnsphotoAdapter", "dataPos:%s, displayPos:%s", Integer.valueOf(i6), Integer.valueOf(i2));
                        SnsMethodCalculate.markEndTimeMs("findListPositionBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                        listView.setSelectionFromTop(i2 + SnsUserUI.m122467Q7(SnsUserUI.this).getSnsListView().getHeaderViewsCount(), i + C94897n1.f274990d);
                    }
                }
                SnsUserUI snsUserUI6 = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI6.f278988G = false;
                SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                C94897n1.f274990d = 0;
                C94897n1.f274989c = 0;
            }
            SnsMethodCalculate.markEndTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.SnsUserUI$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$c */
    public class C95689c implements Runnable {
        public C95689c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$12");
            SnsUserUI snsUserUI = SnsUserUI.this;
            int i = SnsUserUI.f278981R;
            SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            boolean z = snsUserUI.f279009r;
            SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            if (z) {
                Log.m105928w("MicroMsg.SnsUserUI", "too fast that it finish");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$12");
                return;
            }
            C5431p1.C5432a O7 = SnsUserUI.m122465O7(SnsUserUI.this);
            ((C95694k) SnsUserUI.m122460J7(SnsUserUI.this)).getType();
            O7.mo6423t(2, SnsUserUI.m122459I7(SnsUserUI.this), SnsUserUI.this);
            ((C95694k) SnsUserUI.m122460J7(SnsUserUI.this)).getType();
            ((C95694k) SnsUserUI.m122460J7(SnsUserUI.this)).getClass();
            SnsMethodCalculate.markStartTimeMs("isToResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            SnsMethodCalculate.markEndTimeMs("isToResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            C5431p1.C5432a O72 = SnsUserUI.m122465O7(SnsUserUI.this);
            ((C95694k) SnsUserUI.m122460J7(SnsUserUI.this)).getType();
            String I7 = SnsUserUI.m122459I7(SnsUserUI.this);
            SnsUserUI snsUserUI2 = SnsUserUI.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            boolean z2 = snsUserUI2.f279004j;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            O72.mo6413d(2, I7, z2, SnsUserUI.m122462L7(SnsUserUI.this), SnsUserUI.m122464N7(SnsUserUI.this));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$d */
    public class C95690d implements C15601d<C77575r> {
        public C95690d() {
        }

        public C66212f getContext() {
            SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUserUI$19");
            C66217g gVar = C66217g.f190253d;
            SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUserUI$19");
            return gVar;
        }

        public void resumeWith(Object obj) {
            Object obj2 = obj;
            SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsUserUI$19");
            if (obj2 instanceof C77575r) {
                C77575r rVar = (C77575r) obj2;
                if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                    C77574q qVar = rVar.f226149d;
                    Intent intent = new Intent();
                    intent.putExtra("key_extra_data", rVar.f226150e);
                    if (qVar.mo107739a()) {
                        intent.putExtra("key_req_result", new SightCaptureResult(true, qVar.f226143b));
                    } else {
                        C101783gu2 gu22 = new C101783gu2();
                        gu22.f298309e = true;
                        gu22.f298308d = false;
                        String str = qVar.f226143b;
                        intent.putExtra("key_req_result", new SightCaptureResult(true, str, qVar.f226144c, C86013q1.m106457r(str), MD5.getMD5(str), (int) (qVar.f226145d / 1000), gu22));
                    }
                    SnsUserUI.this.onActivityResult(17, rVar.f226147b, intent);
                    SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsUserUI$19");
                }
            }
            SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsUserUI$19");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$e */
    public class C95691e implements Runnable {
        public C95691e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$1");
            if (SnsUserUI.m122458H7(SnsUserUI.this).mo133859w()) {
                SnsUserUI.m122458H7(SnsUserUI.this).mo133861z("");
            } else {
                SnsUserUI.m122458H7(SnsUserUI.this).mo133837g();
                SnsUserUI.m122458H7(SnsUserUI.this).mo133861z("");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$i */
    public class C95692i implements Runnable {
        public C95692i(SnsUserUI snsUserUI) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$2");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$j */
    public class C95693j implements Runnable {
        public C95693j(SnsUserUI snsUserUI) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$3");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$k */
    public class C95694k implements SnsUIAction.C95669n {
        public C95694k() {
        }

        /* renamed from: a */
        public void mo132983a() {
            Animation animation;
            SnsMethodCalculate.markStartTimeMs("onListScolling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            int firstVisiblePosition = SnsUserUI.m122467Q7(SnsUserUI.this).f278851d.getFirstVisiblePosition();
            boolean z = false;
            View childAt = SnsUserUI.m122467Q7(SnsUserUI.this).f278851d.getChildAt(0);
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(SnsUserUI.m122468R7(SnsUserUI.this));
            objArr[1] = Boolean.valueOf(SnsUserUI.m122467Q7(SnsUserUI.this).mo133036n());
            objArr[2] = Integer.valueOf(firstVisiblePosition);
            objArr[3] = childAt != null ? String.valueOf(childAt.getTop()) : "";
            Log.m105919d("MicroMsg.SnsUserUI", "onListScolling: isDoingFetch=%b, isPullDownMode=%b, firstItemPosition=%d, firstView.getTop=%s", objArr);
            if (childAt != null && firstVisiblePosition == 0 && childAt.getTop() == 0 && SnsUserUI.m122467Q7(SnsUserUI.this).mo133036n()) {
                Log.m105925i("MicroMsg.SnsUserUI", "will do up fetch, %s", Boolean.valueOf(SnsUserUI.m122468R7(SnsUserUI.this)));
                if (SnsUserUI.m122468R7(SnsUserUI.this)) {
                    SnsMethodCalculate.markEndTimeMs("onListScolling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
                    return;
                }
                SnsUIAction Q7 = SnsUserUI.m122467Q7(SnsUserUI.this);
                Q7.getClass();
                SnsMethodCalculate.markStartTimeMs("startUpLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                SnsHeader snsHeader = Q7.f278860p;
                if (snsHeader != null) {
                    SnsMethodCalculate.markStartTimeMs("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                    SnsHeader.C95546j jVar = snsHeader.f278099d;
                    if (!(jVar == null || jVar.f278135j == null || (animation = snsHeader.f278114v) == null)) {
                        animation.cancel();
                        snsHeader.f278114v.reset();
                        snsHeader.f278099d.f278135j.startAnimation(snsHeader.f278114v);
                    }
                    SnsMethodCalculate.markEndTimeMs("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                }
                SnsMethodCalculate.markEndTimeMs("startUpLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                SnsUserUI snsUserUI = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI.f278988G = true;
                SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                C5431p1.C5432a O7 = SnsUserUI.m122465O7(SnsUserUI.this);
                getType();
                O7.mo6415f(2, SnsUserUI.m122459I7(SnsUserUI.this), 1, SnsUserUI.m122462L7(SnsUserUI.this), 0, SnsUserUI.m122464N7(SnsUserUI.this));
                SnsUserUI.m122466P7(SnsUserUI.this, 1);
            } else if (!SnsUserUI.m122468R7(SnsUserUI.this)) {
                SnsUIAction Q72 = SnsUserUI.m122467Q7(SnsUserUI.this);
                Q72.getClass();
                SnsMethodCalculate.markStartTimeMs("isListLoadingState", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                LoadingMoreView loadingMoreView = Q72.f278859o;
                loadingMoreView.getClass();
                SnsMethodCalculate.markStartTimeMs("isLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
                if (loadingMoreView.f276864f.getVisibility() == 0) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("isLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
                SnsMethodCalculate.markEndTimeMs("isListLoadingState", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                if (z && SnsUserUI.m122467Q7(SnsUserUI.this).mo133036n() && !SnsUserUI.m122467Q7(SnsUserUI.this).f278863s && SnsUserUI.m122467Q7(SnsUserUI.this).mo133034l()) {
                    Log.m105924i("MicroMsg.SnsUserUI", "onListScolling: bottom load data");
                    SnsUserUI snsUserUI2 = SnsUserUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI2.f278988G = true;
                    SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    SnsUserUI.m122467Q7(SnsUserUI.this).mo133030h();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onListScolling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: b */
        public View mo132984b() {
            SnsMethodCalculate.markStartTimeMs("getActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            View findViewById = SnsUserUI.this.findViewById(C0966R.C0970id.f5383do);
            SnsMethodCalculate.markEndTimeMs("getActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            return findViewById;
        }

        /* renamed from: c */
        public void mo132985c(int i, int i2) {
            int i3;
            Object item;
            SnsMethodCalculate.markStartTimeMs("onActionBarChange", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            if (i2 <= 0) {
                SnsUserUI snsUserUI = SnsUserUI.this;
                int i4 = SnsUserUI.f278981R;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI.getClass();
                SnsMethodCalculate.markStartTimeMs("hideYearTip", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI.f279012u.setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("hideYearTip", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            } else {
                SnsUserUI snsUserUI2 = SnsUserUI.this;
                int i5 = SnsUserUI.f278981R;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI2.getClass();
                SnsMethodCalculate.markStartTimeMs("displayYearTip", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                C96198r5 r5Var = snsUserUI2.f278998d;
                r5Var.getClass();
                SnsMethodCalculate.markStartTimeMs("getRealPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                if (((HashMap) r5Var.f281048i).get(Integer.valueOf(i)) == null) {
                    i3 = -1;
                } else {
                    i3 = ((Integer) ((HashMap) r5Var.f281048i).get(Integer.valueOf(i))).intValue();
                }
                SnsMethodCalculate.markEndTimeMs("getRealPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                Log.m105919d("MicroMsg.SnsUserUI", "displayYearTip position:%d alpha:%d realPos:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                if (!(i3 == -1 || (item = snsUserUI2.f278998d.getItem(i3)) == null || !(item instanceof SnsInfo))) {
                    float f = ((float) i2) / 100.0f;
                    if (f != snsUserUI2.f279012u.getAlpha()) {
                        snsUserUI2.f279012u.setAlpha(f);
                    }
                    snsUserUI2.f279012u.setVisibility(0);
                    SnsInfo snsInfo = (SnsInfo) item;
                    if (snsUserUI2.f278984C != snsInfo.getHead() / 10000) {
                        snsUserUI2.f278984C = snsInfo.getHead() / 10000;
                        snsUserUI2.f279014w.setText(String.format(snsUserUI2.getResources().getString(C0966R.string.f361397jk1), new Object[]{Integer.valueOf(snsUserUI2.f278984C)}));
                    }
                    snsUserUI2.f278985D = (snsInfo.getHead() / 100) % snsUserUI2.f278984C;
                }
                SnsMethodCalculate.markEndTimeMs("displayYearTip", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            }
            SnsMethodCalculate.markEndTimeMs("onActionBarChange", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: d */
        public void mo132986d(boolean z, int i, List<Integer> list, List<Integer> list2) {
            Iterator<Integer> it;
            int i2 = i;
            SnsMethodCalculate.markStartTimeMs("notifyList", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            int i3 = 1;
            if (!(i2 == -1 || SnsUserUI.m122458H7(SnsUserUI.this) == null)) {
                C96198r5 H7 = SnsUserUI.m122458H7(SnsUserUI.this);
                H7.getClass();
                SnsMethodCalculate.markStartTimeMs("addFristItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                C96236u5 u5Var = H7.f281059w;
                if (u5Var != null) {
                    SnsMethodCalculate.markStartTimeMs("addHeaderItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    SnsInfo LL = C94866e1.Yx0().mo139800LL(i2);
                    if (LL == null || LL.getTimeLine().ContentObj == null || u5Var.f281215d.size() <= 0) {
                        SnsMethodCalculate.markEndTimeMs("addHeaderItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    } else {
                        u5Var.f281215d.add(1, LL);
                        u5Var.mo133903f();
                        u5Var.mo133902e();
                        SnsMethodCalculate.markEndTimeMs("addHeaderItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("addFristItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            }
            if (!(SnsUserUI.m122458H7(SnsUserUI.this) == null || list == null || list2 == null)) {
                C96198r5 H72 = SnsUserUI.m122458H7(SnsUserUI.this);
                H72.getClass();
                SnsMethodCalculate.markStartTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                if (H72.f281036F) {
                    if (H72.f281060x != null) {
                        if (list.size() + list2.size() == 0) {
                            SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                        } else {
                            C96245v5 v5Var = H72.f281060x;
                            v5Var.getClass();
                            SnsMethodCalculate.markStartTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            SnsMethodCalculate.markStartTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            if (list.size() == 0) {
                                SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            } else {
                                Log.m105918d("MicroMsg.SnsSelfAdapterSearchHelper", "remove Items");
                                Iterator<Integer> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    int intValue = it4.next().intValue();
                                    int size = v5Var.f281233d.size();
                                    while (true) {
                                        it = it4;
                                        if (i3 >= size) {
                                            break;
                                        }
                                        SnsInfo snsInfo = v5Var.f281233d.get(i3);
                                        if (snsInfo != null && snsInfo.localid == intValue) {
                                            v5Var.f281233d.remove(i3);
                                            break;
                                        } else {
                                            i3++;
                                            it4 = it;
                                        }
                                    }
                                    it4 = it;
                                    i3 = 1;
                                }
                                SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            }
                            SnsMethodCalculate.markStartTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            if (list2.size() == 0) {
                                SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            } else {
                                Log.m105918d("MicroMsg.SnsSelfAdapterSearchHelper", "change Items");
                                LinkedList linkedList = new LinkedList();
                                int i4 = 1;
                                while (i4 < v5Var.f281233d.size()) {
                                    SnsInfo snsInfo2 = v5Var.f281233d.get(i4);
                                    if (snsInfo2 != null) {
                                        Iterator<Integer> it5 = list2.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                int intValue2 = it5.next().intValue();
                                                if (snsInfo2.localid == intValue2) {
                                                    Log.m105918d("MicroMsg.SnsSelfAdapterSearchHelper", "update list localId " + intValue2);
                                                    v5Var.f281233d.remove(i4);
                                                    linkedList.add(C94866e1.Yx0().mo139800LL(intValue2));
                                                    i4 += -1;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    i4++;
                                }
                                Iterator it6 = linkedList.iterator();
                                while (it6.hasNext()) {
                                    v5Var.f281233d.add((SnsInfo) it6.next());
                                }
                                SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            }
                            SnsMethodCalculate.markStartTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            Collections.sort(v5Var.f281233d, v5Var.f281239j);
                            SnsMethodCalculate.markEndTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            SnsMethodCalculate.markStartTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            v5Var.mo133911d(v5Var.f281237h, v5Var.f281233d);
                            SnsMethodCalculate.markEndTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                            SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        }
                    }
                } else if (H72.f281059w != null) {
                    if (list.size() + list2.size() == 0) {
                        SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    } else {
                        C96236u5 u5Var2 = H72.f281059w;
                        u5Var2.getClass();
                        SnsMethodCalculate.markStartTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        SnsMethodCalculate.markStartTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        if (list.size() == 0) {
                            SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        } else {
                            Log.m105918d("MicroMsg.SnsSelfHelper", "remove Items");
                            Iterator<Integer> it7 = list.iterator();
                            while (it7.hasNext()) {
                                int intValue3 = it7.next().intValue();
                                int size2 = u5Var2.f281215d.size();
                                int i5 = 1;
                                while (true) {
                                    if (i5 >= size2) {
                                        break;
                                    }
                                    Iterator<Integer> it8 = it7;
                                    SnsInfo snsInfo3 = u5Var2.f281215d.get(i5);
                                    if (snsInfo3 != null && snsInfo3.localid == intValue3) {
                                        u5Var2.f281215d.remove(i5);
                                        it7 = it8;
                                        break;
                                    }
                                    i5++;
                                    it7 = it8;
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("removeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        }
                        SnsMethodCalculate.markStartTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        if (list2.size() == 0) {
                            SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        } else {
                            Log.m105918d("MicroMsg.SnsSelfHelper", "change Items");
                            LinkedList linkedList2 = new LinkedList();
                            int i6 = 1;
                            while (i6 < u5Var2.f281215d.size()) {
                                SnsInfo snsInfo4 = u5Var2.f281215d.get(i6);
                                if (snsInfo4 != null) {
                                    Iterator<Integer> it9 = list2.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            int intValue4 = it9.next().intValue();
                                            if (snsInfo4.localid == intValue4) {
                                                Log.m105918d("MicroMsg.SnsSelfHelper", "update list localId " + intValue4);
                                                u5Var2.f281215d.remove(i6);
                                                linkedList2.add(C94866e1.Yx0().mo139800LL(intValue4));
                                                i6 += -1;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                i6++;
                            }
                            Iterator it10 = linkedList2.iterator();
                            while (it10.hasNext()) {
                                u5Var2.f281215d.add((SnsInfo) it10.next());
                            }
                            SnsMethodCalculate.markEndTimeMs("changeItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        }
                        u5Var2.mo133903f();
                        u5Var2.mo133902e();
                        SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("updateItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            }
            if (z && SnsUserUI.m122458H7(SnsUserUI.this) != null) {
                C96198r5 H73 = SnsUserUI.m122458H7(SnsUserUI.this);
                H73.getClass();
                SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                H73.mo133831A(true);
                SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            }
            SnsMethodCalculate.markEndTimeMs("notifyList", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: e */
        public void mo132987e() {
            SnsMethodCalculate.markStartTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            Log.m105924i("MicroMsg.SnsUserUI", "onLoadingMore: ");
            if (SnsUserUI.m122458H7(SnsUserUI.this) == null || !SnsUserUI.m122458H7(SnsUserUI.this).mo133859w()) {
                if (SnsUserUI.m122465O7(SnsUserUI.this) == null) {
                    SnsUserUI snsUserUI = SnsUserUI.this;
                    C5431p1.C5432a dy02 = C94866e1.dy0();
                    SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI.f279001g = dy02;
                    SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                }
                Log.m105924i("MicroMsg.SnsUserUI", "onLoadingMore: doNpList");
                getType();
                C5431p1.C5432a O7 = SnsUserUI.m122465O7(SnsUserUI.this);
                getType();
                String I7 = SnsUserUI.m122459I7(SnsUserUI.this);
                SnsUserUI snsUserUI2 = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                boolean z = snsUserUI2.f279004j;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                O7.mo6414e(2, I7, z, SnsUserUI.m122462L7(SnsUserUI.this), SnsUserUI.m122464N7(SnsUserUI.this));
                MMHandler ly02 = C94866e1.ly0();
                SnsUserUI snsUserUI3 = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                Runnable runnable = snsUserUI3.f278991J;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                ly02.postDelayed(runnable, 3000);
            } else {
                Log.m105924i("MicroMsg.SnsUserUI", "onLoadingMore: doOtherList");
                C5431p1.C5432a O72 = SnsUserUI.m122465O7(SnsUserUI.this);
                getType();
                O72.mo6415f(2, SnsUserUI.m122459I7(SnsUserUI.this), 2, SnsUserUI.m122462L7(SnsUserUI.this), 0, SnsUserUI.m122464N7(SnsUserUI.this));
                SnsUserUI.m122466P7(SnsUserUI.this, 2);
            }
            if (SnsUserUI.m122467Q7(SnsUserUI.this) != null) {
                SnsUIAction Q7 = SnsUserUI.m122467Q7(SnsUserUI.this);
                Q7.getClass();
                SnsMethodCalculate.markStartTimeMs("startDownLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                LoadingMoreView loadingMoreView = Q7.f278859o;
                if (loadingMoreView != null) {
                    SnsMethodCalculate.markStartTimeMs("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
                    loadingMoreView.f276868j.cancel();
                    loadingMoreView.f276868j.reset();
                    loadingMoreView.f276863e.startAnimation(loadingMoreView.f276868j);
                    SnsMethodCalculate.markEndTimeMs("startLoadingAnimation", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
                }
                SnsMethodCalculate.markEndTimeMs("startDownLoadingAnimation", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            }
            SnsMethodCalculate.markEndTimeMs("onLoadingMore", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: f */
        public View mo132988f() {
            SnsMethodCalculate.markStartTimeMs("getRootBgView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            View findViewById = SnsUserUI.this.findViewById(C0966R.C0970id.bsa);
            SnsMethodCalculate.markEndTimeMs("getRootBgView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            return findViewById;
        }

        /* renamed from: g */
        public void mo132989g(AbsListView absListView, int i) {
            SnsMethodCalculate.markStartTimeMs("onListViewScoll", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            Log.m105925i("MicroMsg.SnsUserUI", "onListViewScoll %s", Integer.valueOf(i));
            if (i == 2) {
                WXHardCoderJNI a = C40318k.m43492a();
                boolean hcSNSUserScrollEnable = C40318k.m43492a().getHcSNSUserScrollEnable();
                SnsUserUI snsUserUI = SnsUserUI.this;
                int i2 = SnsUserUI.f278981R;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                int i3 = snsUserUI.f279008q;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                a.stopPerformance(hcSNSUserScrollEnable, i3);
                SnsUserUI snsUserUI2 = SnsUserUI.this;
                int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcSNSUserScrollEnable(), C40318k.m43492a().getHcSNSUserScrollDelay(), C40318k.m43492a().getHcSNSUserScrollCPU(), C40318k.m43492a().getHcSNSUserScrollIO(), C40318k.m43492a().getHcSNSUserScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcSNSUserScrollTimeout(), 704, C40318k.m43492a().getHcSNSUserScrollAction(), "MicroMsg.SnsUserUI");
                SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI2.f279008q = startPerformance;
                SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                SnsUserUI snsUserUI3 = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                int i4 = snsUserUI3.f279008q;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                Log.m105925i("MicroMsg.SnsUserUI", "summer hardcoder sns startPerformance [%s]", Integer.valueOf(i4));
            }
            SnsMethodCalculate.markEndTimeMs("onListViewScoll", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        public View getMaskView() {
            SnsMethodCalculate.markStartTimeMs("getMaskView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            View findViewById = SnsUserUI.this.findViewById(C0966R.C0970id.jsr);
            SnsMethodCalculate.markEndTimeMs("getMaskView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            return findViewById;
        }

        public int getType() {
            SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            return 2;
        }

        /* renamed from: h */
        public void mo132992h(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: i */
        public void mo132993i() {
            SnsMethodCalculate.markStartTimeMs("onLoadingTap", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            if (SnsUserUI.m122458H7(SnsUserUI.this) == null || !SnsUserUI.m122458H7(SnsUserUI.this).mo133859w()) {
                C5431p1.C5432a O7 = SnsUserUI.m122465O7(SnsUserUI.this);
                getType();
                String I7 = SnsUserUI.m122459I7(SnsUserUI.this);
                SnsUserUI snsUserUI = SnsUserUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                boolean z = snsUserUI.f279004j;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                O7.mo6413d(2, I7, z, SnsUserUI.m122462L7(SnsUserUI.this), SnsUserUI.m122464N7(SnsUserUI.this));
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("increaseAlbumDragCount", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                snsReportHelper.f275562s.f266219k++;
                SnsMethodCalculate.markEndTimeMs("increaseAlbumDragCount", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
            SnsMethodCalculate.markEndTimeMs("onLoadingTap", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: j */
        public ListView mo132994j() {
            SnsMethodCalculate.markStartTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            ListView listView = (ListView) SnsUserUI.this.findViewById(C0966R.C0970id.jv8);
            SnsMethodCalculate.markEndTimeMs("getSnsListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            return listView;
        }

        /* renamed from: k */
        public void mo132995k(C102267u uVar) {
            SnsMethodCalculate.markStartTimeMs("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            SnsUserUI snsUserUI = SnsUserUI.this;
            int i = SnsUserUI.f278981R;
            SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            snsUserUI.f278989H = uVar;
            SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            SnsUserUI snsUserUI2 = SnsUserUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            snsUserUI2.getClass();
            SnsMethodCalculate.markStartTimeMs("updateDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            boolean T7 = (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) ? snsUserUI2.mo133106T7() : snsUserUI2.mo133106T7();
            Log.m105925i("MicroMsg.SnsUserUI", "username:%s, datePickerEnable:%s", snsUserUI2.f279002h, Boolean.valueOf(T7));
            if (!Util.isEqual(snsUserUI2.f279003i, snsUserUI2.f279002h) || !T7) {
                snsUserUI2.f279015x.setVisibility(8);
                snsUserUI2.f279013v.setOnClickListener((View.OnClickListener) null);
            } else {
                snsUserUI2.f279015x.setVisibility(0);
                snsUserUI2.f279013v.setOnClickListener(new C96222s7(snsUserUI2));
            }
            SnsMethodCalculate.markEndTimeMs("updateDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            SnsMethodCalculate.markEndTimeMs("onSnsUserDateUpdate", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }

        /* renamed from: l */
        public MMOverScrollView mo132996l() {
            SnsMethodCalculate.markStartTimeMs("getSnsPushDownView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            MMOverScrollView mMOverScrollView = (MMOverScrollView) SnsUserUI.this.findViewById(C0966R.C0970id.jvh);
            SnsMethodCalculate.markEndTimeMs("getSnsPushDownView", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            return mMOverScrollView;
        }

        public void onPostEnd(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
            if (SnsUserUI.m122458H7(SnsUserUI.this) != null) {
                C96198r5 H7 = SnsUserUI.m122458H7(SnsUserUI.this);
                H7.getClass();
                SnsMethodCalculate.markStartTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                C96236u5 u5Var = H7.f281059w;
                if (u5Var != null) {
                    SnsMethodCalculate.markStartTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
                    if (LL == null || LL.getTimeLine().ContentObj == null || u5Var.f281215d.size() <= 0) {
                        SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    } else {
                        boolean z2 = false;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= u5Var.f281215d.size()) {
                                break;
                            } else if (u5Var.f281215d.get(i2).getLocalid() == LL.getLocalid()) {
                                u5Var.f281215d.remove(i2);
                                z2 = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (!z2) {
                            SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        } else {
                            u5Var.f281215d.add(LL);
                            u5Var.mo133903f();
                            u5Var.mo133902e();
                            SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("updateItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            }
            SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.ui.SnsUserUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$l */
    public class C95695l extends C98244q.C98247c {
        public C95695l() {
        }

        /* renamed from: c */
        public void mo132975c(boolean z) {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
            Log.m105919d("MicroMsg.SnsUserUI", "onTouchEnd: isPullDown=[%b]", Boolean.valueOf(z));
            if (!z) {
                SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
                return;
            }
            if (SnsUserUI.m122467Q7(SnsUserUI.this).mo133034l()) {
                SnsUserUI.m122467Q7(SnsUserUI.this).mo133030h();
            }
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.SnsUserUI$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$m */
    public class C95696m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f279025d;

        public C95696m(String str) {
            this.f279025d = str;
        }

        public void run() {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$6");
            SnsUserUI snsUserUI = SnsUserUI.this;
            String str = this.f279025d;
            int i = SnsUserUI.f278981R;
            SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            snsUserUI.getClass();
            SnsMethodCalculate.markStartTimeMs("setupRptInfo", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            SnsUserBehaviourInfoStruct B = SnsReportHelper.f275506m0.mo131341B();
            B.f266212d = B.mo86045b("OwnerUsername", snsUserUI.f279002h, true);
            if (snsUserUI.f279004j) {
                SnsReportHelper.f275506m0.mo131341B().f266214f = 1;
            } else {
                SnsReportHelper.f275506m0.mo131341B().f266214f = 0;
            }
            SnsReportHelper.f275506m0.mo131341B().f266213e = (long) snsUserUI.f279007p;
            SnsUserBehaviourInfoStruct B2 = SnsReportHelper.f275506m0.mo131341B();
            C100399d0 Xx0 = C94866e1.Xx0();
            String str2 = snsUserUI.f279002h;
            Xx0.getClass();
            SnsMethodCalculate.markStartTimeMs("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            C100398c0 Yt = Xx0.mo139782Yt(str2);
            String str3 = "run";
            if (Yt.field_snsBgId != 0 || (!Util.isNullOrNil(Yt.field_bgId) && !Yt.field_bgId.equals("0"))) {
                SnsMethodCalculate.markEndTimeMs("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                z = true;
            } else {
                SnsMethodCalculate.markEndTimeMs("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                z = false;
            }
            B2.f266229u = z ? 1 : 0;
            SnsReportHelper.f275506m0.mo131341B().f266230v = Util.isNullOrNil(str) ? 0 : 1;
            SnsMethodCalculate.markEndTimeMs("setupRptInfo", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.SnsUserUI$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$n */
    public class C95697n implements View.OnClickListener {
        public C95697n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUserUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$7");
            C5431p1.C5432a O7 = SnsUserUI.m122465O7(SnsUserUI.this);
            ((C95694k) SnsUserUI.m122460J7(SnsUserUI.this)).getType();
            String I7 = SnsUserUI.m122459I7(SnsUserUI.this);
            boolean L7 = SnsUserUI.m122462L7(SnsUserUI.this);
            SnsUserUI snsUserUI = SnsUserUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            Long l = snsUserUI.f278986E;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            O7.mo6415f(2, I7, 0, L7, l.longValue(), SnsUserUI.m122464N7(SnsUserUI.this));
            SnsUserUI.m122466P7(SnsUserUI.this, 0);
            SnsUserUI.m122461K7(SnsUserUI.this);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUserUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$o */
    public class C95698o implements Runnable {
        public C95698o() {
        }

        public void run() {
            int i;
            Resources resources;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$8");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int statusHeight = KeyBoardUtil.getStatusHeight(SnsUserUI.this);
            if (KeyBoardUtil.isPortOrientation(SnsUserUI.this)) {
                resources = SnsUserUI.this.getResources();
                i = C0966R.dimen.f3679b9;
            } else {
                resources = SnsUserUI.this.getResources();
                i = C0966R.dimen.f3678b8;
            }
            layoutParams.topMargin = statusHeight + resources.getDimensionPixelSize(i);
            SnsUserUI snsUserUI = SnsUserUI.this;
            int i2 = SnsUserUI.f278981R;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            FrameLayout frameLayout = snsUserUI.f279012u;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            frameLayout.setLayoutParams(layoutParams);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$p */
    public class C95699p extends C95700q {
        public C95699p(SnsUserUI snsUserUI) {
            super();
        }

        /* renamed from: b */
        public void mo133118b(int i, int i2) {
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$9");
            SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            Log.m105925i("MicroMsg.SnsUserUI", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b ", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(SnsUserUI.m122462L7(SnsUserUI.this)));
            C60960c.f173618a.mo85926j("RecordMediaReporter", "moment_sessionid_", C102236a0.m134754l());
            SnsUserUI.m122458H7(SnsUserUI.this).f281040J = i3;
            if (!SnsUserUI.m122462L7(SnsUserUI.this) || i4 != -1) {
                Intent intent = new Intent(SnsUserUI.this, SnsGalleryUI.class);
                intent.putExtra("sns_gallery_userName", SnsUserUI.m122459I7(SnsUserUI.this));
                intent.putExtra("sns_gallery_is_self", SnsUserUI.m122462L7(SnsUserUI.this));
                intent.putExtra("sns_gallery_localId", i3);
                intent.putExtra("sns_source", SnsUserUI.m122464N7(SnsUserUI.this));
                C96198r5 H7 = SnsUserUI.m122458H7(SnsUserUI.this);
                H7.getClass();
                SnsMethodCalculate.markStartTimeMs("getStTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i5 = H7.f281032B;
                SnsMethodCalculate.markEndTimeMs("getStTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_st_time", i5);
                C96198r5 H72 = SnsUserUI.m122458H7(SnsUserUI.this);
                H72.getClass();
                SnsMethodCalculate.markStartTimeMs("getEdTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i6 = H72.f281033C;
                SnsMethodCalculate.markEndTimeMs("getEdTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_ed_time", i6);
                intent.putExtra("key_from_scene", 4);
                if (SnsUserUI.m122458H7(SnsUserUI.this) != null) {
                    intent.putExtra("sns_gallery_limit_seq", SnsUserUI.m122458H7(SnsUserUI.this).mo133855s());
                    SnsUserUI.m122465O7(SnsUserUI.this).mo6419p(SnsUserUI.m122459I7(SnsUserUI.this), SnsUserUI.m122458H7(SnsUserUI.this).mo133860x(i3, i4));
                    C96198r5 H73 = SnsUserUI.m122458H7(SnsUserUI.this);
                    H73.getClass();
                    SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    int i7 = H73.f281041K;
                    SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    intent.putExtra("sns_gallery_position", i7);
                }
                SnsUserUI.this.startActivityForResult(intent, 8);
            } else {
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING;
                SnsMethodCalculate.markStartTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
                C94866e1.Wx0().mo60187jo(false);
                C35285a0 qq = C94866e1.Wx0().mo60188qq("draft_normal");
                if (qq != null) {
                    byte[] bArr = qq.field_draft;
                    if (!Util.isNullOrNil(bArr)) {
                        C86709a0.m107528h();
                        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
                        SnsEditDraftStruct snsEditDraftStruct = new SnsEditDraftStruct();
                        snsEditDraftStruct.mo126630s();
                        snsEditDraftStruct.f266008d = snsEditDraftStruct.mo86045b("SessionId", str, true);
                        snsEditDraftStruct.mo86054n();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(bArr, 0, bArr.length);
                        obtain.setDataPosition(0);
                        try {
                            Intent intent2 = (Intent) Intent.CREATOR.createFromParcel(obtain);
                            intent2.addFlags(268435456);
                            intent2.setClass(SnsUserUI.this, SnsUploadUI.class);
                            intent2.putExtra("KSessionID", str);
                            SnsUserUI snsUserUI = SnsUserUI.this;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent2);
                            C117292a.m165358d(snsUserUI, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUserUI$SnsEventListener", "selectImageOrVideo", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            snsUserUI.startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(snsUserUI, "com/tencent/mm/plugin/sns/ui/SnsUserUI$SnsEventListener", "selectImageOrVideo", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
                        } catch (Exception unused) {
                            C94866e1.Wx0().mo60186Yt("draft_normal", (byte[]) null, 0);
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                        }
                    }
                }
                if (SnsTimeLineUI.m122313w8()) {
                    long c = C31543z5.m39453c();
                    String l = C102236a0.m134754l();
                    C115669n.INSTANCE.mo160131h(13822, 2, 2, l, Long.valueOf(c));
                    SnsUserUI.m122467Q7(SnsUserUI.this).mo133026B(1, 3);
                    SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
                } else {
                    C77407n nVar = new C77407n((Context) SnsUserUI.this, 1, false);
                    nVar.f225771i = new C96326y7(this);
                    nVar.f225782p = new C96331z7(this);
                    nVar.mo107573q();
                    SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
                }
            }
            SnsReportHelper.f275506m0.mo131371d(C94866e1.Yx0().mo139800LL(i3));
            SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUserUI$q */
    public class C95700q extends r5$$s {
        public C95700q() {
        }

        /* renamed from: a */
        public void mo133119a(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            Log.m105925i("MicroMsg.SnsUserUI", "click desc_count, localId = %d, position = %d", Integer.valueOf(i), Integer.valueOf(i2));
            SnsUserUI.m122458H7(SnsUserUI.this).f281040J = i;
            if (!SnsUserUI.m122462L7(SnsUserUI.this) || i2 != -1) {
                Intent intent = new Intent(SnsUserUI.this, SnsCommentDetailUI.class);
                intent.putExtra("INTENT_TALKER", SnsUserUI.m122459I7(SnsUserUI.this));
                intent.putExtra("INTENT_SNS_LOCAL_ID", C100417r0.m131420i("sns_table_", (long) i));
                intent.putExtra("INTENT_FROMGALLERY", false);
                SnsUserUI.this.startActivityForResult(intent, 12);
            } else {
                Log.m105924i("MicroMsg.SnsUserUI", "click desc_count, position = -1");
            }
            SnsMethodCalculate.markEndTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        }

        /* renamed from: c */
        public void mo133120c(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
            if (LL == null) {
                SnsMethodCalculate.markEndTimeMs("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
                return;
            }
            SnsUserUI.m122458H7(SnsUserUI.this).f281040J = i;
            if (LL.field_type == 15) {
                Intent intent = new Intent(SnsUserUI.this, SnsGalleryUI.class);
                intent.putExtra("sns_gallery_userName", SnsUserUI.m122459I7(SnsUserUI.this));
                intent.putExtra("sns_gallery_is_self", SnsUserUI.m122462L7(SnsUserUI.this));
                intent.putExtra("sns_gallery_localId", i);
                intent.putExtra("sns_source", SnsUserUI.m122464N7(SnsUserUI.this));
                C96198r5 H7 = SnsUserUI.m122458H7(SnsUserUI.this);
                H7.getClass();
                SnsMethodCalculate.markStartTimeMs("getStTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i3 = H7.f281032B;
                SnsMethodCalculate.markEndTimeMs("getStTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_st_time", i3);
                C96198r5 H72 = SnsUserUI.m122458H7(SnsUserUI.this);
                H72.getClass();
                SnsMethodCalculate.markStartTimeMs("getEdTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i4 = H72.f281033C;
                SnsMethodCalculate.markEndTimeMs("getEdTime", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_ed_time", i4);
                intent.putExtra("sns_video_scene", 4);
                intent.putExtra("key_from_scene", 4);
                if (SnsUserUI.m122458H7(SnsUserUI.this) != null) {
                    intent.putExtra("sns_gallery_limit_seq", SnsUserUI.m122458H7(SnsUserUI.this).mo133855s());
                    SnsUserUI.m122465O7(SnsUserUI.this).mo6419p(SnsUserUI.m122459I7(SnsUserUI.this), SnsUserUI.m122458H7(SnsUserUI.this).mo133860x(i, i2));
                    C96198r5 H73 = SnsUserUI.m122458H7(SnsUserUI.this);
                    H73.getClass();
                    SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    int i5 = H73.f281041K;
                    SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    intent.putExtra("sns_gallery_position", i5);
                }
                SnsUserUI.this.startActivityForResult(intent, 8);
            } else {
                Intent intent2 = new Intent();
                intent2.setClass(SnsUserUI.this, SnsCommentDetailUI.class);
                intent2.putExtra("INTENT_TALKER", LL.getUserName());
                intent2.putExtra("INTENT_NEED_RPT_FEED", true);
                intent2.putExtra("INTENT_SNS_LOCAL_ID", C100417r0.m131420i("sns_table_", (long) i));
                SnsUserUI.this.startActivityForResult(intent2, 12);
            }
            SnsReportHelper.f275506m0.mo131371d(LL);
            SnsMethodCalculate.markEndTimeMs("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        }
    }

    public SnsUserUI() {
        C40008f fVar = C40008f.f107254d;
        this.f278996P = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
                if (r5 != 7) goto L_0x0051;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUserUI$23"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r5 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r5
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    boolean r2 = r5 instanceof com.tencent.p014mm.autogen.events.MusicPlayerEvent
                    if (r2 == 0) goto L_0x0051
                    com.tencent.mm.autogen.events.MusicPlayerEvent$a r5 = r5.f9336d
                    int r5 = r5.f9337a
                    if (r5 == 0) goto L_0x0048
                    r2 = 1
                    if (r5 == r2) goto L_0x0048
                    r2 = 2
                    if (r5 == r2) goto L_0x0048
                    r2 = 3
                    if (r5 == r2) goto L_0x0048
                    r2 = 4
                    if (r5 == r2) goto L_0x0026
                    r2 = 7
                    if (r5 == r2) goto L_0x0048
                    goto L_0x0051
                L_0x0026:
                    java.lang.String r5 = "MicroMsg.SnsUserUI"
                    java.lang.String r2 = "musicPlayerListener error"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                    com.tencent.mm.plugin.sns.ui.SnsUserUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.this
                    com.tencent.mm.plugin.sns.ui.r5 r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.m122458H7(r5)
                    r5.notifyDataSetChanged()
                    com.tencent.mm.plugin.sns.ui.SnsUserUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.this
                    androidx.appcompat.app.AppCompatActivity r2 = r5.getContext()
                    r3 = 2131833332(0x7f1131f4, float:1.9299743E38)
                    java.lang.String r2 = r2.getString(r3)
                    com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.m122463M7(r5, r2)
                    goto L_0x0051
                L_0x0048:
                    com.tencent.mm.plugin.sns.ui.SnsUserUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.this
                    com.tencent.mm.plugin.sns.ui.r5 r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.m122458H7(r5)
                    r5.notifyDataSetChanged()
                L_0x0051:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r5 = 0
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.C9568723.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f278997Q = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                Log.m105924i("MicroMsg.SnsUserUI", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.SnsUserUI", "musicCheckErrorListener, must has error.");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                } else {
                    SnsUserUI.m122463M7(SnsUserUI.this, !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : SnsUserUI.this.getContext().getString(C0966R.string.f361077h32));
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserUI$24");
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static /* synthetic */ C96198r5 m122458H7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        C96198r5 r5Var = snsUserUI.f278998d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return r5Var;
    }

    /* renamed from: I7 */
    public static /* synthetic */ String m122459I7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        String str = snsUserUI.f279002h;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return str;
    }

    /* renamed from: J7 */
    public static /* synthetic */ SnsUIAction.C95669n m122460J7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsUIAction.C95669n nVar = snsUserUI.f279010s;
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return nVar;
    }

    /* renamed from: K7 */
    public static void m122461K7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.getClass();
        SnsMethodCalculate.markStartTimeMs("showLoadingState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        Log.m105924i("MicroMsg.SnsUserUI", "showLoadingState: ");
        SnsUIAction snsUIAction = snsUserUI.f279000f;
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (snsUIAction.getSnsListView() != null) {
            snsUIAction.getSnsListView().setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUserUI.f279016y.setVisibility(0);
        snsUserUI.f279017z.setVisibility(8);
        snsUserUI.f278982A.setVisibility(0);
        snsUserUI.f278990I.reset();
        snsUserUI.f279011t.startAnimation(snsUserUI.f278990I);
        SnsMethodCalculate.markEndTimeMs("showLoadingState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: L7 */
    public static /* synthetic */ boolean m122462L7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean z = snsUserUI.f279005n;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return z;
    }

    /* renamed from: M7 */
    public static void m122463M7(SnsUserUI snsUserUI, String str) {
        SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.getClass();
        SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        C76912y0.m92767f(snsUserUI.getContext(), str);
        SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: N7 */
    public static /* synthetic */ int m122464N7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        int i = snsUserUI.f279006o;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return i;
    }

    /* renamed from: O7 */
    public static /* synthetic */ C5431p1.C5432a m122465O7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        C5431p1.C5432a aVar = snsUserUI.f279001g;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return aVar;
    }

    /* renamed from: P7 */
    public static /* synthetic */ int m122466P7(SnsUserUI snsUserUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.f278987F = i;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return i;
    }

    /* renamed from: Q7 */
    public static /* synthetic */ SnsUIAction m122467Q7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsUIAction snsUIAction = snsUserUI.f279000f;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return snsUIAction;
    }

    /* renamed from: R7 */
    public static /* synthetic */ boolean m122468R7(SnsUserUI snsUserUI) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean z = snsUserUI.f278988G;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return z;
    }

    /* renamed from: B0 */
    public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (this.f278998d.mo133859w()) {
            Log.m105924i("MicroMsg.SnsUserUI", "skip data callback, because this is search mode now.");
            SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            return;
        }
        Log.m105924i("MicroMsg.SnsUserUI", "onFpSetSize: ");
        this.f279000f.mo133046x();
        C96198r5 r5Var = this.f278998d;
        if (r5Var != null) {
            SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            r5Var.f281055s = str;
            SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            String s = this.f278998d.mo133855s();
            if (str.compareTo(s) < 0) {
                Log.m105925i("MicroMsg.SnsUserUI", "onFpSetSize addsize %s %s isNeedNP %s", str, s, Boolean.valueOf(hVar.mo131176w()));
                this.f278998d.mo133837g();
            } else {
                Log.m105925i("MicroMsg.SnsUserUI", "onFpSetSize addsize passed %s %s isNeedNP %s", str, s, Boolean.valueOf(hVar.mo131176w()));
            }
            C96198r5 r5Var2 = this.f278998d;
            r5Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("setUpAll", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            r5Var2.f281037G = true;
            if (r5Var2.f281036F) {
                C96245v5 v5Var = r5Var2.f281060x;
                v5Var.getClass();
                SnsMethodCalculate.markStartTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                v5Var.f281237h = true;
                SnsMethodCalculate.markEndTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            }
            SnsMethodCalculate.markEndTimeMs("setUpAll", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            this.f278998d.mo133861z("");
        }
        mo133107U7();
        if ((z || !Util.isNullOrNil(hVar.mo131161C())) && !this.f279003i.equals(this.f279002h)) {
            SnsUIAction snsUIAction = this.f279000f;
            snsUIAction.f278863s = true;
            snsUIAction.mo133045w(i, hVar.mo131161C());
        } else {
            if (this.f279003i.equals(this.f279002h) && hVar.mo131174p0() != 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, Long.valueOf(hVar.mo131174p0()));
                C96198r5 r5Var3 = this.f278998d;
                long p0 = hVar.mo131174p0();
                r5Var3.getClass();
                SnsMethodCalculate.markStartTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                if (0 != r5Var3.f281034D) {
                    SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                } else {
                    r5Var3.f281034D = p0;
                    r5Var3.f281035E = 0;
                    SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                }
            }
            this.f279000f.f278863s = hVar.mo131175t0();
            if (hVar.mo131175t0()) {
                this.f279000f.mo133043u(hVar.mo131161C());
            } else if (hVar.mo131176w()) {
                C5431p1.C5432a aVar = this.f279001g;
                ((C95694k) this.f279010s).getType();
                aVar.mo6414e(2, this.f279002h, this.f279004j, this.f279005n, this.f279006o);
            }
            if (i == 207) {
                SnsUIAction snsUIAction2 = this.f279000f;
                snsUIAction2.f278863s = true;
                snsUIAction2.mo133045w(i, hVar.mo131161C());
            }
        }
        this.f279000f.mo133038p();
        SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        Log.m105924i("MicroMsg.SnsUserUI", "onNpAddSize: ");
        C94866e1.ly0().removeCallbacks(this.f278991J);
        if (this.f278998d.mo133859w()) {
            Log.m105924i("MicroMsg.SnsUserUI", "skip data callback, because this is search mode now.");
            SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            return;
        }
        this.f279000f.mo133046x();
        C96198r5 r5Var = this.f278998d;
        if (r5Var != null) {
            boolean D0 = hVar.mo131163D0();
            SnsMethodCalculate.markStartTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            r5Var.f281056t = D0;
            SnsMethodCalculate.markEndTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            C96198r5 r5Var2 = this.f278998d;
            r5Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            r5Var2.f281055s = str2;
            SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            String s = this.f278998d.mo133855s();
            if (str2.compareTo(s) < 0) {
                Log.m105925i("MicroMsg.SnsUserUI", "onNpAddSize addsize %s %s", str2, s);
                this.f278998d.mo133837g();
            } else if (str2.compareTo(s) > 0) {
                C5431p1.C5432a aVar = this.f279001g;
                ((C95694k) this.f279010s).getType();
                aVar.mo6414e(2, this.f279002h, this.f279004j, this.f279005n, this.f279006o);
                Log.m105925i("MicroMsg.SnsUserUI", "onNpAddSize addsize passed %s %s", str2, s);
            } else {
                Log.m105925i("MicroMsg.SnsUserUI", "onNpAddSize else passed %s %s", str2, s);
            }
            this.f278998d.mo133861z("");
        }
        if (!z || this.f279003i.equals(this.f279002h)) {
            if (this.f279003i.equals(this.f279002h) && hVar.mo131174p0() != 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, Long.valueOf(hVar.mo131174p0()));
                C96198r5 r5Var3 = this.f278998d;
                long p0 = hVar.mo131174p0();
                r5Var3.getClass();
                SnsMethodCalculate.markStartTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                if (0 != r5Var3.f281034D) {
                    SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                } else {
                    r5Var3.f281034D = p0;
                    r5Var3.f281035E = 0;
                    SnsMethodCalculate.markEndTimeMs("setRecentLimitedID", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                }
            }
            this.f279000f.f278863s = hVar.mo131175t0();
            Log.m105925i("MicroMsg.SnsUserUI", "onNpAddSize: isDownAll=[%b]", Boolean.valueOf(hVar.mo131175t0()));
            if (hVar.mo131175t0()) {
                this.f279000f.mo133043u(hVar.mo131161C());
            } else {
                this.f279000f.mo133044v();
            }
        } else {
            SnsUIAction snsUIAction = this.f279000f;
            snsUIAction.f278863s = true;
            snsUIAction.mo133045w(i, hVar.mo131161C());
        }
        SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: S7 */
    public final void mo133105S7() {
        SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (C61104a.m71665u(this)) {
            SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        } else if (C61104a.m71649e(this)) {
            SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        } else {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.CAMERA", 18, "", "");
            Log.m105919d("MicroMsg.SnsUserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this);
            if (!z1) {
                SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                return;
            }
            SightParams sightParams = new SightParams(2, 0);
            String l = C97842b.m126295l(C98398h0.wx0().ca0());
            String n = C97842b.m126297n(l);
            C94992f fVar = C94992f.f275600a;
            VideoTransPara videoTransPara = sightParams.f248452f;
            RecordConfigProvider a = fVar.mo131399a(l, n, videoTransPara, videoTransPara.f267170h * 1000, 49);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ignore_remux_without_edit, false)) {
                a.f272919d = 2;
            }
            VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
            videoCaptureReportInfo.f272940d = 2;
            a.f272908I = videoCaptureReportInfo;
            ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM(this, a, new C95690d());
            SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        }
    }

    /* renamed from: T7 */
    public final boolean mo133106T7() {
        SnsMethodCalculate.markStartTimeMs("isDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        C102267u uVar = this.f278989H;
        boolean z = uVar != null && !Util.isNullOrNil((List) uVar.f301197a) && !Util.isNullOrNil((List) this.f278989H.f301198b);
        SnsMethodCalculate.markEndTimeMs("isDatePickerEnable", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return z;
    }

    /* renamed from: U7 */
    public boolean mo133107U7() {
        SnsMethodCalculate.markStartTimeMs("isShowTogether", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        if (multiProcessMMKV.getBoolean("ShowWithTaEntrance_" + this.f279002h, false)) {
            SnsMethodCalculate.markStartTimeMs("isTogetherHistoryEntrance", "com.tencent.mm.plugin.sns.model.SnsConfig");
            SnsMethodCalculate.markEndTimeMs("isTogetherHistoryEntrance", "com.tencent.mm.plugin.sns.model.SnsConfig");
        }
        SnsMethodCalculate.markEndTimeMs("isShowTogether", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return false;
    }

    /* renamed from: V7 */
    public final void mo133108V7() {
        SnsMethodCalculate.markStartTimeMs("showListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        Log.m105924i("MicroMsg.SnsUserUI", "showListView: ");
        SnsUIAction snsUIAction = this.f279000f;
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("showListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (snsUIAction.getSnsListView() != null) {
            snsUIAction.getSnsListView().setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("showListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f279016y.setVisibility(8);
        this.f279017z.setVisibility(8);
        this.f278982A.setVisibility(8);
        this.f278990I.cancel();
        SnsMethodCalculate.markEndTimeMs("showListView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        C94866e1.ly0().removeCallbacks(this.f278991J);
        C96198r5 r5Var = this.f278998d;
        if (r5Var != null && r5Var.mo133859w()) {
            Log.m105925i("MicroMsg.SnsUserUI", "onOtherAddSize: isOnRecentErr=%b, recentErrType=%d", Boolean.valueOf(z), Integer.valueOf(i));
            this.f279000f.mo133046x();
            if (z || i == 0 || hVar.mo131164M0() != 0) {
                mo133108V7();
                if (((hVar instanceof C94941r0) && hVar.mo131164M0() == 1) || hVar.mo131164M0() == 0) {
                    C96198r5 r5Var2 = this.f278998d;
                    C94941r0 r0Var = (C94941r0) hVar;
                    r0Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("getPrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                    long j = r0Var.f275170r;
                    SnsMethodCalculate.markEndTimeMs("getPrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUserPage");
                    r5Var2.getClass();
                    SnsMethodCalculate.markStartTimeMs("updatePrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    r5Var2.f281057u = j;
                    SnsMethodCalculate.markEndTimeMs("updatePrePageDayEndFlagFeedId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                }
                C96198r5 r5Var3 = this.f278998d;
                boolean D0 = hVar.mo131163D0();
                r5Var3.getClass();
                SnsMethodCalculate.markStartTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                r5Var3.f281056t = D0;
                SnsMethodCalculate.markEndTimeMs("setPrivacy", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                this.f278998d.mo133861z("");
                Log.m105919d("MicroMsg.SnsUserUI", "onOtherAddSize: isDownAll=[%b], isUpAll=[%b]", Boolean.valueOf(hVar.mo131175t0()), Boolean.valueOf(hVar.mo131167g1()));
                if (hVar.mo131175t0()) {
                    this.f279000f.mo133043u(hVar.mo131161C());
                } else if (hVar.mo131167g1()) {
                    C96198r5 r5Var4 = this.f278998d;
                    r5Var4.getClass();
                    SnsMethodCalculate.markStartTimeMs("setUpAll", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    r5Var4.f281037G = true;
                    if (r5Var4.f281036F) {
                        C96245v5 v5Var = r5Var4.f281060x;
                        v5Var.getClass();
                        SnsMethodCalculate.markStartTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                        v5Var.f281237h = true;
                        SnsMethodCalculate.markEndTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    }
                    SnsMethodCalculate.markEndTimeMs("setUpAll", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    this.f279000f.mo133028D(false);
                }
            } else {
                mo133109W7();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: W7 */
    public final void mo133109W7() {
        SnsMethodCalculate.markStartTimeMs("showNetworkState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        Log.m105924i("MicroMsg.SnsUserUI", "showNetworkState: ");
        SnsUIAction snsUIAction = this.f279000f;
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        if (snsUIAction.getSnsListView() != null) {
            snsUIAction.getSnsListView().setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("hideListViewBySearch", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.f279016y.setVisibility(0);
        this.f279017z.setVisibility(0);
        this.f278982A.setVisibility(8);
        this.f278990I.cancel();
        SnsMethodCalculate.markEndTimeMs("showNetworkState", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return C0966R.C0971layout.c45;
    }

    public void initView() {
        String str;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        this.f279012u = (FrameLayout) findViewById(C0966R.C0970id.jxb);
        this.f279013v = (RelativeLayout) findViewById(C0966R.C0970id.jxa);
        this.f279014w = (TextView) findViewById(C0966R.C0970id.jx_);
        this.f279015x = (ImageView) findViewById(C0966R.C0970id.f359275jx3);
        this.f278983B = findViewById(C0966R.C0970id.f359274jx2);
        this.f279016y = (RelativeLayout) findViewById(C0966R.C0970id.jx7);
        this.f279017z = (RelativeLayout) findViewById(C0966R.C0970id.jx5);
        this.f278982A = (LinearLayout) findViewById(C0966R.C0970id.jx4);
        this.f279011t = (ImageView) findViewById(C0966R.C0970id.jx6);
        this.f279015x.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_arrow, getContext().getResources().getColor(C0966R.color.f3552xi)));
        this.f279017z.setOnClickListener(new C95697n());
        this.f279012u.post(new C95698o());
        C96198r5 r5Var = new C96198r5(this.f278999e, this, new C95699p(this), this.f279002h, new C95688a());
        this.f278998d = r5Var;
        this.f279000f.f278851d.setAdapter(r5Var);
        this.f279000f.f278851d.setOnItemClickListener(new C43093b(this));
        this.f279000f.f278851d.postDelayed(new C95689c(), 500);
        setBackBtn(this.f278995N, C0966R.raw.actionbar_icon_dark_back);
        this.f278990I.setDuration(1000);
        this.f278990I.setRepeatCount(-1);
        this.f278990I.setInterpolator(new LinearInterpolator());
        SnsMethodCalculate.markStartTimeMs("resumeActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markStartTimeMs("initOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        mo133107U7();
        SnsReportHelper.f275506m0.f275545g = SnsUserBehaviourInfoStruct.C92613a.HIDE_ENTRANCE;
        if (this.f279005n) {
            addIconOptionMenu(0, getString(C0966R.string.f361382jf2), (int) C0966R.raw.icons_filled_comment, (MenuItem.OnMenuItemClickListener) new C43154u7(this));
        }
        SnsMethodCalculate.markEndTimeMs("initOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        setBackBtn(this.f278995N, C0966R.raw.actionbar_icon_dark_back);
        SnsMethodCalculate.markStartTimeMs("initMMTitle", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (this.f279005n) {
            setMMTitle((int) C0966R.string.f8197a8);
        } else {
            Log.m105919d("MicroMsg.SnsUserUI", "SnsUserUI, userName:%s, title:%s", this.f279002h, this.f279000f.f278855h);
            C72996z1 z1Var = C94866e1.Jx0().get(this.f279002h);
            if (z1Var != null) {
                Log.m105918d("MicroMsg.SnsUserUI", "SnsUserUI, contact is not null");
                str = z1Var.mo62898f();
            } else {
                Log.m105919d("MicroMsg.SnsUserUI", "SnsUserUI, contact is null, title:%s", this.f279000f.f278855h);
                str = this.f279000f.f278855h;
            }
            setMMTitle(C102236a0.m134771t0(str));
        }
        SnsMethodCalculate.markEndTimeMs("initMMTitle", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("resumeActionBar", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        Log.m105925i("MicroMsg.SnsUserUI", "on activity result, %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (5985 == i && i2 == -1) {
            finish();
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.f279000f.mo133039q(i, i2, intent);
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (!this.f279000f.mo133040r()) {
            finish();
        }
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x020f, code lost:
        if ((((re0.C36313j) ((p239sv.C77792p) di3.C86312j.m106911c(p239sv.C77792p.class)).T20()).mo60611Lo(r0.f279002h) & 2) > 0) goto L_0x0211;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            java.lang.String r2 = "onCreate"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsUserUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.p014mm.p136ui.C85875k4.m106195m0(r18)
            com.tencent.mm.ui.MMActivityController r4 = r0.mController
            r5 = 0
            r6 = 2
            if (r4 == 0) goto L_0x0019
            r4.f348089b0 = r6
            r4.f348091c0 = r5
        L_0x0019:
            r4 = 1
            r0.customfixStatusbar(r4)
            ks2.f r7 = ks2.C99181f.f290857a
            java.lang.String r7 = "startSession"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            ks2.x r9 = ks2.C99204x.f290901d
            java.lang.String r10 = "SnsImageLoadReporter"
            o40.C61926c.m72661F(r10, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            super.onCreate(r19)
            f40.e r7 = f40.C86709a0.m107523b()
            boolean r7 = r7.mo121114l()
            if (r7 != 0) goto L_0x0045
            r18.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0045:
            di3.d r7 = di3.C86312j.m106911c(r1)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_moments_interaction_enabled_v2
            boolean r7 = r7.mo58784wf(r8, r4)
            r0.f278999e = r7
            java.lang.String r8 = "MicroMsg.SnsUserUI"
            if (r7 == 0) goto L_0x005d
            java.lang.String r7 = "SnsUserUI moments interaction open"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            goto L_0x0062
        L_0x005d:
            java.lang.String r7 = "SnsUserUI moments interaction close"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
        L_0x0062:
            java.lang.String r7 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r7)
            java.lang.String r9 = "SnsMMKVSnsUI"
            r7.encode((java.lang.String) r9, (boolean) r4)
            java.lang.String r7 = "fixActionBarStuff"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            r9 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r9 = r0.findViewById(r9)
            r0.f278994M = r9
            if (r9 == 0) goto L_0x00a6
            boolean r9 = in3.C87771d.f254121g
            if (r9 != 0) goto L_0x0082
            goto L_0x00a6
        L_0x0082:
            in3.d r9 = in3.C87771d.m109203b(r18)
            com.tencent.mm.plugin.sns.ui.v7 r10 = new com.tencent.mm.plugin.sns.ui.v7
            r10.<init>(r0)
            r0.mStatusBarHeightCallback = r10
            r9.mo122180d(r10)
            android.view.Window r9 = r18.getWindow()
            android.view.View r9 = r9.getDecorView()
            r9.requestApplyInsets()
            android.view.Window r9 = r18.getWindow()
            in3.C87773e.m109211d(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x00a9
        L_0x00a6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x00a9:
            android.view.Window r7 = r18.getWindow()
            android.view.View r7 = r7.getDecorView()
            r9 = 1280(0x500, float:1.794E-42)
            r7.setSystemUiVisibility(r9)
            androidx.appcompat.app.AppCompatActivity r7 = r18.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r7 = r7.getColor(r9)
            r0.setActionbarColor(r7)
            androidx.appcompat.app.AppCompatActivity r7 = r18.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131099650(0x7f060002, float:1.781166E38)
            int r7 = r7.getColor(r9)
            r0.setNavigationbarColor(r7)
            com.tencent.mm.plugin.sns.ui.SnsUserUI$i r7 = new com.tencent.mm.plugin.sns.ui.SnsUserUI$i
            r7.<init>(r0)
            com.tencent.mm.plugin.sns.ui.SnsUserUI$j r9 = new com.tencent.mm.plugin.sns.ui.SnsUserUI$j
            r9.<init>(r0)
            r0.setTitleBarClickListener(r7, r9)
            com.tencent.mm.plugin.sns.model.p1$a r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.dy0()
            r0.f279001g = r7
            android.content.Intent r7 = r18.getIntent()
            java.lang.String r9 = "sns_source"
            int r7 = r7.getIntExtra(r9, r5)
            r0.f279006o = r7
            android.content.Intent r7 = r18.getIntent()
            java.lang.String r9 = "sns_userName"
            java.lang.String r7 = r7.getStringExtra(r9)
            r0.f279002h = r7
            android.content.Intent r7 = r18.getIntent()
            java.lang.String r9 = "sns_rpt_scene"
            int r7 = r7.getIntExtra(r9, r5)
            r0.f279007p = r7
            java.lang.String r7 = r0.f279002h
            java.lang.String r9 = ""
            if (r7 != 0) goto L_0x011c
            r0.f279002h = r9
        L_0x011c:
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            java.lang.String r10 = r0.f279002h
            boolean r7 = r7.mo69724s3(r10)
            r0.f279004j = r7
            java.lang.String r7 = eb0.C75592q0.m90789s()
            r0.f279003i = r7
            java.lang.String r10 = r0.f279002h
            boolean r7 = r7.equals(r10)
            r0.f279005n = r7
            com.tencent.mm.storage.u3 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Jx0()
            android.content.Intent r10 = r18.getIntent()
            java.lang.String r11 = "sns_signature"
            java.lang.String r10 = r10.getStringExtra(r11)
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r9)
            android.content.Intent r11 = r18.getIntent()
            java.lang.String r12 = "sns_nickName"
            java.lang.String r11 = r11.getStringExtra(r12)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r9)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = r0.f279002h
            r12[r5] = r13
            java.lang.String r13 = r0.f279003i
            r12[r4] = r13
            java.lang.String r13 = "onCreate, userName:%s, selfName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r13, r12)
            java.lang.String r12 = r0.f279002h
            if (r12 == 0) goto L_0x018d
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x017e
            goto L_0x018d
        L_0x017e:
            java.lang.String r12 = r0.f279002h
            com.tencent.mm.storage.z1 r7 = r7.get(r12)
            java.lang.String r12 = r0.f279002h
            java.lang.String r13 = r0.f279003i
            boolean r12 = r12.equals(r13)
            goto L_0x0194
        L_0x018d:
            java.lang.String r12 = r0.f279003i
            com.tencent.mm.storage.z1 r7 = r7.get(r12)
            r12 = 1
        L_0x0194:
            java.lang.String r13 = r7.getUsername()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85843n5(r13)
            if (r13 == 0) goto L_0x01ae
            boolean r13 = r0.f279004j
            if (r13 != 0) goto L_0x01ab
            boolean r13 = r7.mo62927s3()
            if (r13 == 0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r13 = 0
            goto L_0x01ac
        L_0x01ab:
            r13 = 1
        L_0x01ac:
            r0.f279004j = r13
        L_0x01ae:
            boolean r13 = r0.f279004j
            if (r13 == 0) goto L_0x01e6
            oa1.d r13 = oa1.C117731d.m166007c()
            java.lang.String r14 = "clicfg_sns_reset_userpage_md5"
            java.lang.String r15 = "1"
            java.lang.String r13 = r13.mo182444f(r14, r15, r5, r4)
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r4)
            if (r13 <= 0) goto L_0x01e6
            java.lang.String r13 = "SnsUserUI resetMd5"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
            os2.d0 r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Xx0()
            java.lang.String r14 = r0.f279002h
            r13.getClass()
            java.lang.String r15 = "resetMd5"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.SnsExtStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
            os2.c0 r14 = r13.mo139782Yt(r14)
            r14.field_md5 = r9
            r13.mo139790nP(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
        L_0x01e6:
            long r13 = r7.f108320R1
            int r6 = (int) r13
            if (r6 <= 0) goto L_0x0232
            java.lang.String r6 = r0.f279002h
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85843n5(r6)
            if (r6 == 0) goto L_0x0211
            java.lang.Class<sv.p> r6 = p239sv.C77792p.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            sv.p r6 = (p239sv.C77792p) r6
            sv.r r6 = r6.T20()
            java.lang.String r9 = r0.f279002h
            re0.j r6 = (re0.C36313j) r6
            long r13 = r6.mo60611Lo(r9)
            r16 = 2
            long r13 = r13 & r16
            r16 = 0
            int r6 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x0214
        L_0x0211:
            java.lang.String r6 = r7.f149516U
            r10 = r6
        L_0x0214:
            java.lang.String r11 = r7.mo62909j3()
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r9 = r7.getUsername()
            r6[r5] = r9
            long r13 = r7.f108320R1
            int r7 = (int) r13
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            r7 = 2
            r6[r7] = r11
            java.lang.String r7 = "contact:user[%s] id[%d] nickname[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r6)
        L_0x0232:
            if (r12 == 0) goto L_0x0245
            eb0.o4 r6 = eb0.C75590o4.m90741b()
            if (r6 == 0) goto L_0x0245
            java.lang.String r10 = r6.f222068e
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r10
            java.lang.String r7 = "get self signature:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r6)
        L_0x0245:
            com.tencent.mm.plugin.sns.ui.SnsUIAction r6 = new com.tencent.mm.plugin.sns.ui.SnsUIAction
            r6.<init>(r0)
            r0.f279000f = r6
            java.lang.String r7 = r0.f279003i
            java.lang.String r8 = r0.f279002h
            boolean r9 = r0.f279005n
            java.lang.String r12 = "initData"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.SnsUIAction"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r6.f278843S = r7
            r6.f278844T = r8
            r6.f278845U = r11
            r6.f278846V = r10
            r6.f278847W = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            com.tencent.p014mm.plugin.sns.model.C94866e1.ny0(r18)
            com.tencent.mm.plugin.sns.ui.SnsUIAction r6 = r0.f279000f
            com.tencent.mm.plugin.sns.ui.SnsUserUI$k r7 = new com.tencent.mm.plugin.sns.ui.SnsUserUI$k
            r7.<init>()
            r0.f279010s = r7
            r6.getClass()
            java.lang.String r8 = "setUIActionCallback"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r13)
            r6.f278868x = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r13)
            com.tencent.mm.plugin.sns.ui.SnsUIAction r6 = r0.f279000f
            gv2.q$b r6 = r6.f278854g
            com.tencent.mm.plugin.sns.ui.SnsUserUI$l r7 = new com.tencent.mm.plugin.sns.ui.SnsUserUI$l
            r7.<init>()
            r6.mo137550f(r7)
            com.tencent.mm.plugin.sns.ui.SnsUIAction r6 = r0.f279000f
            r6.mo133041s(r5)
            android.content.Intent r5 = r18.getIntent()
            java.lang.Class r6 = r18.getClass()
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r5.setExtrasClassLoader(r6)
            r18.initView()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r5 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r5.mo131358S()
            com.tencent.mm.sdk.platformtools.MMHandler r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            com.tencent.mm.plugin.sns.ui.SnsUserUI$m r6 = new com.tencent.mm.plugin.sns.ui.SnsUserUI$m
            r6.<init>(r10)
            r5.post(r6)
            java.lang.String r5 = "updateNewLabelRangeControl"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_sns_group_dynamic_label_enable
            boolean r1 = r1.mo58784wf(r7, r4)
            mt2.C47101a.f126572a = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "updateNewLabelRangeControl enableNewGroupUI:"
            r1.append(r4)
            boolean r4 = mt2.C47101a.f126572a
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MicroMsg.SnsLabelRangeConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            o31.b r4 = o31.C11345b.SnsUserUI
            l31.e r1 = r1.mo86178qr(r0, r4)
            o31.a r4 = o31.C76986a.Album
            r1.mo86179qs(r0, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C5431p1.C5432a aVar;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", false);
        C94866e1.dy0().mo6411b(this.f279002h);
        C94866e1.ly0().removeCallbacks(this.f278991J);
        this.f279009r = true;
        C91998s.m115551f(getIntent());
        SnsUIAction snsUIAction = this.f279000f;
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l() && (aVar = this.f279001g) != null) {
            ((C95694k) this.f279010s).getType();
            aVar.mo6412c(this, 2);
        }
        SnsUIAction snsUIAction2 = this.f279000f;
        if (snsUIAction2 != null) {
            snsUIAction2.mo133042t();
        }
        int i = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("cleanSearchCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        long j = 0;
        C94897n1.f274987a = 0;
        C94897n1.f274988b = 0;
        SnsMethodCalculate.markEndTimeMs("cleanSearchCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        C87771d.m109203b(this).mo122182f(this.mStatusBarHeightCallback);
        super.onDestroy();
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("doSnsAlbumBehaviourReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct = snsReportHelper.f275562s;
        snsUserBehaviourInfoStruct.f266233y = snsReportHelper.f275545g;
        Object obj = C60960c.f173618a.mo85922f("SnsUserBehaviourInfo").f173614c.get("withFriendsStayTime");
        if (obj != null) {
            try {
                j = ((Long) obj).longValue();
            } catch (Exception unused) {
            }
        }
        snsUserBehaviourInfoStruct.f266232x = j;
        C60960c.f173618a.mo85918a("SnsUserBehaviourInfo");
        snsReportHelper.f275562s.f266216h = (long) ((ArrayList) snsReportHelper.f275563t).size();
        snsReportHelper.f275562s.f266231w = (long) ((ArrayList) snsReportHelper.f275564u).size();
        snsReportHelper.f275562s.f266217i = (long) ((ArrayList) snsReportHelper.f275565v).size();
        SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct2 = snsReportHelper.f275562s;
        snsUserBehaviourInfoStruct2.f266228t = snsUserBehaviourInfoStruct2.mo86045b("AlbumClickFeedListStr", Util.listToString(snsReportHelper.f275565v, "|"), true);
        SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct3 = snsReportHelper.f275562s;
        snsUserBehaviourInfoStruct3.f266218j = snsReportHelper.f275508B;
        snsUserBehaviourInfoStruct3.f266221m = (long) ((ArrayList) snsReportHelper.f275566w).size();
        snsReportHelper.f275562s.f266222n = (long) ((ArrayList) snsReportHelper.f275567x).size();
        SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct4 = snsReportHelper.f275562s;
        snsUserBehaviourInfoStruct4.f266223o = snsReportHelper.f275510D;
        snsUserBehaviourInfoStruct4.f266224p = (long) ((ArrayList) snsReportHelper.f275568y).size();
        snsReportHelper.f275562s.f266225q = (long) ((ArrayList) snsReportHelper.f275569z).size();
        SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct5 = snsReportHelper.f275562s;
        long j2 = snsReportHelper.f275512F;
        snsUserBehaviourInfoStruct5.f266226r = j2;
        snsUserBehaviourInfoStruct5.f266227s = snsReportHelper.f275508B + snsReportHelper.f275510D + j2;
        Log.m105919d("MicroMsg.SnsReportHelper", "doSnsAlbumBehaviourReport:\n %s", snsUserBehaviourInfoStruct5.mo1006q());
        snsReportHelper.f275562s.mo86054n();
        snsReportHelper.f275562s = new SnsUserBehaviourInfoStruct();
        snsReportHelper.mo131358S();
        SnsMethodCalculate.markEndTimeMs("doSnsAlbumBehaviourReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f278988G = false;
        C99181f fVar = C99181f.f290857a;
        SnsMethodCalculate.markStartTimeMs("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C61926c.m72661F("MicroMsg.Image.SnsImageLoadReporter", C99198r.f290892d);
        SnsMethodCalculate.markEndTimeMs("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onDrag() {
        SnsMethodCalculate.markStartTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.onDrag();
        SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onPause() {
        C89940c cVar;
        Class cls = C88146a.class;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSNSUserScrollEnable(), this.f279008q);
        this.f279008q = 0;
        this.f279000f.mo133047y();
        super.onPause();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f278992K = Math.max(0, ((long) ((int) cVar.f258449e)) - this.f278992K);
        }
        this.f278993L = Util.nowSecond() > this.f278993L ? Util.nowSecond() - this.f278993L : 1;
        C40318k.m43492a().reportFPS(704, C40318k.m43492a().getHcSNSUserScrollAction(), 1, this.f278992K, this.f278993L);
        this.f278992K = 0;
        this.f278993L = 0;
        this.f278996P.dead();
        this.f278997Q.dead();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.SnsUserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            return;
        }
        Log.m105925i("MicroMsg.SnsUserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 18) {
            if (iArr[0] == 0) {
                mo133105S7();
            } else {
                int i2 = "android.permission.CAMERA".equals(strArr[0]) ? C0966R.string.hhq : C0966R.string.f361130hi2;
                if (iArr[0] != 0) {
                    C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C43095g(), new C43096h(this));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onResume() {
        C89940c cVar;
        Class cls = C88146a.class;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        this.f278993L = Util.nowSecond();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f278992K = (long) ((int) cVar.f258449e);
        }
        C96198r5 r5Var = this.f278998d;
        if (r5Var != null) {
            r5Var.notifyDataSetChanged();
        }
        this.f279000f.mo133048z();
        this.f279000f.mo133038p();
        this.f278996P.alive();
        this.f278997Q.alive();
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.onStart();
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("albumPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper.f275507A = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("albumPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.onStop();
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("albumPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsReportHelper.f275507A != 0) {
            snsReportHelper.f275508B += System.currentTimeMillis() - snsReportHelper.f275507A;
            snsReportHelper.f275507A = 0;
        }
        SnsMethodCalculate.markEndTimeMs("albumPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void setActionbarColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.setActionbarColor(i);
        View view = this.f278994M;
        if (view != null) {
            view.setBackgroundColor(getWindow().getStatusBarColor());
            C87773e.m109211d(getWindow());
        }
        SnsMethodCalculate.markEndTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        SnsMethodCalculate.markStartTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        super.superImportUIComponents(hashSet);
        hashSet.add(C26705c.class);
        SnsMethodCalculate.markEndTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
    }

    public boolean supportNavigationSwipeBack() {
        SnsMethodCalculate.markStartTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        boolean supportNavigationSwipeBack = super.supportNavigationSwipeBack();
        SnsMethodCalculate.markEndTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        return supportNavigationSwipeBack;
    }
}
