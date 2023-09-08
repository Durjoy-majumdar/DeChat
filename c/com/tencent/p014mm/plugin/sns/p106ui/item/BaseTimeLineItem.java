package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.abtest.SellerABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncNormalTextView;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C43151t;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.C96071m8;
import com.tencent.p014mm.plugin.sns.p106ui.C96174r;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.MaskTextView;
import com.tencent.p014mm.plugin.sns.p106ui.PhotosContent;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTranslateResultView;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95911b;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75354a;
import de3.C75360c0;
import de3.C75375u;
import di3.C86312j;
import go3.C76003c;
import ip3.C98780b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jp2.C98974v;
import jq2.C98994k;
import kg3.C76577a;
import ls2.C99591a;
import lu2.C61409g;
import lu2.a$$a;
import op3.C117882j;
import os2.C100400e0;
import os2.C35296p0;
import os2.C35297q0;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import p773yy.C79168k;
import ps2.C100880k;
import ps2.C100891r;
import te3.C101808lv2;
import te3.C101833r5;
import te3.w64;
import uo3.C78253a;
import up2.C102064e;
import ut2.C102087b;
import vr2.C102236a0;
import vr2.C102243e;
import xt2.C102723a;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem */
public abstract class BaseTimeLineItem {

    /* renamed from: d */
    public boolean f279903d;

    /* renamed from: e */
    public Activity f279904e;

    /* renamed from: f */
    public int f279905f;

    /* renamed from: g */
    public SnsTimeLineBaseAdapter f279906g;

    /* renamed from: h */
    public boolean f279907h = false;

    /* renamed from: i */
    public ViewGroup f279908i;

    /* renamed from: j */
    public StoryAvatarDotsView f279909j;

    /* renamed from: n */
    public C95909n f279910n;

    /* renamed from: o */
    public ArrayList<C94965w1.C94967b> f279911o = new ArrayList<>();

    /* renamed from: p */
    public final C75354a f279912p = new C95899d();

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$a */
    public class C57410a implements View.OnTouchListener {
        public C57410a(BaseTimeLineItem baseTimeLineItem) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$1");
            if (motionEvent.getAction() == 0) {
                view.setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
            }
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$1");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder */
    public static abstract class BaseViewHolder implements C61409g {

        /* renamed from: A */
        public TextView f279913A;

        /* renamed from: A0 */
        public boolean f279914A0 = false;

        /* renamed from: B */
        public TextView f279915B;

        /* renamed from: B0 */
        public ViewStub f279916B0;

        /* renamed from: C */
        public WeImageView f279917C;

        /* renamed from: C0 */
        public TextView f279918C0;

        /* renamed from: D */
        public TextView f279919D;

        /* renamed from: D0 */
        public TextView f279920D0;

        /* renamed from: E */
        public TextView f279921E;

        /* renamed from: E0 */
        public View f279922E0;

        /* renamed from: F */
        public TextView f279923F;

        /* renamed from: G */
        public TextView f279924G;

        /* renamed from: H */
        public TextView f279925H;

        /* renamed from: I */
        public View f279926I;

        /* renamed from: J */
        public ImageView f279927J;

        /* renamed from: K */
        public View f279928K;

        /* renamed from: L */
        public int f279929L = 210;

        /* renamed from: M */
        public LinearLayout f279930M;

        /* renamed from: N */
        public SnsLikesTextView f279931N;

        /* renamed from: O */
        public boolean f279932O = false;

        /* renamed from: P */
        public LinearLayout f279933P;

        /* renamed from: Q */
        public LinearLayout f279934Q;

        /* renamed from: R */
        public View f279935R;

        /* renamed from: S */
        public PhotosContent f279936S;

        /* renamed from: T */
        public View f279937T;

        /* renamed from: U */
        public ViewStub f279938U;

        /* renamed from: V */
        public boolean f279939V = false;

        /* renamed from: W */
        public ViewStub f279940W;

        /* renamed from: X */
        public TextView f279941X;

        /* renamed from: Y */
        public boolean f279942Y = false;

        /* renamed from: Z */
        public ViewStub f279943Z;

        /* renamed from: a */
        public String f279944a = "";

        /* renamed from: a0 */
        public ViewStub f279945a0;

        /* renamed from: b */
        public int f279946b;

        /* renamed from: b0 */
        public boolean f279947b0 = false;

        /* renamed from: c */
        public int f279948c;

        /* renamed from: c0 */
        public View f279949c0;

        /* renamed from: d */
        public String f279950d;

        /* renamed from: d0 */
        public boolean f279951d0 = false;

        /* renamed from: e */
        public long f279952e;

        /* renamed from: e0 */
        public C96066m2 f279953e0 = new C96066m2();

        /* renamed from: f */
        public boolean f279954f;

        /* renamed from: f0 */
        public C40294d f279955f0;

        /* renamed from: g */
        public String f279956g;

        /* renamed from: g0 */
        public C101808lv2 f279957g0;

        /* renamed from: h */
        public int f279958h;

        /* renamed from: h0 */
        public View f279959h0;

        /* renamed from: i */
        public View f279960i;

        /* renamed from: i0 */
        public ViewGroup f279961i0;
        public boolean isAd;

        /* renamed from: j */
        public SnsAvatarImageView f279962j;

        /* renamed from: j0 */
        public ViewGroup f279963j0;

        /* renamed from: k */
        public AsyncTextView f279964k;

        /* renamed from: k0 */
        public BaseTimeLineItem f279965k0;

        /* renamed from: l */
        public ImageView f279966l;

        /* renamed from: l0 */
        public ViewStub f279967l0;

        /* renamed from: m */
        public AsyncNormalTextView f279968m;

        /* renamed from: m0 */
        public View f279969m0;

        /* renamed from: n */
        public SnsTranslateResultView f279970n;

        /* renamed from: n0 */
        public TextView f279971n0;

        /* renamed from: o */
        public LinearLayout f279972o;

        /* renamed from: o0 */
        public MaskTextView f279973o0;

        /* renamed from: p */
        public ViewStub f279974p;

        /* renamed from: p0 */
        public View f279975p0;

        /* renamed from: q */
        public boolean f279976q = false;

        /* renamed from: q0 */
        public TextView f279977q0;

        /* renamed from: r */
        public TextView f279978r;

        /* renamed from: r0 */
        public ViewStub f279979r0;

        /* renamed from: s */
        public View f279980s;

        /* renamed from: s0 */
        public View f279981s0;
        public SnsObject snsobj;

        /* renamed from: t */
        public TagImageView f279982t;

        /* renamed from: t0 */
        public View f279983t0;
        public TimeLineObject timeLineObject;

        /* renamed from: u */
        public ImageView f279984u;

        /* renamed from: u0 */
        public volatile boolean f279985u0;

        /* renamed from: v */
        public TextView f279986v;

        /* renamed from: v0 */
        public ViewGroup f279987v0;

        /* renamed from: w */
        public TextView f279988w;

        /* renamed from: w0 */
        public boolean f279989w0 = false;

        /* renamed from: x */
        public int f279990x = 0;

        /* renamed from: x0 */
        public ViewStub f279991x0;

        /* renamed from: y */
        public C96071m8 f279992y;

        /* renamed from: y0 */
        public StoryAvatarDotsView f279993y0;

        /* renamed from: z */
        public RelativeLayout f279994z;

        /* renamed from: z0 */
        public ViewGroup f279995z0;

        /* renamed from: a */
        public static /* synthetic */ StoryAvatarDotsView m122794a(BaseViewHolder baseViewHolder) {
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
            StoryAvatarDotsView storyAvatarDotsView = baseViewHolder.f279993y0;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
            return storyAvatarDotsView;
        }

        /* renamed from: b */
        public String mo81017b() {
            SnsMethodCalculate.markStartTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
            String str = this.f279944a;
            SnsMethodCalculate.markEndTimeMs("getAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$b */
    public class C95897b implements SnsPostDescPreloadTextView.C96303b {

        /* renamed from: a */
        public final /* synthetic */ SnsTimeLineBaseAdapter f279996a;

        public C95897b(BaseTimeLineItem baseTimeLineItem, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
            this.f279996a = snsTimeLineBaseAdapter;
        }

        /* renamed from: a */
        public void mo132940a() {
            SnsMethodCalculate.markStartTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
            ((SnsTimeLineBaseAdapter.C95628e) this.f279996a.f278559K).mo132940a();
            SnsMethodCalculate.markEndTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
        }

        /* renamed from: b */
        public void mo132941b() {
            SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
            ((SnsTimeLineBaseAdapter.C95628e) this.f279996a.f278559K).mo132941b();
            SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$c */
    public class C95898c implements C102064e.C102069c {

        /* renamed from: a */
        public final /* synthetic */ SnsTimeLineBaseAdapter f279997a;

        /* renamed from: b */
        public final /* synthetic */ BaseViewHolder f279998b;

        public C95898c(BaseTimeLineItem baseTimeLineItem, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, BaseViewHolder baseViewHolder) {
            this.f279997a = snsTimeLineBaseAdapter;
            this.f279998b = baseViewHolder;
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
            BaseViewHolder baseViewHolder = this.f279998b;
            if (baseViewHolder instanceof C95911b.C95915d) {
                ViewGroup viewGroup = ((C95911b.C95915d) baseViewHolder).f280035G0;
                SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
                return viewGroup;
            } else if (baseViewHolder instanceof C95917e.C95922e) {
                ViewGroup viewGroup2 = (ViewGroup) ((C95917e.C95922e) baseViewHolder).f280077F0.f293379x;
                SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
                return viewGroup2;
            } else {
                SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
                return null;
            }
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
            TimelineClickListener timelineClickListener = this.f279997a.f278572f;
            if (timelineClickListener != null) {
                timelineClickListener.mo133540C(this.f279998b);
            }
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$d */
    public class C95899d implements C75354a {
        public C95899d() {
        }

        /* renamed from: a */
        public void mo105675a(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
            if (i < 0) {
                try {
                    Log.m105920e("AdTagClickableHelper", "BaseTimeLineItem, position < 0");
                    SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
                } catch (Throwable th) {
                    Log.m105920e("AdTagClickableHelper", th.toString());
                }
            } else {
                SnsInfo i3 = BaseTimeLineItem.this.f279906g.mo132919i(i);
                if (i3 != null) {
                    Log.m105924i("AdTagClickableHelper", "BaseTimeLineItem position = " + i + ", snsId = " + i3.field_snsId + ", source = SOURCE_TIMELINE , clickPos = " + i2);
                    C98994k.m128904b(BaseTimeLineItem.this.f279904e, 0, i3, i2);
                } else {
                    Log.m105920e("AdTagClickableHelper", "BaseTimeLineItem, snsInfo is null");
                }
                SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$4");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$e */
    public class C95900e implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ BaseViewHolder f280000a;

        public C95900e(BaseTimeLineItem baseTimeLineItem, BaseViewHolder baseViewHolder) {
            this.f280000a = baseViewHolder;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            Bitmap c;
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
            Log.m105925i("MicroMsg.BaseTimeLineItem", "download img %s", str);
            String str2 = (String) this.f280000a.f279962j.getTag(C0966R.C0970id.jve);
            if (!Util.isNullOrNil(str2, str) && str.equals(C100891r.m132217l("adId", str2)) && (c = C98974v.f290191c.mo138336c(str)) != null) {
                this.f280000a.f279962j.setImageBitmap(c);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$f */
    public class C95901f implements Runnable {
        public C95901f() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$6");
            BaseTimeLineItem baseTimeLineItem = BaseTimeLineItem.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            ViewGroup viewGroup = baseTimeLineItem.f279908i;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            BaseTimeLineItem baseTimeLineItem2 = BaseTimeLineItem.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            ViewGroup viewGroup2 = baseTimeLineItem2.f279908i;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            C102236a0.m134775v0(viewGroup, Float.valueOf(((float) viewGroup2.getMeasuredHeight()) / 2.0f));
            BaseTimeLineItem baseTimeLineItem3 = BaseTimeLineItem.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            ViewGroup viewGroup3 = baseTimeLineItem3.f279908i;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            viewGroup3.invalidate();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$g */
    public class C95902g implements View.OnClickListener {
        public C95902g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$7");
            BaseTimeLineItem.this.f279906g.f278568b.mo132088j();
            SnsReportHelper.f275506m0.mo131345F().f266424q = 1;
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$h */
    public class C95903h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseViewHolder f280003d;

        public C95903h(BaseTimeLineItem baseTimeLineItem, BaseViewHolder baseViewHolder) {
            this.f280003d = baseViewHolder;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$8");
            C94866e1.cy0().mo131278b(this.f280003d.f279918C0.getContext());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$i */
    public class C95904i implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f280004d;

        public C95904i(View view) {
            this.f280004d = view;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$9");
            int[] iArr = new int[2];
            if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
            }
            C78253a k = BaseTimeLineItem.this.f279906g.mo132921k();
            View view2 = this.f280004d;
            TimelineClickListener timelineClickListener = BaseTimeLineItem.this.f279906g.f278572f;
            k.mo108273h(view2, timelineClickListener.f280394x, timelineClickListener.f280381k, iArr[0], iArr[1]);
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$9");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$j */
    public class C95905j extends C75360c0 {
        public C95905j() {
        }

        public void onClick(View view) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
            BaseTimeLineItem.this.f279906g.f278576j.f280592j.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
        }

        public void updateDrawState(TextPaint textPaint) {
            SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
            int color = BaseTimeLineItem.this.f279904e.getResources().getColor(C0966R.color.ad7);
            if (getPress()) {
                textPaint.bgColor = color;
            } else {
                textPaint.bgColor = 0;
            }
            SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$k */
    public static class C95906k implements C75360c0.C75361a {

        /* renamed from: a */
        public WeakReference<SnsTimeLineBaseAdapter> f280007a;

        public C95906k(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
            this.f280007a = new WeakReference<>(snsTimeLineBaseAdapter);
        }

        /* renamed from: a */
        public void mo67369a(View view, Object obj) {
            C96174r rVar;
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableCallBack");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f280007a.get();
            if (!(snsTimeLineBaseAdapter == null || (rVar = snsTimeLineBaseAdapter.f278588v) == null)) {
                if (obj instanceof C102243e ? ((C102243e) obj).f301103a : false) {
                    rVar.f280964b = 0;
                } else {
                    rVar.f280964b = 6;
                }
                rVar.mo67369a(view, obj);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableCallBack");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$l */
    public static class C95907l implements C75360c0.C75361a {

        /* renamed from: a */
        public WeakReference<SnsTimeLineBaseAdapter> f280008a;

        /* renamed from: b */
        public String f280009b;

        public C95907l(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, String str) {
            this.f280008a = new WeakReference<>(snsTimeLineBaseAdapter);
            this.f280009b = str;
        }

        /* renamed from: a */
        public void mo67369a(View view, Object obj) {
            C96174r rVar;
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableReportCallBack");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f280008a.get();
            if (!(snsTimeLineBaseAdapter == null || (rVar = snsTimeLineBaseAdapter.f278588v) == null)) {
                rVar.f280964b = 0;
                rVar.mo67369a(view, obj);
                ((C79168k) C86312j.m106911c(C79168k.class)).mo74109HD(this.f280009b, 6);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableReportCallBack");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$m */
    public static class C95908m implements C94901o.C94914k {

        /* renamed from: a */
        public WeakReference<View> f280010a = null;

        /* renamed from: b */
        public String f280011b = null;

        /* renamed from: c */
        public CharSequence f280012c = null;

        /* renamed from: d */
        public CharSequence f280013d = null;

        /* renamed from: e */
        public int f280014e = 0;

        /* renamed from: f */
        public int f280015f = 0;

        /* renamed from: g */
        public int f280016g = C74942w4.m89784a(MMApplicationContext.getContext(), 28);

        /* renamed from: h */
        public C43151t f280017h = null;

        public C95908m(String str, CharSequence charSequence, CharSequence charSequence2, View view, int i, int i2, C43151t tVar) {
            this.f280010a = new WeakReference<>(view);
            this.f280011b = str;
            this.f280012c = charSequence;
            this.f280013d = charSequence2;
            this.f280014e = i;
            this.f280015f = i2;
            this.f280017h = tVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
            r6 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r3.getTag();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo131159a(android.graphics.Bitmap r13, java.lang.String r14) {
            /*
                r12 = this;
                java.lang.String r0 = "onEmojiDecodeFin"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$SnsEmojiFinCallback"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                boolean r4 = vr2.C102236a0.m134740e(r13)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                r4 = 1
                r3[r4] = r14
                java.lang.String r6 = "MicroMsg.BaseTimeLineItem"
                java.lang.String r7 = "onEmojiDecodeFin bitmapAvailable:%s, md5:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
                java.lang.ref.WeakReference<android.view.View> r3 = r12.f280010a
                if (r3 == 0) goto L_0x013c
                java.lang.Object r3 = r3.get()
                if (r3 == 0) goto L_0x013c
                java.lang.ref.WeakReference<android.view.View> r3 = r12.f280010a
                java.lang.Object r3 = r3.get()
                boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout
                if (r3 == 0) goto L_0x013c
                java.lang.ref.WeakReference<android.view.View> r3 = r12.f280010a
                java.lang.Object r3 = r3.get()
                com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout r3 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout) r3
                if (r3 == 0) goto L_0x013c
                java.lang.Object r6 = r3.getTag()
                if (r6 == 0) goto L_0x013c
                java.lang.Object r6 = r3.getTag()
                boolean r6 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96230u
                if (r6 == 0) goto L_0x013c
                java.lang.Object r6 = r3.getTag()
                com.tencent.mm.plugin.sns.ui.u r6 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r6
                te3.w64 r7 = r6.f281195e
                if (r7 == 0) goto L_0x013c
                java.util.LinkedList<te3.c74> r7 = r7.f299717u
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
                if (r7 != 0) goto L_0x013c
                te3.w64 r7 = r6.f281195e
                java.util.LinkedList<te3.c74> r7 = r7.f299717u
                java.lang.Object r7 = r7.get(r5)
                if (r7 == 0) goto L_0x013c
                te3.w64 r6 = r6.f281195e
                java.util.LinkedList<te3.c74> r6 = r6.f299717u
                java.lang.Object r6 = r6.get(r5)
                te3.c74 r6 = (te3.c74) r6
                java.lang.String r6 = r6.f131560d
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r6)
                if (r14 == 0) goto L_0x013c
                boolean r14 = vr2.C102236a0.m134740e(r13)
                if (r14 == 0) goto L_0x013c
                android.graphics.drawable.BitmapDrawable r14 = new android.graphics.drawable.BitmapDrawable
                r14.<init>(r13)
                int r13 = r12.f280016g
                r14.setBounds(r5, r5, r13, r13)
                go3.c r13 = new go3.c
                r13.<init>(r14, r4)
                de3.c0 r14 = new de3.c0
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r6 = r12.f280011b
                com.tencent.mm.plugin.sns.ui.t r7 = r12.f280017h
                r14.<init>(r5, r6, r7, r2)
                android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                java.lang.CharSequence r6 = r12.f280012c
                r5.<init>(r6)
                java.lang.String r6 = "  "
                android.text.SpannableStringBuilder r7 = r5.append(r6)
                java.lang.String r8 = r12.f280011b
                android.text.SpannableStringBuilder r7 = r7.append(r8)
                android.text.SpannableStringBuilder r7 = r7.append(r6)
                java.lang.String r8 = " "
                r7.append(r8)
                int r7 = r5.length()
                java.lang.String r9 = r12.f280011b
                int r9 = r9.length()
                int r7 = r7 - r9
                int r7 = r7 - r2
                int r7 = r7 - r4
                int r9 = r5.length()
                java.lang.String r10 = r12.f280011b
                int r10 = r10.length()
                int r9 = r9 - r10
                int r9 = r9 + -4
                int r9 = r9 - r4
                java.lang.String r10 = r12.f280011b
                int r10 = r10.length()
                int r10 = r10 + r7
                r11 = 33
                r5.setSpan(r13, r7, r10, r11)
                int r7 = r9 + 4
                java.lang.String r10 = r12.f280011b
                int r10 = r10.length()
                int r7 = r7 + r10
                r5.setSpan(r14, r9, r7, r11)
                android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
                java.lang.CharSequence r9 = r12.f280013d
                r7.<init>(r9)
                android.text.SpannableStringBuilder r9 = r7.append(r6)
                java.lang.String r10 = r12.f280011b
                android.text.SpannableStringBuilder r9 = r9.append(r10)
                android.text.SpannableStringBuilder r6 = r9.append(r6)
                r6.append(r8)
                int r6 = r7.length()
                java.lang.String r8 = r12.f280011b
                int r8 = r8.length()
                int r6 = r6 - r8
                int r6 = r6 - r2
                int r6 = r6 - r4
                int r2 = r7.length()
                java.lang.String r8 = r12.f280011b
                int r8 = r8.length()
                int r2 = r2 - r8
                int r2 = r2 + -4
                int r2 = r2 - r4
                java.lang.String r4 = r12.f280011b
                int r4 = r4.length()
                int r4 = r4 + r6
                r7.setSpan(r13, r6, r4, r11)
                int r13 = r2 + 4
                java.lang.String r4 = r12.f280011b
                int r4 = r4.length()
                int r13 = r13 + r4
                r7.setSpan(r14, r2, r13, r11)
                int r13 = r12.f280014e
                int r14 = r12.f280015f
                r3.mo134080e(r5, r7, r13, r14)
            L_0x013c:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.C95908m.mo131159a(android.graphics.Bitmap, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$n */
    public static class C95909n implements C94974y1.C94977c {

        /* renamed from: a */
        public final WeakReference<C94974y1.C94977c> f280018a;

        public C95909n(C94974y1.C94977c cVar) {
            this.f280018a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo131312a(LinkedList<String> linkedList) {
            SnsMethodCalculate.markStartTimeMs("getTargetUserNamesCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$SnsUnreadTipManagerCallbackDelegate");
            SnsMethodCalculate.markStartTimeMs("setOnSnsUnreadTipManagerCallback", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            C94974y1.f275336J = null;
            SnsMethodCalculate.markEndTimeMs("setOnSnsUnreadTipManagerCallback", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            C94974y1.C94977c cVar = this.f280018a.get();
            if (cVar == null) {
                SnsMethodCalculate.markEndTimeMs("getTargetUserNamesCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$SnsUnreadTipManagerCallbackDelegate");
                return;
            }
            cVar.mo131312a(linkedList);
            SnsMethodCalculate.markEndTimeMs("getTargetUserNamesCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$SnsUnreadTipManagerCallbackDelegate");
        }
    }

    /* renamed from: A */
    private void m122772A(TextView textView, int i, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        textView.setVisibility(0);
        if (i != 0) {
            charSequence = this.f279904e.getString(i, new Object[]{charSequence});
        }
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f279904e, charSequence, textView.getTextSize()), TextView.BufferType.SPANNABLE);
        SnsMethodCalculate.markEndTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: q */
    public static ViewStub m122773q(BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("getImageKeeper", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        ViewStub viewStub = baseViewHolder.f279974p;
        SnsMethodCalculate.markEndTimeMs("getImageKeeper", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        return viewStub;
    }

    /* renamed from: B */
    public final void mo133390B(View view, CharSequence charSequence, CharSequence charSequence2, int i, int i2, w64 w64) {
        SnsMethodCalculate.markStartTimeMs("spanCommentTextView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (view instanceof SnsCommentCollapseLayout) {
            ((SnsCommentCollapseLayout) view).mo134080e(charSequence, charSequence2, i, i2);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        C99591a.f291957a.mo138967b(view, w64);
        SnsMethodCalculate.markEndTimeMs("spanCommentTextView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: g */
    public void mo133391g(C96275w6 w6Var, int i) {
        SnsMethodCalculate.markStartTimeMs("aiReportExpose", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("aiReportExpose", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: h */
    public abstract void mo81014h(ViewStub viewStub, BaseViewHolder baseViewHolder);

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r15 != false) goto L_0x0033;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133392i(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "checkReachLast"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r2 = r13.f279906g
            r3 = 0
            if (r2 == 0) goto L_0x0076
            int r2 = r2.mo132917g()
            int r2 = r2 + -1
            if (r2 != r15) goto L_0x0076
            android.view.ViewGroup r15 = r14.f279987v0
            r15.setBackgroundColor(r3)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r15 = r13.f279906g
            if (r15 == 0) goto L_0x0033
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r15 = r15.f278568b
            if (r15 == 0) goto L_0x0033
            r15.getClass()
            java.lang.String r2 = "isLoadingEndVisible"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            boolean r15 = r15.f276704n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r15 == 0) goto L_0x00c2
        L_0x0033:
            android.view.View r14 = r14.f279922E0
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r15.mo10233c(r2)
            java.lang.Object[] r6 = r15.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r8 = "checkReachLast"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r14
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r15 = r15.mo10231a(r3)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r14.setVisibility(r15)
            java.lang.String r6 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r7 = "checkReachLast"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00c2
        L_0x0076:
            android.view.ViewGroup r15 = r14.f279987v0
            r2 = 2131233600(0x7f080b40, float:1.8083342E38)
            r15.setBackgroundResource(r2)
            android.view.View r14 = r14.f279922E0
            r15 = 8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r2.mo10233c(r15)
            java.lang.Object[] r5 = r2.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r7 = "checkReachLast"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r14
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r15 = r2.mo10231a(r3)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r14.setVisibility(r15)
            java.lang.String r5 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r6 = "checkReachLast"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x00c2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.mo133392i(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int):void");
    }

    /* renamed from: j */
    public final void mo133393j(BaseViewHolder baseViewHolder, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkRetryTip", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (C94866e1.cy0().mo131277a(snsInfo.field_snsId, snsInfo.getCreateTime(), snsInfo.localid)) {
            if (!baseViewHolder.f279914A0) {
                baseViewHolder.f279914A0 = true;
                baseViewHolder.f279918C0 = (TextView) ((LinearLayout) baseViewHolder.f279916B0.inflate()).findViewById(C0966R.C0970id.jvj);
            }
            baseViewHolder.f279916B0.setVisibility(0);
            baseViewHolder.f279987v0.setBackgroundColor(0);
            baseViewHolder.f279918C0.setOnClickListener(new C95903h(this, baseViewHolder));
        } else {
            if (baseViewHolder.f279914A0) {
                baseViewHolder.f279916B0.setVisibility(8);
            }
            baseViewHolder.f279987v0.setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        SnsMethodCalculate.markEndTimeMs("checkRetryTip", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: k */
    public final void mo133394k(BaseViewHolder baseViewHolder, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkUnreadTip", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (C94866e1.fy0().mo131303d(snsInfo.field_snsId)) {
            if (!baseViewHolder.f279989w0) {
                baseViewHolder.f279989w0 = true;
                ViewGroup viewGroup = (ViewGroup) ((LinearLayout) baseViewHolder.f279991x0.inflate()).findViewById(C0966R.C0970id.jwz);
                baseViewHolder.f279995z0 = viewGroup;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
                baseViewHolder.f279993y0 = (StoryAvatarDotsView) viewGroup.findViewById(C0966R.C0970id.jwy);
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
                this.f279908i = baseViewHolder.f279995z0;
            }
            baseViewHolder.f279991x0.setVisibility(0);
            LinkedList<String> h = C94866e1.fy0().mo131307h();
            Log.m105925i("MicroMsg.BaseTimeLineItem", "checkUnreadTip expose, targetUserNames:%s", Integer.valueOf(h.size()));
            if (Util.isNullOrNil((List) h)) {
                BaseViewHolder.m122794a(baseViewHolder).setVisibility(8);
                this.f279909j = BaseViewHolder.m122794a(baseViewHolder);
                if (this.f279910n == null) {
                    this.f279910n = new C95909n(new a$$a(this));
                }
                C95909n nVar = this.f279910n;
                SnsMethodCalculate.markStartTimeMs("setOnSnsUnreadTipManagerCallback", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                C94974y1.f275336J = nVar;
                SnsMethodCalculate.markEndTimeMs("setOnSnsUnreadTipManagerCallback", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            } else {
                BaseViewHolder.m122794a(baseViewHolder).setVisibility(0);
                mo133399r(BaseViewHolder.m122794a(baseViewHolder), h, 3);
            }
            this.f279908i.invalidate();
            this.f279908i.post(new C95901f());
            baseViewHolder.f279987v0.setBackgroundColor(0);
            baseViewHolder.f279995z0.setTag(Long.valueOf(snsInfo.field_snsId));
            C94866e1.fy0().getClass();
            baseViewHolder.f279995z0.setOnClickListener(new C95902g());
            C115669n.INSTANCE.mo175911u(1295, 1);
        } else {
            if (baseViewHolder.f279989w0) {
                baseViewHolder.f279991x0.setVisibility(8);
                baseViewHolder.f279995z0.setTag(Long.valueOf(snsInfo.field_snsId));
            }
            baseViewHolder.f279987v0.setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        SnsMethodCalculate.markEndTimeMs("checkUnreadTip", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: l */
    public final void mo133395l(BaseViewHolder baseViewHolder, SnsInfo snsInfo) {
        C35296p0 p0Var;
        SnsMethodCalculate.markStartTimeMs("checkWsFoldDebug", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        baseViewHolder.f279920D0.setVisibility(8);
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f279906g;
        if (snsTimeLineBaseAdapter != null) {
            SnsMethodCalculate.markStartTimeMs("isWsFoldDebugEnable", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            boolean z = snsTimeLineBaseAdapter.f278591y;
            SnsMethodCalculate.markEndTimeMs("isWsFoldDebugEnable", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            if (z) {
                C35297q0 jy02 = C94866e1.jy0();
                long j = snsInfo.field_snsId;
                jy02.getClass();
                SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
                Cursor rawQuery = jy02.f94560d.rawQuery("select *,rowid from SnsWsFoldGroup  where SnsWsFoldGroup.bottom<=" + j + " AND " + "SnsWsFoldGroup" + "." + "top" + ">=" + j, (String[]) null, 2);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        p0Var = new C35296p0();
                        p0Var.convertFrom(rawQuery);
                    } else {
                        p0Var = null;
                    }
                    rawQuery.close();
                } else {
                    p0Var = null;
                }
                SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
                if (p0Var != null) {
                    String p0 = C102236a0.m134763p0(p0Var.field_top);
                    String p05 = C102236a0.m134763p0(p0Var.field_bottom);
                    C100400e0 Yx0 = C94866e1.Yx0();
                    Yx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("getCursorByTimeLineSeqIncluded", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    SnsMethodCalculate.markStartTimeMs("getFullTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    SnsMethodCalculate.markEndTimeMs("getFullTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    String str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
                    if (p0 == null || !p0.equals("")) {
                        str = str + " AND " + Yx0.mo139832vP(p0);
                    }
                    if (Yx0.zs0(p05)) {
                        str = str + " AND " + Yx0.mo139827nP(p05);
                    }
                    String str2 = str + C100400e0.f294096o;
                    Log.m105918d("MicroMsg.SnsInfoStorage", "getCursorByTimeLineSeqIncluded " + str2);
                    Cursor rawQuery2 = Yx0.f294108d.rawQuery(str2, (String[]) null);
                    SnsMethodCalculate.markEndTimeMs("getCursorByTimeLineSeqIncluded", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    ArrayList arrayList = new ArrayList();
                    if (rawQuery2 != null) {
                        while (rawQuery2.moveToNext()) {
                            SnsInfo snsInfo2 = new SnsInfo();
                            snsInfo2.convertFrom(rawQuery2);
                            arrayList.add(snsInfo2);
                        }
                        rawQuery2.close();
                    }
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            i = 0;
                            break;
                        } else if (((SnsInfo) arrayList.get(i)).field_snsId == snsInfo.field_snsId) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    baseViewHolder.f279920D0.setText("top:" + p0 + "bottom:" + p05 + "\n" + "snsid:" + C102236a0.m134763p0(snsInfo.field_snsId) + "\n" + "indexInGroup:" + i);
                    baseViewHolder.f279920D0.setVisibility(0);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkWsFoldDebug", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0a00  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0a95  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0aa2  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0ad4  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0ae9  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0b04  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0b26  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0b64  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0ba4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0bc7  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0bdd  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0be8  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0c72  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0c9f  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0cca  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0d19  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0d5f  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0d7e  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0d81  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133396m(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r51, int r52, com.tencent.p014mm.plugin.sns.storage.SnsInfo r53, com.tencent.p014mm.protocal.protobuf.TimeLineObject r54, int r55, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r56, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r57) {
        /*
            r50 = this;
            r7 = r50
            r15 = r51
            r14 = r52
            r13 = r53
            r8 = r54
            r12 = r55
            r11 = r56
            r10 = r57
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            java.lang.String r6 = "fillContent"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            long r24 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$a r1 = com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity.f280539s
            java.lang.String r2 = r50.mo81016t()
            r1.mo133612a(r2, r6)
            r7.mo133405y(r15, r13)
            r7.f279905f = r12
            r7.f279906g = r11
            boolean r1 = r7.f279907h
            if (r1 == 0) goto L_0x004b
            java.util.HashMap<java.lang.Long, ft2.c$$e> r1 = ft2.C97979c.f287345j
            java.lang.String r1 = "addClickInfo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            ft2.e r4 = new ft2.e
            r4.<init>(r13)
            r3.post(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x004b:
            ft2.C97979c.m126545f(r54)
            ft2.C97979c.m126544d(r54)
            boolean r1 = r53.isAd()
            java.lang.String r4 = "MicroMsg.BaseTimeLineItem"
            if (r1 == 0) goto L_0x0079
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "the ad sns id is "
            r1.append(r2)
            long r2 = r13.field_snsId
            java.lang.String r2 = vr2.C102236a0.m134763p0(r2)
            r1.append(r2)
            java.lang.String r2 = " for susan"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
        L_0x0079:
            long r1 = r10.f281383j
            r15.f279952e = r1
            r3 = 0
            r15.f279954f = r3
            r15.f279948c = r14
            java.lang.String r1 = r10.f281382i
            r15.f279950d = r1
            java.lang.String r1 = r10.f281381h
            r15.f279956g = r1
            int r1 = r10.f281387n
            r15.f279958h = r1
            android.widget.ImageView r1 = r15.f279927J
            android.view.View$OnClickListener r2 = r11.f278557I
            r1.setOnClickListener(r2)
            r15.timeLineObject = r8
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r10.f281371c
            r15.snsobj = r2
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r1 = r11.f278568b
            com.tencent.mm.plugin.sns.model.m2 r1 = r1.f276700g
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            r1.mo131315b(r13, r8, r14)
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r10.f281370b0
            java.lang.String r3 = r10.f281398y
            r27 = r2
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r2 = r15.f279968m
            r28 = r5
            r2.getClass()
            java.lang.String r5 = "setAdTagClickCallback"
            r29 = r6
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.CollapsibleTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            r30 = r9
            r9 = 0
            r2.f276752u = r9
            r9 = -1
            r2.f276753v = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            boolean r2 = r10.f281391r
            boolean r2 = jq2.C98994k.m128903a(r2, r12)
            if (r2 == 0) goto L_0x00ef
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r2 = r15.f279968m
            de3.a r9 = r7.f279912p
            r2.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            r2.f276752u = r9
            r2.f276753v = r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x00ef:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r13 = ""
            r6 = 1
            if (r2 != 0) goto L_0x0279
            com.tencent.mm.contact.d r2 = r10.f281377f
            r15.f279955f0 = r2
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r2 = r15.f279962j
            r2.setTag(r3)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r2 = r15.f279962j
            android.content.res.Resources r5 = r2.getResources()
            r9 = 2131836509(0x7f113e5d, float:1.9306187E38)
            java.lang.String r5 = r5.getString(r9)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r6 = r10.f281399z
            r16 = 0
            r9[r16] = r6
            java.lang.String r5 = java.lang.String.format(r5, r9)
            r2.setContentDescription(r5)
            com.tencent.mm.contact.d r2 = r15.f279955f0
            if (r2 == 0) goto L_0x0137
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r2 == 0) goto L_0x0137
            com.tencent.mm.contact.d r2 = r15.f279955f0
            java.lang.String r2 = r2.mo73980x2()
            java.lang.String r5 = "3552365301"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0137
            r2 = 1
            goto L_0x0138
        L_0x0137:
            r2 = 0
        L_0x0138:
            r5 = 2131231871(0x7f08047f, float:1.8079835E38)
            if (r1 == 0) goto L_0x01d1
            boolean r6 = r1.usePreferedInfo
            if (r6 == 0) goto L_0x01d1
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r0.setImageResource(r5)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r5 = 4
            r0.mo134068q(r3, r5)
            java.lang.String r0 = r1.preferAvatar
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = r1.preferAvatar
            java.lang.String r5 = "adId"
            java.lang.String r0 = ps2.C100891r.m132217l(r5, r0)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r5 = r15.f279962j
            r6 = 2131314082(0x7f0945a2, float:1.8246579E38)
            java.lang.String r9 = r1.preferAvatar
            r5.setTag(r6, r9)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r5 == 0) goto L_0x0187
            boolean r1 = jq2.C99009x.m128943d()
            if (r1 == 0) goto L_0x0179
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r1 = r15.f279962j
            r5 = 1
            jq2.C99009x.m128942c(r1, r0, r5)
            goto L_0x01a8
        L_0x0179:
            jp2.v r1 = jp2.C98974v.f290191c
            android.graphics.Bitmap r0 = r1.mo138336c(r0)
            if (r0 == 0) goto L_0x01a8
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r1 = r15.f279962j
            r1.setImageBitmap(r0)
            goto L_0x01a8
        L_0x0187:
            boolean r0 = jq2.C99009x.m128943d()
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = "download use avatar with cdn, but the statement should not reach!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            java.lang.String r1 = r1.preferAvatar
            r5 = 1
            jq2.C99009x.m128940a(r0, r1, r5)
            goto L_0x01a8
        L_0x019b:
            java.lang.String r0 = r1.preferAvatar
            r1 = 41
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$e r5 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$e
            r5.<init>(r7, r15)
            r6 = 0
            ps2.C100891r.m132206a(r0, r6, r1, r6, r5)
        L_0x01a8:
            com.tencent.mm.plugin.sns.ui.AsyncTextView r0 = r15.f279964k
            com.tencent.mm.contact.d r1 = r15.f279955f0
            r0.setContactInfo(r1)
            com.tencent.mm.plugin.sns.ui.AsyncTextView r0 = r15.f279964k
            java.lang.String r1 = r10.f281399z
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$l r5 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$l
            r5.<init>(r11, r3)
            boolean r6 = r10.f281391r
            java.lang.String r9 = r10.f281381h
            r16 = r0
            r17 = r3
            r18 = r1
            r19 = r5
            r20 = r6
            r21 = r9
            r22 = r55
            r23 = r6
            r16.mo97919b(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0270
        L_0x01d1:
            java.lang.String r1 = "@ad"
            boolean r1 = r3.endsWith(r1)
            if (r1 != 0) goto L_0x023e
            boolean r1 = r10.f281341A
            if (r1 == 0) goto L_0x021c
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r5[r1] = r3
            java.lang.String r1 = "getContact %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r5)
            di3.d r1 = di3.C86312j.m106911c(r0)
            ln.f r1 = (p196ln.C76705f) r1
            vd3.r$b r1 = r1.mo106829VT()
            android.graphics.Bitmap r1 = r1.mo10728qq()
            if (r1 == 0) goto L_0x020b
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r1 = r15.f279962j
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            vd3.r$b r0 = r0.mo106829VT()
            android.graphics.Bitmap r0 = r0.mo10728qq()
            r1.setImageBitmap(r0)
        L_0x020b:
            eb0.w2 r0 = eb0.C31519v2.m39436a()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$k r1 = new com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$k
            com.tencent.mm.plugin.sns.ui.c1 r5 = r56.mo132918h()
            r1.<init>(r5, r14)
            r0.mo55988e(r3, r13, r1)
            goto L_0x0227
        L_0x021c:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r1 = r15.f279962j
            r0.mo106849z(r1, r3)
        L_0x0227:
            boolean r0 = r10.f281342B
            if (r0 != 0) goto L_0x0237
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r1 = 4
            r0.mo134068q(r3, r1)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r0.setTag(r3)
            goto L_0x0249
        L_0x0237:
            r1 = 4
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r0.mo134068q(r3, r1)
            goto L_0x0249
        L_0x023e:
            r1 = 4
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r0.setImageResource(r5)
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            r0.mo134068q(r3, r1)
        L_0x0249:
            com.tencent.mm.plugin.sns.ui.AsyncTextView r0 = r15.f279964k
            com.tencent.mm.contact.d r1 = r15.f279955f0
            r0.setContactInfo(r1)
            com.tencent.mm.plugin.sns.ui.AsyncTextView r0 = r15.f279964k
            java.lang.String r1 = r10.f281399z
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$k r5 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$k
            r5.<init>(r11)
            boolean r6 = r10.f281391r
            java.lang.String r9 = r10.f281381h
            r16 = r0
            r17 = r3
            r18 = r1
            r19 = r5
            r20 = r6
            r21 = r9
            r22 = r55
            r23 = r6
            r16.mo97919b(r17, r18, r19, r20, r21, r22, r23)
        L_0x0270:
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r0 = r15.f279962j
            java.lang.String r1 = r10.f281381h
            r0.f285320i = r1
            r18 = r2
            goto L_0x027b
        L_0x0279:
            r18 = 0
        L_0x027b:
            android.widget.ImageView r0 = r15.f279966l
            r9 = 8
            r0.setVisibility(r9)
            boolean r0 = r10.f281391r
            if (r0 == 0) goto L_0x028f
            r6 = 1
            r15.isAd = r6
            boolean r0 = r10.f281388o
            r15.f279954f = r0
            r3 = 0
            goto L_0x0293
        L_0x028f:
            r3 = 0
            r6 = 1
            r15.isAd = r3
        L_0x0293:
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r0 = r15.f279968m
            java.lang.String r1 = r10.f281384k
            int r2 = r10.f281385l
            r0.mo132054i(r1, r11, r2, r10)
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r0 = r15.f279968m
            r0.setShow(r15)
            ls2.a$a r0 = ls2.C99591a.f291957a
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r1 = r15.f279968m
            r2 = 2131300854(0x7f0911f6, float:1.821975E38)
            r0.mo138968c(r1, r2, r10)
            android.widget.TextView r0 = r15.f279925H
            com.tencent.mm.plugin.sns.ui.l1 r1 = new com.tencent.mm.plugin.sns.ui.l1
            r1.<init>()
            r0.setOnTouchListener(r1)
            r0 = r50
            r1 = r51
            r5 = r27
            r2 = r52
            r3 = r57
            r34 = r4
            r4 = r54
            r35 = r5
            r36 = r28
            r5 = r55
            r37 = r29
            r6 = r56
            r0.mo81015o(r1, r2, r3, r4, r5, r6)
            r7.mo133402v(r10, r8)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.view.View>> r0 = r11.f278570d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r52)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            android.view.View r3 = r15.f279960i
            r2.<init>(r3)
            r0.put(r1, r2)
            android.view.View r0 = r15.f279960i
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0306
            android.view.View r0 = r15.f279960i
            r1 = 2131231818(0x7f08044a, float:1.8079728E38)
            r0.setBackgroundResource(r1)
            android.app.Activity r0 = r7.f279904e
            r1 = 12
            int r0 = kg3.C76577a.m92151b(r0, r1)
            android.app.Activity r1 = r7.f279904e
            int r1 = kg3.C76577a.m92151b(r1, r9)
            android.view.View r2 = r15.f279960i
            r2.setPadding(r0, r0, r0, r1)
        L_0x0306:
            android.widget.TextView r0 = r15.f279915B
            java.lang.String r1 = r10.f281390q
            r0.setText(r1)
            android.widget.TextView r0 = r15.f279919D
            r0.setVisibility(r9)
            android.widget.TextView r0 = r15.f279921E
            r0.setVisibility(r9)
            boolean r0 = r10.f281391r
            java.lang.String r1 = "..."
            if (r0 == 0) goto L_0x04da
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r10.f281392s
            android.widget.TextView r4 = r15.f279919D
            java.lang.String r6 = r10.f281381h
            r4.setTag(r6)
            boolean r4 = jq2.C98995n.m128905a(r0)
            if (r4 == 0) goto L_0x0339
            android.widget.TextView r4 = r15.f279919D
            r6 = r35
            jq2.C98995n.m128908d(r4, r6, r0)
        L_0x0333:
            r27 = r6
            r3 = 8
            goto L_0x045f
        L_0x0339:
            r6 = r35
            com.tencent.mm.plugin.sns.storage.ADInfo r4 = r10.f281392s
            int r4 = r4.adActionExtTailType
            int r2 = com.tencent.p014mm.plugin.sns.storage.ADInfo.ADChainStrengthenDefaultWording
            if (r4 != r2) goto L_0x0379
            java.lang.String r2 = r10.f281395v
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0359
            android.widget.TextView r2 = r15.f279919D
            java.lang.String r4 = r10.f281395v
            r2.setText(r4)
            android.widget.TextView r2 = r15.f279919D
            r4 = 0
            r2.setVisibility(r4)
            goto L_0x035f
        L_0x0359:
            r4 = 0
            android.widget.TextView r2 = r15.f279919D
            r2.setVisibility(r9)
        L_0x035f:
            int r2 = r0.adChainType
            r9 = 1
            if (r2 != r9) goto L_0x0333
            java.lang.String r2 = r0.adActionExtTailWording
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0333
            android.widget.TextView r2 = r15.f279919D
            java.lang.String r5 = r0.adActionExtTailWording
            r2.setText(r5)
            android.widget.TextView r2 = r15.f279919D
            r2.setVisibility(r4)
            goto L_0x0333
        L_0x0379:
            r4 = 0
            r9 = 1
            int r2 = r0.adActionExtTailType
            int r5 = com.tencent.p014mm.plugin.sns.storage.ADInfo.ADChainStrengthenUserInfoFormatWording
            if (r2 != r5) goto L_0x0333
            java.lang.String r2 = r10.f281396w
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0453
            java.lang.String r2 = r10.f281397x
            java.lang.String r5 = r10.f281396w
            de3.u r4 = new de3.u
            di3.d r21 = di3.C86312j.m106911c(r30)
            r3 = r21
            ny.h r3 = (p629ny.C76979h) r3
            android.app.Activity r9 = r7.f279904e
            r21 = r2
            android.widget.TextView r2 = r15.f279919D
            float r2 = r2.getTextSize()
            r14 = 1
            android.text.SpannableString r2 = r3.Eb0(r9, r5, r2, r14)
            r4.<init>((android.text.SpannableString) r2)
            r2 = 33
            r3 = 0
            r4.mo105704a(r3, r5, r2)
            android.widget.TextView r2 = r15.f279919D
            android.text.TextPaint r2 = r2.getPaint()
            int r3 = r4.length()
            r5 = 0
            float r3 = android.text.Layout.getDesiredWidth(r4, r5, r3, r2)
            android.app.Activity r9 = r7.f279904e
            int r3 = (int) r3
            int r3 = kg3.C76577a.m92152c(r9, r3)
            int r9 = r15.f279929L
            if (r3 <= r9) goto L_0x0441
            r3 = r21
        L_0x03cb:
            int r4 = r3.length()
            r9 = 1
            if (r4 <= r9) goto L_0x043e
            int r4 = r3.length()
            r14 = 2
            int r4 = r4 - r14
            java.lang.String r3 = r3.substring(r5, r4)
            java.lang.String r4 = r0.adActionExtTailWording
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r3)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r14[r5] = r9
            java.lang.String r4 = java.lang.String.format(r4, r14)
            de3.u r5 = new de3.u
            di3.d r9 = di3.C86312j.m106911c(r30)
            ny.h r9 = (p629ny.C76979h) r9
            android.app.Activity r14 = r7.f279904e
            r21 = r3
            android.widget.TextView r3 = r15.f279919D
            float r3 = r3.getTextSize()
            r27 = r6
            r6 = 1
            android.text.SpannableString r3 = r9.Eb0(r14, r4, r3, r6)
            r5.<init>((android.text.SpannableString) r3)
            r3 = 33
            r6 = 0
            r5.mo105704a(r6, r4, r3)
            int r3 = r5.length()
            r6 = 0
            float r3 = android.text.Layout.getDesiredWidth(r5, r6, r3, r2)
            android.app.Activity r4 = r7.f279904e
            int r3 = (int) r3
            int r3 = kg3.C76577a.m92152c(r4, r3)
            android.widget.TextView r4 = r15.f279919D
            android.widget.TextView$BufferType r9 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r5, r9)
            android.widget.TextView r4 = r15.f279919D
            r4.setVisibility(r6)
            int r4 = r15.f279929L
            if (r3 > r4) goto L_0x0438
            goto L_0x0450
        L_0x0438:
            r3 = r21
            r6 = r27
            r5 = 0
            goto L_0x03cb
        L_0x043e:
            r27 = r6
            goto L_0x0450
        L_0x0441:
            r27 = r6
            r6 = 0
            android.widget.TextView r2 = r15.f279919D
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r3)
            android.widget.TextView r2 = r15.f279919D
            r2.setVisibility(r6)
        L_0x0450:
            r3 = 8
            goto L_0x045c
        L_0x0453:
            r27 = r6
            android.widget.TextView r2 = r15.f279919D
            r3 = 8
            r2.setVisibility(r3)
        L_0x045c:
            r7.mo133397n(r0, r15)
        L_0x045f:
            android.widget.TextView r2 = r15.f279919D
            int r2 = r2.getVisibility()
            if (r2 == r3) goto L_0x0487
            java.lang.String r0 = r0.adActionExtTailLink
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0487
            android.widget.TextView r0 = r15.f279919D
            android.app.Activity r2 = r7.f279904e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101556(0x7f060774, float:1.7815525E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r15.f279919D
            r2 = 0
            r0.setOnClickListener(r2)
        L_0x0487:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r53.getTimeLine()
            te3.j00 r0 = r0.ContentObj
            int r0 = r0.f298428i
            r2 = 4
            r0 = r0 & r2
            if (r0 == 0) goto L_0x04d1
            android.widget.TextView r0 = r15.f279921E
            r0.setTag(r15)
            android.widget.TextView r0 = r15.f279921E
            r3 = 0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r15.f279921E
            r6 = 3
            java.lang.Object[] r4 = new java.lang.Object[r6]
            android.app.Activity r5 = r7.f279904e
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131836740(0x7f113f44, float:1.9306655E38)
            java.lang.String r5 = r5.getString(r9)
            r4[r3] = r5
            java.lang.String r3 = r10.f281399z
            r5 = 1
            r4[r5] = r3
            android.app.Activity r3 = r7.f279904e
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131836741(0x7f113f45, float:1.9306657E38)
            java.lang.String r3 = r3.getString(r5)
            r5 = 2
            r4[r5] = r3
            java.lang.String r3 = "%s%s%s"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.setText(r3)
            goto L_0x04de
        L_0x04d1:
            r6 = 3
            android.widget.TextView r0 = r15.f279921E
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x04de
        L_0x04da:
            r27 = r35
            r2 = 4
            r6 = 3
        L_0x04de:
            boolean r0 = r10.f281343C
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder"
            java.lang.String r4 = "access$000"
            if (r0 == 0) goto L_0x0514
            com.tencent.mm.ui.MMActivity r0 = r11.f278575i
            r5 = 2131832564(0x7f112ef4, float:1.9298185E38)
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]
            int r9 = r10.f281344D
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r19 = 0
            r14[r19] = r9
            java.lang.String r0 = r0.getString(r5, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            android.widget.TextView r5 = r15.f279977q0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r5.setText(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            android.widget.TextView r0 = r15.f279977q0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r3 = 0
            r0.setVisibility(r3)
            goto L_0x0521
        L_0x0514:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            android.widget.TextView r0 = r15.f279977q0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r3 = 8
            r0.setVisibility(r3)
        L_0x0521:
            android.widget.TextView r0 = r15.f279923F
            java.lang.String r3 = r10.f281381h
            r0.setTag(r3)
            java.lang.String r0 = r10.f281346F
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = 2131101521(0x7f060751, float:1.7815454E38)
            if (r0 != 0) goto L_0x0599
            android.widget.TextView r0 = r15.f279923F
            r4 = 0
            r0.setVisibility(r4)
            android.widget.TextView r0 = r15.f279923F
            java.lang.String r4 = r10.f281346F
            r0.setText(r4)
            android.widget.TextView r0 = r15.f279923F
            java.lang.String r4 = r10.f281346F
            r0.setContentDescription(r4)
            android.widget.TextView r0 = r15.f279923F
            boolean r4 = r10.f281347G
            r0.setClickable(r4)
            android.widget.TextView r0 = r15.f279923F
            boolean r4 = r10.f281347G
            if (r4 == 0) goto L_0x055f
            android.app.Activity r4 = r7.f279904e
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r3)
            goto L_0x056c
        L_0x055f:
            android.app.Activity r4 = r7.f279904e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131100381(0x7f0602dd, float:1.7813142E38)
            int r4 = r4.getColor(r5)
        L_0x056c:
            r0.setTextColor(r4)
            boolean r0 = r10.f281347G
            if (r0 == 0) goto L_0x0586
            android.widget.TextView r0 = r15.f279923F
            android.app.Activity r4 = r7.f279904e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131234949(0x7f081085, float:1.8086078E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r0.setBackground(r4)
            goto L_0x05a6
        L_0x0586:
            android.widget.TextView r0 = r15.f279923F
            android.app.Activity r4 = r7.f279904e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131234067(0x7f080d13, float:1.808429E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r0.setBackground(r4)
            goto L_0x05a6
        L_0x0599:
            android.widget.TextView r0 = r15.f279923F
            r4 = 8
            r0.setVisibility(r4)
            android.widget.TextView r0 = r15.f279923F
            r4 = 0
            r0.setContentDescription(r4)
        L_0x05a6:
            boolean r0 = r10.f281351K
            if (r0 == 0) goto L_0x05cb
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r15.f279917C
            r4 = 0
            r0.setVisibility(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r15.f279917C
            r4 = 2131756358(0x7f100546, float:1.9143621E38)
            r0.setImageResource(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r15.f279917C
            android.app.Activity r4 = r7.f279904e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099669(0x7f060015, float:1.7811698E38)
            int r4 = r4.getColor(r5)
            r0.setIconColor(r4)
            goto L_0x05d2
        L_0x05cb:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r15.f279917C
            r4 = 8
            r0.setVisibility(r4)
        L_0x05d2:
            android.widget.TextView r0 = r15.f279925H
            android.app.Activity r4 = r7.f279904e
            android.content.res.Resources r4 = r4.getResources()
            int r3 = r4.getColor(r3)
            r0.setTextColor(r3)
            boolean r0 = r10.f281348H
            r3 = 28
            if (r0 == 0) goto L_0x0693
            android.widget.TextView r0 = r15.f279925H
            r4 = 0
            r0.setVisibility(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.app.Activity r4 = r7.f279904e
            r5 = 2131836867(0x7f113fc3, float:1.9306913E38)
            java.lang.String r4 = r4.getString(r5)
            r0.append(r4)
            java.lang.CharSequence r4 = r10.f281350J
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            te3.j00 r4 = r8.ContentObj
            if (r4 == 0) goto L_0x0628
            int r5 = r4.f298424e
            if (r5 == r3) goto L_0x0626
            r9 = 34
            if (r5 == r9) goto L_0x0626
            r9 = 45
            if (r5 == r9) goto L_0x0626
            r9 = 43
            if (r5 == r9) goto L_0x0626
            r9 = 36
            if (r5 == r9) goto L_0x0626
            r9 = 1
            if (r5 != r9) goto L_0x0628
            te3.p81 r4 = r4.f298435s
            if (r4 == 0) goto L_0x0628
        L_0x0626:
            r4 = 1
            goto L_0x0629
        L_0x0628:
            r4 = 0
        L_0x0629:
            int r5 = r0.length()
            r9 = 10
            if (r5 <= r9) goto L_0x0647
            if (r4 != 0) goto L_0x0647
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            java.lang.String r0 = r0.substring(r5, r9)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
        L_0x0647:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$j r0 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$j
            r0.<init>()
            int r4 = r1.length()
            r5 = 33
            r9 = 0
            r1.setSpan(r0, r9, r4, r5)
            android.widget.TextView r0 = r15.f279925H
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r0.setText(r1, r4)
            boolean r0 = r10.f281349I
            if (r0 != 0) goto L_0x068b
            te3.r5 r0 = r8.AppInfo
            java.lang.String r0 = r0.f299236d
            java.lang.String r1 = "wx7fa037cc7dfabad5"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x068b
            android.widget.TextView r0 = r15.f279925H
            android.app.Activity r1 = r7.f279904e
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131101556(0x7f060774, float:1.7815525E38)
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r15.f279925H
            r1 = 0
            r0.setOnTouchListener(r1)
        L_0x068b:
            android.widget.TextView r0 = r15.f279925H
            r0.setTag(r8)
            r1 = 8
            goto L_0x069a
        L_0x0693:
            android.widget.TextView r0 = r15.f279925H
            r1 = 8
            r0.setVisibility(r1)
        L_0x069a:
            boolean r0 = r10.f281342B
            if (r0 == 0) goto L_0x06ac
            android.widget.TextView r0 = r15.f279924G
            r4 = 0
            r0.setVisibility(r4)
            android.widget.TextView r0 = r15.f279924G
            java.lang.String r4 = r10.f281381h
            r0.setTag(r4)
            goto L_0x06b1
        L_0x06ac:
            android.widget.TextView r0 = r15.f279924G
            r0.setVisibility(r1)
        L_0x06b1:
            android.widget.ImageView r0 = r15.f279927J
            r0.setTag(r15)
            boolean r0 = r10.f281352L
            r1 = 7
            if (r0 == 0) goto L_0x0815
            boolean r0 = r15.f279942Y
            if (r0 != 0) goto L_0x06e6
            android.view.ViewStub r0 = r15.f279940W
            android.view.View r0 = r0.inflate()
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r15.f279934Q = r0
            android.view.View r0 = r15.f279960i
            r4 = 2131311118(0x7f093a0e, float:1.8240567E38)
            android.view.View r0 = r0.findViewById(r4)
            r15.f279935R = r0
            r5 = 1
            r15.f279942Y = r5
            java.lang.String r5 = r10.f281381h
            r0.setTag(r5)
            android.widget.LinearLayout r0 = r15.f279934Q
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r15.f279941X = r0
        L_0x06e6:
            android.view.ViewStub r0 = r15.f279940W
            r4 = 0
            r0.setVisibility(r4)
            int r0 = r10.f281353M
            if (r0 == r1) goto L_0x076a
            r4 = 201(0xc9, float:2.82E-43)
            if (r0 == r4) goto L_0x0750
            r4 = 210(0xd2, float:2.94E-43)
            if (r0 == r4) goto L_0x0736
            r4 = 211(0xd3, float:2.96E-43)
            if (r0 == r4) goto L_0x0719
            android.widget.TextView r0 = r15.f279941X
            r4 = 2131837094(0x7f1140a6, float:1.9307373E38)
            r0.setText(r4)
            android.view.View r0 = r15.f279935R
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r11.f278572f
            android.view.View$OnClickListener r4 = r4.f280390t
            r0.setOnClickListener(r4)
            android.widget.LinearLayout r0 = r15.f279934Q
            r4 = 1
            r0.setClickable(r4)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setEnabled(r4)
            goto L_0x0783
        L_0x0719:
            r4 = 1
            android.widget.TextView r0 = r15.f279941X
            r5 = 2131837092(0x7f1140a4, float:1.930737E38)
            r0.setText(r5)
            android.view.View r0 = r15.f279935R
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r5 = r11.f278572f
            android.view.View$OnClickListener r5 = r5.f280390t
            r0.setOnClickListener(r5)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setClickable(r4)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setEnabled(r4)
            goto L_0x0783
        L_0x0736:
            android.widget.TextView r0 = r15.f279941X
            r4 = 2131837093(0x7f1140a5, float:1.9307371E38)
            r0.setText(r4)
            android.view.View r0 = r15.f279935R
            r4 = 0
            r0.setOnClickListener(r4)
            android.widget.LinearLayout r0 = r15.f279934Q
            r5 = 0
            r0.setClickable(r5)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setEnabled(r5)
            goto L_0x0783
        L_0x0750:
            r4 = 0
            r5 = 0
            android.widget.TextView r0 = r15.f279941X
            r9 = 2131837091(0x7f1140a3, float:1.9307367E38)
            r0.setText(r9)
            android.view.View r0 = r15.f279935R
            r0.setOnClickListener(r4)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setClickable(r5)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setEnabled(r5)
            goto L_0x0783
        L_0x076a:
            r4 = 0
            r5 = 0
            android.widget.TextView r0 = r15.f279941X
            r9 = 2131837198(0x7f11410e, float:1.9307584E38)
            r0.setText(r9)
            android.view.View r0 = r15.f279935R
            r0.setOnClickListener(r4)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setClickable(r5)
            android.widget.LinearLayout r0 = r15.f279934Q
            r0.setEnabled(r5)
        L_0x0783:
            te3.lv2 r0 = r53.getPostInfo()
            if (r0 == 0) goto L_0x07fc
            java.lang.String r4 = r0.f298732F
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x07fc
            java.lang.String r3 = r0.f298737K
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x07f4
            java.lang.String r3 = r0.f298738L
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x07f4
            android.view.View r3 = r15.f279935R
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r11.f278572f
            android.view.View$OnClickListener r4 = r4.f280390t
            r3.setOnClickListener(r4)
            android.widget.LinearLayout r3 = r15.f279934Q
            r4 = 1
            r3.setClickable(r4)
            android.widget.LinearLayout r3 = r15.f279934Q
            r3.setEnabled(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = r0.f298738L
            r3.add(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = r0.f298737K
            r4.add(r5)
            di3.d r5 = di3.C86312j.m106911c(r30)
            r38 = r5
            ny.h r38 = (p629ny.C76979h) r38
            android.app.Activity r5 = r7.f279904e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.f298732F
            r8.append(r9)
            java.lang.String r0 = r0.f298737K
            r8.append(r0)
            java.lang.String r41 = r8.toString()
            android.widget.TextView r0 = r15.f279941X
            r39 = r5
            r40 = r3
            r42 = r4
            r43 = r0
            r38.mo107047GG(r39, r40, r41, r42, r43)
            goto L_0x0812
        L_0x07f4:
            android.widget.TextView r3 = r15.f279941X
            java.lang.String r0 = r0.f298732F
            r3.setText(r0)
            goto L_0x0812
        L_0x07fc:
            te3.j00 r0 = r8.ContentObj
            int r0 = r0.f298424e
            if (r0 != r3) goto L_0x0812
            android.view.View r0 = r15.f279935R
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto L_0x0812
            android.view.ViewStub r0 = r15.f279940W
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x0820
        L_0x0812:
            r3 = 8
            goto L_0x0820
        L_0x0815:
            r3 = 8
            boolean r0 = r15.f279942Y
            if (r0 == 0) goto L_0x0820
            android.view.ViewStub r0 = r15.f279940W
            r0.setVisibility(r3)
        L_0x0820:
            boolean r0 = r10.f281354N
            if (r0 == 0) goto L_0x086b
            android.view.View r0 = r15.f279926I
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r39 = r3.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r41 = "fillContent"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r39 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r40 = "fillContent"
            java.lang.String r41 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
            android.view.View r0 = r15.f279926I
            java.lang.String r3 = r10.f281381h
            r0.setTag(r3)
            goto L_0x08ab
        L_0x086b:
            android.view.View r0 = r15.f279926I
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r39 = r3.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r41 = "fillContent"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r39 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r40 = "fillContent"
            java.lang.String r41 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
        L_0x08ab:
            boolean r0 = r10.f281355O
            if (r0 != 0) goto L_0x08b7
            android.widget.TextView r0 = r15.f279913A
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x08f4
        L_0x08b7:
            r3 = 8
            java.lang.CharSequence r0 = r10.f281357Q
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r0 != 0) goto L_0x08c7
            android.widget.TextView r0 = r15.f279913A
            r0.setVisibility(r3)
            goto L_0x08f4
        L_0x08c7:
            boolean r0 = r10.f281358R
            if (r0 == 0) goto L_0x08d4
            android.widget.TextView r0 = r15.f279913A
            r1 = 2131837218(0x7f114122, float:1.9307625E38)
            r7.m122772A(r0, r1, r13)
            goto L_0x08f4
        L_0x08d4:
            java.lang.String r0 = r10.f281356P
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x08ed
            android.widget.TextView r0 = r15.f279913A
            if (r12 != r1) goto L_0x08e4
            r1 = 2131837216(0x7f114120, float:1.930762E38)
            goto L_0x08e7
        L_0x08e4:
            r1 = 2131837217(0x7f114121, float:1.9307623E38)
        L_0x08e7:
            java.lang.String r3 = r10.f281356P
            r7.m122772A(r0, r1, r3)
            goto L_0x08f4
        L_0x08ed:
            android.widget.TextView r0 = r15.f279913A
            r1 = 8
            r0.setVisibility(r1)
        L_0x08f4:
            boolean r0 = r10.f281359S
            if (r0 == 0) goto L_0x09a2
            android.view.View r0 = r15.f279969m0
            if (r0 != 0) goto L_0x0924
            android.view.ViewStub r0 = r15.f279967l0
            android.view.View r0 = r0.inflate()
            r15.f279969m0 = r0
            r1 = 2131296825(0x7f090239, float:1.8211578E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r15.f279971n0 = r0
            android.view.View r0 = r15.f279969m0
            r1 = 2131296826(0x7f09023a, float:1.821158E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.sns.ui.MaskTextView r0 = (com.tencent.p014mm.plugin.sns.p106ui.MaskTextView) r0
            r15.f279973o0 = r0
            com.tencent.mm.plugin.sns.ui.l1 r1 = new com.tencent.mm.plugin.sns.ui.l1
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x0924:
            android.view.View r0 = r15.f279969m0
            k20.a r1 = new k20.a
            r1.<init>()
            r3 = 0
            k20.C60958c.m71442b(r3, r1)
            java.lang.Object[] r39 = r1.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r41 = "fillContent"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r39 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r40 = "fillContent"
            java.lang.String r41 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
            com.tencent.mm.plugin.sns.ui.MaskTextView r0 = r15.f279973o0
            ip3.b<op3.j> r1 = r10.f281362V
            r7.mo133406z(r0, r1, r12)
            android.app.Activity r0 = r7.f279904e
            r1 = 2131837036(0x7f11406c, float:1.9307256E38)
            r5 = 2
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r4 = r10.f281360T
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 0
            r3[r8] = r4
            double r8 = r10.f281361U
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 / r19
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.formatMoney2f(r8)
            r8 = 1
            r3[r8] = r4
            java.lang.String r0 = r0.getString(r1, r3)
            android.widget.TextView r1 = r15.f279971n0
            r1.setText(r0)
            android.view.View r0 = r15.f279969m0
            r1 = r53
            r0.setTag(r1)
            android.view.View r0 = r15.f279969m0
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r11.f278572f
            android.view.View$OnClickListener r3 = r3.f280393w
            r0.setOnClickListener(r3)
            goto L_0x09e8
        L_0x09a2:
            r1 = r53
            r5 = 2
            android.view.View r0 = r15.f279969m0
            if (r0 == 0) goto L_0x09e8
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r39 = r3.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r41 = "fillContent"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r8 = 0
            java.lang.Object r3 = r3.mo10231a(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r39 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r40 = "fillContent"
            java.lang.String r41 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x09ea
        L_0x09e8:
            r4 = 8
        L_0x09ea:
            ip3.b<op3.j> r0 = r10.f281363W
            if (r0 == 0) goto L_0x09f4
            int r0 = r0.mo138165b()
            if (r0 != 0) goto L_0x0a00
        L_0x09f4:
            ip3.b<op3.j> r0 = r10.f281364X
            if (r0 == 0) goto L_0x0ba4
            int r0 = r0.mo138165b()
            if (r0 != 0) goto L_0x0a00
            goto L_0x0ba4
        L_0x0a00:
            boolean r0 = r15.f279939V
            if (r0 != 0) goto L_0x0a8d
            android.widget.LinearLayout r0 = r15.f279930M
            if (r0 != 0) goto L_0x0a1d
            android.view.ViewStub r0 = r15.f279938U
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0a1d
            android.view.ViewStub r0 = r15.f279938U
            android.view.View r0 = r0.inflate()
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r15.f279930M = r0
            r14 = r34
            goto L_0x0a35
        L_0x0a1d:
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            android.widget.LinearLayout r0 = r15.f279930M
            if (r0 != 0) goto L_0x0a26
            r0 = 1
            goto L_0x0a27
        L_0x0a26:
            r0 = 0
        L_0x0a27:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 0
            r3[r8] = r0
            java.lang.String r0 = "holder.listKeeper = null %s,and holder.commentStub.inflated"
            r14 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r3)
        L_0x0a35:
            android.widget.LinearLayout r0 = r15.f279930M
            if (r0 == 0) goto L_0x0a8f
            r3 = 2131296844(0x7f09024c, float:1.8211616E38)
            android.view.View r0 = r0.findViewById(r3)
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r0 = (com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView) r0
            r15.f279931N = r0
            com.tencent.mm.plugin.sns.ui.l1 r3 = new com.tencent.mm.plugin.sns.ui.l1
            r3.<init>()
            r0.setLikedTextTouchListener(r3)
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r0 = r15.f279931N
            android.view.View$OnClickListener r3 = r11.f278560L
            r0.setOpClickListener(r3)
            android.view.View r0 = r15.f279960i
            r3 = 2131296803(0x7f090223, float:1.8211533E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r15.f279933P = r0
            android.widget.LinearLayout r0 = r15.f279930M
            java.lang.String r3 = r10.f281382i
            r0.setTag(r3)
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r0 = r15.f279931N
            java.lang.String r3 = r10.f281382i
            r0.setLikeTvTag(r3)
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r0 = r15.f279931N
            r0.setOpTvTag(r15)
            android.widget.LinearLayout r0 = r15.f279930M
            r3 = 2131296848(0x7f090250, float:1.8211624E38)
            android.view.View r0 = r0.findViewById(r3)
            r15.f279937T = r0
            android.widget.LinearLayout r0 = r15.f279930M
            r3 = 2131296846(0x7f09024e, float:1.821162E38)
            android.view.View r0 = r0.findViewById(r3)
            r15.f279975p0 = r0
            r0 = 1
            r15.f279939V = r0
            goto L_0x0a90
        L_0x0a8d:
            r14 = r34
        L_0x0a8f:
            r0 = 1
        L_0x0a90:
            android.widget.LinearLayout r3 = r15.f279930M
            r8 = 0
            if (r3 == 0) goto L_0x0a98
            r3.setVisibility(r8)
        L_0x0a98:
            ip3.b<op3.j> r3 = r10.f281363W
            if (r3 == 0) goto L_0x0ad4
            int r3 = r3.mo138165b()
            if (r3 <= 0) goto L_0x0ad4
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r3 = r15.f279931N
            r3.setVisibility(r8)
            java.lang.String r3 = r10.f281381h
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r8 = r15.f279931N
            r11.mo132929x(r3, r8)
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r8 = r15.f279931N
            ip3.b<op3.j> r9 = r10.f281363W
            java.lang.String r3 = r10.f281381h
            int r0 = r11.f278578l
            boolean r2 = r11.f278579m
            com.tencent.mm.pointers.PBool r4 = r11.f278580n
            r7 = 1
            r10 = r55
            r11 = r56
            r12 = r3
            r3 = r1
            r1 = r13
            r13 = r0
            r0 = r14
            r14 = r2
            r2 = r15
            r15 = r4
            r16 = r57
            r17 = r51
            r8.mo132828c(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.f279932O = r7
            r8 = r57
            r4 = 0
            goto L_0x0ae5
        L_0x0ad4:
            r3 = r1
            r1 = r13
            r0 = r14
            r2 = r15
            r7 = 1
            com.tencent.mm.plugin.sns.ui.SnsLikesTextView r4 = r2.f279931N
            r8 = 8
            r4.setVisibility(r8)
            r4 = 0
            r2.f279932O = r4
            r8 = r57
        L_0x0ae5:
            ip3.b<op3.j> r9 = r8.f281364X
            if (r9 == 0) goto L_0x0b04
            r10 = r27
            java.util.LinkedList<te3.w64> r10 = r10.CommentUserList
            r11 = r0
            r0 = r50
            r12 = r1
            r1 = r10
            r10 = r2
            r2 = r9
            r9 = r3
            r3 = r51
            r13 = 0
            r4 = r57
            r14 = 2
            r5 = r52
            r15 = 3
            r6 = r53
            r0.mo133404x(r1, r2, r3, r4, r5, r6)
            goto L_0x0b12
        L_0x0b04:
            r11 = r0
            r12 = r1
            r10 = r2
            r9 = r3
            r13 = 0
            r14 = 2
            r15 = 3
            android.widget.LinearLayout r0 = r10.f279933P
            r1 = 8
            r0.setVisibility(r1)
        L_0x0b12:
            ip3.b<op3.j> r0 = r8.f281363W
            if (r0 == 0) goto L_0x0b64
            int r0 = r0.mo138165b()
            if (r0 == 0) goto L_0x0b64
            ip3.b<op3.j> r0 = r8.f281364X
            if (r0 == 0) goto L_0x0b64
            int r0 = r0.mo138165b()
            if (r0 == 0) goto L_0x0b64
            android.view.View r0 = r10.f279937T
            k20.a r1 = new k20.a
            r1.<init>()
            k20.C60958c.m71442b(r13, r1)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r29 = "fillContent"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r28 = "fillContent"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0bc3
        L_0x0b64:
            android.view.View r0 = r10.f279937T
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            k20.C60958c.m71442b(r2, r1)
            java.lang.Object[] r39 = r1.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r41 = "fillContent"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            java.lang.Object r1 = r1.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r39 = "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem"
            java.lang.String r40 = "fillContent"
            java.lang.String r41 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;)V"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0bc3
        L_0x0ba4:
            r9 = r1
            r8 = r10
            r12 = r13
            r10 = r15
            r11 = r34
            r7 = 1
            r13 = 0
            r14 = 2
            r15 = 3
            android.widget.LinearLayout r0 = r10.f279930M
            if (r0 == 0) goto L_0x0bb8
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0bc3
        L_0x0bb8:
            r1 = 8
            boolean r0 = r10.f279939V
            if (r0 == 0) goto L_0x0bc3
            android.view.ViewStub r0 = r10.f279938U
            r0.setVisibility(r1)
        L_0x0bc3:
            boolean r0 = r8.f281365Y
            if (r0 == 0) goto L_0x0bdd
            android.widget.TextView r0 = r10.f279978r
            java.lang.String r1 = r8.f281381h
            r0.setTag(r1)
            android.widget.TextView r0 = r10.f279978r
            java.lang.String r1 = r8.f281366Z
            r0.setText(r1)
            android.widget.TextView r0 = r10.f279978r
            r0.setVisibility(r13)
            r1 = 8
            goto L_0x0be4
        L_0x0bdd:
            android.widget.TextView r0 = r10.f279978r
            r1 = 8
            r0.setVisibility(r1)
        L_0x0be4:
            boolean r0 = r8.f281391r
            if (r0 == 0) goto L_0x0c72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "adatag "
            r0.append(r2)
            java.lang.String r2 = r8.f281394u
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f279992y
            long r2 = r8.f281383j
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            vr2.f r3 = new vr2.f
            com.tencent.mm.plugin.sns.ui.m8 r4 = r10.f279992y
            int r5 = r10.f279948c
            java.lang.String r6 = r8.f281381h
            long r14 = r8.f281383j
            java.lang.String r1 = r8.f281389p
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r14
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r22)
            r0.mo133605d(r2, r3)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f279992y
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r8.f281367a
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r8.f281393t
            com.tencent.mm.plugin.sns.storage.ADInfo r3 = r8.f281392s
            r0.mo133602a(r1, r2, r3)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f279992y
            r0.mo133607f(r13)
            android.widget.TextView r0 = r10.f279923F
            if (r0 == 0) goto L_0x0c68
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0c68
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f279992y
            boolean r0 = r0.mo133603b()
            if (r0 == 0) goto L_0x0c68
            android.widget.TextView r0 = r10.f279923F
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r0.leftMargin
            r3 = 8
            r2 = r50
            android.app.Activity r4 = r2.f279904e
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r4, r5)
            int r5 = r0.rightMargin
            int r6 = r0.bottomMargin
            r0.setMargins(r1, r4, r5, r6)
            android.widget.TextView r1 = r10.f279923F
            r1.setLayoutParams(r0)
            goto L_0x0c6c
        L_0x0c68:
            r3 = 8
            r2 = r50
        L_0x0c6c:
            android.widget.RelativeLayout r0 = r10.f279994z
            r0.setVisibility(r3)
            goto L_0x0c9b
        L_0x0c72:
            r3 = 8
            r2 = r50
            if (r18 == 0) goto L_0x0c91
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f279992y
            r0.mo133607f(r3)
            android.widget.RelativeLayout r0 = r10.f279994z
            vr2.j r1 = new vr2.j
            java.lang.String r3 = r53.getLocalid()
            r1.<init>(r0, r3)
            r0.setTag(r1)
            android.widget.RelativeLayout r0 = r10.f279994z
            r0.setVisibility(r13)
            goto L_0x0c9b
        L_0x0c91:
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f279992y
            r0.mo133607f(r3)
            android.widget.RelativeLayout r0 = r10.f279994z
            r0.setVisibility(r3)
        L_0x0c9b:
            boolean r0 = r2.f279907h
            if (r0 == 0) goto L_0x0cca
            js2.b r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Px0()
            r0.getClass()
            java.lang.String r1 = "dealItem"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isSimplifiedChineseAppLang()
            if (r4 != 0) goto L_0x0cba
            r0.mo138365c(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x0cc0
        L_0x0cba:
            r0.mo138365c(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
        L_0x0cc0:
            r2.mo133395l(r10, r9)
            r2.mo133394k(r10, r9)
            r2.mo133393j(r10, r9)
            goto L_0x0ccd
        L_0x0cca:
            r50.mo133392i(r51, r52)
        L_0x0ccd:
            com.tencent.mm.plugin.sns.ui.p5 r0 = new com.tencent.mm.plugin.sns.ui.p5
            java.lang.String r15 = r8.f281382i
            java.lang.String r1 = r8.f281381h
            r17 = 0
            r18 = 1
            r19 = 1
            r14 = r0
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r1 = r10.f279970n
            android.widget.TextView r1 = r1.getResultTextView()
            r1.setTag(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            ip3.b<op3.j> r1 = r8.f281363W
            java.lang.String r3 = ","
            java.lang.String r4 = ":"
            if (r1 == 0) goto L_0x0d32
            int r1 = r1.mo138165b()
            if (r1 <= 0) goto L_0x0d32
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2131836726(0x7f113f36, float:1.9306627E38)
            java.lang.String r1 = r1.getString(r5)
            r0.append(r1)
            r0.append(r4)
            r1 = 0
        L_0x0d11:
            ip3.b<op3.j> r5 = r8.f281363W
            int r5 = r5.mo138165b()
            if (r1 >= r5) goto L_0x0d32
            ip3.b<op3.j> r5 = r8.f281363W
            java.lang.Object r5 = r5.mo138164a(r1)
            op3.j r5 = (op3.C117882j) r5
            if (r5 == 0) goto L_0x0d2f
            java.lang.Object r5 = r5.mo182596a(r7)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            r0.append(r3)
        L_0x0d2f:
            int r1 = r1 + 1
            goto L_0x0d11
        L_0x0d32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            ip3.b<op3.j> r5 = r8.f281364X
            if (r5 == 0) goto L_0x0d79
            int r5 = r5.mo138165b()
            if (r5 <= 0) goto L_0x0d79
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131836721(0x7f113f31, float:1.9306617E38)
            java.lang.String r5 = r5.getString(r6)
            r1.append(r5)
            r1.append(r4)
            r4 = 0
        L_0x0d57:
            ip3.b<op3.j> r5 = r8.f281364X
            int r5 = r5.mo138165b()
            if (r4 >= r5) goto L_0x0d79
            ip3.b<op3.j> r5 = r8.f281364X
            java.lang.Object r5 = r5.mo138164a(r4)
            op3.j r5 = (op3.C117882j) r5
            if (r5 == 0) goto L_0x0d76
            r6 = 6
            java.lang.Object r5 = r5.mo182596a(r6)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.append(r5)
            r1.append(r3)
        L_0x0d76:
            int r4 = r4 + 1
            goto L_0x0d57
        L_0x0d79:
            r3 = r55
            r4 = 2
            if (r3 != r4) goto L_0x0d81
            r49 = 1
            goto L_0x0d90
        L_0x0d81:
            r4 = 3
            if (r3 == r4) goto L_0x0d8e
            r4 = 4
            if (r3 == r4) goto L_0x0d8e
            r4 = 5
            if (r3 != r4) goto L_0x0d8b
            goto L_0x0d8e
        L_0x0d8b:
            r49 = 0
            goto L_0x0d90
        L_0x0d8e:
            r49 = 2
        L_0x0d90:
            xi3.a r38 = xi3.C78844a.m95368g()
            android.view.View r3 = r10.f279960i
            com.tencent.mm.plugin.sns.ui.AsyncTextView r4 = r10.f279964k
            android.widget.TextView r5 = r10.f279915B
            android.widget.TextView r6 = r10.f279923F
            java.lang.String r43 = r50.mo133398p(r51)
            android.widget.TextView r8 = r10.f279986v
            boolean r9 = r10.f279951d0
            android.widget.TextView r12 = r10.f279925H
            java.lang.String r47 = r0.toString()
            java.lang.String r48 = r1.toString()
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r6
            r44 = r8
            r45 = r9
            r46 = r12
            r38.mo108839d(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$a r0 = com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity.f280539s
            java.lang.String r1 = r50.mo81016t()
            r0.mo133613b(r1)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem r1 = r10.f279965k0
            java.lang.String r1 = r1.mo81016t()
            r0[r13] = r1
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r24
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0[r7] = r1
            java.lang.String r1 = "name:%s fillcontent cost:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r1, r0)
            r1 = r36
            r0 = r37
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.mo133396m(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter, com.tencent.mm.plugin.sns.ui.w6):void");
    }

    /* renamed from: n */
    public final void mo133397n(ADInfo aDInfo, BaseViewHolder baseViewHolder) {
        ADInfo aDInfo2 = aDInfo;
        BaseViewHolder baseViewHolder2 = baseViewHolder;
        Class cls = C76979h.class;
        SnsMethodCalculate.markStartTimeMs("fillDynamicAdTailItem", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (aDInfo2 == null || baseViewHolder2 == null) {
            Log.m105924i("MicroMsg.BaseTimeLineItem", "adInfo or holder is null");
            SnsMethodCalculate.markEndTimeMs("fillDynamicAdTailItem", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            return;
        }
        try {
            if (aDInfo2.adChainType == 1 && !Util.isNullOrNil(aDInfo2.adActionExtTailFormattedWording)) {
                String str = aDInfo2.adActionExtTailUserDisplayName;
                String str2 = aDInfo2.adActionExtTailFormattedWording;
                C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(cls)).Eb0(this.f279904e, str2, baseViewHolder2.f279919D.getTextSize(), 1));
                uVar.mo105704a((Object) null, str2, 33);
                TextPaint paint = baseViewHolder2.f279919D.getPaint();
                int i = 0;
                if (C76577a.m92152c(this.f279904e, (int) Layout.getDesiredWidth(uVar, 0, uVar.length(), paint)) > baseViewHolder2.f279929L) {
                    while (true) {
                        if (str.length() <= 1) {
                            break;
                        }
                        str = str.substring(i, str.length() - 2);
                        String str3 = aDInfo2.adActionExtTailWording;
                        Object[] objArr = new Object[1];
                        objArr[i] = str + "...";
                        String format = String.format(str3, objArr);
                        C75375u uVar2 = new C75375u(((C76979h) C86312j.m106911c(cls)).Eb0(this.f279904e, format, baseViewHolder2.f279919D.getTextSize(), 1));
                        uVar2.mo105704a((Object) null, format, 33);
                        int c = C76577a.m92152c(this.f279904e, (int) Layout.getDesiredWidth(uVar2, 0, uVar2.length(), paint));
                        baseViewHolder2.f279919D.setText(uVar2, TextView.BufferType.SPANNABLE);
                        baseViewHolder2.f279919D.setVisibility(0);
                        if (c <= baseViewHolder2.f279929L) {
                            break;
                        }
                        i = 0;
                    }
                } else {
                    baseViewHolder2.f279919D.setText(uVar, TextView.BufferType.SPANNABLE);
                    baseViewHolder2.f279919D.setVisibility(0);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.BaseTimeLineItem", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("fillDynamicAdTailItem", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: o */
    public abstract void mo81015o(BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter);

    /* renamed from: p */
    public final String mo133398p(BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        String content = baseViewHolder.f279968m.getContent();
        if (TextUtils.isEmpty(content)) {
            content = "";
        }
        String b = baseViewHolder.mo81017b();
        if (!TextUtils.isEmpty(b)) {
            content = content + "，" + b;
        }
        SnsMethodCalculate.markEndTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        return content;
    }

    /* renamed from: r */
    public final void mo133399r(StoryAvatarDotsView storyAvatarDotsView, List<String> list, int i) {
        SnsMethodCalculate.markStartTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        storyAvatarDotsView.setIconSize(C76577a.m92151b(this.f279904e, 20));
        storyAvatarDotsView.setIconGap(C76577a.m92151b(this.f279904e, 24));
        if (list.size() > 0) {
            storyAvatarDotsView.setVisibility(0);
            storyAvatarDotsView.setIconLayerCount(Math.min(list.size(), i));
            for (int i2 = 0; i2 < storyAvatarDotsView.getChildCount(); i2++) {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(storyAvatarDotsView.mo136313a(i2), list.get(i2), 0.1f);
                storyAvatarDotsView.mo136313a(i2).setPadding(C76577a.m92151b(this.f279904e, 1), C76577a.m92151b(this.f279904e, 1), C76577a.m92151b(this.f279904e, 1), C76577a.m92151b(this.f279904e, 1));
            }
        } else {
            storyAvatarDotsView.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: s */
    public View mo133400s(Activity activity, BaseViewHolder baseViewHolder, int i, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("initContent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        SnsJankActivity.C96073a aVar = SnsJankActivity.f280539s;
        aVar.mo133612a(mo81016t(), "initContent");
        this.f279904e = activity;
        this.f279905f = i;
        this.f279906g = snsTimeLineBaseAdapter;
        baseViewHolder.f279950d = snsInfo.getSnsId();
        if (i == 6) {
            C85875k4.m106208w();
        }
        int i2 = C0966R.C0971layout.ast;
        this.f279903d = false;
        if (activity instanceof SnsTimeLineUI) {
            C102723a aVar2 = (C102723a) C39818r.f106831a.mo62443b(activity).mo75002a(C102723a.class);
            SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
            boolean z = C102723a.f303339d;
            SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
            SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
            this.f279903d = z;
        } else if (activity instanceof ImproveSnsTimelineUI) {
            C102087b bVar = (C102087b) C39818r.f106831a.mo62443b(activity).mo75002a(C102087b.class);
            SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
            boolean z2 = C102087b.f300617d;
            SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
            SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
            this.f279903d = z2;
        }
        if (this.f279903d) {
            i2 = C0966R.C0971layout.f360015at0;
        }
        View inflate = LayoutInflater.from(this.f279904e).inflate(i2, (ViewGroup) null);
        baseViewHolder.f279983t0 = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.f5g);
        if (findViewById instanceof ViewStub) {
            baseViewHolder.f279974p = (ViewStub) findViewById;
        } else {
            baseViewHolder.f279974p = null;
        }
        Log.m105924i("MicroMsg.BaseTimeLineItem", "create new item  " + i + "  " + inflate.hashCode() + ", inLargeWindow= " + this.f279903d);
        baseViewHolder.f279959h0 = inflate.findViewById(C0966R.C0970id.jwn);
        baseViewHolder.f279961i0 = (ViewGroup) inflate.findViewById(C0966R.C0970id.jtq);
        baseViewHolder.f279963j0 = (ViewGroup) inflate.findViewById(C0966R.C0970id.f359261mm3);
        baseViewHolder.f279946b = i;
        SnsAvatarImageView snsAvatarImageView = (SnsAvatarImageView) inflate.findViewById(C0966R.C0970id.f5678lm);
        baseViewHolder.f279962j = snsAvatarImageView;
        snsAvatarImageView.setWeakContext(activity);
        baseViewHolder.f279962j.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280382l);
        baseViewHolder.f279962j.setOnLongClickListener(snsTimeLineBaseAdapter.f278572f.f280383m);
        baseViewHolder.f279962j.setOnTouchListener(new C57410a(this));
        baseViewHolder.f279964k = (AsyncTextView) inflate.findViewById(C0966R.C0970id.hg4);
        baseViewHolder.f279966l = (ImageView) inflate.findViewById(C0966R.C0970id.kza);
        baseViewHolder.f279964k.setOnTouchListener(new C71253l1());
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.hfs);
        AsyncNormalTextView asyncNormalTextView = (AsyncNormalTextView) inflate.findViewById(C0966R.C0970id.c29);
        baseViewHolder.f279968m = asyncNormalTextView;
        asyncNormalTextView.setOpClickListener(snsTimeLineBaseAdapter.f278558J);
        baseViewHolder.f279968m.setShrinkOrSpreadListener(new C95897b(this, snsTimeLineBaseAdapter));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5h);
        baseViewHolder.f279972o = linearLayout;
        linearLayout.setTag(baseViewHolder);
        baseViewHolder.f279972o.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280365U);
        if (snsTimeLineBaseAdapter.f278568b.mo132094p()) {
            View findViewById2 = inflate.findViewById(C0966R.C0970id.f5746nh);
            SnsMethodCalculate.markStartTimeMs("registerIgnore", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            ((ArrayList) snsTimeLineBaseAdapter.f278566R).add(findViewById2);
            SnsMethodCalculate.markEndTimeMs("registerIgnore", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        View findViewById3 = inflate.findViewById(C0966R.C0970id.c2h);
        C78253a k = snsTimeLineBaseAdapter.mo132921k();
        TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter.f278572f;
        k.mo108275j(findViewById3, timelineClickListener.f280384n, timelineClickListener.f280381k);
        C78253a k2 = snsTimeLineBaseAdapter.mo132921k();
        TimelineClickListener timelineClickListener2 = snsTimeLineBaseAdapter.f278572f;
        k2.mo108275j((TextView) inflate.findViewById(C0966R.C0970id.c2i), timelineClickListener2.f280384n, timelineClickListener2.f280381k);
        SnsTranslateResultView snsTranslateResultView = (SnsTranslateResultView) inflate.findViewById(C0966R.C0970id.jwu);
        baseViewHolder.f279970n = snsTranslateResultView;
        snsTranslateResultView.setVisibility(8);
        baseViewHolder.f279970n.getSplitlineView().setPadding(0, 0, 0, 0);
        baseViewHolder.f279970n.getResultTextView().setBackgroundResource(C0966R.C0969drawable.f357356at2);
        C78253a k3 = snsTimeLineBaseAdapter.mo132921k();
        TextView resultTextView = baseViewHolder.f279970n.getResultTextView();
        TimelineClickListener timelineClickListener3 = snsTimeLineBaseAdapter.f278572f;
        k3.mo108275j(resultTextView, timelineClickListener3.f280384n, timelineClickListener3.f280381k);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0966R.C0970id.bju);
        baseViewHolder.f279913A = (TextView) inflate.findViewById(C0966R.C0970id.lqm);
        baseViewHolder.f279915B = (TextView) inflate.findViewById(C0966R.C0970id.f5745ng);
        baseViewHolder.f279919D = (TextView) inflate.findViewById(C0966R.C0970id.f5673lh);
        baseViewHolder.f279921E = (TextView) inflate.findViewById(C0966R.C0970id.f5672lg);
        baseViewHolder.f279923F = (TextView) inflate.findViewById(C0966R.C0970id.f5676lk);
        C96071m8 m8Var = new C96071m8(inflate, snsTimeLineBaseAdapter.f278568b.f276699f, 0, new C95898c(this, snsTimeLineBaseAdapter, baseViewHolder));
        baseViewHolder.f279992y = m8Var;
        TimelineClickListener timelineClickListener4 = snsTimeLineBaseAdapter.f278572f;
        m8Var.mo133606e(timelineClickListener4.f280392v, timelineClickListener4.f280355K);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0966R.C0970id.hn4);
        baseViewHolder.f279994z = relativeLayout;
        relativeLayout.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280358N);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f5712mj);
        baseViewHolder.f279924G = textView;
        textView.setText(activity.getString(C0966R.string.f7944x1));
        baseViewHolder.f279924G.setContentDescription(activity.getString(C0966R.string.f7944x1));
        baseViewHolder.f279924G.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280386p);
        baseViewHolder.f279919D.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280356L);
        baseViewHolder.f279921E.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280357M);
        baseViewHolder.f279923F.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280352H);
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f5715mn);
        baseViewHolder.f279926I = findViewById4;
        findViewById4.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280391u);
        baseViewHolder.f279917C = (WeImageView) inflate.findViewById(C0966R.C0970id.f5773o9);
        baseViewHolder.f279925H = (TextView) inflate.findViewById(C0966R.C0970id.f5714mm);
        baseViewHolder.f279927J = (ImageView) inflate.findViewById(C0966R.C0970id.f5746nh);
        baseViewHolder.f279938U = (ViewStub) inflate.findViewById(C0966R.C0970id.f5707me);
        baseViewHolder.f279930M = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5735n7);
        baseViewHolder.f279967l0 = (ViewStub) inflate.findViewById(C0966R.C0970id.f5717mp);
        baseViewHolder.f279991x0 = (ViewStub) inflate.findViewById(C0966R.C0970id.f359272jx0);
        baseViewHolder.f279916B0 = (ViewStub) inflate.findViewById(C0966R.C0970id.jvm);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0966R.C0970id.jtr);
        baseViewHolder.f279987v0 = viewGroup2;
        viewGroup2.setClickable(true);
        baseViewHolder.f279940W = (ViewStub) inflate.findViewById(C0966R.C0970id.jvb);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.emh);
        baseViewHolder.f279978r = textView2;
        textView2.setOnClickListener(snsTimeLineBaseAdapter.f278572f.f280387q);
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
        baseViewHolder.f279977q0 = (TextView) inflate.findViewById(C0966R.C0970id.etv);
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder");
        baseViewHolder.f279920D0 = (TextView) inflate.findViewById(C0966R.C0970id.jxf);
        baseViewHolder.f279979r0 = (ViewStub) inflate.findViewById(C0966R.C0970id.ncm);
        baseViewHolder.f279960i = inflate;
        baseViewHolder.f279922E0 = inflate.findViewById(C0966R.C0970id.jwo);
        if (this.f279907h) {
            Set<Long> set = SellerABTestManager.f116470a;
            SnsMethodCalculate.markStartTimeMs("initSellerItem", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
            SnsMethodCalculate.markEndTimeMs("initSellerItem", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
            IListener iListener = NotInteresetABTestManager.f273611b;
            SnsMethodCalculate.markStartTimeMs("initNotInterestItem", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
            SnsMethodCalculate.markEndTimeMs("initNotInterestItem", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
            C94866e1.Px0().getClass();
            SnsMethodCalculate.markStartTimeMs("initItem", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
            ViewStub viewStub = (ViewStub) inflate.findViewById(C0966R.C0970id.jvd);
            baseViewHolder.f279943Z = viewStub;
            viewStub.setVisibility(8);
            ViewStub viewStub2 = (ViewStub) inflate.findViewById(C0966R.C0970id.jtp);
            baseViewHolder.f279945a0 = viewStub2;
            viewStub2.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("initItem", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        }
        aVar.mo133613b(mo81016t());
        aVar.mo133612a(mo81016t(), "buildContent");
        mo81014h(m122773q(baseViewHolder), baseViewHolder);
        inflate.setTag(baseViewHolder);
        mo133405y(baseViewHolder, snsInfo);
        aVar.mo133613b(mo81016t());
        SnsMethodCalculate.markEndTimeMs("initContent", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        return inflate;
    }

    /* renamed from: t */
    public abstract String mo81016t();

    /* renamed from: u */
    public void mo133401u(C94965w1.C94967b bVar, BaseViewHolder baseViewHolder, String str, String str2) {
        SnsTranslateResultView snsTranslateResultView;
        SnsMethodCalculate.markStartTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (!(baseViewHolder == null || (snsTranslateResultView = baseViewHolder.f279970n) == null)) {
            snsTranslateResultView.mo133013a(bVar, 1, str, str2, bVar.f275309g);
            baseViewHolder.f279970n.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: v */
    public final void mo133402v(C96275w6 w6Var, TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("reportReadMsg", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (w6Var == null || timeLineObject == null) {
            SnsMethodCalculate.markEndTimeMs("reportReadMsg", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            return;
        }
        C101833r5 r5Var = timeLineObject.AppInfo;
        String str = r5Var == null ? null : r5Var.f299236d;
        if (!Util.isNullOrNil(str)) {
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().c40(this.f279904e, str, timeLineObject.UserName, timeLineObject.ContentObj.f298424e, 4, timeLineObject.statisticsData, w6Var.f281383j);
        }
        SnsMethodCalculate.markEndTimeMs("reportReadMsg", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: w */
    public void mo133403w(BaseViewHolder baseViewHolder) {
        SnsTranslateResultView snsTranslateResultView;
        SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (!(baseViewHolder == null || (snsTranslateResultView = baseViewHolder.f279970n) == null)) {
            snsTranslateResultView.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: com.tencent.mm.plugin.sns.ui.TranslateCommentTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo133404x(java.util.List<te3.w64> r39, ip3.C98780b<op3.C117882j> r40, com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r41, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r42, int r43, com.tencent.p014mm.plugin.sns.storage.SnsInfo r44) {
        /*
            r38 = this;
            r7 = r38
            r8 = r41
            r9 = r42
            java.lang.String r10 = "setCommentList"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            android.widget.LinearLayout r12 = r8.f279933P
            int r13 = r12.getChildCount()
            int r0 = r40.mo138165b()
            if (r13 <= r0) goto L_0x0042
            r1 = r0
        L_0x001b:
            if (r1 >= r13) goto L_0x0042
            android.view.View r2 = r12.getChildAt(r0)
            r12.removeViewAt(r0)
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout
            if (r3 == 0) goto L_0x003f
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r7.f279906g
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout r2 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout) r2
            r3.getClass()
            java.lang.String r4 = "pushTextView"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.util.LinkedList<com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout> r3 = r3.f278569c
            r3.add(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x0042:
            int r0 = r40.mo138165b()
            r14 = 8
            r15 = 0
            if (r0 != 0) goto L_0x0052
            r12.setVisibility(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return r15
        L_0x0052:
            r12.setVisibility(r15)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r0 = 0
            r3 = 0
            r4 = 0
        L_0x0062:
            int r1 = r40.mo138165b()
            r2 = 1
            if (r4 >= r1) goto L_0x05fb
            r1 = r40
            java.lang.Object r16 = r1.mo138164a(r4)
            r14 = r16
            op3.j r14 = (op3.C117882j) r14
            java.lang.Object r16 = r14.mo182596a(r15)
            java.lang.Long r16 = (java.lang.Long) r16
            r17 = r0
            long r0 = r16.longValue()
            java.lang.Object r16 = r14.mo182596a(r2)
            r22 = r16
            java.lang.String r22 = (java.lang.String) r22
            r15 = 2
            java.lang.Object r18 = r14.mo182596a(r15)
            java.lang.String r18 = (java.lang.String) r18
            r2 = 3
            java.lang.Object r20 = r14.mo182596a(r2)
            r23 = r20
            java.lang.String r23 = (java.lang.String) r23
            r15 = 4
            java.lang.Object r21 = r14.mo182596a(r15)
            r15 = r21
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r2 = 5
            java.lang.Object r2 = r14.mo182596a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r32 = r10
            r10 = 6
            java.lang.Object r14 = r14.mo182596a(r10)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r24 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            java.lang.String r10 = "|"
            if (r24 != 0) goto L_0x00c1
            r5.append(r0)
            r5.append(r10)
            r17 = 1
        L_0x00c1:
            r6.append(r0)
            r6.append(r10)
            r10 = r39
            java.lang.Object r24 = r10.get(r4)
            r10 = r24
            te3.w64 r10 = (te3.w64) r10
            r24 = r4
            int r4 = r10.f299716t
            r25 = r5
            int r5 = r10.f299715s
            r26 = r6
            java.lang.String r6 = r8.f279950d
            java.lang.String r9 = "getCommentTranslateInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)
            java.util.ArrayList<com.tencent.mm.plugin.sns.model.w1$b> r8 = r7.f279911o
            int r8 = r8.size()
            r33 = r10
            if (r8 > 0) goto L_0x00f0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x013a
        L_0x00f0:
            java.util.ArrayList<com.tencent.mm.plugin.sns.model.w1$b> r8 = r7.f279911o
            java.util.Iterator r8 = r8.iterator()
        L_0x00f6:
            boolean r27 = r8.hasNext()
            if (r27 == 0) goto L_0x0137
            java.lang.Object r27 = r8.next()
            r10 = r27
            com.tencent.mm.plugin.sns.model.w1$b r10 = (com.tencent.p014mm.plugin.sns.model.C94965w1.C94967b) r10
            r27 = r8
            java.lang.String r8 = r10.f275303a
            if (r8 == 0) goto L_0x0134
            r28 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r29 = r0
            java.lang.String r0 = ""
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120623d(r6, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x012f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            r8 = r28
            goto L_0x013b
        L_0x012f:
            r8 = r27
            r0 = r29
            goto L_0x00f6
        L_0x0134:
            r8 = r27
            goto L_0x00f6
        L_0x0137:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
        L_0x013a:
            r8 = 0
        L_0x013b:
            if (r8 == 0) goto L_0x0147
            boolean r0 = r8.f275307e
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r8.f275303a
            r1 = 2
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120629j(r0, r1)
        L_0x0147:
            r0 = 1097859072(0x41700000, float:15.0)
            if (r3 < r13) goto L_0x01b5
            if (r8 == 0) goto L_0x017d
            boolean r6 = r8.f275307e
            if (r6 == 0) goto L_0x0152
            goto L_0x017d
        L_0x0152:
            com.tencent.mm.plugin.sns.ui.TranslateCommentTextView r6 = new com.tencent.mm.plugin.sns.ui.TranslateCommentTextView
            android.app.Activity r9 = r7.f279904e
            r6.<init>(r9)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r9 = r6.getTranslateResultView()
            android.content.Context r10 = r6.getContext()
            float r10 = kg3.C76577a.m92165p(r10)
            float r10 = r10 * r0
            r1 = 1
            r9.mo133018i(r1, r10)
            android.widget.TextView r9 = r6.getOriginCommentTextView()
            android.content.Context r10 = r6.getContext()
            float r10 = kg3.C76577a.m92165p(r10)
            float r10 = r10 * r0
            r9.setTextSize(r1, r10)
            goto L_0x01b3
        L_0x017d:
            r1 = 1
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r6 = r7.f279906g
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout r6 = r6.mo132922m()
            android.content.Context r9 = r6.getContext()
            float r9 = kg3.C76577a.m92165p(r9)
            float r9 = r9 * r0
            r6.mo134081f(r1, r9)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r1 = r7.f279906g
            int r9 = r1.f278583q
            r10 = -1
            if (r9 != r10) goto L_0x01a7
            android.app.Activity r9 = r7.f279904e
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131099801(0x7f060099, float:1.7811965E38)
            int r9 = r9.getColor(r10)
            r1.f278583q = r9
        L_0x01a7:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r1 = r7.f279906g
            int r1 = r1.f278583q
            r6.setTextColor(r1)
            r1 = 16
            r6.setGravity(r1)
        L_0x01b3:
            r9 = 1
            goto L_0x01ba
        L_0x01b5:
            android.view.View r6 = r12.getChildAt(r3)
            r9 = 0
        L_0x01ba:
            if (r8 == 0) goto L_0x0240
            boolean r1 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.TranslateCommentTextView
            if (r1 != 0) goto L_0x01f1
            r12.removeView(r6)
            com.tencent.mm.plugin.sns.ui.TranslateCommentTextView r6 = new com.tencent.mm.plugin.sns.ui.TranslateCommentTextView
            android.app.Activity r1 = r7.f279904e
            r6.<init>(r1)
            r12.addView(r6, r3)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r1 = r6.getTranslateResultView()
            android.content.Context r2 = r6.getContext()
            float r2 = kg3.C76577a.m92165p(r2)
            float r2 = r2 * r0
            r10 = 1
            r1.mo133018i(r10, r2)
            android.widget.TextView r1 = r6.getOriginCommentTextView()
            android.content.Context r2 = r6.getContext()
            float r2 = kg3.C76577a.m92165p(r2)
            float r2 = r2 * r0
            r1.setTextSize(r10, r2)
            goto L_0x01f2
        L_0x01f1:
            r10 = 1
        L_0x01f2:
            r2 = r6
            com.tencent.mm.plugin.sns.ui.TranslateCommentTextView r2 = (com.tencent.p014mm.plugin.sns.p106ui.TranslateCommentTextView) r2
            r0 = 0
            r6.setOnTouchListener(r0)
            android.widget.TextView r1 = r2.getOriginCommentTextView()
            r0 = r38
            r19 = r2
            r2 = r14
            r14 = r3
            r3 = r15
            r34 = r24
            r35 = r25
            r15 = r6
            r36 = r26
            r6 = r33
            r0.mo133390B(r1, r2, r3, r4, r5, r6)
            boolean r0 = r8.f275306d
            if (r0 != 0) goto L_0x0218
            r19.mo133138c()
            goto L_0x0231
        L_0x0218:
            boolean r0 = r8.f275307e
            if (r0 != 0) goto L_0x0226
            java.lang.String r0 = r8.f275304b
            java.lang.String r1 = r8.f275305c
            r6 = r19
            r6.mo133136a(r8, r0, r1)
            goto L_0x0231
        L_0x0226:
            r6 = r19
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r0 = r6.getTranslateResultView()
            r1 = 8
            r0.setVisibility(r1)
        L_0x0231:
            r28 = r9
            r7 = r11
            r37 = r12
            r29 = r14
            r6 = r15
            r8 = r33
            r2 = 1
            r33 = r13
            goto L_0x0475
        L_0x0240:
            r8 = r3
            r34 = r24
            r35 = r25
            r36 = r26
            r10 = 1
            if (r9 != 0) goto L_0x0267
            boolean r1 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.TranslateCommentTextView
            if (r1 == 0) goto L_0x0267
            r12.removeView(r6)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r1 = r7.f279906g
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout r6 = r1.mo132922m()
            r12.addView(r6, r8)
            android.content.Context r1 = r6.getContext()
            float r1 = kg3.C76577a.m92165p(r1)
            float r1 = r1 * r0
            r6.mo134081f(r10, r1)
        L_0x0267:
            boolean r1 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout
            if (r1 == 0) goto L_0x02b7
            r1 = r6
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout r1 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout) r1
            android.content.Context r3 = r6.getContext()
            float r3 = kg3.C76577a.m92165p(r3)
            float r3 = r3 * r0
            r1.mo134081f(r10, r3)
            r0 = r6
            com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout r0 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout) r0
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r1 = r7.f279906g
            android.view.View$OnClickListener r1 = r1.f278561M
            r0.setOpClickListener(r1)
            de3.a0 r1 = new de3.a0
            android.app.Activity r3 = r7.f279904e
            r1.<init>(r3)
            r3 = 0
            r1.f221527n = r3
            r3 = -1
            r1.f221528o = r3
            r3 = r33
            java.lang.String r10 = r3.f299703d
            r33 = r13
            r13 = r44
            boolean r10 = gv2.C98242p.m126943e(r13, r10)
            if (r10 == 0) goto L_0x02af
            de3.a r10 = r7.f279912p
            r1.f221527n = r10
            r10 = r43
            r1.f221528o = r10
            r21 = r3
            r3 = 31
            r1.f221529p = r3
            goto L_0x02b3
        L_0x02af:
            r10 = r43
            r21 = r3
        L_0x02b3:
            r0.setPressTouchListener(r1)
            goto L_0x02bf
        L_0x02b7:
            r10 = r43
            r21 = r33
            r33 = r13
            r13 = r44
        L_0x02bf:
            java.lang.String r0 = "wrapEmojiInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            r1 = 2
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r1]
            r1 = 0
            r3[r1] = r14
            r1 = 1
            r3[r1] = r15
            int r1 = r6.hashCode()
            boolean r24 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r24 != 0) goto L_0x043a
            boolean r10 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout
            if (r10 != 0) goto L_0x02de
            goto L_0x043a
        L_0x02de:
            com.tencent.mm.plugin.sns.model.o r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$m r13 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$m
            r37 = r12
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r12 = r7.f279906g
            com.tencent.mm.plugin.sns.ui.t r12 = r12.f278589w
            r24 = r13
            r25 = r2
            r26 = r14
            r27 = r15
            r28 = r6
            r29 = r4
            r30 = r5
            r31 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            android.graphics.Bitmap r1 = r10.mo131123j(r2, r1, r13)
            android.app.Activity r10 = r7.f279904e
            r12 = 28
            int r10 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r10, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r2)
            java.lang.String r2 = "MicroMsg.BaseTimeLineItem"
            if (r1 != 0) goto L_0x0339
            java.lang.String r1 = "miss"
            r12.append(r1)
            r13 = 1
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r19 = r12.toString()
            r16 = 0
            r1[r16] = r19
            java.lang.String r13 = "wrapEmojiInfo:%s miss cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r1)
            android.app.Activity r1 = r7.f279904e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131234966(0x7f081096, float:1.8086113E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r28 = r9
            goto L_0x0352
        L_0x0339:
            r28 = r9
            r13 = 1
            r16 = 0
            java.lang.Object[] r9 = new java.lang.Object[r13]
            java.lang.String r13 = r12.toString()
            r9[r16] = r13
            java.lang.String r13 = "wrapEmojiInfo:%s hit cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r9)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r1)
            r1 = r2
        L_0x0352:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r14)
            java.lang.String r9 = "  "
            android.text.SpannableStringBuilder r13 = r2.append(r9)
            java.lang.String r14 = r12.toString()
            android.text.SpannableStringBuilder r13 = r13.append(r14)
            android.text.SpannableStringBuilder r13 = r13.append(r9)
            java.lang.String r14 = " "
            r13.append(r14)
            int r13 = r2.length()
            java.lang.String r24 = r12.toString()
            int r24 = r24.length()
            int r13 = r13 - r24
            int r13 = r13 + -2
            r29 = r8
            r8 = 1
            int r13 = r13 - r8
            int r19 = r2.length()
            java.lang.String r24 = r12.toString()
            int r24 = r24.length()
            int r19 = r19 - r24
            int r19 = r19 + -4
            r24 = -1
            int r8 = r19 + -1
            r24 = r5
            r5 = 0
            r1.setBounds(r5, r5, r10, r10)
            go3.c r5 = new go3.c
            r26 = r4
            r4 = 1
            r5.<init>(r1, r4)
            de3.c0 r4 = new de3.c0
            r25 = r6
            android.app.Activity r6 = r7.f279904e
            r27 = r0
            java.lang.String r0 = r12.toString()
            r30 = r11
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r11 = r7.f279906g
            com.tencent.mm.plugin.sns.ui.t r11 = r11.f278589w
            r7 = 2
            r4.<init>(r6, r0, r11, r7)
            java.lang.String r0 = r12.toString()
            int r0 = r0.length()
            int r0 = r0 + r13
            r6 = 33
            r2.setSpan(r5, r13, r0, r6)
            int r0 = r8 + 4
            java.lang.String r7 = r12.toString()
            int r7 = r7.length()
            int r0 = r0 + r7
            r2.setSpan(r4, r8, r0, r6)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r15)
            android.text.SpannableStringBuilder r7 = r0.append(r9)
            java.lang.String r8 = r12.toString()
            android.text.SpannableStringBuilder r7 = r7.append(r8)
            android.text.SpannableStringBuilder r7 = r7.append(r9)
            r7.append(r14)
            int r7 = r0.length()
            java.lang.String r8 = r12.toString()
            int r8 = r8.length()
            int r7 = r7 - r8
            r8 = 2
            int r7 = r7 - r8
            r8 = 1
            int r7 = r7 - r8
            int r9 = r0.length()
            java.lang.String r11 = r12.toString()
            int r11 = r11.length()
            int r9 = r9 - r11
            int r9 = r9 + -4
            int r9 = r9 - r8
            r8 = 0
            r1.setBounds(r8, r8, r10, r10)
            java.lang.String r1 = r12.toString()
            int r1 = r1.length()
            int r1 = r1 + r7
            r0.setSpan(r5, r7, r1, r6)
            int r1 = r9 + 4
            java.lang.String r5 = r12.toString()
            int r5 = r5.length()
            int r1 = r1 + r5
            r0.setSpan(r4, r9, r1, r6)
            r3[r8] = r2
            r1 = 1
            r3[r1] = r0
            r0 = r27
            r7 = r30
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)
            goto L_0x044a
        L_0x043a:
            r26 = r4
            r24 = r5
            r25 = r6
            r29 = r8
            r28 = r9
            r7 = r11
            r37 = r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)
        L_0x044a:
            java.lang.String r0 = "attachStatusSpan"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r7)
            java.lang.Class<yy.k> r1 = p773yy.C79168k.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            yy.k r1 = (p773yy.C79168k) r1
            r6 = r25
            r1.mo74119Py(r6, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)
            r0 = 0
            r2 = r3[r0]
            r0 = 1
            r3 = r3[r0]
            r0 = r38
            r1 = r6
            r8 = r21
            r4 = r26
            r5 = r24
            r9 = r6
            r6 = r8
            r0.mo133390B(r1, r2, r3, r4, r5, r6)
            r6 = r9
            r2 = 0
        L_0x0475:
            r0 = 2131235005(0x7f0810bd, float:1.8086192E38)
            r1 = 2131234949(0x7f081085, float:1.8086078E38)
            if (r29 <= 0) goto L_0x04db
            if (r2 == 0) goto L_0x04a2
            r9 = r38
            android.app.Activity r3 = r9.f279904e
            r4 = 8
            int r3 = kg3.C76577a.m92151b(r3, r4)
            android.app.Activity r5 = r9.f279904e
            r10 = 4
            int r5 = kg3.C76577a.m92151b(r5, r10)
            android.app.Activity r10 = r9.f279904e
            r11 = 0
            int r10 = kg3.C76577a.m92151b(r10, r11)
            android.app.Activity r12 = r9.f279904e
            r13 = 3
            int r12 = kg3.C76577a.m92151b(r12, r13)
            r6.setPadding(r3, r5, r10, r12)
            goto L_0x04c4
        L_0x04a2:
            r4 = 8
            r10 = 4
            r11 = 0
            r13 = 3
            r9 = r38
            android.app.Activity r3 = r9.f279904e
            int r3 = kg3.C76577a.m92151b(r3, r4)
            android.app.Activity r4 = r9.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r10)
            android.app.Activity r5 = r9.f279904e
            int r5 = kg3.C76577a.m92151b(r5, r11)
            android.app.Activity r10 = r9.f279904e
            int r10 = kg3.C76577a.m92151b(r10, r13)
            r6.setPadding(r3, r4, r5, r10)
        L_0x04c4:
            int r3 = r40.mo138165b()
            r4 = 1
            int r3 = r3 - r4
            r15 = r29
            if (r15 != r3) goto L_0x04d2
            r6.setBackgroundResource(r0)
            goto L_0x04d5
        L_0x04d2:
            r6.setBackgroundResource(r1)
        L_0x04d5:
            r11 = r41
            r10 = 8
            goto L_0x054a
        L_0x04db:
            r9 = r38
            r15 = r29
            r13 = 3
            if (r2 == 0) goto L_0x0502
            android.app.Activity r3 = r9.f279904e
            r10 = 8
            int r3 = kg3.C76577a.m92151b(r3, r10)
            android.app.Activity r4 = r9.f279904e
            r5 = 6
            int r4 = kg3.C76577a.m92151b(r4, r5)
            android.app.Activity r5 = r9.f279904e
            r11 = 0
            int r5 = kg3.C76577a.m92151b(r5, r11)
            android.app.Activity r12 = r9.f279904e
            int r12 = kg3.C76577a.m92151b(r12, r13)
            r6.setPadding(r3, r4, r5, r12)
            goto L_0x0521
        L_0x0502:
            r5 = 6
            r10 = 8
            r11 = 0
            android.app.Activity r3 = r9.f279904e
            int r3 = kg3.C76577a.m92151b(r3, r10)
            android.app.Activity r4 = r9.f279904e
            int r4 = kg3.C76577a.m92151b(r4, r5)
            android.app.Activity r5 = r9.f279904e
            int r5 = kg3.C76577a.m92151b(r5, r11)
            android.app.Activity r11 = r9.f279904e
            int r11 = kg3.C76577a.m92151b(r11, r13)
            r6.setPadding(r3, r4, r5, r11)
        L_0x0521:
            r11 = r41
            boolean r3 = r11.f279932O
            if (r3 == 0) goto L_0x0536
            int r3 = r40.mo138165b()
            r4 = 1
            if (r3 != r4) goto L_0x0532
            r6.setBackgroundResource(r0)
            goto L_0x054a
        L_0x0532:
            r6.setBackgroundResource(r1)
            goto L_0x054a
        L_0x0536:
            r4 = 1
            int r0 = r40.mo138165b()
            if (r0 != r4) goto L_0x0544
            r0 = 2131235004(0x7f0810bc, float:1.808619E38)
            r6.setBackgroundResource(r0)
            goto L_0x054a
        L_0x0544:
            r0 = 2131235006(0x7f0810be, float:1.8086194E38)
            r6.setBackgroundResource(r0)
        L_0x054a:
            if (r2 == 0) goto L_0x0573
            r0 = r6
            com.tencent.mm.plugin.sns.ui.TranslateCommentTextView r0 = (com.tencent.p014mm.plugin.sns.p106ui.TranslateCommentTextView) r0
            android.app.Activity r1 = r9.f279904e
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165644(0x7f0701cc, float:1.794551E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            java.lang.String r2 = "setSplitPadding"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r0 = r0.f279065e
            android.view.View r0 = r0.getSplitlineView()
            r12 = 0
            r0.setPadding(r12, r12, r1, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0574
        L_0x0573:
            r12 = 0
        L_0x0574:
            boolean r0 = gv2.C98242p.m126944f(r8)
            if (r0 == 0) goto L_0x0582
            r13 = 0
            r6.setOnLongClickListener(r13)
            r6.setOnClickListener(r13)
            goto L_0x05ae
        L_0x0582:
            r13 = 0
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$i r0 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$i
            r0.<init>(r6)
            r6.setOnLongClickListener(r0)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r9.f279906g
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r1 = r0.f278568b
            r1.getClass()
            java.lang.String r14 = "createCommentClickListener"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.BaseTimeLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r5)
            com.tencent.mm.plugin.sns.ui.BaseTimeLine$f r4 = new com.tencent.mm.plugin.sns.ui.BaseTimeLine$f
            r0 = r4
            r2 = r8
            r3 = r18
            r10 = r4
            r4 = r23
            r12 = r5
            r5 = r41
            r0.<init>(r2, r3, r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
            r6.setOnClickListener(r10)
        L_0x05ae:
            r0 = r42
            if (r0 == 0) goto L_0x05d9
            com.tencent.mm.plugin.sns.ui.u r1 = new com.tencent.mm.plugin.sns.ui.u
            java.lang.String r2 = r0.f281381h
            java.lang.String r3 = r0.f281382i
            r25 = 1
            java.lang.String r4 = r0.f281398y
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f281369b
            if (r5 == 0) goto L_0x05c5
            java.lang.String r5 = r5.f283893Id
            r27 = r5
            goto L_0x05c7
        L_0x05c5:
            r27 = r13
        L_0x05c7:
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r8
            r24 = r6
            r26 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6.setTag(r1)
        L_0x05d9:
            r1 = r37
            if (r28 == 0) goto L_0x05e3
            r1.removeView(r6)
            r1.addView(r6)
        L_0x05e3:
            int r3 = r15 + 1
            int r4 = r34 + 1
            r12 = r1
            r8 = r11
            r10 = r32
            r13 = r33
            r5 = r35
            r6 = r36
            r14 = 8
            r15 = 0
            r11 = r7
            r7 = r9
            r9 = r0
            r0 = r17
            goto L_0x0062
        L_0x05fb:
            r17 = r0
            r35 = r5
            r36 = r6
            r0 = r9
            r32 = r10
            r9 = r7
            r7 = r11
            r11 = r8
            if (r17 == 0) goto L_0x0663
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r1 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r2 = r11.f279948c
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.f281367a
            long r3 = r0.field_snsId
            java.lang.String r0 = r35.toString()
            java.lang.String r5 = r36.toString()
            r1.getClass()
            java.lang.String r6 = "setupSnsCommentEmojiRpt"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            java.lang.String r3 = vr2.C102236a0.m134765q0(r3)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b> r4 = r1.f275561r
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r3)
            if (r4 != 0) goto L_0x0660
            com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct
            r4.<init>()
            java.lang.String r10 = "PublishId"
            r11 = 1
            java.lang.String r10 = r4.mo86045b(r10, r3, r11)
            r4.f265973d = r10
            java.lang.String r10 = "CommentIdList"
            java.lang.String r5 = r4.mo86045b(r10, r5, r11)
            r4.f265974e = r5
            java.lang.String r5 = "EmojiIdList"
            java.lang.String r0 = r4.mo86045b(r5, r0, r11)
            r4.f265975f = r0
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b r0 = new com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b
            r0.<init>(r1)
            r0.f275574a = r2
            r0.f275575b = r4
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b> r1 = r1.f275561r
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r3, r0)
        L_0x0660:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
        L_0x0663:
            r0 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.mo133404x(java.util.List, ip3.b, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, com.tencent.mm.plugin.sns.ui.w6, int, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    /* renamed from: y */
    public final void mo133405y(BaseViewHolder baseViewHolder, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("setImageKeeperVisible", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (snsInfo.isAd()) {
            AsyncNormalTextView asyncNormalTextView = baseViewHolder.f279968m;
            if (asyncNormalTextView != null) {
                asyncNormalTextView.setVisibility(0);
            }
            baseViewHolder.f279972o.setLongClickable(false);
            baseViewHolder.f279972o.setOnClickListener((View.OnClickListener) null);
            baseViewHolder.f279972o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            baseViewHolder.f279972o.setBackgroundColor(Color.parseColor("#00ffffff"));
            PhotosContent photosContent = baseViewHolder.f279936S;
            if (photosContent != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) photosContent.getLayoutParams();
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                baseViewHolder.f279936S.setLayoutParams(layoutParams);
            }
            if (baseViewHolder.f279951d0) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baseViewHolder.f279953e0.f280501d.getLayoutParams();
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = 0;
                baseViewHolder.f279953e0.f280501d.setLayoutParams(layoutParams2);
            }
        } else {
            AsyncNormalTextView asyncNormalTextView2 = baseViewHolder.f279968m;
            if (asyncNormalTextView2 != null) {
                asyncNormalTextView2.setVisibility(0);
            }
            baseViewHolder.f279972o.setLongClickable(false);
            baseViewHolder.f279972o.setOnClickListener((View.OnClickListener) null);
            PhotosContent photosContent2 = baseViewHolder.f279936S;
            if (photosContent2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) photosContent2.getLayoutParams();
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
                baseViewHolder.f279936S.setLayoutParams(layoutParams3);
            }
            if (baseViewHolder.f279951d0) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) baseViewHolder.f279953e0.f280501d.getLayoutParams();
                layoutParams4.leftMargin = 0;
                layoutParams4.rightMargin = 0;
                baseViewHolder.f279953e0.f280501d.setLayoutParams(layoutParams4);
            }
            baseViewHolder.f279972o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            baseViewHolder.f279972o.setBackgroundColor(Color.parseColor("#00ffffff"));
        }
        SnsMethodCalculate.markEndTimeMs("setImageKeeperVisible", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }

    /* renamed from: z */
    public final void mo133406z(MaskTextView maskTextView, C98780b<C117882j> bVar, int i) {
        MaskTextView maskTextView2 = maskTextView;
        C98780b<C117882j> bVar2 = bVar;
        String str = ", ";
        SnsMethodCalculate.markStartTimeMs("setRewardList", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        if (bVar.mo138165b() == 0) {
            maskTextView2.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            return;
        }
        maskTextView2.setVisibility(0);
        String str2 = " ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int i2 = 1;
        int length = spannableStringBuilder.length() - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int b = bVar.mo138165b();
        int[] iArr = new int[b];
        int[] iArr2 = new int[bVar.mo138165b()];
        int i3 = 0;
        boolean z = true;
        while (i3 < bVar.mo138165b()) {
            try {
                String str3 = (String) bVar2.mo138164a(i3).mo182596a(i2);
                if (z) {
                    spannableStringBuilder.append(str2);
                    stringBuffer.append(str2);
                    z = false;
                } else {
                    spannableStringBuilder.append(str);
                    stringBuffer.append(str);
                }
                int length2 = spannableStringBuilder.length();
                iArr[i3] = length2;
                iArr2[i3] = length2 + str3.length();
                stringBuffer.append(str3);
                spannableStringBuilder.append(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f279904e, str3, maskTextView.getTextSize()));
                i3++;
                str = str;
                str2 = str2;
                i2 = 1;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BaseTimeLineItem", "setReward error  e:%s", Util.stackTraceToString(e));
            }
        }
        Drawable drawable = this.f279904e.getResources().getDrawable(C0966R.raw.friendactivity_luckymoney_icon);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        C76003c cVar = new C76003c(drawable, 1);
        drawable.getIntrinsicHeight();
        maskTextView.getTextSize();
        int i4 = 2;
        C76577a.m92151b(this.f279904e, 2);
        spannableStringBuilder.setSpan(cVar, length, length + 1, 33);
        if (i == 10) {
            i4 = 3;
        }
        for (int i5 = 0; i5 < b; i5++) {
            spannableStringBuilder.setSpan(new C75360c0((MMActivity) this.f279904e, (String) bVar2.mo138164a(i5).mo182596a(0), this.f279906g.f278588v, i4), iArr[i5], iArr2[i5], 33);
        }
        maskTextView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        maskTextView2.setOriginText(stringBuffer.toString());
        SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
    }
}
