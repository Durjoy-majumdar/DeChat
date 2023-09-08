package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsMsgListActionStruct;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.hardcoder.WXHardCoderJNI;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.data.SnsCmdList;
import com.tencent.p014mm.plugin.sns.model.C43036f0;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94886k0;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fm0.C8136w;
import go3.C76003c;
import gv2.C98242p;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100417r0;
import os2.C100420w;
import os2.C100421x;
import p1029rf.C89940c;
import p154fy.C87121j;
import p214om.C11502f;
import p629ny.C76979h;
import p761yd.C91441c;
import p910lj.C76701a;
import p995kf.C88146a;
import pt2.C100904a;
import pt2.C100906d;
import pt2.C100909g;
import pt2.C35681h;
import qo3.C77407n;
import qo3.C89779i0;
import rq2.C63489a;
import sf0.C48374j0;
import te3.C51101rf2;
import te3.m64;
import te3.n74;
import uo3.C78253a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI */
public class SnsMsgUI extends MMActivity implements C94853e.C94861h, C11385n {

    /* renamed from: Q */
    public static final /* synthetic */ int f278275Q = 0;

    /* renamed from: A */
    public View.OnClickListener f278276A = new C95579g();

    /* renamed from: B */
    public long f278277B = 0;

    /* renamed from: C */
    public long f278278C = 0;

    /* renamed from: D */
    public int f278279D;

    /* renamed from: E */
    public long f278280E;

    /* renamed from: F */
    public C11184p0 f278281F = new C95574c();

    /* renamed from: G */
    public MStorage.IOnStorageChange f278282G = new C95576e();

    /* renamed from: H */
    public Runnable f278283H = new C95578f();

    /* renamed from: I */
    public int f278284I;

    /* renamed from: J */
    public long f278285J;

    /* renamed from: K */
    public long f278286K;

    /* renamed from: L */
    public int f278287L = 0;

    /* renamed from: M */
    public int f278288M = 0;

    /* renamed from: N */
    public HashMap<Integer, C100420w> f278289N = new HashMap<>();

    /* renamed from: P */
    public HashMap<Integer, Integer> f278290P = new HashMap<>();

    /* renamed from: d */
    public ListView f278291d;

    /* renamed from: e */
    public C95588q f278292e;

    /* renamed from: f */
    public View f278293f;

    /* renamed from: g */
    public View f278294g = null;

    /* renamed from: h */
    public C96227t4 f278295h;

    /* renamed from: i */
    public MMHandler f278296i = C94866e1.ly0();

    /* renamed from: j */
    public boolean f278297j = false;

    /* renamed from: n */
    public View f278298n;

    /* renamed from: o */
    public String f278299o;

    /* renamed from: p */
    public boolean f278300p = false;

    /* renamed from: q */
    public C35681h f278301q;

    /* renamed from: r */
    public int f278302r;

    /* renamed from: s */
    public C44668u3 f278303s;

    /* renamed from: t */
    public SnsCmdList f278304t = new SnsCmdList();

    /* renamed from: u */
    public boolean f278305u = false;

    /* renamed from: v */
    public C89779i0 f278306v;

    /* renamed from: w */
    public C89779i0 f278307w;

    /* renamed from: x */
    public int[] f278308x = new int[2];

    /* renamed from: y */
    public int f278309y = 86400;

    /* renamed from: z */
    public View f278310z = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$n */
    public class C43085n implements View.OnTouchListener {
        public C43085n() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$8");
            if (motionEvent.getAction() == 0) {
                SnsMsgUI.this.hideVKB();
                SnsMsgUI.m122163J7(SnsMsgUI.this)[0] = (int) motionEvent.getRawX();
                SnsMsgUI.m122163J7(SnsMsgUI.this)[1] = (int) motionEvent.getRawY();
            }
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$8");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$p */
    public static class C43086p implements C63489a.C63493f {

        /* renamed from: a */
        public WeakReference<TextView> f116608a;

        /* renamed from: b */
        public int f116609b;

        /* renamed from: c */
        public String f116610c;

        public C43086p(TextView textView, String str) {
            this.f116608a = new WeakReference<>(textView);
            this.f116609b = C76577a.m92151b(textView.getContext(), 16);
            this.f116610c = str;
        }

        /* renamed from: a */
        public void mo67280a(Bitmap bitmap, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
            try {
                WeakReference<TextView> weakReference = this.f116608a;
                if (weakReference == null) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
                    return;
                }
                TextView textView = weakReference.get();
                if (textView == null) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
                    return;
                }
                Object tag = textView.getTag(C0966R.C0970id.lww);
                if (tag instanceof String) {
                    String str = (String) tag;
                    if (!TextUtils.isEmpty(this.f116610c) && this.f116610c.equals(str) && z && bitmap != null) {
                        Log.m105924i("MicroMsg.SnsMsgUI", "onDownloadResult: success");
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap);
                        int i = this.f116609b;
                        bitmapDrawable.setBounds(0, 0, i, i);
                        bitmapDrawable.setColorFilter(textView.getResources().getColor(C0966R.color.f2958ae), PorterDuff.Mode.SRC_ATOP);
                        textView.setCompoundDrawables(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsMsgUI", "onDownloadResult, exp=" + th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$a */
    public class C95572a implements AbsListView.OnScrollListener {
        public C95572a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
            SnsMsgUI snsMsgUI = SnsMsgUI.this;
            int i3 = SnsMsgUI.f278275Q;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            boolean z = snsMsgUI.f278305u;
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            Log.m105925i("MicroMsg.SnsMsgUI", "onListViewScoll %s", Integer.valueOf(i));
            if (i2 == 2) {
                WXHardCoderJNI a = C40318k.m43492a();
                boolean hcSNSMsgScrollEnable = C40318k.m43492a().getHcSNSMsgScrollEnable();
                SnsMsgUI snsMsgUI2 = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                int i4 = snsMsgUI2.f278302r;
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                a.stopPerformance(hcSNSMsgScrollEnable, i4);
                SnsMsgUI snsMsgUI3 = SnsMsgUI.this;
                int startPerformance = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcSNSMsgScrollEnable(), C40318k.m43492a().getHcSNSMsgScrollDelay(), C40318k.m43492a().getHcSNSMsgScrollCPU(), C40318k.m43492a().getHcSNSMsgScrollIO(), C40318k.m43492a().getHcSNSMsgScrollThr() ? Process.myTid() : 0, C40318k.m43492a().getHcSNSMsgScrollTimeout(), 705, C40318k.m43492a().getHcSNSMsgScrollAction(), "MicroMsg.SnsMsgUI");
                SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                snsMsgUI3.f278302r = startPerformance;
                SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                SnsMsgUI snsMsgUI4 = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                int i5 = snsMsgUI4.f278302r;
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                Log.m105925i("MicroMsg.SnsMsgUI", "summer hardcoder sns startPerformance [%s]", Integer.valueOf(i5));
            }
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                if (C94866e1.Tx0().mo139896kD() > 0) {
                    C94866e1.Tx0().mo139894bF();
                } else {
                    SnsMsgUI.m122168O7(SnsMsgUI.this).mo132858s();
                }
                if (i2 == 0) {
                    int count = absListView.getCount();
                    C95588q O7 = SnsMsgUI.m122168O7(SnsMsgUI.this);
                    O7.getClass();
                    SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    int i6 = O7.f278328p;
                    SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    if (count < i6) {
                        C95588q O72 = SnsMsgUI.m122168O7(SnsMsgUI.this);
                        O72.getClass();
                        SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                        int i7 = O72.f278328p;
                        SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                        Log.m105919d("MicroMsg.SnsMsgUI", "onScrollStateChanged: IDLE, itemCount=%d, totalCount=%d", Integer.valueOf(absListView.getCount()), Integer.valueOf(i7));
                        SnsMsgUI.m122168O7(SnsMsgUI.this).onNotifyChange((String) null, (MStorageEventData) null);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$b */
    public class C95573b implements MenuItem.OnMenuItemClickListener {
        public C95573b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
            Intent intent = new Intent();
            SnsMsgUI snsMsgUI = SnsMsgUI.this;
            int i = SnsMsgUI.f278275Q;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            SnsCmdList snsCmdList = snsMsgUI.f278304t;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            intent.putExtra("sns_cmd_list", snsCmdList);
            SnsMsgUI.this.setResult(-1, intent);
            SnsMsgUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$c */
    public class C95574c implements C11184p0 {
        public C95574c() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                SnsMsgUI snsMsgUI = SnsMsgUI.this;
                SnsMsgUI.m122171R7(snsMsgUI, snsMsgUI.f278279D);
                Log.m105925i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected delMsg snsCommentID:%d", Integer.valueOf(SnsMsgUI.this.f278279D));
            } else if (itemId == 1) {
                SnsMsgUI snsMsgUI2 = SnsMsgUI.this;
                int i2 = SnsMsgUI.f278275Q;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                snsMsgUI2.getClass();
                SnsMethodCalculate.markStartTimeMs("notRemind", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                C76879j.m92707A(snsMsgUI2, snsMsgUI2.getString(C0966R.string.f361104hc3), "", snsMsgUI2.getString(C0966R.string.f361103hc2), snsMsgUI2.getString(C0966R.string.f7926wf), new C96329z4(snsMsgUI2), (DialogInterface.OnClickListener) null);
                SnsMethodCalculate.markEndTimeMs("notRemind", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                C100906d.m132261a();
                C100906d.f295510b.mo140374c();
                Log.m105925i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected notRemind snsCommentID:%d", Integer.valueOf(SnsMsgUI.this.f278279D));
            } else if (itemId == 2) {
                SnsMsgUI.m122164K7(SnsMsgUI.this, false);
                C100906d.m132261a();
                C100906d.f295510b.mo140374c();
                Log.m105925i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected remindImp snsCommentID:%d", Integer.valueOf(SnsMsgUI.this.f278279D));
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$d */
    public class C95575d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C43036f0 f278314d;

        public C95575d(SnsMsgUI snsMsgUI, C43036f0 f0Var) {
            this.f278314d = f0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$13");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f278314d);
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$13");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$e */
    public class C95576e implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$e$a */
        public class C95577a implements Runnable {
            public C95577a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16$1");
                synchronized (SnsMsgUI.m122168O7(SnsMsgUI.this)) {
                    try {
                        Log.m105924i("MicroMsg.SnsMsgUI", "comment notify");
                        SnsMsgUI snsMsgUI = SnsMsgUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        snsMsgUI.f278300p = true;
                        SnsMethodCalculate.markEndTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        SnsMsgUI.m122168O7(SnsMsgUI.this).onNotifyChange((String) null, (MStorageEventData) null);
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16$1");
                            throw th;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16$1");
            }
        }

        public C95576e() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16");
            C94866e1.ly0().post(new C95577a());
            SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$16");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$f */
    public class C95578f implements Runnable {
        public C95578f() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17");
            if (SnsMsgUI.m122168O7(SnsMsgUI.this) == null) {
                Log.m105924i("MicroMsg.SnsMsgUI", "notifyUI error,because adapter == null");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17");
                return;
            }
            synchronized (SnsMsgUI.m122168O7(SnsMsgUI.this)) {
                try {
                    Log.m105924i("MicroMsg.SnsMsgUI", "notifyUI call adapter onNotifyChange");
                    SnsMsgUI.m122168O7(SnsMsgUI.this).onNotifyChange((String) null, (MStorageEventData) null);
                    SnsMsgUI snsMsgUI = SnsMsgUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$2802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    snsMsgUI.f278297j = false;
                    SnsMethodCalculate.markEndTimeMs("access$2802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$17");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$g */
    public class C95579g implements View.OnClickListener {
        public C95579g() {
        }

        public void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            if (view.getTag() instanceof C96235u4) {
                long j = ((C96235u4) view.getTag()).f281213h.field_snsID;
                SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
                if (SE == null) {
                    Log.m105924i("MicroMsg.SnsMsgUI", "[imageClickListener] info == null, id = " + j);
                } else {
                    Log.m105924i("MicroMsg.SnsMsgUI", "[imageClickListener] info id = " + j + ", info isAd() = " + SE.isAd());
                }
                if (SE == null || SE.isAd()) {
                    SnsMsgUI snsMsgUI = SnsMsgUI.this;
                    int i = SnsMsgUI.f278275Q;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    C96227t4 t4Var = snsMsgUI.f278295h;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    t4Var.mo133892c(view2, -1, 1);
                } else {
                    C96235u4 u4Var = (C96235u4) view.getTag();
                    C100420w wVar = u4Var.f281213h;
                    SnsMsgUI snsMsgUI2 = SnsMsgUI.this;
                    int i2 = SnsMsgUI.f278275Q;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    Boolean S7 = snsMsgUI2.mo132839S7(wVar);
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    if (!S7.booleanValue()) {
                        Log.m105924i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: check access now");
                        SnsMsgUI snsMsgUI3 = SnsMsgUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        snsMsgUI3.f278310z = view2;
                        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        SnsMsgUI snsMsgUI4 = SnsMsgUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        snsMsgUI4.mo132842V7(wVar, true, true);
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    } else if (SnsMsgUI.m122168O7(SnsMsgUI.this).mo132860u(String.valueOf(wVar.field_snsID))) {
                        Log.m105924i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: forbid access");
                        u4Var.mo133900a();
                        SnsMsgUI snsMsgUI5 = SnsMsgUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        snsMsgUI5.mo132841U7(wVar);
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    } else {
                        if (SnsMsgUI.m122168O7(SnsMsgUI.this).mo132859t(String.valueOf(wVar.field_snsID))) {
                            Log.m105924i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: have access");
                            SnsMethodCalculate.markStartTimeMs("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                            u4Var.f281211f = 1;
                            SnsMethodCalculate.markEndTimeMs("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                        } else {
                            Log.m105924i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: check access later on browse");
                        }
                        SnsMethodCalculate.markStartTimeMs("markNeedRequestCheckAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                        u4Var.f281212g = j;
                        SnsMethodCalculate.markEndTimeMs("markNeedRequestCheckAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                        SnsMsgUI snsMsgUI6 = SnsMsgUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        C96227t4 t4Var2 = snsMsgUI6.f278295h;
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        t4Var2.mo133893d(view, -1, 1, (C94895m2) null, 0, true, 2);
                    }
                }
            } else if (view.getTag() instanceof C100420w) {
                SnsMsgUI.m122169P7(SnsMsgUI.this, (C100420w) view.getTag());
            } else {
                Log.m105928w("MicroMsg.SnsMsgUI", "v.getTag():" + view.getTag());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$h */
    public class C95580h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$h$a */
        public class C95581a implements DialogInterface.OnClickListener {
            public C95581a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2$1");
                SnsMsgUI.m122170Q7(SnsMsgUI.this).setVisibility(8);
                SnsMsgUI snsMsgUI = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                View view = snsMsgUI.f278298n;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$2$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$2$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C100421x Tx0 = C94866e1.Tx0();
                Tx0.getClass();
                SnsMethodCalculate.markStartTimeMs("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Tx0.f294191d.execSQL("SnsComment", "delete from SnsComment");
                SnsMethodCalculate.markEndTimeMs("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                SnsMsgUI.this.enableOptionMenu(false);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2$1");
            }
        }

        public C95580h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2");
            C76879j.m92750u(SnsMsgUI.this.getContext(), SnsMsgUI.this.getString(C0966R.string.f361383jf3), "", new C95581a(), (DialogInterface.OnClickListener) null);
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$i */
    public class C95582i implements MMSlideDelView.C73185e {
        public C95582i() {
        }

        /* renamed from: a */
        public int mo96224a(View view) {
            SnsMethodCalculate.markStartTimeMs("getViewPosition", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3");
            int positionForView = SnsMsgUI.m122170Q7(SnsMsgUI.this).getPositionForView(view);
            SnsMethodCalculate.markEndTimeMs("getViewPosition", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3");
            return positionForView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$j */
    public class C95583j implements MMSlideDelView.C73188i {
        public C95583j() {
        }

        /* renamed from: a */
        public void mo96225a(View view, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("performItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$4");
            SnsMsgUI.m122170Q7(SnsMsgUI.this).performItemClick(view, i, (long) i2);
            SnsMethodCalculate.markEndTimeMs("performItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$k */
    public class C95584k implements MMSlideDelView.C73187h {
        public C95584k() {
        }

        /* renamed from: a */
        public void mo7896a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$5");
            if (obj == null) {
                Log.m105920e("MicroMsg.SnsMsgUI", "onItemDel object null");
                SnsMethodCalculate.markEndTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$5");
                return;
            }
            try {
                SnsMsgUI.m122171R7(SnsMsgUI.this, Util.safeParseInt(obj.toString()));
                SnsMethodCalculate.markEndTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$5");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SnsMsgUI", "onItemDel object not int");
                Log.printErrStackTrace("MicroMsg.SnsMsgUI", e, "", new Object[0]);
                SnsMethodCalculate.markEndTimeMs("onItemDel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$5");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$l */
    public class C95585l implements C6975i1.C6977b {
        public C95585l() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$6");
            StringBuilder sb = new StringBuilder();
            sb.append("total count:");
            C95588q O7 = SnsMsgUI.m122168O7(SnsMsgUI.this);
            O7.getClass();
            SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            int i = O7.f278328p;
            SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            sb.append(i);
            sb.append(" unread:");
            sb.append(C94866e1.Tx0().mo139896kD());
            sb.append("  showcount:");
            C95588q O72 = SnsMsgUI.m122168O7(SnsMsgUI.this);
            O72.getClass();
            SnsMethodCalculate.markStartTimeMs("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            int i2 = O72.f278327o;
            SnsMethodCalculate.markEndTimeMs("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            sb.append(i2);
            Log.m105926v("MicroMsg.SnsMsgUI", sb.toString());
            if (SnsMsgUI.m122168O7(SnsMsgUI.this).getCount() == 0) {
                SnsMsgUI.m122170Q7(SnsMsgUI.this).setVisibility(8);
                SnsMsgUI snsMsgUI = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                View view = snsMsgUI.f278298n;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SnsMsgUI.this.enableOptionMenu(false);
            } else {
                SnsMsgUI.m122170Q7(SnsMsgUI.this).setVisibility(0);
                SnsMsgUI snsMsgUI2 = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                View view3 = snsMsgUI2.f278298n;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SnsMsgUI.this.enableOptionMenu(true);
            }
            if ((SnsMsgUI.m122168O7(SnsMsgUI.this).mo132856B() && C94866e1.Tx0().mo139896kD() == 0) || C94866e1.Tx0().mo139896kD() == C94866e1.Tx0().mo139892Yt(false)) {
                View H7 = SnsMsgUI.m122161H7(SnsMsgUI.this);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view5 = H7;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                H7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$6");
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$6");
            SnsMethodCalculate.markEndTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$m */
    public class C95586m implements AdapterView.OnItemClickListener {
        public C95586m() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int i3 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
            boolean z = true;
            if (i3 == SnsMsgUI.m122168O7(SnsMsgUI.this).getCount()) {
                if (C94866e1.Tx0().mo139896kD() > 0) {
                    C94866e1.Tx0().mo139894bF();
                    i2 = !SnsMsgUI.m122168O7(SnsMsgUI.this).mo132856B();
                } else {
                    i2 = SnsMsgUI.m122168O7(SnsMsgUI.this).mo132858s();
                }
                SnsMsgUI.m122168O7(SnsMsgUI.this).onNotifyChange((String) null, (MStorageEventData) null);
                SnsMsgUI snsMsgUI = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                boolean z2 = snsMsgUI.f278305u;
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (!z2) {
                    if (SnsMsgUI.m122161H7(SnsMsgUI.this).getParent() != null) {
                        Log.m105918d("MicroMsg.SnsMsgUI", "remove footer");
                        SnsMsgUI.m122170Q7(SnsMsgUI.this).removeFooterView(SnsMsgUI.m122161H7(SnsMsgUI.this));
                    }
                    if (SnsMsgUI.m122162I7(SnsMsgUI.this).getParent() == null && i2 > 0) {
                        SnsMsgUI.m122170Q7(SnsMsgUI.this).addFooterView(SnsMsgUI.m122162I7(SnsMsgUI.this));
                        Log.m105924i("MicroMsg.SnsMsgUI", "add mLoadingFooterView");
                    }
                }
                SnsMsgUI snsMsgUI2 = SnsMsgUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                snsMsgUI2.f278305u = true;
                SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                View H7 = SnsMsgUI.m122161H7(SnsMsgUI.this);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = H7;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$7", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                H7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$7", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C100420w wVar = (C100420w) SnsMsgUI.m122168O7(SnsMsgUI.this).getItem(i3);
            if (wVar != null) {
                SnsMsgUI snsMsgUI3 = SnsMsgUI.this;
                SnsInfo SE = C94866e1.Yx0().mo139806SE(wVar.field_snsID);
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                snsMsgUI3.getClass();
                SnsMethodCalculate.markStartTimeMs("skipClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (SE == null || SE.getTypeFlag() != 7) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("skipClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (!z) {
                    SnsMsgUI.m122169P7(SnsMsgUI.this, wVar);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$o */
    public class C95587o implements AdapterView.OnItemLongClickListener {
        public C95587o() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            SnsMethodCalculate.markStartTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$9");
            if (i < SnsMsgUI.m122170Q7(SnsMsgUI.this).getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.SnsMsgUI", "on header view long click, ignore");
                SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$9");
                return true;
            }
            C78253a aVar = new C78253a(SnsMsgUI.this);
            SnsMsgUI snsMsgUI = SnsMsgUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            C11184p0 p0Var = snsMsgUI.f278281F;
            SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            aVar.mo108272g(view, i, j, snsMsgUI, p0Var, SnsMsgUI.m122163J7(SnsMsgUI.this)[0], SnsMsgUI.m122163J7(SnsMsgUI.this)[1]);
            SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$9");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$q */
    public class C95588q extends C6975i1<C100420w> {

        /* renamed from: o */
        public int f278327o;

        /* renamed from: p */
        public int f278328p;

        /* renamed from: q */
        public int f278329q;

        /* renamed from: r */
        public MMSlideDelView.C73188i f278330r;

        /* renamed from: s */
        public MMSlideDelView.C73185e f278331s;

        /* renamed from: t */
        public MMSlideDelView.C73187h f278332t;

        /* renamed from: u */
        public C100904a f278333u;

        /* renamed from: v */
        public Map<String, Integer> f278334v;

        /* renamed from: w */
        public MMSlideDelView.C73186f f278335w = new C71212a(this);

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$a */
        public class C71212a implements MMSlideDelView.C73186f {
            public C71212a(C95588q qVar) {
            }

            /* renamed from: a */
            public boolean mo97956a() {
                SnsMethodCalculate.markStartTimeMs("hasMenuShowed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
                boolean z = ((HashSet) MMSlideDelView.C73186f.f214912a).size() > 0;
                SnsMethodCalculate.markEndTimeMs("hasMenuShowed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
                return z;
            }

            /* renamed from: b */
            public void mo97957b() {
                SnsMethodCalculate.markStartTimeMs("closeMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
                Iterator it = ((HashSet) MMSlideDelView.C73186f.f214912a).iterator();
                while (it.hasNext()) {
                    MMSlideDelView mMSlideDelView = (MMSlideDelView) it.next();
                    if (mMSlideDelView != null) {
                        mMSlideDelView.mo101784d();
                    }
                }
                ((HashSet) MMSlideDelView.C73186f.f214912a).clear();
                SnsMethodCalculate.markEndTimeMs("closeMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
            }

            /* renamed from: c */
            public void mo97958c() {
                SnsMethodCalculate.markStartTimeMs("closeMenuWithoutAnim", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
                Iterator it = ((HashSet) MMSlideDelView.C73186f.f214912a).iterator();
                while (it.hasNext()) {
                    MMSlideDelView mMSlideDelView = (MMSlideDelView) it.next();
                    if (mMSlideDelView != null) {
                        mMSlideDelView.mo101782c();
                    }
                }
                ((HashSet) MMSlideDelView.C73186f.f214912a).clear();
                SnsMethodCalculate.markEndTimeMs("closeMenuWithoutAnim", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
            }

            /* renamed from: d */
            public void mo97959d(MMSlideDelView mMSlideDelView, boolean z) {
                SnsMethodCalculate.markStartTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
                if (z) {
                    ((HashSet) MMSlideDelView.C73186f.f214912a).add(mMSlideDelView);
                } else {
                    ((HashSet) MMSlideDelView.C73186f.f214912a).remove(mMSlideDelView);
                }
                SnsMethodCalculate.markEndTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$b */
        public class C71213b implements View.OnClickListener {
            public C71213b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$2");
                Log.m105926v("MicroMsg.SnsMsgUI", "on delView clicked");
                ((C71212a) C95588q.this.f278335w).mo97958c();
                MMSlideDelView.C73187h hVar = C95588q.this.f278332t;
                if (hVar != null) {
                    hVar.mo7896a(view.getTag());
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$c */
        public class C95589c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ SnsInfo f278337d;

            /* renamed from: e */
            public final /* synthetic */ String f278338e;

            public C95589c(SnsInfo snsInfo, String str) {
                this.f278337d = snsInfo;
                this.f278338e = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e2, code lost:
                if (r3.mo126055b(r13, 1, r12.f278337d, new tp2.C101914d()) != false) goto L_0x00cb;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r13) {
                /*
                    r12 = this;
                    java.lang.Class<om.f> r0 = p214om.C11502f.class
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r1.add(r13)
                    java.lang.Object[] r7 = r1.toArray()
                    r1.clear()
                    java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$3"
                    java.lang.String r3 = "android/view/View$OnClickListener"
                    java.lang.String r4 = "onClick"
                    java.lang.String r5 = "(Landroid/view/View;)V"
                    r6 = r12
                    j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                    java.lang.String r1 = "onClick"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$3"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                    com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r12.f278337d
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L_0x00e5
                    java.lang.String r6 = r12.f278338e
                    boolean r3 = gv2.C98242p.m126943e(r3, r6)
                    if (r3 == 0) goto L_0x00e5
                    com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r12.f278337d
                    com.tencent.mm.plugin.sns.storage.ADXml r3 = r3.getAdXml()
                    if (r3 == 0) goto L_0x00e5
                    int r6 = r3.headClickType
                    if (r6 != r5) goto L_0x00cd
                    java.lang.String r6 = r3.headClickParam
                    boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                    if (r6 != 0) goto L_0x00cd
                    com.tencent.mm.plugin.sns.ui.SnsMsgUI$q r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.this
                    com.tencent.mm.plugin.sns.ui.SnsMsgUI r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                    com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r12.f278337d
                    com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.getAdInfo()
                    r13.getClass()
                    java.lang.String r7 = "openAdUrl"
                    java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                    java.lang.String r9 = r3.headClickParam
                    if (r6 == 0) goto L_0x0067
                    java.lang.String r10 = r6.uxInfo
                    java.lang.String r9 = vr2.C102236a0.m134734b(r9, r10)
                L_0x0067:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    java.lang.String r11 = "comment msg headClickParam url "
                    r10.append(r11)
                    r10.append(r9)
                    java.lang.String r11 = " "
                    r10.append(r11)
                    int r11 = r3.headClickRightBarShow
                    r10.append(r11)
                    java.lang.String r10 = r10.toString()
                    java.lang.String r11 = "MicroMsg.SnsMsgUI"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
                    android.content.Intent r10 = new android.content.Intent
                    r10.<init>()
                    int r3 = r3.headClickRightBarShow
                    if (r3 != 0) goto L_0x0091
                    r4 = 1
                L_0x0091:
                    java.lang.String r3 = r6.viewId
                    java.lang.String r6 = "KsnsViewId"
                    r10.putExtra(r6, r3)
                    java.lang.String r3 = "KRightBtn"
                    r10.putExtra(r3, r4)
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    java.lang.String r4 = "jsapiargs"
                    r10.putExtra(r4, r3)
                    java.lang.String r3 = "rawUrl"
                    r10.putExtra(r3, r9)
                    java.lang.String r3 = "useJs"
                    r10.putExtra(r3, r5)
                    r3 = 82
                    vr2.C102236a0.m134732a(r10, r3)
                    di3.d r3 = di3.C86312j.m106911c(r0)
                    om.f r3 = (p214om.C11502f) r3
                    wc3.z r3 = r3.mo11462yM()
                    com.tencent.mm.app.r1 r3 = (com.tencent.p014mm.app.C67654r1) r3
                    r3.mo93190w(r10, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                L_0x00cb:
                    r4 = 1
                    goto L_0x00e5
                L_0x00cd:
                    com.tencent.mm.plugin.sns.ui.SnsMsgUI$q r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.this
                    com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                    tp2.c r3 = tp2.C101911a.m134113b(r3)
                    if (r3 == 0) goto L_0x00e5
                    com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r12.f278337d
                    tp2.d r7 = new tp2.d
                    r7.<init>()
                    boolean r13 = r3.mo126055b(r13, r5, r6, r7)
                    if (r13 == 0) goto L_0x00e5
                    goto L_0x00cb
                L_0x00e5:
                    if (r4 != 0) goto L_0x011c
                    android.content.Intent r13 = new android.content.Intent
                    r13.<init>()
                    java.lang.String r3 = r12.f278338e
                    java.lang.String r4 = "Contact_User"
                    r13.putExtra(r4, r3)
                    r3 = 11
                    java.lang.String r4 = "CONTACT_INFO_UI_SOURCE"
                    r13.putExtra(r4, r3)
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    om.f r0 = (p214om.C11502f) r0
                    wc3.z r0 = r0.mo11462yM()
                    com.tencent.mm.plugin.sns.ui.SnsMsgUI$q r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.this
                    com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                    com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
                    r0.mo93174g(r13, r3)
                    java.lang.Class<yy.k> r13 = p773yy.C79168k.class
                    di3.d r13 = di3.C86312j.m106911c(r13)
                    yy.k r13 = (p773yy.C79168k) r13
                    java.lang.String r0 = r12.f278338e
                    r3 = 9
                    r13.mo74109HD(r0, r3)
                L_0x011c:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                    java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$3"
                    java.lang.String r0 = "android/view/View$OnClickListener"
                    java.lang.String r2 = "(Landroid/view/View;)V"
                    j20.C117292a.m165361g(r12, r13, r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.C95589c.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$d */
        public class C95590d {

            /* renamed from: a */
            public SnsAvatarImageView f278340a;

            /* renamed from: b */
            public TextView f278341b;

            /* renamed from: c */
            public TextView f278342c;

            /* renamed from: d */
            public TextView f278343d;

            /* renamed from: e */
            public TextView f278344e;

            /* renamed from: f */
            public MMImageView f278345f;

            /* renamed from: g */
            public View f278346g;

            /* renamed from: h */
            public ImageView f278347h;

            /* renamed from: i */
            public EmojiStatusView f278348i;

            public C95590d(C95588q qVar) {
            }
        }

        public C95588q(Context context, C100420w wVar) {
            super(context, wVar);
            new HashSet();
            this.f278329q = C74942w4.m89784a(context, 14);
            this.f278327o = 10;
            this.f278328p = 10;
            this.f278334v = new HashMap();
            Log.m105924i("MicroMsg.SnsMsgUI", "adapter created");
        }

        /* renamed from: A */
        public final void mo132855A(String str, TextView textView, int i, int i2) {
            Drawable drawable;
            SnsMethodCalculate.markStartTimeMs("setSourceIcon", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            SnsMethodCalculate.markStartTimeMs("isStranger", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            boolean z = false;
            if (i2 == 1 || i2 == 2) {
                SnsMethodCalculate.markEndTimeMs("isStranger", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 7 || i2 == 8 || i2 == 13 || i2 == 14 || i2 == 16) {
                                SnsMethodCalculate.markEndTimeMs("isStranger", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                            } else if (i2 != 19) {
                                SnsMethodCalculate.markEndTimeMs("isStranger", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                                z = true;
                            }
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("isStranger", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                }
                SnsMethodCalculate.markEndTimeMs("isStranger", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                z = true;
            }
            if (z) {
                SnsMsgUI snsMsgUI = SnsMsgUI.this;
                int i3 = SnsMsgUI.f278275Q;
                SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                String str2 = snsMsgUI.f278299o;
                SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (!str2.equals(str)) {
                    if (i != 18) {
                        switch (i) {
                            case 22:
                            case 23:
                            case 24:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                drawable = C76577a.m92158i(this.f24696e, C0966R.C0969drawable.bjf);
                                break;
                            case 25:
                                drawable = C76577a.m92158i(this.f24696e, C0966R.C0969drawable.bjb);
                                break;
                            case 30:
                                drawable = C76577a.m92158i(this.f24696e, C0966R.C0969drawable.bjc);
                                break;
                            default:
                                drawable = C76577a.m92158i(this.f24696e, C0966R.C0969drawable.bje);
                                break;
                        }
                    } else {
                        drawable = C76577a.m92158i(this.f24696e, C0966R.C0969drawable.bjd);
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    SnsMethodCalculate.markEndTimeMs("setSourceIcon", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    return;
                }
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            SnsMethodCalculate.markEndTimeMs("setSourceIcon", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        }

        /* renamed from: B */
        public boolean mo132856B() {
            SnsMethodCalculate.markStartTimeMs("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            boolean z = this.f278327o >= this.f278328p;
            SnsMethodCalculate.markEndTimeMs("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return z;
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            C100420w wVar = (C100420w) obj;
            SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            if (wVar == null) {
                wVar = new C100420w();
                Log.m105918d("MicroMsg.SnsMsgUI", "new SnsComment");
            }
            wVar.convertFrom(cursor);
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return wVar;
        }

        public long getItemId(int i) {
            SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            long j = ((C100420w) getItem(i)).field_snsID;
            SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return j;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(21:20|40|42|43|(3:45|46|(1:48))(1:51)|52|53|54|55|(4:57|58|(1:60)|61)(3:62|63|64)|65|(2:67|68)(2:69|70)|(6:72|73|(2:75|76)|77|78|(20:82|83|84|85|86|91|92|(2:94|95)|98|99|100|101|102|103|104|105|106|(3:108|109|(24:111|117|121|122|123|124|125|(4:134|135|(2:137|138)(1:141)|142)(2:130|131)|143|144|145|(3:147|148|(12:152|153|(3:155|156|(1:158)(2:159|(2:161|(1:164))))(5:165|166|167|168|(3:170|171|(3:173|(1:175)(1:176)|177))(13:181|182|(2:184|(1:186)(10:187|(2:189|(6:191|192|193|194|195|196))(2:199|(2:201|(1:203))(5:204|(2:208|(1:210)(2:211|(4:213|(2:215|(1:217)(2:218|(1:220)))|221|(3:223|(1:225)(1:226)|227))(2:228|(2:230|(3:232|(1:234)|235)(1:236))(2:237|(2:239|(3:241|(1:243)(1:244)|245))(2:246|(1:248)(5:249|(4:251|(2:253|(7:260|(1:262)(1:263)|264|(2:266|(1:268)(4:269|(1:271)|276|278))|275|276|278)(1:259))|277|278)(1:279)|280|(1:282)(1:283)|284))))))|285|(1:287)|288))|336|(1:341)(1:340)|342|(1:344)(1:345)|346|(1:348)(1:349)|350|351))|289|(1:291)|336|(0)(0)|342|(0)(0)|346|(0)(0)|350|351))|178|336|(0)(0)|342|(0)(0)|346|(0)(0)|350|351))|295|296|297|(1:(3:302|303|(3:305|(4:307|308|309|310)(1:311)|312))(2:315|(1:317)))|336|(0)(0)|342|(0)(0)|346|(0)(0)|350|351))|114|(29:116|117|121|122|123|124|125|(0)|134|135|(0)(0)|142|143|144|145|(0)|295|296|297|299|(0)(0)|336|(0)(0)|342|(0)(0)|346|(0)(0)|350|351)(29:119|120|121|122|123|124|125|127|134|135|(0)(0)|142|143|144|145|(0)|295|296|297|299|(0)(0)|336|(0)(0)|342|(0)(0)|346|(0)(0)|350|351)))|90|91|92|(0)|98|99|100|(9:101|102|103|104|105|106|(0)|114|(0)(0))) */
        /* JADX WARNING: Code restructure failed: missing block: B:331:0x0c1f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:332:0x0c20, code lost:
            r33 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
            r8 = r9;
            r1 = "MicroMsg.SnsMsgUI";
            r24 = "getView";
            r32 = r19;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x01c6 */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3 A[SYNTHETIC, Splitter:B:108:0x02f3] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x032b A[Catch:{ Exception -> 0x0323 }] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0372 A[SYNTHETIC, Splitter:B:119:0x0372] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0426 A[SYNTHETIC, Splitter:B:137:0x0426] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0431  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0455 A[SYNTHETIC, Splitter:B:147:0x0455] */
        /* JADX WARNING: Removed duplicated region for block: B:302:0x0b89 A[SYNTHETIC, Splitter:B:302:0x0b89] */
        /* JADX WARNING: Removed duplicated region for block: B:315:0x0bd2 A[Catch:{ Exception -> 0x0bf3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:340:0x0c4a  */
        /* JADX WARNING: Removed duplicated region for block: B:341:0x0c4c  */
        /* JADX WARNING: Removed duplicated region for block: B:344:0x0c58  */
        /* JADX WARNING: Removed duplicated region for block: B:345:0x0c5a  */
        /* JADX WARNING: Removed duplicated region for block: B:348:0x0ca2  */
        /* JADX WARNING: Removed duplicated region for block: B:349:0x0ca4  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01d2 A[SYNTHETIC, Splitter:B:45:0x01d2] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01ed  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01fb A[SYNTHETIC, Splitter:B:57:0x01fb] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0226  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x023f A[SYNTHETIC, Splitter:B:67:0x023f] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0242 A[SYNTHETIC, Splitter:B:69:0x0242] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0246 A[SYNTHETIC, Splitter:B:72:0x0246] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02c1 A[SYNTHETIC, Splitter:B:94:0x02c1] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r35, android.view.View r36, android.view.ViewGroup r37) {
            /*
                r34 = this;
                r9 = r34
                java.lang.Class<he0.j> r1 = he0.C76158j.class
                java.lang.String r10 = "MicroMsg.SnsMsgUI"
                pl1.e0$a r11 = pl1.C11978e0.C11979a.COMMON
                java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
                java.lang.Class<ny.h> r13 = p629ny.C76979h.class
                java.lang.String r14 = ""
                java.lang.String r15 = "getView"
                java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r8)
                java.lang.Object r2 = r34.getItem(r35)
                r7 = r2
                os2.w r7 = (os2.C100420w) r7
                if (r7 == 0) goto L_0x006c
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                int r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.f278275Q
                java.lang.String r3 = "access$2100"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.util.HashMap<java.lang.Integer, os2.w> r2 = r2.f278289N
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                int r5 = r7.f294189L
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                boolean r2 = r2.containsKey(r5)
                if (r2 != 0) goto L_0x0052
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.util.HashMap<java.lang.Integer, os2.w> r2 = r2.f278289N
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                int r3 = r7.f294189L
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                os2.w r4 = r7.mo139886l2()
                r2.put(r3, r4)
                goto L_0x006c
            L_0x0052:
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.util.HashMap<java.lang.Integer, os2.w> r2 = r2.f278289N
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                int r3 = r7.f294189L
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r2 = r2.get(r3)
                os2.w r2 = (os2.C100420w) r2
                int r3 = r7.field_isSilence
                r2.field_isSilence = r3
            L_0x006c:
                r5 = 0
                if (r36 == 0) goto L_0x0083
                java.lang.Object r2 = r36.getTag()
                boolean r2 = r2 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.C95590d
                if (r2 != 0) goto L_0x0078
                goto L_0x0083
            L_0x0078:
                java.lang.Object r2 = r36.getTag()
                com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$d r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.C95590d) r2
                r5 = r36
                r6 = r2
                goto L_0x0142
            L_0x0083:
                android.content.Context r2 = r9.f24696e
                android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
                r3 = 2131493270(0x7f0c0196, float:1.8610015E38)
                android.view.View r2 = r2.inflate(r3, r5)
                com.tencent.mm.ui.base.MMSlideDelView r2 = (com.tencent.p014mm.p136ui.base.MMSlideDelView) r2
                android.content.Context r3 = r9.f24696e
                android.view.LayoutInflater r3 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r3)
                r4 = 2131497696(0x7f0c12e0, float:1.8618992E38)
                android.view.View r3 = r3.inflate(r4, r5)
                com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$d r4 = new com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$d
                r4.<init>(r9)
                r5 = 2131314042(0x7f09457a, float:1.8246498E38)
                android.view.View r5 = r3.findViewById(r5)
                com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r5 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView) r5
                r4.f278340a = r5
                android.content.Context r6 = r9.f24696e
                r5.setWeakContext(r6)
                r5 = 2131314050(0x7f094582, float:1.8246514E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f278342c = r5
                r5 = 2131314044(0x7f09457c, float:1.8246502E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f278343d = r5
                r5 = 2131314048(0x7f094580, float:1.824651E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r5 = 2131314051(0x7f094583, float:1.8246516E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f278344e = r5
                r5 = 2131314046(0x7f09457e, float:1.8246506E38)
                android.view.View r5 = r3.findViewById(r5)
                com.tencent.mm.ui.MMImageView r5 = (com.tencent.p014mm.p136ui.MMImageView) r5
                r4.f278345f = r5
                r5 = 2131314052(0x7f094584, float:1.8246518E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f278341b = r5
                com.tencent.mm.ui.MMImageView r5 = r4.f278345f
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                android.view.View$OnClickListener r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.m122165L7(r6)
                r5.setOnClickListener(r6)
                r5 = 2131313694(0x7f09441e, float:1.8245792E38)
                android.view.View r5 = r2.findViewById(r5)
                r4.f278346g = r5
                r5 = 2131313695(0x7f09441f, float:1.8245794E38)
                android.view.View r5 = r2.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r5 = 2131314094(0x7f0945ae, float:1.8246603E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r4.f278347h = r5
                r5 = 2131314043(0x7f09457b, float:1.82465E38)
                android.view.View r5 = r3.findViewById(r5)
                com.tencent.mm.emoji.view.EmojiStatusView r5 = (com.tencent.p014mm.emoji.view.EmojiStatusView) r5
                r4.f278348i = r5
                r2.setView(r3)
                com.tencent.mm.ui.base.MMSlideDelView$i r3 = r9.f278330r
                r2.setPerformItemClickListener(r3)
                com.tencent.mm.ui.base.MMSlideDelView$e r3 = r9.f278331s
                r2.setGetViewPositionCallback(r3)
                com.tencent.mm.ui.base.MMSlideDelView$f r3 = r9.f278335w
                r2.setItemStatusCallBack(r3)
                r3 = 0
                r2.setEnable(r3)
                r2.setTag(r4)
                r5 = r2
                r6 = r4
            L_0x0142:
                com.tencent.mm.ui.MMImageView r2 = r6.f278345f
                r4 = 0
                r2.setTag(r4)
                long r2 = r7.field_snsID
                android.view.View r2 = r6.f278346g
                int r3 = r7.f294189L
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.setTag(r3)
                android.view.View r2 = r6.f278346g
                com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$b r3 = new com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$b
                r3.<init>()
                r2.setOnClickListener(r3)
                te3.m64 r2 = new te3.m64     // Catch:{ Exception -> 0x0c29 }
                r2.<init>()     // Catch:{ Exception -> 0x0c29 }
                byte[] r3 = r7.field_curActionBuf     // Catch:{ Exception -> 0x0c29 }
                pe3.a r2 = r2.parseFrom(r3)     // Catch:{ Exception -> 0x0c29 }
                r3 = r2
                te3.m64 r3 = (te3.m64) r3     // Catch:{ Exception -> 0x0c29 }
                te3.m64 r2 = new te3.m64     // Catch:{ Exception -> 0x01c2 }
                r2.<init>()     // Catch:{ Exception -> 0x01c2 }
                byte[] r4 = r7.field_refActionBuf     // Catch:{ Exception -> 0x01c2 }
                pe3.a r2 = r2.parseFrom(r4)     // Catch:{ Exception -> 0x01c2 }
                te3.m64 r2 = (te3.m64) r2     // Catch:{ Exception -> 0x01c2 }
                java.lang.String r2 = r2.f298773d     // Catch:{ Exception -> 0x01c2 }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x01bf }
                if (r4 == 0) goto L_0x0183
                goto L_0x01c2
            L_0x0183:
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x01bf }
                com.tencent.mm.storage.u3 r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.m122166M7(r4)     // Catch:{ Exception -> 0x01bf }
                com.tencent.mm.storage.z1 r4 = r4.get(r2)     // Catch:{ Exception -> 0x01bf }
                if (r4 == 0) goto L_0x01bf
                r18 = r2
                java.lang.String r2 = r4.getUsername()     // Catch:{ Exception -> 0x01bc }
                r19 = r5
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Mx0()     // Catch:{ Exception -> 0x01c6 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x01c6 }
                if (r2 == 0) goto L_0x01a8
                java.lang.String r2 = r4.getNickname()     // Catch:{ Exception -> 0x01c6 }
            L_0x01a5:
                r18 = r2
                goto L_0x01c6
            L_0x01a8:
                java.lang.String r2 = r4.mo62898f()     // Catch:{ Exception -> 0x01c6 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x01c6 }
                if (r2 != 0) goto L_0x01b7
                java.lang.String r2 = r4.mo62898f()     // Catch:{ Exception -> 0x01c6 }
                goto L_0x01a5
            L_0x01b7:
                java.lang.String r2 = r4.getNickname()     // Catch:{ Exception -> 0x01c6 }
                goto L_0x01a5
            L_0x01bc:
                r19 = r5
                goto L_0x01c6
            L_0x01bf:
                r18 = r2
                goto L_0x01bc
            L_0x01c2:
                r19 = r5
                r18 = r14
            L_0x01c6:
                os2.e0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x0c1f }
                long r4 = r7.field_snsID     // Catch:{ Exception -> 0x0c1f }
                com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.mo139806SE(r4)     // Catch:{ Exception -> 0x0c1f }
                if (r2 != 0) goto L_0x01ed
                os2.j r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ Exception -> 0x01e7 }
                r20 = r11
                r21 = r12
                long r11 = r7.field_snsID     // Catch:{ Exception -> 0x01e7 }
                com.tencent.mm.plugin.sns.storage.AdSnsInfo r4 = r4.mo139864jo(r11)     // Catch:{ Exception -> 0x01e7 }
                if (r4 == 0) goto L_0x01f1
                com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r4.convertToSnsInfo()     // Catch:{ Exception -> 0x01e7 }
                goto L_0x01f1
            L_0x01e7:
                r0 = move-exception
                r1 = r0
                r23 = r8
                goto L_0x02cc
            L_0x01ed:
                r20 = r11
                r21 = r12
            L_0x01f1:
                r11 = r2
                java.lang.String r2 = r3.f298773d     // Catch:{ Exception -> 0x0c1f }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0c1f }
                r12 = 6
                if (r2 != 0) goto L_0x0226
                com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r2 = r6.f278340a     // Catch:{ Exception -> 0x01e7 }
                java.lang.String r4 = r3.f298773d     // Catch:{ Exception -> 0x01e7 }
                boolean r2 = gv2.C98242p.m126945g(r2, r11, r4)     // Catch:{ Exception -> 0x01e7 }
                if (r2 != 0) goto L_0x0214
                java.lang.Class<ln.f> r2 = p196ln.C76705f.class
                di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01e7 }
                ln.f r2 = (p196ln.C76705f) r2     // Catch:{ Exception -> 0x01e7 }
                com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r4 = r6.f278340a     // Catch:{ Exception -> 0x01e7 }
                java.lang.String r5 = r3.f298773d     // Catch:{ Exception -> 0x01e7 }
                r2.mo106849z(r4, r5)     // Catch:{ Exception -> 0x01e7 }
            L_0x0214:
                java.lang.String r2 = r3.f298773d     // Catch:{ Exception -> 0x01e7 }
                com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r4 = r6.f278340a     // Catch:{ Exception -> 0x01e7 }
                r4.mo134068q(r2, r12)     // Catch:{ Exception -> 0x01e7 }
                com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r4 = r6.f278340a     // Catch:{ Exception -> 0x01e7 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$c r5 = new com.tencent.mm.plugin.sns.ui.SnsMsgUI$q$c     // Catch:{ Exception -> 0x01e7 }
                r5.<init>(r11, r2)     // Catch:{ Exception -> 0x01e7 }
                r4.setOnClickListener(r5)     // Catch:{ Exception -> 0x01e7 }
                goto L_0x022b
            L_0x0226:
                java.lang.String r2 = "action.getFromUsername() is null or Nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r2)     // Catch:{ Exception -> 0x0c1f }
            L_0x022b:
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0c1f }
                com.tencent.mm.storage.u3 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.m122166M7(r2)     // Catch:{ Exception -> 0x0c1f }
                java.lang.String r4 = r3.f298773d     // Catch:{ Exception -> 0x0c1f }
                com.tencent.mm.storage.z1 r2 = r2.get(r4)     // Catch:{ Exception -> 0x0c1f }
                java.lang.String r4 = r3.f298775f     // Catch:{ Exception -> 0x0c1f }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0c1f }
                if (r4 != 0) goto L_0x0242
                java.lang.String r4 = r3.f298775f     // Catch:{ Exception -> 0x01e7 }
                goto L_0x0244
            L_0x0242:
                java.lang.String r4 = r3.f298773d     // Catch:{ Exception -> 0x0c1f }
            L_0x0244:
                if (r2 == 0) goto L_0x02b4
                java.lang.String r5 = r2.mo62898f()     // Catch:{ Exception -> 0x02af }
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x02af }
                if (r5 != 0) goto L_0x0254
                java.lang.String r4 = r2.mo62898f()     // Catch:{ Exception -> 0x01e7 }
            L_0x0254:
                java.lang.String r5 = r2.getUsername()     // Catch:{ Exception -> 0x02af }
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r5)     // Catch:{ Exception -> 0x02af }
                if (r5 == 0) goto L_0x02b4
                java.lang.String r5 = "3552365301"
                java.lang.String r12 = r2.mo73980x2()     // Catch:{ Exception -> 0x02af }
                boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x02af }
                if (r5 == 0) goto L_0x02b4
                di3.d r5 = di3.C86312j.m106911c(r13)     // Catch:{ Exception -> 0x02af }
                ny.h r5 = (p629ny.C76979h) r5     // Catch:{ Exception -> 0x02af }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x02af }
                r23 = r8
                android.widget.TextView r8 = r6.f278342c     // Catch:{ Exception -> 0x02ca }
                float r8 = r8.getTextSize()     // Catch:{ Exception -> 0x02ca }
                android.text.SpannableString r5 = r5.yp0(r12, r4, r8)     // Catch:{ Exception -> 0x02ca }
                int r5 = r5.length()     // Catch:{ Exception -> 0x02ca }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ca }
                r8.<init>()     // Catch:{ Exception -> 0x02ca }
                r8.append(r4)     // Catch:{ Exception -> 0x02ca }
                java.lang.String r4 = " @"
                r8.append(r4)     // Catch:{ Exception -> 0x02ca }
                di3.d r4 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x02ca }
                he0.j r4 = (he0.C76158j) r4     // Catch:{ Exception -> 0x02ca }
                java.lang.String r12 = r2.mo73980x2()     // Catch:{ Exception -> 0x02ca }
                r24 = r5
                java.lang.String r5 = r2.mo73976t2()     // Catch:{ Exception -> 0x02ca }
                java.lang.String r4 = r4.mo106373wo(r12, r5)     // Catch:{ Exception -> 0x02ca }
                r8.append(r4)     // Catch:{ Exception -> 0x02ca }
                java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x02ca }
                r5 = r4
                r4 = r24
                r8 = 1
                goto L_0x02b9
            L_0x02af:
                r0 = move-exception
                r23 = r8
            L_0x02b2:
                r1 = r0
                goto L_0x02cc
            L_0x02b4:
                r23 = r8
                r5 = r4
                r4 = 0
                r8 = 0
            L_0x02b9:
                java.lang.String r12 = r3.f298773d     // Catch:{ Exception -> 0x0c12 }
                boolean r12 = gv2.C98242p.m126943e(r11, r12)     // Catch:{ Exception -> 0x0c12 }
                if (r12 == 0) goto L_0x02d9
                com.tencent.mm.plugin.sns.storage.ADXml r12 = r11.getAdXml()     // Catch:{ Exception -> 0x02ca }
                java.lang.String r5 = gv2.C98242p.m126939a(r12, r5)     // Catch:{ Exception -> 0x02ca }
                goto L_0x02d9
            L_0x02ca:
                r0 = move-exception
                goto L_0x02b2
            L_0x02cc:
                r25 = r10
                r24 = r15
                r32 = r19
                r33 = r23
                r12 = 1
                r15 = r6
                r10 = r7
                goto L_0x042b
            L_0x02d9:
                di3.d r12 = di3.C86312j.m106911c(r13)     // Catch:{ Exception -> 0x0c12 }
                ny.h r12 = (p629ny.C76979h) r12     // Catch:{ Exception -> 0x0c12 }
                r24 = r15
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0c06 }
                r25 = r10
                android.widget.TextView r10 = r6.f278342c     // Catch:{ Exception -> 0x0bfa }
                float r10 = r10.getTextSize()     // Catch:{ Exception -> 0x0bfa }
                android.text.SpannableString r5 = r12.yp0(r15, r5, r10)     // Catch:{ Exception -> 0x0bfa }
                r10 = 33
                if (r11 == 0) goto L_0x0326
                int r12 = r11.getTypeFlag()     // Catch:{ Exception -> 0x0323 }
                r15 = 21
                if (r12 != r15) goto L_0x0326
                android.content.Context r1 = r9.f24696e     // Catch:{ Exception -> 0x0323 }
                r2 = 2131101529(0x7f060759, float:1.781547E38)
                android.content.res.ColorStateList r31 = kg3.C76577a.m92154e(r1, r2)     // Catch:{ Exception -> 0x0323 }
                android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan     // Catch:{ Exception -> 0x0323 }
                r27 = 0
                r28 = 0
                android.widget.TextView r2 = r6.f278342c     // Catch:{ Exception -> 0x0323 }
                float r2 = r2.getTextSize()     // Catch:{ Exception -> 0x0323 }
                int r2 = (int) r2     // Catch:{ Exception -> 0x0323 }
                r26 = r1
                r29 = r2
                r30 = r31
                r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0323 }
                int r2 = r5.length()     // Catch:{ Exception -> 0x0323 }
                r4 = 0
                r5.setSpan(r1, r4, r2, r10)     // Catch:{ Exception -> 0x0323 }
                goto L_0x0367
            L_0x0323:
                r0 = move-exception
                r1 = r0
                goto L_0x0369
            L_0x0326:
                r12 = 2131101521(0x7f060751, float:1.7815454E38)
                if (r8 == 0) goto L_0x0372
                android.content.Context r8 = r9.f24696e     // Catch:{ Exception -> 0x0323 }
                android.content.res.ColorStateList r31 = kg3.C76577a.m92154e(r8, r12)     // Catch:{ Exception -> 0x0323 }
                android.text.style.TextAppearanceSpan r8 = new android.text.style.TextAppearanceSpan     // Catch:{ Exception -> 0x0323 }
                r27 = 0
                r28 = 0
                android.widget.TextView r12 = r6.f278342c     // Catch:{ Exception -> 0x0323 }
                float r12 = r12.getTextSize()     // Catch:{ Exception -> 0x0323 }
                int r12 = (int) r12     // Catch:{ Exception -> 0x0323 }
                r26 = r8
                r29 = r12
                r30 = r31
                r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0323 }
                r12 = 0
                r5.setSpan(r8, r12, r4, r10)     // Catch:{ Exception -> 0x0323 }
                di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0323 }
                he0.j r1 = (he0.C76158j) r1     // Catch:{ Exception -> 0x0323 }
                android.content.Context r8 = r9.f24696e     // Catch:{ Exception -> 0x0323 }
                java.lang.String r2 = r2.mo73980x2()     // Catch:{ Exception -> 0x0323 }
                int r12 = r9.f278329q     // Catch:{ Exception -> 0x0323 }
                r15 = 2131099674(0x7f06001a, float:1.7811708E38)
                android.text.style.TextAppearanceSpan r1 = r1.mo106367cY(r8, r2, r12, r15)     // Catch:{ Exception -> 0x0323 }
                int r2 = r5.length()     // Catch:{ Exception -> 0x0323 }
                r5.setSpan(r1, r4, r2, r10)     // Catch:{ Exception -> 0x0323 }
            L_0x0367:
                r8 = 0
                goto L_0x0396
            L_0x0369:
                r15 = r6
                r10 = r7
                r32 = r19
                r33 = r23
                r12 = 1
                goto L_0x042b
            L_0x0372:
                android.content.Context r1 = r9.f24696e     // Catch:{ Exception -> 0x0bfa }
                android.content.res.ColorStateList r31 = kg3.C76577a.m92154e(r1, r12)     // Catch:{ Exception -> 0x0bfa }
                android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan     // Catch:{ Exception -> 0x0bfa }
                r27 = 0
                r28 = 0
                android.widget.TextView r2 = r6.f278342c     // Catch:{ Exception -> 0x0bfa }
                float r2 = r2.getTextSize()     // Catch:{ Exception -> 0x0bfa }
                int r2 = (int) r2     // Catch:{ Exception -> 0x0bfa }
                r26 = r1
                r29 = r2
                r30 = r31
                r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0bfa }
                int r2 = r5.length()     // Catch:{ Exception -> 0x0bfa }
                r8 = 0
                r5.setSpan(r1, r8, r2, r10)     // Catch:{ Exception -> 0x0bfa }
            L_0x0396:
                java.lang.Class<yy.k> r1 = p773yy.C79168k.class
                di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x0bfa }
                r26 = r1
                yy.k r26 = (p773yy.C79168k) r26     // Catch:{ Exception -> 0x0bfa }
                android.widget.TextView r1 = r6.f278342c     // Catch:{ Exception -> 0x0bfa }
                java.lang.String r2 = r3.f298773d     // Catch:{ Exception -> 0x0bfa }
                qy2.a$c r30 = qy2.C63347a.C47892c.SNS_NOTIFICATION     // Catch:{ Exception -> 0x0bfa }
                float r31 = r1.getTextSize()     // Catch:{ Exception -> 0x0bfa }
                r27 = r1
                r28 = r2
                r29 = r5
                java.lang.CharSequence r1 = r26.mo74108Fe(r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0bfa }
                android.widget.TextView r2 = r6.f278342c     // Catch:{ Exception -> 0x0bfa }
                r2.setText(r1)     // Catch:{ Exception -> 0x0bfa }
                java.lang.String r1 = r3.f298773d     // Catch:{ Exception -> 0x0bfa }
                android.widget.TextView r2 = r6.f278342c     // Catch:{ Exception -> 0x0bfa }
                int r4 = r3.f298778i     // Catch:{ Exception -> 0x0bfa }
                int r5 = r7.field_type     // Catch:{ Exception -> 0x0bfa }
                r9.mo132855A(r1, r2, r4, r5)     // Catch:{ Exception -> 0x0bfa }
                com.tencent.mm.emoji.view.EmojiStatusView r2 = r6.f278348i     // Catch:{ Exception -> 0x0bfa }
                android.widget.TextView r4 = r6.f278343d     // Catch:{ Exception -> 0x0bfa }
                r12 = r11
                long r10 = r7.field_snsID     // Catch:{ Exception -> 0x0bfa }
                r1 = r34
                r5 = 1
                r36 = r3
                r15 = 8
                r3 = r4
                r16 = 0
                r4 = r36
                r15 = r6
                r17 = r12
                r8 = r16
                r32 = r19
                r12 = 1
                r5 = r10
                r10 = r7
                r7 = r18
                r11 = r8
                r33 = r23
                r8 = r10
                r1.mo132863z(r2, r3, r4, r5, r7, r8)     // Catch:{ Exception -> 0x0bf7 }
                android.widget.TextView r1 = r15.f278344e     // Catch:{ Exception -> 0x0bf7 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0bf7 }
                r3 = r36
                int r4 = r3.f298779j     // Catch:{ Exception -> 0x0bf7 }
                long r4 = (long) r4     // Catch:{ Exception -> 0x0bf7 }
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 * r6
                java.lang.String r2 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123538d(r2, r4)     // Catch:{ Exception -> 0x0bf7 }
                r1.setText(r2)     // Catch:{ Exception -> 0x0bf7 }
                int r1 = r3.f298777h     // Catch:{ Exception -> 0x0bf7 }
                r2 = 16
                r4 = 7
                if (r1 == r4) goto L_0x041a
                r5 = 8
                if (r1 == r5) goto L_0x041a
                if (r1 != r2) goto L_0x040c
                goto L_0x041a
            L_0x040c:
                os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x0417 }
                long r5 = r10.field_snsID     // Catch:{ Exception -> 0x0417 }
                com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139806SE(r5)     // Catch:{ Exception -> 0x0417 }
                goto L_0x0433
            L_0x0417:
                r0 = move-exception
                r1 = r0
                goto L_0x042b
            L_0x041a:
                os2.j r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()     // Catch:{ Exception -> 0x0bf7 }
                long r5 = r10.field_snsID     // Catch:{ Exception -> 0x0bf7 }
                com.tencent.mm.plugin.sns.storage.AdSnsInfo r1 = r1.mo139864jo(r5)     // Catch:{ Exception -> 0x0bf7 }
                if (r1 == 0) goto L_0x0431
                com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.convertToSnsInfo()     // Catch:{ Exception -> 0x0417 }
                goto L_0x0432
            L_0x042b:
                r2 = r1
                r8 = r9
            L_0x042d:
                r1 = r25
                goto L_0x0c33
            L_0x0431:
                r5 = r11
            L_0x0432:
                r1 = r5
            L_0x0433:
                com.tencent.mm.ui.MMImageView r5 = r15.f278345f     // Catch:{ Exception -> 0x0bf7 }
                r6 = 8
                r5.setVisibility(r6)     // Catch:{ Exception -> 0x0bf7 }
                android.widget.TextView r5 = r15.f278341b     // Catch:{ Exception -> 0x0bf7 }
                r5.setVisibility(r6)     // Catch:{ Exception -> 0x0bf7 }
                android.widget.ImageView r5 = r15.f278347h     // Catch:{ Exception -> 0x0bf7 }
                r5.setVisibility(r6)     // Catch:{ Exception -> 0x0bf7 }
                com.tencent.mm.ui.MMImageView r5 = r15.f278345f     // Catch:{ Exception -> 0x0bf7 }
                r5.setImageBitmap(r11)     // Catch:{ Exception -> 0x0bf7 }
                com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0bf7 }
                com.tencent.mm.ui.MMImageView r6 = r15.f278345f     // Catch:{ Exception -> 0x0bf7 }
                r5.mo131092L(r6)     // Catch:{ Exception -> 0x0bf7 }
                r5 = 2
                if (r1 == 0) goto L_0x0b7c
                com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                if (r6 == 0) goto L_0x0b7c
                com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r6 = r6.ContentObj     // Catch:{ Exception -> 0x0b75 }
                if (r6 == 0) goto L_0x0b7c
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0b75 }
                java.util.LinkedList<te3.kv2> r2 = r2.f298427h     // Catch:{ Exception -> 0x0b75 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0b75 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0b75 }
                r4 = 28
                if (r3 != r4) goto L_0x0505
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x057f }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x057f }
                te3.rk1 r1 = r1.f298431o     // Catch:{ Exception -> 0x057f }
                int r2 = r1.f185188i     // Catch:{ Exception -> 0x057f }
                if (r2 != r12) goto L_0x04bf
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r2.setTag(r11)     // Catch:{ Exception -> 0x057f }
                android.widget.TextView r2 = r15.f278341b     // Catch:{ Exception -> 0x057f }
                r6 = 0
                r2.setVisibility(r6)     // Catch:{ Exception -> 0x057f }
                di3.d r2 = di3.C86312j.m106911c(r13)     // Catch:{ Exception -> 0x057f }
                ny.h r2 = (p629ny.C76979h) r2     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x057f }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x057f }
                r4.<init>()     // Catch:{ Exception -> 0x057f }
                java.lang.String r1 = r1.f185187h     // Catch:{ Exception -> 0x057f }
                r4.append(r1)     // Catch:{ Exception -> 0x057f }
                r4.append(r14)     // Catch:{ Exception -> 0x057f }
                java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x057f }
                android.widget.TextView r4 = r15.f278341b     // Catch:{ Exception -> 0x057f }
                float r4 = r4.getTextSize()     // Catch:{ Exception -> 0x057f }
                android.text.SpannableString r1 = r2.yp0(r3, r1, r4)     // Catch:{ Exception -> 0x057f }
                android.widget.TextView r2 = r15.f278341b     // Catch:{ Exception -> 0x057f }
                r2.setText(r1)     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r2 = 8
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x057f }
                goto L_0x057c
            L_0x04bf:
                r6 = 0
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x057f }
                r2.<init>()     // Catch:{ Exception -> 0x057f }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x057f }
                long r7 = r10.systemRowid     // Catch:{ Exception -> 0x057f }
                r3.get((long) r7, r2)     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r3.setTag(r2)     // Catch:{ Exception -> 0x057f }
                java.util.LinkedList<te3.pk1> r2 = r1.f185190n     // Catch:{ Exception -> 0x057f }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ Exception -> 0x057f }
                if (r2 != 0) goto L_0x057c
                di3.d r2 = di3.C86312j.m106911c(r21)     // Catch:{ Exception -> 0x057f }
                ht1.t1 r2 = (ht1.C60200t1) r2     // Catch:{ Exception -> 0x057f }
                java.util.LinkedList<te3.pk1> r3 = r1.f185190n     // Catch:{ Exception -> 0x057f }
                java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x057f }
                te3.pk1 r3 = (te3.C64628pk1) r3     // Catch:{ Exception -> 0x057f }
                java.lang.String r3 = r3.f184828f     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r4 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r7 = r20
                r2.mo76741Cm(r3, r4, r7)     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r2.setVisibility(r6)     // Catch:{ Exception -> 0x057f }
                int r1 = r1.f185188i     // Catch:{ Exception -> 0x057f }
                r2 = 4
                if (r1 == r2) goto L_0x04fe
                if (r1 != r5) goto L_0x057c
            L_0x04fe:
                android.widget.ImageView r1 = r15.f278347h     // Catch:{ Exception -> 0x057f }
                r1.setVisibility(r6)     // Catch:{ Exception -> 0x057f }
                goto L_0x057c
            L_0x0505:
                r7 = r20
                r6 = 0
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0b75 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0b75 }
                r4 = 36
                if (r3 != r4) goto L_0x0584
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x057f }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x057f }
                te3.fw2 r1 = r1.f298436t     // Catch:{ Exception -> 0x057f }
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x057f }
                r2.<init>()     // Catch:{ Exception -> 0x057f }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x057f }
                long r4 = r10.systemRowid     // Catch:{ Exception -> 0x057f }
                r3.get((long) r4, r2)     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r3.setTag(r2)     // Catch:{ Exception -> 0x057f }
                java.util.LinkedList<te3.ew2> r2 = r1.f183247j     // Catch:{ Exception -> 0x057f }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ Exception -> 0x057f }
                if (r2 != 0) goto L_0x057c
                java.util.LinkedList<te3.ew2> r2 = r1.f183247j     // Catch:{ Exception -> 0x057f }
                java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x057f }
                te3.ew2 r2 = (te3.C64350ew2) r2     // Catch:{ Exception -> 0x057f }
                java.lang.String r2 = r2.f183043h     // Catch:{ Exception -> 0x057f }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x057f }
                if (r2 != 0) goto L_0x055d
                di3.d r2 = di3.C86312j.m106911c(r21)     // Catch:{ Exception -> 0x057f }
                ht1.t1 r2 = (ht1.C60200t1) r2     // Catch:{ Exception -> 0x057f }
                java.util.LinkedList<te3.ew2> r1 = r1.f183247j     // Catch:{ Exception -> 0x057f }
                java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x057f }
                te3.ew2 r1 = (te3.C64350ew2) r1     // Catch:{ Exception -> 0x057f }
                java.lang.String r1 = r1.f183043h     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r2.mo76741Cm(r1, r3, r7)     // Catch:{ Exception -> 0x057f }
                goto L_0x0572
            L_0x055d:
                di3.d r2 = di3.C86312j.m106911c(r21)     // Catch:{ Exception -> 0x057f }
                ht1.t1 r2 = (ht1.C60200t1) r2     // Catch:{ Exception -> 0x057f }
                java.util.LinkedList<te3.ew2> r1 = r1.f183247j     // Catch:{ Exception -> 0x057f }
                java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x057f }
                te3.ew2 r1 = (te3.C64350ew2) r1     // Catch:{ Exception -> 0x057f }
                java.lang.String r1 = r1.f183040e     // Catch:{ Exception -> 0x057f }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r2.mo76741Cm(r1, r3, r7)     // Catch:{ Exception -> 0x057f }
            L_0x0572:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x057f }
                r1.setVisibility(r6)     // Catch:{ Exception -> 0x057f }
                android.widget.ImageView r1 = r15.f278347h     // Catch:{ Exception -> 0x057f }
                r1.setVisibility(r6)     // Catch:{ Exception -> 0x057f }
            L_0x057c:
                r8 = r9
                goto L_0x0c39
            L_0x057f:
                r0 = move-exception
                r1 = r0
                r8 = r9
                goto L_0x0b79
            L_0x0584:
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0b75 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0b75 }
                r4 = 29
                if (r3 == r4) goto L_0x0afd
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0b75 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0b75 }
                r4 = 37
                if (r3 != r4) goto L_0x059e
                goto L_0x0afd
            L_0x059e:
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0b75 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0b75 }
                r4 = 38
                if (r3 != r4) goto L_0x0642
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0b75 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0b75 }
                int r21 = r9.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0b75 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0b75 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0b75 }
                te3.nk1 r2 = r2.f298434r     // Catch:{ Exception -> 0x0b75 }
                if (r2 == 0) goto L_0x057c
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x0b75 }
                r2.<init>()     // Catch:{ Exception -> 0x0b75 }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0b75 }
                long r8 = r10.systemRowid     // Catch:{ Exception -> 0x063d }
                r3.get((long) r8, r2)     // Catch:{ Exception -> 0x063d }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x063d }
                r3.setTag(r2)     // Catch:{ Exception -> 0x063d }
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x063d }
                r2.<init>()     // Catch:{ Exception -> 0x063d }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x063d }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x063d }
                te3.nk1 r3 = r3.f298434r     // Catch:{ Exception -> 0x063d }
                java.util.LinkedList<java.lang.String> r3 = r3.f184478g     // Catch:{ Exception -> 0x063d }
                java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x063d }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x063d }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x063d }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x063d }
                te3.nk1 r1 = r1.f298434r     // Catch:{ Exception -> 0x063d }
                java.util.LinkedList<java.lang.String> r1 = r1.f184479h     // Catch:{ Exception -> 0x063d }
                java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x063d }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x063d }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x063d }
                r4.<init>()     // Catch:{ Exception -> 0x063d }
                r4.append(r3)     // Catch:{ Exception -> 0x063d }
                r4.append(r1)     // Catch:{ Exception -> 0x063d }
                java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x063d }
                r2.f298692g = r1     // Catch:{ Exception -> 0x063d }
                r2.f298694i = r1     // Catch:{ Exception -> 0x063d }
                r2.f298690e = r5     // Catch:{ Exception -> 0x063d }
                r2.f298695j = r12     // Catch:{ Exception -> 0x063d }
                te3.mv2 r1 = new te3.mv2     // Catch:{ Exception -> 0x063d }
                r1.<init>()     // Catch:{ Exception -> 0x063d }
                r2.f298698p = r1     // Catch:{ Exception -> 0x063d }
                r2.f298693h = r12     // Catch:{ Exception -> 0x063d }
                r3 = 0
                r1.f298875d = r3     // Catch:{ Exception -> 0x063d }
                r1.f298876e = r3     // Catch:{ Exception -> 0x063d }
                java.lang.String r1 = r17.getSnsId()     // Catch:{ Exception -> 0x063d }
                r2.f298689d = r1     // Catch:{ Exception -> 0x063d }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x063d }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x063d }
                r8 = r34
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r3.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r1
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r1.setVisibility(r6)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x063d:
                r0 = move-exception
                r8 = r34
                goto L_0x0a35
            L_0x0642:
                r8 = r9
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 33
                if (r3 != r4) goto L_0x06b2
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r21 = r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.fa r2 = r2.f298433q     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x0c39
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.fa r3 = r3.f298433q     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f133370h     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.fa r1 = r1.f298433q     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.f133370h     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r1 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r1.f298875d = r3     // Catch:{ Exception -> 0x0a38 }
                r1.f298876e = r3     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r1     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r3.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r1
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r1.setVisibility(r6)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x06b2:
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 34
                if (r3 == r4) goto L_0x0a85
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 45
                if (r3 == r4) goto L_0x0a85
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 43
                if (r3 != r4) goto L_0x06d8
                goto L_0x0a85
            L_0x06d8:
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 39
                if (r3 != r4) goto L_0x0806
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r2 = r2.f298437u     // Catch:{ Exception -> 0x0a38 }
                r3 = 3
                if (r2 == r3) goto L_0x076b
                r3 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r2 == r3) goto L_0x06f6
                goto L_0x0c39
            L_0x06f6:
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r21 = r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r2 = r2.f298432p     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x076b
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r6 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r3.get((long) r6, r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3.setTag(r2)     // Catch:{ Exception -> 0x0a38 }
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r3 = r3.f298432p     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r3 = r3.f298432p     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r3     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r3 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r3.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r3     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                r4 = 0
                r3.f298875d = r4     // Catch:{ Exception -> 0x0a38 }
                r3.f298876e = r4     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r4.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r3
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0a38 }
            L_0x076b:
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r21 = r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r2 = r2.f298438v     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x0c39
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r6 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r3.get((long) r6, r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3.setTag(r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r2 = r2.f298438v     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r2 = r2.f185605f     // Catch:{ Exception -> 0x0a38 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0a38 }
                if (r2 != 0) goto L_0x07eb
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r3 = r3.f298438v     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r1 = r1.f298438v     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r1 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r1.f298875d = r3     // Catch:{ Exception -> 0x0a38 }
                r1.f298876e = r3     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r1     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r3.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r1
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x07fe
            L_0x07eb:
                com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3 = 2131755877(0x7f100365, float:1.9142646E38)
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r4 = r4.hashCode()     // Catch:{ Exception -> 0x0a38 }
                r5 = -1
                r1.mo131095O(r2, r5, r3, r4)     // Catch:{ Exception -> 0x0a38 }
            L_0x07fe:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0806:
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 46
                if (r3 != r4) goto L_0x08ac
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r21 = r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r2 = r2.f298442z     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x0899
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r6 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r3.get((long) r6, r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3.setTag(r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r2 = r2.f298442z     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r2 = r2.f185605f     // Catch:{ Exception -> 0x0a38 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0a38 }
                if (r2 != 0) goto L_0x0891
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r3 = r3.f298442z     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r1 = r1.f298442z     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r1 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r1.f298875d = r3     // Catch:{ Exception -> 0x0a38 }
                r1.f298876e = r3     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r1     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r3.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r1
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
            L_0x0891:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0899:
                com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3 = 2131234159(0x7f080d6f, float:1.8084476E38)
                int r4 = r34.hashCode()     // Catch:{ Exception -> 0x0a38 }
                r5 = -1
                r1.mo131095O(r2, r5, r3, r4)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x08ac:
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                int r3 = r3.f298424e     // Catch:{ Exception -> 0x0a38 }
                r4 = 44
                if (r3 != r4) goto L_0x0953
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r21 = r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.sk1 r2 = r2.f298440x     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x0c39
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r6 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r3.get((long) r6, r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3.setTag(r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.sk1 r2 = r2.f298440x     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r2 = r2.f185427i     // Catch:{ Exception -> 0x0a38 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0a38 }
                if (r2 != 0) goto L_0x0938
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.sk1 r3 = r3.f298440x     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f185427i     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.sk1 r1 = r1.f298440x     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.f185427i     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r1 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r1.f298875d = r3     // Catch:{ Exception -> 0x0a38 }
                r1.f298876e = r3     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r1     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r3.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r1
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x094b
            L_0x0938:
                com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3 = 2131756337(0x7f100531, float:1.9143579E38)
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r4 = r4.hashCode()     // Catch:{ Exception -> 0x0a38 }
                r5 = -1
                r1.mo131095O(r2, r5, r3, r4)     // Catch:{ Exception -> 0x0a38 }
            L_0x094b:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0953:
                int r3 = r1.getTypeFlag()     // Catch:{ Exception -> 0x0a38 }
                if (r3 != r5) goto L_0x0992
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2.setTag(r11)     // Catch:{ Exception -> 0x0a38 }
                android.widget.TextView r2 = r15.f278341b     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0a38 }
                di3.d r2 = di3.C86312j.m106911c(r13)     // Catch:{ Exception -> 0x0a38 }
                ny.h r2 = (p629ny.C76979h) r2     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a38 }
                r4.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.ContentDesc     // Catch:{ Exception -> 0x0a38 }
                r4.append(r1)     // Catch:{ Exception -> 0x0a38 }
                r4.append(r14)     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0a38 }
                android.widget.TextView r4 = r15.f278341b     // Catch:{ Exception -> 0x0a38 }
                float r4 = r4.getTextSize()     // Catch:{ Exception -> 0x0a38 }
                android.text.SpannableString r1 = r2.yp0(r3, r1, r4)     // Catch:{ Exception -> 0x0a38 }
                android.widget.TextView r2 = r15.f278341b     // Catch:{ Exception -> 0x0a38 }
                r2.setText(r1)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0992:
                int r3 = r2.size()     // Catch:{ Exception -> 0x0a38 }
                if (r3 <= 0) goto L_0x0a77
                int r3 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r4 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r29 = r8.mo132862x(r3, r4)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r26 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                java.lang.Object r4 = r2.get(r3)     // Catch:{ Exception -> 0x0a38 }
                r27 = r4
                te3.kv2 r27 = (te3.C101804kv2) r27     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r30 = r4.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r31 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r28 = r3
                r26.mo131104X(r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0a38 }
                int r3 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                r4 = 15
                if (r3 == r4) goto L_0x0a5c
                r4 = 27
                if (r3 != r4) goto L_0x09da
                int r3 = r2.size()     // Catch:{ Exception -> 0x0a38 }
                if (r3 <= 0) goto L_0x09da
                r3 = 0
                java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0a38 }
                te3.kv2 r2 = (te3.C101804kv2) r2     // Catch:{ Exception -> 0x0a38 }
                int r2 = r2.f298690e     // Catch:{ Exception -> 0x0a38 }
                r3 = 6
                if (r2 != r3) goto L_0x09da
                goto L_0x0a5c
            L_0x09da:
                com.tencent.mm.plugin.sns.ui.u4 r2 = new com.tencent.mm.plugin.sns.ui.u4     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.w r3 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r3.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r6 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r4.get((long) r6, r3)     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r4 = "isSnsDelFlag"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.SnsComment"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)     // Catch:{ Exception -> 0x0a38 }
                int r7 = r3.field_commentflag     // Catch:{ Exception -> 0x0a38 }
                r5 = r5 & r7
                if (r5 <= 0) goto L_0x09fc
                r5 = 1
                goto L_0x09fd
            L_0x09fc:
                r5 = 0
            L_0x09fd:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)     // Catch:{ Exception -> 0x0a38 }
                if (r5 != 0) goto L_0x0a3a
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI$q r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.m122168O7(r4)     // Catch:{ Exception -> 0x0a38 }
                long r5 = r10.field_snsID     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0a38 }
                boolean r4 = r4.mo132860u(r5)     // Catch:{ Exception -> 0x0a38 }
                if (r4 == 0) goto L_0x0a15
                goto L_0x0a3a
            L_0x0a15:
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI$q r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.m122168O7(r4)     // Catch:{ Exception -> 0x0a38 }
                long r5 = r10.field_snsID     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0a38 }
                boolean r4 = r4.mo132859t(r5)     // Catch:{ Exception -> 0x0a38 }
                if (r4 == 0) goto L_0x0a3d
                java.lang.String r4 = "markEnableAccess"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsImageViewTag"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ Exception -> 0x0a38 }
                r2.f281211f = r12     // Catch:{ Exception -> 0x0a38 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0a3d
            L_0x0a35:
                r1 = r0
                goto L_0x0b79
            L_0x0a38:
                r0 = move-exception
                goto L_0x0a35
            L_0x0a3a:
                r2.mo133900a()     // Catch:{ Exception -> 0x0a38 }
            L_0x0a3d:
                r2.f281213h = r3     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.getLocalid()     // Catch:{ Exception -> 0x0a38 }
                r2.f281206a = r1     // Catch:{ Exception -> 0x0a38 }
                r1 = 0
                r2.f281207b = r1     // Catch:{ Exception -> 0x0a38 }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r1.add(r3)     // Catch:{ Exception -> 0x0a38 }
                r1 = r35
                r2.f281208c = r1     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r1.setTag(r2)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0a75
            L_0x0a5c:
                android.widget.ImageView r1 = r15.f278347h     // Catch:{ Exception -> 0x0a38 }
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x0a38 }
                os2.w r1 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r3 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r2.get((long) r3, r1)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r2 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2.setTag(r1)     // Catch:{ Exception -> 0x0a38 }
            L_0x0a75:
                r6 = 1
                goto L_0x0a78
            L_0x0a77:
                r6 = 0
            L_0x0a78:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                if (r6 == 0) goto L_0x0a7e
                r6 = 0
                goto L_0x0a80
            L_0x0a7e:
                r6 = 8
            L_0x0a80:
                r1.setVisibility(r6)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0a85:
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.p81 r2 = r2.f298435s     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x0af5
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.p81 r3 = r3.f298435s     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f184783i     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.p81 r3 = r3.f298435s     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f184783i     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r3     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r3 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r3.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r3     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r4 = r4.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.p81 r4 = r4.f298435s     // Catch:{ Exception -> 0x0a38 }
                float r4 = r4.f184784j     // Catch:{ Exception -> 0x0a38 }
                r3.f298875d = r4     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r3 = r2.f298698p     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r4 = r4.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.p81 r4 = r4.f298435s     // Catch:{ Exception -> 0x0a38 }
                float r4 = r4.f184785n     // Catch:{ Exception -> 0x0a38 }
                r3.f298876e = r4     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r3     // Catch:{ Exception -> 0x0a38 }
                di3.d r2 = di3.C86312j.m106911c(r21)     // Catch:{ Exception -> 0x0a38 }
                ht1.t1 r2 = (ht1.C60200t1) r2     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.p81 r1 = r1.f298435s     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.f184783i     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2.mo76741Cm(r1, r3, r7)     // Catch:{ Exception -> 0x0a38 }
            L_0x0af5:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0afd:
                r8 = r9
                int r2 = r1.field_type     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                int r21 = r8.mo132862x(r2, r3)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r2 = r2.f298432p     // Catch:{ Exception -> 0x0a38 }
                if (r2 == 0) goto L_0x0c39
                os2.w r2 = new os2.w     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()     // Catch:{ Exception -> 0x0a38 }
                long r6 = r10.systemRowid     // Catch:{ Exception -> 0x0a38 }
                r3.get((long) r6, r2)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r3 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r3.setTag(r2)     // Catch:{ Exception -> 0x0a38 }
                te3.kv2 r2 = new te3.kv2     // Catch:{ Exception -> 0x0a38 }
                r2.<init>()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r3 = r3.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r3 = r3.f298432p     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r3 = r3.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298692g = r3     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ Exception -> 0x0a38 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ Exception -> 0x0a38 }
                te3.tk1 r1 = r1.f298432p     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r1.f185605f     // Catch:{ Exception -> 0x0a38 }
                r2.f298694i = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298690e = r5     // Catch:{ Exception -> 0x0a38 }
                r2.f298695j = r12     // Catch:{ Exception -> 0x0a38 }
                te3.mv2 r1 = new te3.mv2     // Catch:{ Exception -> 0x0a38 }
                r1.<init>()     // Catch:{ Exception -> 0x0a38 }
                r2.f298698p = r1     // Catch:{ Exception -> 0x0a38 }
                r2.f298693h = r12     // Catch:{ Exception -> 0x0a38 }
                r3 = 0
                r1.f298875d = r3     // Catch:{ Exception -> 0x0a38 }
                r1.f298876e = r3     // Catch:{ Exception -> 0x0a38 }
                java.lang.String r1 = r17.getSnsId()     // Catch:{ Exception -> 0x0a38 }
                r2.f298689d = r1     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.model.o r18 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this     // Catch:{ Exception -> 0x0a38 }
                int r22 = r3.hashCode()     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284137i     // Catch:{ Exception -> 0x0a38 }
                r19 = r2
                r20 = r1
                r18.mo131104X(r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0a38 }
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f     // Catch:{ Exception -> 0x0a38 }
                r2 = 0
                r1.setVisibility(r2)     // Catch:{ Exception -> 0x0a38 }
                goto L_0x0c39
            L_0x0b75:
                r0 = move-exception
                r8 = r9
                goto L_0x0a35
            L_0x0b79:
                r2 = r1
                goto L_0x042d
            L_0x0b7c:
                r8 = r9
                int r1 = r3.f298777h     // Catch:{ Exception -> 0x0bf5 }
                if (r1 == r4) goto L_0x0c39
                r4 = 8
                if (r1 != r4) goto L_0x0b87
                goto L_0x0c39
            L_0x0b87:
                if (r1 != r2) goto L_0x0bd2
                long r1 = r10.field_snsID     // Catch:{ Exception -> 0x0bce }
                boolean r1 = com.tencent.p014mm.plugin.sns.model.C94835a0.m120174j1(r1)     // Catch:{ Exception -> 0x0bce }
                if (r1 == 0) goto L_0x0c39
                te3.yq3 r1 = r3.f298788v     // Catch:{ Exception -> 0x0bce }
                if (r1 == 0) goto L_0x0bb2
                java.lang.String r2 = "atFriend detail, aid64 %d, aid %d"
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0bce }
                long r4 = r1.f145470i     // Catch:{ Exception -> 0x0bce }
                java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0bce }
                r4 = 0
                r6[r4] = r1     // Catch:{ Exception -> 0x0bce }
                te3.yq3 r1 = r3.f298788v     // Catch:{ Exception -> 0x0bce }
                int r1 = r1.f145465d     // Catch:{ Exception -> 0x0bce }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0bce }
                r6[r12] = r1     // Catch:{ Exception -> 0x0bce }
                r1 = r25
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r6)     // Catch:{ Exception -> 0x0bf3 }
                goto L_0x0bb4
            L_0x0bb2:
                r1 = r25
            L_0x0bb4:
                com.tencent.mm.plugin.sns.model.a0 r2 = new com.tencent.mm.plugin.sns.model.a0     // Catch:{ Exception -> 0x0bf3 }
                long r4 = r10.field_snsID     // Catch:{ Exception -> 0x0bf3 }
                te3.yq3 r3 = r3.f298788v     // Catch:{ Exception -> 0x0bf3 }
                r6 = 2
                r2.<init>((long) r4, (int) r6, (te3.C52156yq3) r3)     // Catch:{ Exception -> 0x0bf3 }
                f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0bf3 }
                f40.g r3 = f40.C86709a0.m107529k()     // Catch:{ Exception -> 0x0bf3 }
                ob0.b0 r3 = r3.mo121127b()     // Catch:{ Exception -> 0x0bf3 }
                r3.mo123460f(r2)     // Catch:{ Exception -> 0x0bf3 }
                goto L_0x0c39
            L_0x0bce:
                r0 = move-exception
            L_0x0bcf:
                r1 = r25
                goto L_0x0c10
            L_0x0bd2:
                r1 = r25
                long r2 = r10.field_snsID     // Catch:{ Exception -> 0x0bf3 }
                boolean r2 = com.tencent.p014mm.plugin.sns.model.C43036f0.m46671j1(r2)     // Catch:{ Exception -> 0x0bf3 }
                if (r2 == 0) goto L_0x0c39
                f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0bf3 }
                f40.g r2 = f40.C86709a0.m107529k()     // Catch:{ Exception -> 0x0bf3 }
                ob0.b0 r2 = r2.mo121127b()     // Catch:{ Exception -> 0x0bf3 }
                com.tencent.mm.plugin.sns.model.f0 r3 = new com.tencent.mm.plugin.sns.model.f0     // Catch:{ Exception -> 0x0bf3 }
                long r4 = r10.field_snsID     // Catch:{ Exception -> 0x0bf3 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0bf3 }
                r2.mo123460f(r3)     // Catch:{ Exception -> 0x0bf3 }
                goto L_0x0c39
            L_0x0bf3:
                r0 = move-exception
                goto L_0x0c10
            L_0x0bf5:
                r0 = move-exception
                goto L_0x0bcf
            L_0x0bf7:
                r0 = move-exception
                r8 = r9
                goto L_0x0bcf
            L_0x0bfa:
                r0 = move-exception
                r15 = r6
                r10 = r7
                r8 = r9
                r32 = r19
                r33 = r23
                r1 = r25
                r12 = 1
                goto L_0x0c10
            L_0x0c06:
                r0 = move-exception
                r15 = r6
                r8 = r9
                r1 = r10
                r32 = r19
                r33 = r23
                r12 = 1
                goto L_0x0c1d
            L_0x0c10:
                r2 = r0
                goto L_0x0c33
            L_0x0c12:
                r0 = move-exception
                r8 = r9
                r1 = r10
                r24 = r15
                r32 = r19
                r33 = r23
            L_0x0c1b:
                r12 = 1
                r15 = r6
            L_0x0c1d:
                r10 = r7
                goto L_0x0c10
            L_0x0c1f:
                r0 = move-exception
                r33 = r8
                r8 = r9
                r1 = r10
                r24 = r15
                r32 = r19
                goto L_0x0c1b
            L_0x0c29:
                r0 = move-exception
                r32 = r5
                r33 = r8
                r8 = r9
                r1 = r10
                r24 = r15
                goto L_0x0c1b
            L_0x0c33:
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r14, r4)
            L_0x0c39:
                com.tencent.mm.ui.MMImageView r1 = r15.f278345f
                int r1 = r1.getVisibility()
                if (r1 == 0) goto L_0x0c4c
                android.widget.ImageView r1 = r15.f278347h
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L_0x0c4a
                goto L_0x0c4c
            L_0x0c4a:
                r6 = 0
                goto L_0x0c4d
            L_0x0c4c:
                r6 = 1
            L_0x0c4d:
                r1 = 2131314049(0x7f094581, float:1.8246512E38)
                r2 = r32
                android.view.View r1 = r2.findViewById(r1)
                if (r6 == 0) goto L_0x0c5a
                r6 = 0
                goto L_0x0c5c
            L_0x0c5a:
                r6 = 8
            L_0x0c5c:
                k20.a r3 = new k20.a
                r3.<init>()
                k20.C60958c.m71442b(r6, r3)
                java.lang.Object[] r14 = r3.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r1
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                r4 = 0
                java.lang.Object r3 = r3.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r1.setVisibility(r3)
                java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                r1 = 2131314099(0x7f0945b3, float:1.8246613E38)
                android.view.View r3 = r2.findViewById(r1)
                int r4 = r10.field_isSilence
                if (r4 != r12) goto L_0x0ca4
                r6 = 0
                goto L_0x0ca6
            L_0x0ca4:
                r6 = 8
            L_0x0ca6:
                k20.a r4 = new k20.a
                r4.<init>()
                k20.C60958c.m71442b(r6, r4)
                java.lang.Object[] r14 = r4.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r3
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                r5 = 0
                java.lang.Object r4 = r4.mo10231a(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                android.view.View r1 = r2.findViewById(r1)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.content.Context r3 = r8.f24696e
                r4 = 2131756982(0x7f1007b6, float:1.9144887E38)
                android.content.res.Resources r5 = r3.getResources()
                r6 = 2131100124(0x7f0601dc, float:1.781262E38)
                int r5 = r5.getColor(r6)
                android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r5)
                r1.setImageDrawable(r3)
                r1 = r24
                r3 = r33
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        /* renamed from: l */
        public void mo1332l() {
            SnsMethodCalculate.markStartTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            Log.m105924i("MicroMsg.SnsMsgUI", "adapter initCursor");
            mo5580b();
            mo1333o();
            SnsMethodCalculate.markEndTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0398  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0474  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x04d9  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x038e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x012b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0174  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0247  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0258  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1333o() {
            /*
                r32 = this;
                r0 = r32
                java.lang.String r1 = "resetCursor"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                os2.x r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                int r3 = r3.mo139896kD()
                r4 = 0
                r5 = 0
                r6 = 1
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI"
                java.lang.String r8 = "MicroMsg.SnsMsgUI"
                if (r3 <= 0) goto L_0x0044
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.this
                int r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.f278275Q
                java.lang.String r10 = "access$2000"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r7)
                boolean r9 = r9.f278300p
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r7)
                if (r9 != 0) goto L_0x0044
                java.lang.Object[] r9 = new java.lang.Object[r6]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                r9[r5] = r10
                java.lang.String r10 = "adapter resetCursor unReadCount = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r9)
                os2.x r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                android.database.Cursor r9 = r9.mo139893bD()
                r0.mo7998r(r9)
                goto L_0x00af
            L_0x0044:
                os2.x r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                int r9 = r9.mo139892Yt(r5)
                r0.f278328p = r9
                java.lang.Object[] r10 = new java.lang.Object[r6]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r5] = r9
                java.lang.String r9 = "adapter resetCursor totalCount = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r10)
                os2.x r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                int r10 = r0.f278327o
                r9.getClass()
                java.lang.String r11 = "getCursor"
                java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.SnsCommentStorage"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r9.mo139889Ow()
                java.lang.String r14 = "select *, rowid from SnsComment"
                r13.append(r14)
                java.lang.String r14 = " where isSend = "
                r13.append(r14)
                r13.append(r5)
                java.lang.String r14 = " order by createTime desc LIMIT "
                r13.append(r14)
                r13.append(r10)
                java.lang.String r10 = r13.toString()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "getCursor sql:"
                r13.append(r14)
                r13.append(r10)
                java.lang.String r13 = r13.toString()
                java.lang.String r14 = "MicroMsg.SnsCommentStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r13)
                zh3.f r9 = r9.f294191d
                android.database.Cursor r9 = r9.rawQuery(r10, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
                r0.mo7998r(r9)
            L_0x00af:
                java.lang.String r9 = "checkShouldShowMsgStopRemindTips"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)
                if (r3 <= 0) goto L_0x0509
                pt2.a r10 = r0.f278333u
                if (r10 == 0) goto L_0x0509
                pt2.g r10 = (pt2.C100909g) r10
                java.lang.String r11 = "isInflateTipsUIAfterLastUnreadData"
                java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
                boolean r13 = r10.f295515c
                if (r13 == 0) goto L_0x00d0
                java.lang.String r13 = r10.f295514b
                java.lang.String r14 = "isInflateTipsUIAfterLastUnreadData ,UI already inflate once"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            L_0x00d0:
                boolean r10 = r10.f295515c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
                if (r10 != 0) goto L_0x0509
                pt2.C100906d.m132261a()
                pt2.d r10 = pt2.C100906d.f295510b
                java.lang.String r11 = "enableTrigger"
                java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
                java.lang.String r14 = "isShowStopMsgRemindTipsExpt"
                java.lang.String r15 = "com.tencent.mm.plugin.sns.model.SnsConfig"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
                boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                r15 = 788529167(0x2f00000f, float:1.1641553E-10)
                if (r14 != 0) goto L_0x0110
                boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r14 != 0) goto L_0x0104
                boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r14 != 0) goto L_0x0104
                int r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                if (r14 != r15) goto L_0x0102
                goto L_0x0104
            L_0x0102:
                r14 = 0
                goto L_0x0105
            L_0x0104:
                r14 = 1
            L_0x0105:
                if (r14 != 0) goto L_0x0110
                boolean r14 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r14 == 0) goto L_0x010e
                goto L_0x0110
            L_0x010e:
                r14 = 0
                goto L_0x0111
            L_0x0110:
                r14 = 1
            L_0x0111:
                if (r14 == 0) goto L_0x0126
                f40.o r14 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r14 = r14.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_TRIGGER_DEBUG_INT
                int r4 = r14.mo119689j(r4, r6)
                if (r4 != r6) goto L_0x0124
                goto L_0x0126
            L_0x0124:
                r4 = 0
                goto L_0x0127
            L_0x0126:
                r4 = 1
            L_0x0127:
                java.lang.String r14 = "MicroMsg.SnsMsgStopRemindHelper"
                if (r4 != 0) goto L_0x0134
                java.lang.String r4 = "enableTrigger:false <-- Expt == false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
                goto L_0x016d
            L_0x0134:
                int r4 = r10.mo140373b()
                if (r4 <= 0) goto L_0x013c
                r10 = 1
                goto L_0x013d
            L_0x013c:
                r10 = 0
            L_0x013d:
                if (r10 != 0) goto L_0x0148
                java.lang.String r4 = "enableTrigger:false <-- allowShowCount <= 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
                goto L_0x016d
            L_0x0148:
                r15 = 3
                if (r4 >= r15) goto L_0x016f
                java.lang.String r4 = "isUserDidUseStopRemindAfterTips"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r13)
                f40.o r10 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()
                com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_USED_AFTER_BOOLEAN
                boolean r10 = r10.mo119686g(r15, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r13)
                r10 = r10 ^ r6
                if (r10 != 0) goto L_0x016f
                java.lang.String r4 = "enableTrigger:false <-- user did use stop remind after last Tips"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            L_0x016d:
                r10 = 0
                goto L_0x0172
            L_0x016f:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            L_0x0172:
                if (r10 == 0) goto L_0x0509
                r4 = 100
                int r3 = java.lang.Math.min(r3, r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r10 = 0
            L_0x0180:
                if (r10 >= r3) goto L_0x01cf
                os2.w r11 = new os2.w
                r11.<init>()
                boolean r15 = r0.mo7996n(r10)
                if (r15 == 0) goto L_0x0190
                T r11 = r0.f24695d
                goto L_0x01a7
            L_0x0190:
                if (r10 < 0) goto L_0x01a6
                android.database.Cursor r15 = r32.mo7992g()
                boolean r15 = r15.moveToPosition(r10)
                if (r15 != 0) goto L_0x019d
                goto L_0x01a6
            L_0x019d:
                android.database.Cursor r15 = r32.mo7992g()
                java.lang.Object r11 = r0.mo1330d(r11, r15)
                goto L_0x01a7
            L_0x01a6:
                r11 = 0
            L_0x01a7:
                os2.w r11 = (os2.C100420w) r11
                if (r11 == 0) goto L_0x01c7
                java.lang.String r15 = "hadRead"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.SnsComment"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r5)
                r17 = r3
                short r3 = r11.field_isRead
                if (r3 != r6) goto L_0x01bd
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
                r3 = 1
                goto L_0x01c1
            L_0x01bd:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
                r3 = 0
            L_0x01c1:
                if (r3 != 0) goto L_0x01c9
                r4.add(r11)
                goto L_0x01c9
            L_0x01c7:
                r17 = r3
            L_0x01c9:
                int r10 = r10 + 1
                r3 = r17
                r5 = 0
                goto L_0x0180
            L_0x01cf:
                java.lang.Object[] r3 = new java.lang.Object[r6]
                int r5 = r4.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r10 = 0
                r3[r10] = r5
                java.lang.String r5 = "adapter ready to check unreadCommentData, unreadComment size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r3)
                pt2.a r3 = r0.f278333u
                pt2.g r3 = (pt2.C100909g) r3
                r3.getClass()
                java.lang.String r5 = "onDataFetch"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r12)
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.ui.SnsMsgUI> r10 = r3.f295513a
                if (r10 == 0) goto L_0x04fe
                java.lang.Object r10 = r10.get()
                com.tencent.mm.plugin.sns.ui.SnsMsgUI r10 = (com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI) r10
                if (r10 != 0) goto L_0x01fc
                goto L_0x04fe
            L_0x01fc:
                boolean r11 = r4.isEmpty()
                if (r11 == 0) goto L_0x0207
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r12)
                goto L_0x0509
            L_0x0207:
                java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
                r11.<init>()
                java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
                r15.<init>()
                pt2.d$a r17 = pt2.C100906d.f295509a
                r17.mo140375a()
                java.lang.String r6 = "getUnreadLikeThreshold"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r13)
                boolean r18 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r18 != 0) goto L_0x0241
                boolean r18 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r18 != 0) goto L_0x0233
                boolean r18 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r18 != 0) goto L_0x0233
                int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r18 = r1
                r1 = 788529167(0x2f00000f, float:1.1641553E-10)
                if (r0 != r1) goto L_0x0231
                goto L_0x0235
            L_0x0231:
                r0 = 0
                goto L_0x0236
            L_0x0233:
                r18 = r1
            L_0x0235:
                r0 = 1
            L_0x0236:
                if (r0 != 0) goto L_0x0243
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 == 0) goto L_0x023f
                goto L_0x0243
            L_0x023f:
                r0 = 0
                goto L_0x0244
            L_0x0241:
                r18 = r1
            L_0x0243:
                r0 = 1
            L_0x0244:
                r1 = 5
                if (r0 == 0) goto L_0x0258
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r16 = r2
                com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_THRESHOLD_MSG_STOP_REMIND_UNREAD_LIKE_NOT_MINE_FEED_DEBUG_INT
                int r1 = r0.mo119689j(r2, r1)
                goto L_0x025a
            L_0x0258:
                r16 = r2
            L_0x025a:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r13)
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                java.util.Iterator r2 = r4.iterator()
            L_0x0263:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x038e
                java.lang.Object r4 = r2.next()
                os2.w r4 = (os2.C100420w) r4
                r19 = r5
                long r5 = r4.field_snsID
                pt2.d$a r20 = pt2.C100906d.f295509a
                r20.mo140375a()
                r21 = r2
                int r2 = r4.field_type
                r22 = r9
                java.lang.String r9 = "isLikeComment"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
                r23 = r14
                r14 = 1
                if (r2 == r14) goto L_0x028f
                r14 = 7
                if (r2 != r14) goto L_0x028d
                goto L_0x028f
            L_0x028d:
                r2 = 0
                goto L_0x0290
            L_0x028f:
                r2 = 1
            L_0x0290:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
                if (r2 == 0) goto L_0x0384
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                boolean r2 = r15.contains(r2)
                if (r2 == 0) goto L_0x02a1
                goto L_0x0384
            L_0x02a1:
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                boolean r2 = r11.containsKey(r2)
                if (r2 != 0) goto L_0x02b8
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r9 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
                r11.put(r2, r14)
                goto L_0x02d5
            L_0x02b8:
                r9 = 1
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                java.lang.Object r2 = r11.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 == 0) goto L_0x02d5
                int r2 = r2.intValue()
                java.lang.Long r14 = java.lang.Long.valueOf(r5)
                int r2 = r2 + r9
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r11.put(r14, r2)
            L_0x02d5:
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                java.lang.Object r2 = r11.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 == 0) goto L_0x02e6
                int r2 = r2.intValue()
                goto L_0x02e7
            L_0x02e6:
                r2 = 0
            L_0x02e7:
                if (r0 >= r2) goto L_0x02ea
                r0 = r2
            L_0x02ea:
                if (r2 < r1) goto L_0x0380
                r20.mo140375a()
                java.lang.String r9 = "checkMineFeedBySnsId"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
                os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
                com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r14.mo139806SE(r5)
                if (r14 != 0) goto L_0x0317
                os2.j r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
                com.tencent.mm.plugin.sns.storage.AdSnsInfo r14 = r14.mo139864jo(r5)
                if (r14 == 0) goto L_0x0313
                java.lang.String r14 = r14.field_userName
                r20 = r0
                java.lang.String r0 = pt2.C100906d.f295511c
                boolean r14 = gy3.C87412m.m108589b(r14, r0)
                goto L_0x0321
            L_0x0313:
                r20 = r0
                r14 = 1
                goto L_0x0321
            L_0x0317:
                r20 = r0
                java.lang.String r0 = r14.field_userName
                java.lang.String r14 = pt2.C100906d.f295511c
                boolean r14 = gy3.C87412m.m108589b(r0, r14)
            L_0x0321:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
                if (r14 == 0) goto L_0x0349
                java.lang.String r0 = r3.f295514b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r9 = "onDataFetch found but mine feed, feedId:"
                r2.append(r9)
                java.lang.String r4 = vr2.C102236a0.m134776w(r4)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                java.lang.Long r0 = java.lang.Long.valueOf(r5)
                r15.add(r0)
                goto L_0x0382
            L_0x0349:
                java.lang.String r0 = r3.f295514b
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "onDataFetch finally enableShow snsId:"
                r9.append(r11)
                r9.append(r5)
                java.lang.String r5 = ", feedId:"
                r9.append(r5)
                java.lang.String r5 = vr2.C102236a0.m134776w(r4)
                r9.append(r5)
                java.lang.String r5 = ", likeCount:"
                r9.append(r5)
                r9.append(r2)
                java.lang.String r2 = ", threshold:"
                r9.append(r2)
                r9.append(r1)
                java.lang.String r2 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                r0 = r20
                r2 = 1
                goto L_0x0396
            L_0x0380:
                r20 = r0
            L_0x0382:
                r0 = r20
            L_0x0384:
                r5 = r19
                r2 = r21
                r9 = r22
                r14 = r23
                goto L_0x0263
            L_0x038e:
                r19 = r5
                r22 = r9
                r23 = r14
                r2 = 0
                r4 = 0
            L_0x0396:
                if (r2 == 0) goto L_0x04d9
                java.lang.String r0 = "initSnsMsgUIStopRemindTips"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
                boolean r1 = r3.f295515c
                if (r1 == 0) goto L_0x03ad
                java.lang.String r1 = r3.f295514b
                java.lang.String r2 = "initSnsMsgUIStopRemindTips already inflate, skip this time"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                goto L_0x0465
            L_0x03ad:
                r1 = 2131314135(0x7f0945d7, float:1.8246686E38)
                android.view.View r1 = r10.findViewById(r1)
                boolean r2 = r1 instanceof android.view.ViewStub
                if (r2 == 0) goto L_0x03bc
                r2 = r1
                android.view.ViewStub r2 = (android.view.ViewStub) r2
                goto L_0x03bd
            L_0x03bc:
                r2 = 0
            L_0x03bd:
                if (r1 == 0) goto L_0x0467
                if (r2 != 0) goto L_0x03c3
                goto L_0x0467
            L_0x03c3:
                pt2.e r1 = new pt2.e
                r1.<init>(r3)
                r2.setOnInflateListener(r1)
                android.view.View r1 = r2.inflate()
                r2 = 2131315359(0x7f094a9f, float:1.824917E38)
                android.view.View r2 = r1.findViewById(r2)
                java.lang.String r3 = "null cannot be cast to non-null type android.widget.TextView"
                gy3.C87412m.m108592e(r2, r3)
                android.widget.TextView r2 = (android.widget.TextView) r2
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r5 = 2131837051(0x7f11407b, float:1.9307286E38)
                java.lang.String r3 = r3.getString(r5)
                r2.setText(r3)
                r3 = 2131315358(0x7f094a9e, float:1.8249167E38)
                android.view.View r3 = r1.findViewById(r3)
                java.lang.String r5 = "null cannot be cast to non-null type android.widget.ImageView"
                gy3.C87412m.m108592e(r3, r5)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                pt2.f r5 = new pt2.f
                r5.<init>(r1)
                r3.setOnClickListener(r5)
                r3 = 2131315357(0x7f094a9d, float:1.8249165E38)
                android.view.View r1 = r1.findViewById(r3)
                java.lang.String r3 = "view.findViewById(R.id.tipsbar_left_icon)"
                gy3.C87412m.m108593f(r1, r3)
                r3 = 8
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5.mo10233c(r3)
                java.lang.Object[] r25 = r5.mo10232b()
                java.lang.String r26 = "com/tencent/mm/plugin/sns/ui/helper/SnsMsgStopRemindPreCheckCallback"
                java.lang.String r27 = "initSnsMsgUIStopRemindTips"
                java.lang.String r28 = "(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Z"
                java.lang.String r29 = "android/view/View_EXEC_"
                java.lang.String r30 = "setVisibility"
                java.lang.String r31 = "(I)V"
                r24 = r1
                j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
                r3 = 0
                java.lang.Object r5 = r5.mo10231a(r3)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r3 = r5.intValue()
                r1.setVisibility(r3)
                java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/helper/SnsMsgStopRemindPreCheckCallback"
                java.lang.String r26 = "initSnsMsgUIStopRemindTips"
                java.lang.String r27 = "(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Z"
                java.lang.String r28 = "android/view/View_EXEC_"
                java.lang.String r29 = "setVisibility"
                java.lang.String r30 = "(I)V"
                j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 16
                int r1 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r1, r3)
                r3 = 0
                r2.setPadding(r1, r3, r1, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            L_0x0465:
                r0 = 1
                goto L_0x0472
            L_0x0467:
                java.lang.String r1 = r3.f295514b
                java.lang.String r2 = "initSnsMsgUIStopRemindTips failed , viewStub init error"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                r0 = 0
            L_0x0472:
                if (r0 == 0) goto L_0x04f8
                pt2.h r0 = new pt2.h
                java.lang.String r1 = vr2.C102236a0.m134776w(r4)
                java.lang.String r2 = "genFeedIdBySnsComment(eduTriggerComment)"
                gy3.C87412m.m108593f(r1, r2)
                r2 = 1
                r0.<init>(r2, r1)
                java.lang.String r1 = "updateStopRemindReportInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r7)
                r10.f278301q = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
                pt2.d$a r0 = pt2.C100906d.f295509a
                r0.mo140375a()
                pt2.d r0 = pt2.C100906d.f295510b
                java.lang.String r1 = "updateUserTipsEnableShowCount"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
                int r2 = r0.mo140373b()
                int r2 = r2 + -1
                r3 = 0
                int r2 = java.lang.Math.max(r3, r2)
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_REMAINDER_SHOW_COUNT_INT
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.mo119677K(r4, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "updateUserTipsEnableShowCount newValue:"
                r2.append(r3)
                int r0 = r0.mo140373b()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r2 = r23
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
                goto L_0x04f8
            L_0x04d9:
                java.lang.String r2 = r3.f295514b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onDataFetch resultEnableShow=false, likeCommentThreshold="
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = ", max feed unread Like Count:"
                r3.append(r1)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            L_0x04f8:
                r0 = r19
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                goto L_0x050f
            L_0x04fe:
                r18 = r1
                r16 = r2
                r0 = r5
                r22 = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                goto L_0x050f
            L_0x0509:
                r18 = r1
                r16 = r2
                r22 = r9
            L_0x050f:
                r1 = r16
                r0 = r22
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r32.notifyDataSetChanged()
                r0 = r18
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.mo1333o():void");
        }

        public synchronized void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            mo7991f();
            Log.m105924i("MicroMsg.SnsMsgUI", "onNotifyChange: ");
            SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        }

        /* renamed from: s */
        public int mo132858s() {
            SnsMethodCalculate.markStartTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            if (mo132856B()) {
                if (SnsMsgUI.m122162I7(SnsMsgUI.this).getParent() != null) {
                    SnsMsgUI.m122170Q7(SnsMsgUI.this).removeFooterView(SnsMsgUI.m122162I7(SnsMsgUI.this));
                }
                SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                return 0;
            }
            int i = this.f278327o + 10;
            this.f278327o = i;
            int i2 = this.f278328p;
            if (i <= i2) {
                SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                return 10;
            }
            this.f278327o = i2;
            int i3 = i2 % 10;
            SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return i3;
        }

        /* renamed from: t */
        public boolean mo132859t(String str) {
            SnsMethodCalculate.markStartTimeMs("checkSnsIdHadEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            boolean z = this.f278334v != null && !Util.isNullOrNil(str) && ((HashMap) this.f278334v).get(str) != null && ((Integer) ((HashMap) this.f278334v).get(str)).intValue() == 1;
            Log.m105919d("MicroMsg.SnsMsgUI", "checkSnsIdHadEnableAccess: snsId:%s enable:%b", str, Boolean.valueOf(z));
            SnsMethodCalculate.markEndTimeMs("checkSnsIdHadEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return z;
        }

        /* renamed from: u */
        public boolean mo132860u(String str) {
            SnsMethodCalculate.markStartTimeMs("checkSnsIdHadForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            boolean z = this.f278334v != null && !Util.isNullOrNil(str) && ((HashMap) this.f278334v).get(str) != null && ((Integer) ((HashMap) this.f278334v).get(str)).intValue() == 2;
            Log.m105919d("MicroMsg.SnsMsgUI", "checkSnsIdHadForbidAccess: snsId:%s forbid:%b", str, Boolean.valueOf(z));
            SnsMethodCalculate.markEndTimeMs("checkSnsIdHadForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return z;
        }

        /* renamed from: w */
        public void mo132861w(String str) {
            SnsMethodCalculate.markStartTimeMs("markSnsIdForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            ((HashMap) this.f278334v).put(str, 2);
            SnsMethodCalculate.markEndTimeMs("markSnsIdForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            r3 = -1;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo132862x(int r6, com.tencent.p014mm.p136ui.MMImageView r7) {
            /*
                r5 = this;
                java.lang.String r0 = "setDefaultImg"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                r2 = 15
                r3 = 2131755119(0x7f10006f, float:1.9141108E38)
                r4 = 2131230947(0x7f0800e3, float:1.8077961E38)
                if (r6 == r2) goto L_0x0030
                r2 = 42
                if (r6 == r2) goto L_0x002c
                r2 = 0
                switch(r6) {
                    case 1: goto L_0x0028;
                    case 2: goto L_0x0023;
                    case 3: goto L_0x0033;
                    case 4: goto L_0x002c;
                    case 5: goto L_0x0030;
                    case 6: goto L_0x001f;
                    case 7: goto L_0x0028;
                    case 8: goto L_0x001b;
                    default: goto L_0x001a;
                }
            L_0x001a:
                goto L_0x0033
            L_0x001b:
                r7.setImageDrawable(r2)
                goto L_0x0026
            L_0x001f:
                r3 = 2131755088(0x7f100050, float:1.9141045E38)
                goto L_0x0033
            L_0x0023:
                r7.setImageDrawable(r2)
            L_0x0026:
                r3 = -1
                goto L_0x0033
            L_0x0028:
                r3 = 2131230947(0x7f0800e3, float:1.8077961E38)
                goto L_0x0033
            L_0x002c:
                r3 = 2131755090(0x7f100052, float:1.914105E38)
                goto L_0x0033
            L_0x0030:
                r3 = 2131755116(0x7f10006c, float:1.9141102E38)
            L_0x0033:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsMsgUI.C95588q.mo132862x(int, com.tencent.mm.ui.MMImageView):int");
        }

        /* renamed from: z */
        public final void mo132863z(EmojiStatusView emojiStatusView, TextView textView, m64 m64, long j, String str, C100420w wVar) {
            String str2;
            String str3;
            String str4;
            String str5;
            int i;
            SnsInfo snsInfo;
            AdSnsInfo jo;
            int i2;
            Drawable drawable;
            SpannableString spannableString;
            TextView textView2 = textView;
            m64 m642 = m64;
            String str6 = str;
            C100420w wVar2 = wVar;
            Class cls = C75700k0.class;
            Class cls2 = C76979h.class;
            SnsMethodCalculate.markStartTimeMs("setMsgContent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            emojiStatusView.setVisibility(8);
            textView2.setVisibility(0);
            if (Util.isNullOrNil((List) m642.f298789w) || m642.f298789w.get(0) == null) {
                textView2.setTag((Object) null);
            } else {
                textView2.setTag(m642.f298789w.get(0).f131560d);
            }
            int[] iArr = new int[2];
            wVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
            boolean z = (wVar2.field_commentflag & 1) > 0;
            SnsMethodCalculate.markEndTimeMs("isCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
            if (z) {
                textView2.setText(C0966R.string.jf4);
                textView2.setBackgroundColor(SnsMsgUI.this.getResources().getColor(C0966R.color.f3258ld));
                textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                SnsMethodCalculate.markEndTimeMs("setMsgContent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                return;
            }
            textView2.setTag(C0966R.C0970id.lww, "");
            textView2.setTextColor(SnsMsgUI.this.getResources().getColor(C0966R.color.a7f));
            textView2.setBackgroundDrawable((Drawable) null);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setText("");
            textView2.setCompoundDrawablePadding(0);
            int i3 = m642.f298777h;
            if (i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    str5 = "setMsgContent";
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
                    String nullAsNil = Util.nullAsNil(m642.f298780n);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    AdSnsInfo jo4 = C94866e1.zx0().mo139864jo(wVar2.field_snsID);
                    ColorStateList e = C76577a.m92154e(this.f24696e, C0966R.color.ad8);
                    TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan((String) null, 1, (int) textView.getTextSize(), e, e);
                    if (C98242p.m126942d(m642.f298787u, 1)) {
                        if (jo4 != null) {
                            C86709a0.m107528h();
                            C72996z1 N2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(jo4.field_userName);
                            spannableStringBuilder.append(this.f24696e.getString(C0966R.string.jf8)).append(N2.mo62898f()).append(": ");
                            int length = this.f24696e.getString(C0966R.string.jf8).length();
                            iArr[0] = length;
                            iArr[1] = length + N2.mo62898f().length();
                        }
                    } else if (!Util.isNullOrNil(str)) {
                        spannableStringBuilder.append(this.f24696e.getString(C0966R.string.jf9)).append(str6).append(": ");
                        int length2 = this.f24696e.getString(C0966R.string.jf9).length();
                        iArr[0] = length2;
                        iArr[1] = length2 + str.length();
                    }
                    spannableStringBuilder.append(nullAsNil).append(" ");
                    SnsMsgUI.m122167N7(SnsMsgUI.this, emojiStatusView, m64, spannableStringBuilder, textView, nullAsNil);
                    SpannableString yp02 = ((C76979h) C86312j.m106911c(cls2)).yp0(SnsMsgUI.this, spannableStringBuilder, textView.getTextSize());
                    int i4 = iArr[0];
                    if (i4 >= 0 && (i = iArr[1]) > i4) {
                        yp02.setSpan(textAppearanceSpan, i4, i, 33);
                    }
                    textView2.setText(yp02);
                    str3 = str5;
                    str2 = str4;
                    SnsMethodCalculate.markEndTimeMs(str3, str2);
                }
                if (i3 == 4) {
                    str5 = "setMsgContent";
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
                    textView2.setText(SnsMsgUI.this.getString(C0966R.string.jj8));
                } else if (i3 != 5) {
                    if (i3 == 7) {
                        str5 = "setMsgContent";
                        str4 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
                        SnsMsgUI snsMsgUI = SnsMsgUI.this;
                        int i5 = SnsMsgUI.f278275Q;
                        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        snsMsgUI.getClass();
                        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        try {
                            SnsInfo SE = C94866e1.Yx0().mo139806SE(wVar2.field_snsID);
                            SnsInfo convertToSnsInfo = (SE != null || (jo = C94866e1.zx0().mo139864jo(wVar2.field_snsID)) == null) ? SE : jo.convertToSnsInfo();
                            SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                            snsInfo = convertToSnsInfo;
                        } catch (Throwable unused) {
                            SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                            snsInfo = null;
                        }
                        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        if (snsInfo == null || !snsInfo.isSocialAttitudeAd()) {
                            Context context = this.f24696e;
                            Drawable e2 = C74933u4.m89768e(context, C0966R.raw.friendactivity_likeicon, context.getResources().getColor(C0966R.color.f2958ae));
                            e2.setBounds(0, 0, e2.getIntrinsicWidth(), e2.getIntrinsicHeight());
                            SpannableString spannableString2 = new SpannableString(" ");
                            spannableString2.setSpan(new ImageSpan(e2), 0, 1, 18);
                            textView2.setText(spannableString2);
                            textView2.setContentDescription(SnsMsgUI.this.getContext().getString(C0966R.string.jck));
                        } else {
                            String str7 = snsInfo.getAdXml().adSocialInfo.f294141a;
                            textView2.setTag(C0966R.C0970id.lww, str7);
                            C63489a.m74831f(str7, new C43086p(textView2, str7));
                        }
                    } else if (i3 != 8) {
                        if (i3 == 13) {
                            C51101rf2 rf22 = new C51101rf2();
                            Log.m105924i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + m642.f298786t);
                            try {
                                rf22.parseFrom(C48374j0.m53715d(m642.f298786t));
                                Log.m105924i("MicroMsg.SnsMsgUI", "hbbuffer  " + rf22.f140881d);
                            } catch (Exception e3) {
                                Log.m105920e("MicroMsg.SnsMsgUI", "parser hbbuffer " + e3.getMessage());
                            }
                            SnsMsgUI.m122166M7(SnsMsgUI.this).get(m642.f298773d);
                            if (rf22.f140881d == 0) {
                                SnsMsgUI snsMsgUI2 = SnsMsgUI.this;
                                SnsMethodCalculate.markStartTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                                snsMsgUI2.getClass();
                                SnsMethodCalculate.markEndTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                                spannableString = new SpannableString(SnsMsgUI.this.getString(C0966R.string.gec));
                                drawable = null;
                            } else {
                                SnsMsgUI snsMsgUI3 = SnsMsgUI.this;
                                SnsMethodCalculate.markStartTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                                snsMsgUI3.getClass();
                                SnsMethodCalculate.markEndTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                                spannableString = new SpannableString(" " + SnsMsgUI.this.getString(C0966R.string.geb, new Object[]{Util.formatMoney2f(((double) rf22.f140881d) / 100.0d)}));
                                drawable = SnsMsgUI.this.getResources().getDrawable(C0966R.C0969drawable.f4417c0);
                            }
                            if (drawable != null) {
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                C76003c cVar = new C76003c(drawable, 1);
                                drawable.getIntrinsicHeight();
                                textView.getTextSize();
                                C76577a.m92151b(SnsMsgUI.this, 2);
                                spannableString.setSpan(cVar, 0, 1, 33);
                            }
                            textView2.setText(spannableString);
                        } else if (i3 == 14) {
                            C51101rf2 rf23 = new C51101rf2();
                            Log.m105924i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + m642.f298786t);
                            try {
                                rf23.parseFrom(C48374j0.m53715d(m642.f298786t));
                                Log.m105924i("MicroMsg.SnsMsgUI", "hbbuffer  " + rf23.f140881d);
                            } catch (Exception e4) {
                                Log.m105920e("MicroMsg.SnsMsgUI", "parser hbbuffer " + e4.getMessage());
                            }
                            textView2.setText(SnsMsgUI.this.getString(C0966R.string.ge_, new Object[]{SnsMsgUI.m122166M7(SnsMsgUI.this).get(m642.f298773d).mo62898f(), Util.formatMoney2f(((double) rf23.f140881d) / 100.0d)}));
                        } else if (i3 == 16) {
                            textView2.setText(((C76979h) C86312j.m106911c(cls2)).yp0(SnsMsgUI.this, ("" + "[" + SnsMsgUI.this.getString(C0966R.string.j9o) + "]") + " " + Util.nullAsNil(m642.f298780n), textView.getTextSize()));
                        } else if (i3 == 19) {
                            textView2.setText(SnsMsgUI.this.getString(C0966R.string.jj5));
                            SnsMethodCalculate.markStartTimeMs("isTogetherRedDotDefault", "com.tencent.mm.plugin.sns.model.SnsConfig");
                            boolean z2 = MultiProcessMMKV.getDefault().getInt("sns_with_together_red", 0) == 0;
                            SnsMethodCalculate.markEndTimeMs("isTogetherRedDotDefault", "com.tencent.mm.plugin.sns.model.SnsConfig");
                            if (z2) {
                                MultiProcessMMKV.getDefault().encode("sns_with_together_red", 1);
                            }
                        }
                        str3 = "setMsgContent";
                        str2 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
                        SnsMethodCalculate.markEndTimeMs(str3, str2);
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        String nullAsNil2 = Util.nullAsNil(m642.f298780n);
                        str5 = "setMsgContent";
                        str4 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
                        AdSnsInfo jo5 = C94866e1.zx0().mo139864jo(wVar2.field_snsID);
                        ColorStateList e5 = C76577a.m92154e(this.f24696e, C0966R.color.ad8);
                        TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan((String) null, 1, (int) textView.getTextSize(), e5, e5);
                        if (C98242p.m126942d(m642.f298787u, 1)) {
                            if (jo5 != null) {
                                C86709a0.m107528h();
                                C72996z1 N22 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(jo5.field_userName);
                                spannableStringBuilder2.append(this.f24696e.getString(C0966R.string.jf8)).append(N22.mo62898f()).append(": ");
                                int length3 = this.f24696e.getString(C0966R.string.jf8).length();
                                iArr[0] = length3;
                                iArr[1] = length3 + N22.mo62898f().length();
                            }
                        } else if (!Util.isNullOrNil(str)) {
                            spannableStringBuilder2.append(this.f24696e.getString(C0966R.string.jf9)).append(str6).append(": ");
                            int length4 = this.f24696e.getString(C0966R.string.jf9).length();
                            iArr[0] = length4;
                            iArr[1] = length4 + str.length();
                        }
                        spannableStringBuilder2.append(nullAsNil2).append(" ");
                        SnsMsgUI.m122167N7(SnsMsgUI.this, emojiStatusView, m64, spannableStringBuilder2, textView, nullAsNil2);
                        SpannableString yp03 = ((C76979h) C86312j.m106911c(cls2)).yp0(SnsMsgUI.this, spannableStringBuilder2, textView.getTextSize());
                        int i6 = iArr[0];
                        if (i6 >= 0 && (i2 = iArr[1]) > i6) {
                            yp03.setSpan(textAppearanceSpan2, i6, i2, 33);
                        }
                        textView2.setText(yp03);
                    }
                }
                str3 = str5;
                str2 = str4;
                SnsMethodCalculate.markEndTimeMs(str3, str2);
            }
            str5 = "setMsgContent";
            str4 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter";
            SnsInfo SE2 = C94866e1.Yx0().mo139806SE(wVar2.field_snsID);
            if (SE2 == null || SE2.field_type != 7) {
                Context context2 = this.f24696e;
                Drawable e6 = C74933u4.m89768e(context2, C0966R.raw.friendactivity_likeicon, context2.getResources().getColor(C0966R.color.f2958ae));
                if (SE2 == null || SE2.getTypeFlag() != 21) {
                    e6.clearColorFilter();
                } else {
                    e6.setColorFilter(SnsMsgUI.this.getResources().getColor(C0966R.color.adj), PorterDuff.Mode.SRC_ATOP);
                }
                e6.setBounds(0, 0, e6.getIntrinsicWidth(), e6.getIntrinsicHeight());
                SpannableString spannableString3 = new SpannableString(" ");
                spannableString3.setSpan(new ImageSpan(e6), 0, 1, 18);
                textView2.setText(spannableString3);
                textView2.setContentDescription(SnsMsgUI.this.getContext().getString(C0966R.string.jck));
                str3 = str5;
                str2 = str4;
                SnsMethodCalculate.markEndTimeMs(str3, str2);
            }
            textView2.setText(SnsMsgUI.this.getString(C0966R.string.je8));
            str3 = str5;
            str2 = str4;
            SnsMethodCalculate.markEndTimeMs(str3, str2);
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ View m122161H7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        View view = snsMsgUI.f278293f;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return view;
    }

    /* renamed from: I7 */
    public static /* synthetic */ View m122162I7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        View view = snsMsgUI.f278294g;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return view;
    }

    /* renamed from: J7 */
    public static /* synthetic */ int[] m122163J7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        int[] iArr = snsMsgUI.f278308x;
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return iArr;
    }

    /* renamed from: K7 */
    public static void m122164K7(SnsMsgUI snsMsgUI, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        SnsMethodCalculate.markStartTimeMs("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        n74 n74 = new n74();
        n74.f138460d = z ? 1 : 0;
        C94877g0 g0Var = new C94877g0(snsMsgUI.f278280E, 12, (Object) n74);
        C86709a0.m107528h();
        if (!C86709a0.m107529k().f251779b.mo123461g(g0Var, 0)) {
            SnsMethodCalculate.markEndTimeMs("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } else {
            C89779i0 i0Var = snsMsgUI.f278306v;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C89779i0 Q = C76879j.m92723Q(snsMsgUI, snsMsgUI.getString(C0966R.string.a3h), snsMsgUI.getString(C0966R.string.hc6), true, true, new C96322y4(snsMsgUI, g0Var));
            snsMsgUI.f278306v = Q;
            Q.show();
            SnsMethodCalculate.markEndTimeMs("remindImp", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        }
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* renamed from: L7 */
    public static /* synthetic */ View.OnClickListener m122165L7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        View.OnClickListener onClickListener = snsMsgUI.f278276A;
        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return onClickListener;
    }

    /* renamed from: M7 */
    public static /* synthetic */ C44668u3 m122166M7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        C44668u3 u3Var = snsMsgUI.f278303s;
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return u3Var;
    }

    /* renamed from: N7 */
    public static void m122167N7(SnsMsgUI snsMsgUI, EmojiStatusView emojiStatusView, m64 m64, SpannableStringBuilder spannableStringBuilder, TextView textView, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        SnsMethodCalculate.markStartTimeMs("checkCommentEmoji", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (!Util.isNullOrNil((List) m64.f298789w) && m64.f298789w.get(0) != null) {
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(m64.f298789w.get(0).f131560d);
            if (TO != null) {
                emojiStatusView.setVisibility(0);
                emojiStatusView.setEmojiInfo(TO);
            }
            if (Util.isNullOrNil(spannableStringBuilder.toString().trim())) {
                textView.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkCommentEmoji", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* renamed from: O7 */
    public static /* synthetic */ C95588q m122168O7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        C95588q qVar = snsMsgUI.f278292e;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return qVar;
    }

    /* renamed from: P7 */
    public static void m122169P7(SnsMsgUI snsMsgUI, C100420w wVar) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        SnsMethodCalculate.markStartTimeMs("goToCommentDetailWithCheck", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (snsMsgUI.mo132839S7(wVar).booleanValue()) {
            Log.m105924i("MicroMsg.SnsMsgUI", "goToCommentDetailWithCheck: can check later");
            snsMsgUI.mo132841U7(wVar);
        } else {
            snsMsgUI.mo132842V7(wVar, true, false);
            Log.m105924i("MicroMsg.SnsMsgUI", "goToCommentDetailWithCheck: try doScene NetSceneSnsObjectDetial");
        }
        SnsMethodCalculate.markEndTimeMs("goToCommentDetailWithCheck", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* renamed from: Q7 */
    public static /* synthetic */ ListView m122170Q7(SnsMsgUI snsMsgUI) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        ListView listView = snsMsgUI.f278291d;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return listView;
    }

    /* renamed from: R7 */
    public static void m122171R7(SnsMsgUI snsMsgUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.getClass();
        SnsMethodCalculate.markStartTimeMs("delMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        C94866e1.Tx0().delete((long) i);
        snsMsgUI.f278292e.onNotifyChange((String) null, (MStorageEventData) null);
        SnsMethodCalculate.markEndTimeMs("delMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* renamed from: S7 */
    public final Boolean mo132839S7(C100420w wVar) {
        SnsMethodCalculate.markStartTimeMs("enableCheckVisibilityOnLaterPage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        boolean z = C31543z5.m39455e() - wVar.field_createTime < this.f278309y;
        boolean z2 = z || C94866e1.Yx0().mo139806SE(wVar.field_snsID) != null;
        Log.m105925i("MicroMsg.SnsMsgUI", "enableCheckVisibilityOnLaterPage: [%b], timeInLimit=[%b]", Boolean.valueOf(z2), Boolean.valueOf(z));
        Boolean valueOf = Boolean.valueOf(z2);
        SnsMethodCalculate.markEndTimeMs("enableCheckVisibilityOnLaterPage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return valueOf;
    }

    /* renamed from: T7 */
    public final String mo132840T7(C100420w wVar) {
        SnsMethodCalculate.markStartTimeMs("genFeedId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j = wVar.field_parentID;
        String q0 = j == 0 ? C102236a0.m134765q0(wVar.field_snsID) : C102236a0.m134765q0(j);
        SnsMethodCalculate.markEndTimeMs("genFeedId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return q0;
    }

    /* renamed from: U7 */
    public final void mo132841U7(C100420w wVar) {
        boolean z;
        C100420w wVar2 = wVar;
        SnsMethodCalculate.markStartTimeMs("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j = wVar2.field_snsID;
        Log.m105925i("MicroMsg.SnsMsgUI", "goToCommentDetail: comment field_type:%d", Integer.valueOf(wVar2.field_type));
        int i = wVar2.field_type;
        if (i == 1) {
            this.f278287L++;
        } else if (i == 2) {
            this.f278288M++;
        }
        if (this.f278290P.containsKey(Integer.valueOf(wVar2.f294189L))) {
            this.f278290P.put(Integer.valueOf(wVar2.f294189L), Integer.valueOf(this.f278290P.get(Integer.valueOf(wVar2.f294189L)).intValue() + 1));
        } else {
            this.f278290P.put(Integer.valueOf(wVar2.f294189L), 1);
        }
        SnsMethodCalculate.markStartTimeMs("isSnsDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        boolean z2 = (wVar2.field_commentflag & 2) > 0;
        SnsMethodCalculate.markEndTimeMs("isSnsDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        if (z2) {
            Log.m105924i("MicroMsg.SnsMsgUI", "skip goToCommentDetail, comment.isSnsDelFlag");
            this.f278292e.mo132861w(String.valueOf(j));
        }
        Intent intent = new Intent();
        intent.putExtra("INTENT_COMMENT_TYPE", wVar2.field_type);
        int i2 = wVar2.field_type;
        if (i2 == 3 || i2 == 5) {
            intent.setClass(this, SnsStrangerCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", wVar2.field_talker);
            try {
                intent.putExtra("INTENT_SOURCE", ((m64) new m64().parseFrom(wVar2.field_curActionBuf)).f298778i);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SnsMsgUI", e, "", new Object[0]);
            }
        } else {
            intent.setClass(this, SnsCommentDetailUI.class);
        }
        int i3 = wVar2.field_type;
        if (i3 != 7 && i3 != 8 && i3 != 16) {
            intent.putExtra("INTENT_SNSID", C100417r0.m131421j("sns_table_", j));
        } else if (!WeChatBrands.Business.Entries.MomentAds.checkAvailable(getContext())) {
            SnsMethodCalculate.markEndTimeMs("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        } else {
            intent.putExtra("INTENT_SNSID", C100417r0.m131421j("ad_table_", j));
            SnsInfo TE = C94866e1.Yx0().mo139807TE(C100417r0.m131421j("ad_table_", j));
            if (TE == null) {
                Log.m105924i("MicroMsg.SnsMsgUI", "sns id " + j + "was not exist!");
                if (wVar2.field_type == 16) {
                    C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 2);
                }
                SnsMethodCalculate.markEndTimeMs("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
            int i4 = C86709a0.m107535s().mo121142i().mo119688i(14, 0);
            Log.m105925i("MicroMsg.SnsMsgUI", "current client version %s, [%s, %s]", Integer.valueOf(i4), Integer.valueOf(TE.getAdXml().clientMinVersion), Integer.valueOf(TE.getAdXml().clientMaxVersion));
            if (i4 < TE.getAdXml().clientMinVersion || (TE.getAdXml().clientMaxVersion > 0 && i4 > TE.getAdXml().clientMaxVersion)) {
                if (!Util.isNullOrNil(TE.getAdXml().compatibleUrl)) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("rawUrl", TE.getAdXml().compatibleUrl);
                    intent2.putExtra("showShare", false);
                    intent2.putExtra("show_bottom", false);
                    intent2.putExtra("needRedirect", false);
                    intent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent2, this);
                } else {
                    Log.m105928w("MicroMsg.SnsMsgUI", "compatible jump url is null!");
                }
                SnsMethodCalculate.markEndTimeMs("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
        }
        int i5 = wVar2.field_type;
        if (i5 == 2) {
            z = true;
            intent.putExtra("INTENT_FROMSUI", true);
            intent.putExtra("INTENT_FROMSUI_COMMENTID", wVar2.field_commentSvrID);
        } else {
            z = true;
            if (i5 == 8 || i5 == 16) {
                intent.putExtra("INTENT_FROMSUI", true);
                intent.putExtra("INTENT_FROMSUI_COMMENTID", wVar2.field_commentSvrID);
            }
        }
        if (this.f278292e.mo132860u(String.valueOf(wVar2.field_snsID))) {
            intent.putExtra("INTENT_COMMENT_forbid_access", z);
        }
        intent.putExtra("intent_content_enable_show_access_view", z);
        startActivityForResult(intent, z ? 1 : 0);
        SnsMethodCalculate.markEndTimeMs("goToCommentDetail", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    /* renamed from: V7 */
    public final void mo132842V7(C100420w wVar, boolean z, boolean z2) {
        C100420w wVar2 = wVar;
        SnsMethodCalculate.markStartTimeMs("requestCheckVisibility", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long j = wVar2.field_snsID;
        C43036f0 f0Var = new C43036f0(j);
        f0Var.f116496g = true;
        f0Var.f116497h = wVar2;
        f0Var.f116498i = z2;
        if (z) {
            this.f278307w = C76879j.m92723Q(this, "", getContext().getResources().getString(C0966R.string.gas), true, true, new C95575d(this, f0Var));
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(f0Var);
        Log.m105925i("MicroMsg.SnsMsgUI", "requestCheckVisibility: feedId=%s, showLoading=%b, fromPhotoClick:%b", Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2));
        SnsMethodCalculate.markEndTimeMs("requestCheckVisibility", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.SnsMsgUI", "dispatchKeyEvent");
            Intent intent = new Intent();
            intent.putExtra("sns_cmd_list", this.f278304t);
            setResult(-1, intent);
            finish();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return dispatchKeyEvent;
    }

    public int getCustomBounceId() {
        SnsMethodCalculate.markStartTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return C0966R.C0970id.jui;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        return C0966R.C0971layout.c3q;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        setMMTitle((int) C0966R.string.jf_);
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C95580h());
        this.f278295h = new C96227t4(this);
        this.f278298n = findViewById(C0966R.C0970id.jug);
        this.f278291d = (ListView) findViewById(C0966R.C0970id.jui);
        this.f278293f = C85868k2.m106137b(this).inflate(C0966R.C0971layout.c3o, (ViewGroup) null);
        this.f278294g = C85868k2.m106137b(this).inflate(C0966R.C0971layout.bcf, (ViewGroup) null);
        Log.m105924i("MicroMsg.SnsMsgUI", "autoLoad " + this.f278305u);
        if (this.f278305u) {
            this.f278291d.addFooterView(this.f278294g);
        } else {
            this.f278291d.addFooterView(this.f278293f);
        }
        C95588q qVar = new C95588q(this, new C100420w());
        this.f278292e = qVar;
        C100909g gVar = new C100909g(this);
        SnsMethodCalculate.markStartTimeMs("setUnreadCommentFetchCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        qVar.f278333u = gVar;
        Log.m105925i("MicroMsg.SnsMsgUI", "setUnreadCommentFetchCallback null:%b", false);
        SnsMethodCalculate.markEndTimeMs("setUnreadCommentFetchCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        C95588q qVar2 = this.f278292e;
        C95582i iVar = new C95582i();
        qVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("setGetViewPositionCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        qVar2.f278331s = iVar;
        SnsMethodCalculate.markEndTimeMs("setGetViewPositionCallback", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        C95588q qVar3 = this.f278292e;
        C95583j jVar = new C95583j();
        qVar3.getClass();
        SnsMethodCalculate.markStartTimeMs("setPerformItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        qVar3.f278330r = jVar;
        SnsMethodCalculate.markEndTimeMs("setPerformItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        C95588q qVar4 = this.f278292e;
        C95584k kVar = new C95584k();
        qVar4.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnItemDelListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        qVar4.f278332t = kVar;
        SnsMethodCalculate.markEndTimeMs("setOnItemDelListener", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        C95588q qVar5 = this.f278292e;
        qVar5.f24699h = new C95585l();
        this.f278291d.setAdapter(qVar5);
        this.f278291d.setOnItemClickListener(new C95586m());
        LayoutInflater.from(this);
        new C77407n((Context) this, 1, false);
        new C76874e0(this);
        new C76874e0(this);
        this.f278291d.setOnTouchListener(new C43085n());
        this.f278291d.setOnItemLongClickListener(new C95587o());
        this.f278291d.setOnScrollListener(new C95572a());
        if (this.f278292e.getCount() == 0) {
            this.f278291d.setVisibility(8);
            View view = this.f278298n;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        } else {
            this.f278291d.setVisibility(0);
            View view3 = this.f278298n;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        }
        if ((this.f278292e.mo132856B() && C94866e1.Tx0().mo139896kD() == 0) || C94866e1.Tx0().mo139896kD() == C94866e1.Tx0().mo139892Yt(false)) {
            View view4 = this.f278293f;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f278292e.mo132856B() && this.f278305u) {
            this.f278291d.removeFooterView(this.f278294g);
        }
        setBackBtn(new C95573b());
        if (this.f278292e.mo132856B() && this.f278305u) {
            this.f278291d.removeFooterView(this.f278294g);
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        Log.m105924i("MicroMsg.SnsMsgUI", "onAcvityResult requestCode:" + i);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        }
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("result_forbid_access", false);
            long longExtra = intent.getLongExtra("result_access_sns_id", 0);
            String valueOf = String.valueOf(longExtra);
            if (!Util.isNullOrNil(valueOf) && longExtra != 0) {
                Log.m105925i("MicroMsg.SnsMsgUI", "onActivityResult: need forbid:%b, snsId:%s", Boolean.valueOf(booleanExtra), valueOf);
                if (booleanExtra) {
                    this.f278292e.mo132861w(valueOf);
                } else {
                    C95588q qVar = this.f278292e;
                    qVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    ((HashMap) qVar.f278334v).put(valueOf, 1);
                    SnsMethodCalculate.markEndTimeMs("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                }
            }
            boolean booleanExtra2 = intent.getBooleanExtra("result_finish", false);
            Log.m105925i("MicroMsg.SnsMsgUI", "onActivityResult: isFinish=[%b]", Boolean.valueOf(booleanExtra2));
            if (booleanExtra2) {
                finish();
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
        }
        if (intent != null) {
            this.f278304t.mo130689a(intent.getIntExtra("sns_gallery_op_id", 0));
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SnsMsgUI", "onCreate");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(210, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(683, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        this.f278299o = C75592q0.m90789s();
        this.f278303s = C94866e1.Jx0();
        boolean booleanExtra = getIntent().getBooleanExtra("sns_msg_force_show_all", false);
        this.f278300p = booleanExtra;
        if (booleanExtra) {
            this.f278305u = true;
        }
        C94866e1.Tx0().add(this.f278282G);
        setActionbarColor(getActionbarColor());
        initView();
        this.f278285J = Util.nowMilliSecond();
        this.f278284I = getIntent().getIntExtra("sns_msg_comment_list_scene", 0);
        if (C85875k4.m106208w()) {
            C100421x Tx0 = C94866e1.Tx0();
            Tx0.getClass();
            SnsMethodCalculate.markStartTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            Tx0.f294192e = true;
            SnsMethodCalculate.markEndTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            C94886k0.m120341j1();
        }
        ((C87121j) C86312j.m106911c(C87121j.class)).oc0(C75592q0.m90789s(), 7, "MomentsUnreadMsgStatus", String.format("%s", new Object[]{Long.valueOf(C31543z5.m39451a() / 1000)}));
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        C100420w wVar = (C100420w) this.f278292e.getItem(adapterContextMenuInfo.position);
        if (wVar == null) {
            SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            return;
        }
        this.f278279D = wVar.f294189L;
        this.f278280E = wVar.field_snsID;
        try {
            m64 m64 = (m64) new m64().parseFrom(wVar.field_curActionBuf);
            if (m64 != null) {
                C72996z1 z1Var = this.f278303s.get(m64.f298773d);
                contextMenu.setHeaderTitle(Util.nullAsNil(z1Var != null ? z1Var.mo62898f() : !Util.isNullOrNil(m64.f298775f) ? m64.f298775f : m64.f298773d));
                if (wVar.field_isSilence == 0) {
                    contextMenu.add(adapterContextMenuInfo.position, 1, 1, getString(C0966R.string.f361103hc2));
                } else {
                    contextMenu.add(adapterContextMenuInfo.position, 2, 1, getString(C0966R.string.f361102hc1));
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsMsgUI", e, "", new Object[0]);
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, getString(C0966R.string.f7944x1));
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onDestroy() {
        Iterator<C100420w> it;
        boolean z;
        int i;
        String str;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        Log.m105918d("MicroMsg.SnsMsgUI", "msgui onDestroy");
        this.f278286K = super.getActivityBrowseTimeMs();
        if (C94866e1.Tx0().mo139896kD() > 0) {
            C94866e1.Tx0().mo139894bF();
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(210, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(683, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        C94866e1.Tx0().remove(this.f278282G);
        this.f278292e.mo5580b();
        C94866e1.Fx0().mo131089I(this);
        C89779i0 i0Var = this.f278306v;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f278306v = null;
        }
        SnsMethodCalculate.markStartTimeMs("reportBrowseMsgListInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        long currentTicks = Util.currentTicks();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<C100420w> it4 = this.f278289N.values().iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it4.hasNext()) {
            C100420w next = it4.next();
            if (next != null) {
                SnsMethodCalculate.markStartTimeMs("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                it = it4;
                if (next.field_isRead == 1) {
                    SnsMethodCalculate.markEndTimeMs("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                    z = true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("hadRead", "com.tencent.mm.plugin.sns.storage.SnsComment");
                    z = false;
                }
                if (!z) {
                    int i5 = next.field_type;
                    if (i5 == 1) {
                        i3++;
                    } else if (i5 == 2) {
                        i2++;
                    }
                }
                int intValue = this.f278290P.containsKey(Integer.valueOf(next.f294189L)) ? this.f278290P.get(Integer.valueOf(next.f294189L)).intValue() : 0;
                SnsMethodCalculate.markStartTimeMs("createCommentJson", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (intValue == 0) {
                    str = String.format("{\"fid\":%s;\"cid\":%d;\"usr\":\"%s\";\"type\":%d;\"ig\":%d}", new Object[]{mo132840T7(next), Integer.valueOf(next.f294189L), next.field_talker, Integer.valueOf(next.field_type), Integer.valueOf(next.field_isSilence)});
                    i = i2;
                } else {
                    i = i2;
                    str = String.format("{\"fid\":%s;\"cid\":%d;\"usr\":\"%s\";\"type\":%d;\"ig\":%d;\"click\":%d}", new Object[]{mo132840T7(next), Integer.valueOf(next.f294189L), next.field_talker, Integer.valueOf(next.field_type), Integer.valueOf(next.field_isSilence), Integer.valueOf(intValue)});
                }
                SnsMethodCalculate.markEndTimeMs("createCommentJson", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(";");
                    stringBuffer.append(str);
                } else {
                    stringBuffer.append(str);
                }
                i2 = i;
            } else {
                it = it4;
            }
            i4++;
            it4 = it;
        }
        if (this.f278301q == null) {
            Log.m105924i("MicroMsg.SnsMsgUI", "create empty stopRemindReportInfo");
            this.f278301q = new C35681h();
        }
        SnsMsgListActionStruct snsMsgListActionStruct = new SnsMsgListActionStruct();
        long j = this.f278285J;
        snsMsgListActionStruct.f266087j = j;
        snsMsgListActionStruct.mo86046c("EnterStartTimeMs", j);
        snsMsgListActionStruct.f266081d = (long) this.f278284I;
        snsMsgListActionStruct.f266084g = this.f278286K;
        snsMsgListActionStruct.f266085h = (long) this.f278287L;
        snsMsgListActionStruct.f266086i = (long) this.f278288M;
        snsMsgListActionStruct.f266083f = (long) i2;
        snsMsgListActionStruct.f266082e = (long) i3;
        C35681h hVar = this.f278301q;
        hVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getBlockNotifyEduFlag", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        boolean z2 = hVar.f95350a;
        SnsMethodCalculate.markEndTimeMs("getBlockNotifyEduFlag", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        snsMsgListActionStruct.f266089l = z2 ? 1 : 0;
        C35681h hVar2 = this.f278301q;
        hVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getEduTriggerFeedid", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        String str2 = hVar2.f95351b;
        SnsMethodCalculate.markEndTimeMs("getEduTriggerFeedid", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindReportInfo");
        snsMsgListActionStruct.f266090m = snsMsgListActionStruct.mo86045b("EduTriggerFeedid", str2, true);
        snsMsgListActionStruct.f266088k = snsMsgListActionStruct.mo86045b("BrowseJson", "[" + stringBuffer.toString() + "]", true);
        snsMsgListActionStruct.mo86054n();
        this.f278289N.clear();
        this.f278290P.clear();
        Log.m105925i("MicroMsg.SnsMsgUI", "reportBrowseMsgListInfo debugLog [%d] cost[%d]", Integer.valueOf(i4), Long.valueOf(Util.ticksToNow(currentTicks)));
        Log.m105919d("MicroMsg.SnsMsgUI", "rpt %s", snsMsgListActionStruct.mo1006q());
        SnsMethodCalculate.markEndTimeMs("reportBrowseMsgListInfo", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        C100421x Tx0 = C94866e1.Tx0();
        Tx0.getClass();
        SnsMethodCalculate.markStartTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Tx0.f294192e = false;
        SnsMethodCalculate.markEndTimeMs("setHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        this.f278310z = null;
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onPause() {
        C89940c cVar;
        Class cls = C88146a.class;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSNSMsgScrollEnable(), this.f278302r);
        this.f278302r = 0;
        C94866e1.Vx0().mo130997v(this);
        super.onPause();
        Log.m105924i("MicroMsg.SnsMsgUI", "onPause");
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f278277B = Math.max(0, ((long) ((int) cVar.f258449e)) - this.f278277B);
        }
        this.f278278C = Util.nowSecond() > this.f278278C ? Util.nowSecond() - this.f278278C : 1;
        C40318k.m43492a().reportFPS(705, C40318k.m43492a().getHcSNSMsgScrollAction(), 1, this.f278277B, this.f278278C);
        this.f278277B = 0;
        this.f278278C = 0;
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onResume() {
        C89940c cVar;
        Class cls = C88146a.class;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f278278C = Util.nowSecond();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f278277B = (long) ((int) cVar.f258449e);
        }
        C94866e1.Vx0().mo130978c(this);
        super.onResume();
        Log.m105924i("MicroMsg.SnsMsgUI", "onResume");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C117747y yVar2 = yVar;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        Log.m105925i("MicroMsg.SnsMsgUI", "onSceneEnd:%s errtype:%s errcode:%s", yVar2, Integer.valueOf(i), Integer.valueOf(i2));
        if (yVar2 instanceof C43036f0) {
            C89779i0 i0Var = this.f278307w;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f278307w = null;
            }
            if (yVar2 != null) {
                Log.m105924i("MicroMsg.SnsMsgUI", "onSceneEnd from NetSceneSnsObjectDetial");
                C43036f0 f0Var = (C43036f0) yVar2;
                if (f0Var.f116496g) {
                    SnsObject k1 = f0Var.mo67229k1();
                    if (k1 == null || k1.f283891Id == 0) {
                        Log.m105924i("MicroMsg.SnsMsgUI", "onSceneEnd: respObject nil, forbidAccess = true");
                        z = true;
                    } else {
                        z = false;
                    }
                    C100420w wVar = f0Var.f116497h;
                    if (wVar != null) {
                        String valueOf = String.valueOf(wVar.field_snsID);
                        if (z) {
                            this.f278292e.mo132861w(valueOf);
                        } else {
                            C95588q qVar = this.f278292e;
                            qVar.getClass();
                            SnsMethodCalculate.markStartTimeMs("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                            ((HashMap) qVar.f278334v).put(valueOf, 1);
                            SnsMethodCalculate.markEndTimeMs("markSnsIdEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                        }
                        if (f0Var.f116498i) {
                            View view = this.f278310z;
                            if (view != null) {
                                Object tag = view.getTag();
                                if (tag instanceof C96235u4) {
                                    if (z) {
                                        ((C96235u4) tag).mo133900a();
                                        Log.m105924i("MicroMsg.SnsMsgUI", "onSceneEnd: SnsImageViewTag InValid");
                                    } else {
                                        C96235u4 u4Var = (C96235u4) tag;
                                        u4Var.getClass();
                                        SnsMethodCalculate.markStartTimeMs("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                                        u4Var.f281211f = 1;
                                        SnsMethodCalculate.markEndTimeMs("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                                        Log.m105924i("MicroMsg.SnsMsgUI", "onSceneEnd: SnsImageViewTag enable access");
                                    }
                                }
                                this.f278295h.mo133892c(this.f278310z, -1, 1);
                                this.f278310z = null;
                            }
                        } else {
                            mo132841U7(wVar);
                        }
                    } else {
                        Log.m105924i("MicroMsg.SnsMsgUI", "onSceneEnd: SnsComment null!!");
                    }
                } else {
                    SnsMethodCalculate.markStartTimeMs("tryToNotify", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    if (this.f278297j) {
                        Log.m105924i("MicroMsg.SnsMsgUI", "notifyUI failed, because notifying = true");
                        SnsMethodCalculate.markEndTimeMs("tryToNotify", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    } else {
                        this.f278297j = true;
                        this.f278296i.postDelayed(this.f278283H, 500);
                        SnsMethodCalculate.markEndTimeMs("tryToNotify", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    }
                }
            }
        }
        if (yVar.getType() == 218) {
            C94877g0 g0Var = (C94877g0) yVar2;
            Log.m105925i("MicroMsg.SnsMsgUI", "onSceneEnd opScene opType:%d", Integer.valueOf(g0Var.mo131050m1()));
            if (g0Var.mo131050m1() != 12) {
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                return;
            }
            if (i == 0 && i2 == 0) {
                this.f278292e.onNotifyChange((String) null, (MStorageEventData) null);
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.hc5), 0).show();
            } else {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.hc4), 0).show();
            }
            C89779i0 i0Var2 = this.f278306v;
            if (i0Var2 != null) {
                i0Var2.dismiss();
                this.f278306v = null;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        this.f278292e.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
    }
}
