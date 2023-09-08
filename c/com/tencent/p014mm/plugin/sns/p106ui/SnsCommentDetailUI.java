package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import as2.C92086h;
import br2.C54550e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.FullScreenHelperEvent;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.events.SnsAdListScrollEvent;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.autogen.events.SnsLuckyPayNotifyEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1795c0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView;
import com.tencent.p014mm.plugin.sns.lucky.view.SnsDetailLuckyHeader;
import com.tencent.p014mm.plugin.sns.model.C43036f0;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94835a0;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94880h1;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdSocialAttitudeView;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.C94753a;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96014c;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import com.tencent.xweb.file.XVFSFile;
import cs2.C45199a;
import d62.C75339i;
import de3.C75354a;
import de3.C75355a0;
import de3.C75360c0;
import de3.C75375u;
import di3.C86312j;
import dm2.C45420d;
import eb0.C75597w2;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import gv2.C98231f;
import gv2.C98242p;
import h81.C32735h;
import hc0.C20937c;
import he0.C76158j;
import ht1.C98519c2;
import i21.C60242i;
import ir2.C98784a;
import j20.C117292a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import jm2.C46562a;
import jp2.C33615q;
import jp2.C98962n;
import jp2.C98963o;
import jp2.C98977w;
import jq2.C46568m;
import jq2.C98994k;
import jr2.C76440q;
import jr2.C99014h;
import js2.C99020a;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import kg3.C76577a;
import l31.C61212e;
import lo2.C99567r;
import ls2.C99591a;
import ms2.C99965e;
import ms2.C99966g;
import n60.C100073d;
import nj3.C76879j;
import nj3.C76912y0;
import nq2.C100151a;
import nt2.C100165c;
import nt2.C100173h;
import nt2.C100189m;
import nt2.C100194n;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100416r;
import os2.C100417r0;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import p640ox.C77049b;
import p910lj.C76701a;
import pt2.C100905b;
import qo3.C89779i0;
import rq2.C101431r;
import rq2.C63489a;
import s60.C101535a;
import s60.C101536b;
import s60.C101539c;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C50903q2;
import te3.C51018qv3;
import te3.C52156yq3;
import te3.w64;
import tp2.C101911a;
import tp2.C101913c;
import tp2.C101914d;
import uo3.C78253a;
import vr2.C102236a0;
import vr2.C102243e;
import vr2.C102244f;
import vr2.C102259p;
import vr2.C102260r;
import vr2.C65874b0;
import wc3.C78538u;
import xv2.C102775d;
import xv2.C102776e;
import yn2.C102882s0;
import zn2.C53798a;
import zr2.C66976a;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI */
public class SnsCommentDetailUI extends MMSecDataActivity implements C94853e.C94861h, C11385n, C76440q.C76441a, C43104d1 {

    /* renamed from: M1 */
    public static final /* synthetic */ int f277824M1 = 0;

    /* renamed from: A */
    public C96227t4 f277825A;

    /* renamed from: A1 */
    public IListener f277826A1;

    /* renamed from: B */
    public C95713a5 f277827B;

    /* renamed from: B1 */
    public ScreenShotUtil.ScreenShotCallback f277828B1;

    /* renamed from: C */
    public String f277829C;

    /* renamed from: C1 */
    public C94853e.C94861h f277830C1;

    /* renamed from: D */
    public String f277831D;

    /* renamed from: D1 */
    public boolean f277832D1;

    /* renamed from: E */
    public int f277833E;

    /* renamed from: E1 */
    public LinearLayout f277834E1;

    /* renamed from: F */
    public C44668u3 f277835F;

    /* renamed from: F1 */
    public int f277836F1;

    /* renamed from: G */
    public String f277837G;

    /* renamed from: G1 */
    public boolean f277838G1;

    /* renamed from: H */
    public View.OnTouchListener f277839H = Util.genLinearPressedListener();

    /* renamed from: H1 */
    public PhotosContent f277840H1;

    /* renamed from: I */
    public C89779i0 f277841I = null;

    /* renamed from: I1 */
    public int f277842I1;

    /* renamed from: J */
    public ImageView f277843J;

    /* renamed from: J1 */
    public C75597w2.C31525a f277844J1;

    /* renamed from: K */
    public WeImageView f277845K;

    /* renamed from: K1 */
    public C96071m8 f277846K1;

    /* renamed from: L */
    public C96174r f277847L;

    /* renamed from: L1 */
    public final C75354a f277848L1;

    /* renamed from: M */
    public String f277849M = "";

    /* renamed from: N */
    public boolean f277850N = false;

    /* renamed from: P */
    public long f277851P = 0;

    /* renamed from: Q */
    public C78253a f277852Q;

    /* renamed from: Q0 */
    public boolean f277853Q0 = false;

    /* renamed from: R */
    public C96085n8 f277854R;

    /* renamed from: R0 */
    public Dialog f277855R0 = null;

    /* renamed from: S */
    public int f277856S;

    /* renamed from: S0 */
    public boolean f277857S0 = false;

    /* renamed from: T */
    public int f277858T;

    /* renamed from: T0 */
    public String f277859T0 = "";

    /* renamed from: U */
    public int f277860U = 210;

    /* renamed from: U0 */
    public boolean f277861U0 = true;

    /* renamed from: V */
    public int f277862V;

    /* renamed from: V0 */
    public int f277863V0;

    /* renamed from: W */
    public C100165c f277864W;

    /* renamed from: W0 */
    public boolean f277865W0 = false;

    /* renamed from: X */
    public C98963o f277866X;

    /* renamed from: X0 */
    public int f277867X0 = 0;

    /* renamed from: Y */
    public TimelineClickListener f277868Y;

    /* renamed from: Y0 */
    public boolean f277869Y0 = false;

    /* renamed from: Z */
    public C95733b f277870Z;

    /* renamed from: Z0 */
    public boolean f277871Z0 = false;

    /* renamed from: a1 */
    public C57394a0 f277872a1 = null;

    /* renamed from: b1 */
    public TextView f277873b1 = null;

    /* renamed from: c1 */
    public volatile boolean f277874c1 = false;

    /* renamed from: d */
    public boolean f277875d = true;

    /* renamed from: d1 */
    public boolean f277876d1 = false;

    /* renamed from: e */
    public long f277877e = 0;

    /* renamed from: e1 */
    public boolean f277878e1 = false;

    /* renamed from: f */
    public View f277879f;

    /* renamed from: f1 */
    public volatile int f277880f1;

    /* renamed from: g */
    public TextView f277881g;

    /* renamed from: g1 */
    public C100905b f277882g1;

    /* renamed from: h */
    public LinearLayout f277883h;

    /* renamed from: h1 */
    public boolean f277884h1;

    /* renamed from: i */
    public LinearLayout f277885i;

    /* renamed from: i1 */
    public boolean f277886i1;

    /* renamed from: j */
    public SnsDetailLuckyHeader f277887j;

    /* renamed from: j1 */
    public boolean f277888j1;

    /* renamed from: k1 */
    public boolean f277889k1 = false;

    /* renamed from: l1 */
    public SnsGroupDialog f277890l1;

    /* renamed from: m1 */
    public C94880h1 f277891m1 = new C94880h1(2);

    /* renamed from: n */
    public LinearLayout f277892n;

    /* renamed from: n1 */
    public IListener f277893n1;

    /* renamed from: o */
    public ListView f277894o;

    /* renamed from: o1 */
    public IListener f277895o1;

    /* renamed from: p */
    public View f277896p;

    /* renamed from: p0 */
    public C43162z1 f277897p0;

    /* renamed from: p1 */
    public IListener f277898p1;

    /* renamed from: q */
    public View f277899q;

    /* renamed from: q1 */
    public IListener f277900q1;

    /* renamed from: r */
    public CommentListAdapter f277901r;

    /* renamed from: r1 */
    public IListener f277902r1;

    /* renamed from: s */
    public ScaleAnimation f277903s;

    /* renamed from: s1 */
    public ScrollUp f277904s1;

    /* renamed from: t */
    public ScaleAnimation f277905t;

    /* renamed from: t1 */
    public Runnable f277906t1;

    /* renamed from: u */
    public LinearLayout f277907u;

    /* renamed from: u1 */
    public View.OnClickListener f277908u1;

    /* renamed from: v */
    public LinearLayout f277909v;

    /* renamed from: v1 */
    public View.OnClickListener f277910v1;

    /* renamed from: w */
    public LinkedList<w64> f277911w;

    /* renamed from: w1 */
    public View.OnClickListener f277912w1;

    /* renamed from: x */
    public SnsCommentFooter f277913x;

    /* renamed from: x0 */
    public C43155u8 f277914x0;

    /* renamed from: x1 */
    public IListener f277915x1;

    /* renamed from: y */
    public int f277916y = -1;

    /* renamed from: y0 */
    public SnsTranslateResultView f277917y0;

    /* renamed from: y1 */
    public IListener f277918y1;

    /* renamed from: z */
    public boolean f277919z = false;

    /* renamed from: z1 */
    public IListener f277920z1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback */
    public static class DownloadCallback implements C63489a.C63493f {

        /* renamed from: a */
        public WeakReference<ImageView> f116599a;

        /* renamed from: b */
        public int f116600b;

        /* renamed from: c */
        public int f116601c;

        /* renamed from: d */
        public int f116602d;

        public DownloadCallback(ImageView imageView) {
            this.f116599a = new WeakReference<>(imageView);
            Context context = imageView.getContext();
            this.f116600b = C76577a.m92151b(context, 16);
            this.f116601c = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 32.0f);
            this.f116602d = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 6.0f);
        }

        /* renamed from: a */
        public void mo67280a(Bitmap bitmap, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
            try {
                WeakReference<ImageView> weakReference = this.f116599a;
                if (weakReference == null) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
                    return;
                }
                ImageView imageView = weakReference.get();
                if (imageView == null) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
                    return;
                }
                if (z && bitmap != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap);
                    int i = this.f116600b;
                    bitmapDrawable.setBounds(0, 0, i, i);
                    bitmapDrawable.setColorFilter(imageView.getResources().getColor(C0966R.color.f2958ae), PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageDrawable(bitmapDrawable);
                    int i2 = this.f116601c;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                    layoutParams.topMargin = this.f116602d;
                    int i3 = (this.f116601c - this.f116600b) / 2;
                    imageView.setPadding(i3, i3, i3, i3);
                    layoutParams.gravity = 49;
                    imageView.setLayoutParams(layoutParams);
                }
                SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$DownloadCallback");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsCommentDetailUI", "onDownloadResult, exp=" + th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan */
    public class AppClickSpan extends C75360c0 {
        public AppClickSpan() {
        }

        public void onClick(View view) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
            SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
            int i = SnsCommentDetailUI.f277824M1;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            C96085n8 n8Var = snsCommentDetailUI.f277854R;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            n8Var.f280592j.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
        }

        public void updateDrawState(TextPaint textPaint) {
            SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
            int color = SnsCommentDetailUI.this.getResources().getColor(C0966R.color.ad7);
            if (getPress()) {
                textPaint.bgColor = color;
            } else {
                textPaint.bgColor = 0;
            }
            SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter */
    public class CommentListAdapter extends BaseAdapter {

        /* renamed from: d */
        public LinkedList<w64> f277999d;

        /* renamed from: e */
        public LinkedList<w64> f278000e;

        /* renamed from: f */
        public Activity f278001f;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter$ViewHolder */
        public class ViewHolder {

            /* renamed from: a */
            public ImageView f278003a;

            /* renamed from: b */
            public TextView f278004b;

            /* renamed from: c */
            public TextView f278005c;

            /* renamed from: d */
            public TextView f278006d;

            /* renamed from: e */
            public FrameLayout f278007e;

            /* renamed from: f */
            public SnsTranslateResultView f278008f;

            /* renamed from: g */
            public Object f278009g;

            /* renamed from: h */
            public w64 f278010h;

            /* renamed from: i */
            public String f278011i;

            /* renamed from: j */
            public EmojiStatusView f278012j;

            public ViewHolder(CommentListAdapter commentListAdapter) {
            }
        }

        public CommentListAdapter(LinkedList<w64> linkedList, LinkedList<w64> linkedList2, Activity activity, String str) {
            this.f277999d = linkedList;
            this.f278000e = linkedList2;
            this.f278001f = activity;
        }

        public int getCount() {
            SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            int i = 0;
            if (this.f278000e.size() > 0) {
                LinkedList<w64> linkedList = this.f277999d;
                if (linkedList != null) {
                    i = linkedList.size();
                }
                int i2 = i + 1;
                SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
                return i2;
            }
            LinkedList<w64> linkedList2 = this.f277999d;
            if (linkedList2 != null) {
                i = linkedList2.size();
            }
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            return i;
        }

        public Object getItem(int i) {
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            return null;
        }

        public long getItemId(int i) {
            SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            View view2;
            ViewHolder viewHolder;
            String str;
            View view3;
            String str2;
            String str3;
            CharSequence charSequence;
            String str4;
            ViewHolder viewHolder2;
            int i3;
            String str5;
            String str6;
            int i4;
            String str7;
            int i5;
            int i6;
            String str8;
            String str9;
            Class cls = C76158j.class;
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            if (this.f278000e.size() <= 0) {
                i2 = i;
            } else if (i == 0) {
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i7 = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                LinearLayout linearLayout = snsCommentDetailUI.f277892n;
                SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
                return linearLayout;
            } else {
                i2 = i - 1;
            }
            w64 w64 = this.f277999d.get(i2);
            C66976a.m79133d(w64.f299707h);
            w64.f299707h = Util.nullAsNil(w64.f299707h);
            if (view == null || !(view.getTag() instanceof ViewHolder)) {
                View inflate = C85868k2.m106137b(this.f278001f).inflate(C0966R.C0971layout.c2j, (ViewGroup) null);
                SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                int i8 = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                View.OnTouchListener onTouchListener = snsCommentDetailUI2.f277839H;
                SnsMethodCalculate.markEndTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                inflate.setOnTouchListener(onTouchListener);
                ViewHolder viewHolder3 = new ViewHolder(this);
                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f5693m1);
                viewHolder3.f278003a = imageView;
                imageView.setContentDescription(String.format(SnsCommentDetailUI.this.getString(C0966R.string.j3b), new Object[]{w64.f299704e}));
                ImageView imageView2 = viewHolder3.f278003a;
                SnsCommentDetailUI snsCommentDetailUI3 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                View.OnClickListener onClickListener = snsCommentDetailUI3.f277908u1;
                SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                imageView2.setOnClickListener(onClickListener);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f5705mc);
                viewHolder3.f278004b = textView;
                textView.setOnTouchListener(new C71253l1());
                viewHolder3.f278005c = (TextView) inflate.findViewById(C0966R.C0970id.f5708mf);
                viewHolder3.f278006d = (TextView) inflate.findViewById(C0966R.C0970id.f5697m5);
                viewHolder3.f278007e = (FrameLayout) inflate.findViewById(C0966R.C0970id.f5696m4);
                viewHolder3.f278006d.setOnTouchListener(new C71253l1());
                SnsTranslateResultView snsTranslateResultView = (SnsTranslateResultView) inflate.findViewById(C0966R.C0970id.jwu);
                viewHolder3.f278008f = snsTranslateResultView;
                snsTranslateResultView.setVisibility(8);
                viewHolder3.f278012j = (EmojiStatusView) inflate.findViewById(C0966R.C0970id.f5698m6);
                if (SnsCommentDetailUI.m121975X7(SnsCommentDetailUI.this) == 10) {
                    inflate.findViewById(C0966R.C0970id.bka).setBackgroundResource(C0966R.C0969drawable.c39);
                }
                view2 = inflate;
                viewHolder = viewHolder3;
            } else {
                view2 = view;
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.f278010h = w64;
            String str10 = w64.f299703d;
            viewHolder.f278011i = str10;
            ((SnsAvatarImageView) viewHolder.f278003a).mo134068q(str10, 3);
            ((SnsAvatarImageView) viewHolder.f278003a).setWeakContext(this.f278001f);
            int i9 = SnsCommentDetailUI.m121975X7(SnsCommentDetailUI.this) == 10 ? 3 : 2;
            SnsCommentDetailUI.m121975X7(SnsCommentDetailUI.this);
            C86709a0.m107528h();
            C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(viewHolder.f278011i);
            if (i2 != 0 || !this.f278000e.isEmpty()) {
                if (SnsCommentDetailUI.m121975X7(SnsCommentDetailUI.this) == 10) {
                    view2.setBackgroundResource(C0966R.C0969drawable.at_);
                } else {
                    view2.setBackgroundResource(C0966R.C0969drawable.at9);
                }
            } else if (SnsCommentDetailUI.m121975X7(SnsCommentDetailUI.this) == 10) {
                view2.setBackgroundResource(C0966R.C0969drawable.c3_);
            } else {
                view2.setBackgroundResource(C0966R.C0969drawable.a6s);
            }
            if (i2 == 0) {
                View findViewById = view2.findViewById(C0966R.C0970id.jsb);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = view2.findViewById(C0966R.C0970id.jsc);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view5 = findViewById2;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (SnsCommentDetailUI.m121975X7(SnsCommentDetailUI.this) == 10) {
                    ((ImageView) view2.findViewById(C0966R.C0970id.jsb)).setImageResource(C0966R.raw.friendactivity_writeicon_golden);
                }
            } else {
                View findViewById3 = view2.findViewById(C0966R.C0970id.jsb);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view6 = findViewById3;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = view2.findViewById(C0966R.C0970id.jsc);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view7 = findViewById4;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$CommentListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsInfo a = C100416r.m131408a(SnsCommentDetailUI.m121965N7(SnsCommentDetailUI.this));
            viewHolder.f278003a.setTag(w64.f299703d);
            if (!C98242p.m126945g(viewHolder.f278003a, a, w64.f299703d)) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(viewHolder.f278003a, w64.f299703d, true);
            }
            if (N2 != null) {
                str = N2.mo62898f();
            } else {
                str = w64.f299704e;
                if (str == null) {
                    str = w64.f299703d;
                }
            }
            viewHolder.f278003a.setTag(C0966R.C0970id.mlz, Boolean.FALSE);
            if (C98242p.m126943e(a, w64.f299703d)) {
                str = C98242p.m126939a(a.getAdXml(), str);
                viewHolder.f278003a.setTag(C0966R.C0970id.mlz, Boolean.TRUE);
            }
            String str11 = str;
            if (a != null) {
                String str12 = a.field_userName;
                viewHolder.f278006d.setText(w64.f299707h + " ");
                SnsCommentDetailUI snsCommentDetailUI4 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                int i15 = i9;
                C96174r rVar = snsCommentDetailUI4.f277847L;
                SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                String str13 = str12;
                int i16 = a.field_type;
                String userName = a.getUserName();
                SnsCommentDetailUI snsCommentDetailUI5 = SnsCommentDetailUI.this;
                String str14 = str11;
                SnsMethodCalculate.markStartTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                boolean z = snsCommentDetailUI5.f277869Y0;
                SnsMethodCalculate.markEndTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsCommentDetailUI snsCommentDetailUI6 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                boolean z2 = snsCommentDetailUI6.f277871Z0;
                SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                String str15 = "access$5700";
                int i17 = i15;
                String str16 = str13;
                String str17 = str14;
                String str18 = "getView";
                CharSequence charSequence2 = " ";
                ViewHolder viewHolder4 = viewHolder;
                View view8 = view2;
                SnsInfo snsInfo = a;
                CharSequence c = C98242p.m126941c(snsCommentDetailUI4, w64, rVar, i16, userName, 2, z, z2, a);
                EmojiInfo TO = (Util.isNullOrNil((List) w64.f299717u) || w64.f299717u.get(0) == null) ? null : C30790w2.m39221h().mo57717d().mo142044TO(w64.f299717u.get(0).f131560d);
                if (TO == null) {
                    ViewHolder viewHolder5 = viewHolder4;
                    viewHolder5.f278012j.setVisibility(8);
                    viewHolder5.f278012j.setEmojiInfo((IEmojiInfo) null);
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter";
                    viewHolder2 = viewHolder5;
                    charSequence = c;
                } else {
                    ViewHolder viewHolder6 = viewHolder4;
                    String K7 = SnsCommentDetailUI.m121962K7(SnsCommentDetailUI.this);
                    String N7 = SnsCommentDetailUI.m121965N7(SnsCommentDetailUI.this);
                    String str19 = w64.f299703d;
                    String str20 = w64.f299707h;
                    TextView textView2 = viewHolder6.f278006d;
                    if (snsInfo.getTimeLine() != null) {
                        str8 = snsInfo.getTimeLine().f283893Id;
                        str9 = str19;
                    } else {
                        str9 = str19;
                        str8 = null;
                    }
                    C96230u uVar = r7;
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter";
                    viewHolder2 = viewHolder6;
                    charSequence = c;
                    C96230u uVar2 = new C96230u(K7, N7, w64, str9, str20, textView2, 2, str16, str8);
                    viewHolder2.f278012j.setTag(uVar);
                    viewHolder2.f278012j.setVisibility(0);
                    viewHolder2.f278012j.setEmojiInfo(TO);
                    viewHolder2.f278012j.setOnClickListener(SnsCommentDetailUI.m121974W7(SnsCommentDetailUI.this).f280360P);
                }
                if (N2 == null || !C72996z1.m85843n5(N2.getUsername()) || !"3552365301".equals(N2.mo73980x2())) {
                    str6 = str17;
                    str5 = str6;
                    i4 = 0;
                    i3 = 0;
                } else {
                    int length = str17.length();
                    String wo = ((C76158j) C86312j.m106911c(cls)).mo106373wo(N2.mo73980x2(), N2.mo73976t2());
                    StringBuilder sb = new StringBuilder();
                    str6 = str17;
                    sb.append(str6);
                    sb.append(" @");
                    sb.append(wo);
                    str5 = sb.toString();
                    int i18 = length;
                    i3 = str5.length();
                    i4 = i18;
                }
                viewHolder2.f278004b.setText(str5, TextView.BufferType.SPANNABLE);
                int i19 = i17;
                ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(viewHolder2.f278004b, i19);
                C75375u uVar3 = new C75375u(viewHolder2.f278004b.getText());
                Log.m105925i("MicroMsg.SnsCommentDetailUI", "test %s,%s", w64.f299703d, str6);
                SnsInfo snsInfo2 = snsInfo;
                if (C98242p.m126943e(snsInfo2, w64.f299703d)) {
                    C102243e eVar = new C102243e(snsInfo2.isAd(), w64.f299703d, snsInfo2.getLocalid(), 2, C98242p.m126942d(w64.f299716t, 32) ? 27 : 2);
                    Activity activity = this.f278001f;
                    i5 = i2;
                    SnsCommentDetailUI snsCommentDetailUI7 = SnsCommentDetailUI.this;
                    str7 = "MicroMsg.SnsCommentDetailUI";
                    String str21 = str15;
                    SnsMethodCalculate.markStartTimeMs(str21, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    C96174r rVar2 = snsCommentDetailUI7.f277847L;
                    SnsMethodCalculate.markEndTimeMs(str21, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    uVar3.mo105705b(new C75360c0(activity, eVar, rVar2, i19), 0, str6.length() + 0, 33);
                } else {
                    i5 = i2;
                    str7 = "MicroMsg.SnsCommentDetailUI";
                    String str22 = str15;
                    Activity activity2 = this.f278001f;
                    String str23 = w64.f299703d;
                    SnsCommentDetailUI snsCommentDetailUI8 = SnsCommentDetailUI.this;
                    SnsMethodCalculate.markStartTimeMs(str22, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    C96174r rVar3 = snsCommentDetailUI8.f277847L;
                    SnsMethodCalculate.markEndTimeMs(str22, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    uVar3.mo105705b(new C75360c0(activity2, str23, rVar3, i19), 0, str6.length() + 0, 33);
                }
                if (i4 >= 0 && i3 > i4) {
                    uVar3.mo105705b(((C76158j) C86312j.m106911c(cls)).mo106367cY(SnsCommentDetailUI.this, N2.mo73980x2(), C74942w4.m89784a(SnsCommentDetailUI.this.getContext(), 12), C0966R.color.Orange_100), i4, i3, 33);
                }
                viewHolder2.f278004b.setText(uVar3, TextView.BufferType.SPANNABLE);
                long j = (long) w64.f299708i;
                if (C98242p.m126942d(w64.f299716t, 32)) {
                    j = (long) snsInfo2.getCreateTime();
                }
                viewHolder2.f278005c.setText("" + C96315x6.m123537c(this.f278001f, j * 1000));
                if (Util.isNullOrNil(charSequence)) {
                    i6 = 8;
                    viewHolder2.f278006d.setVisibility(8);
                } else {
                    i6 = 8;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append(charSequence2);
                    viewHolder2.f278006d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                    viewHolder2.f278006d.setVisibility(0);
                    C99591a.f291957a.mo138967b(viewHolder2.f278006d, viewHolder2.f278010h);
                }
                SnsCommentDetailUI snsCommentDetailUI9 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                C78253a aVar5 = snsCommentDetailUI9.f277852Q;
                SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                View view9 = view8;
                aVar5.mo108275j(view9, SnsCommentDetailUI.m121974W7(SnsCommentDetailUI.this).f280394x, SnsCommentDetailUI.m121974W7(SnsCommentDetailUI.this).f280381k);
                SnsCommentDetailUI snsCommentDetailUI10 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                C78253a aVar6 = snsCommentDetailUI10.f277852Q;
                SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                aVar6.mo108275j(viewHolder2.f278007e, SnsCommentDetailUI.m121974W7(SnsCommentDetailUI.this).f280394x, SnsCommentDetailUI.m121974W7(SnsCommentDetailUI.this).f280381k);
                int i25 = w64.f299709j;
                String d = C94965w1.m120623d(SnsCommentDetailUI.m121965N7(SnsCommentDetailUI.this), String.valueOf(i25 != 0 ? (long) i25 : w64.f299714r));
                if (C94965w1.m120626g(d, 4) && viewHolder2.f278008f != null) {
                    C94965w1.C94967b e = C94965w1.m120624e(d);
                    if (e != null) {
                        viewHolder2.f278008f.setVisibility(0);
                        if (!e.f275306d) {
                            viewHolder2.f278008f.mo133019j(2);
                        } else if (!e.f275307e) {
                            viewHolder2.f278008f.mo133013a(e, 2, e.f275304b, e.f275305c, e.f275310h);
                        } else {
                            viewHolder2.f278008f.setVisibility(i6);
                        }
                    } else {
                        viewHolder2.f278008f.setVisibility(i6);
                    }
                }
                view9.setClickable(true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("position ");
                sb4.append(w64.f299703d);
                sb4.append(" self ");
                SnsCommentDetailUI snsCommentDetailUI11 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                String str24 = snsCommentDetailUI11.f277837G;
                SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                sb4.append(str24);
                sb4.append(" commentid ");
                sb4.append(w64.f299709j);
                sb4.append(" snsid ");
                sb4.append(SnsCommentDetailUI.m121965N7(SnsCommentDetailUI.this));
                Log.m105918d(str7, sb4.toString());
                SnsCommentDetailUI snsCommentDetailUI12 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                String str25 = snsCommentDetailUI12.f277837G;
                SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                if (str25.equals(w64.f299703d)) {
                    viewHolder2.f278009g = w64;
                } else {
                    viewHolder2.f278009g = new Object[]{Integer.valueOf(i5), w64, w64.f299703d, str6};
                }
                String K72 = SnsCommentDetailUI.m121962K7(SnsCommentDetailUI.this);
                String N72 = SnsCommentDetailUI.m121965N7(SnsCommentDetailUI.this);
                String str26 = w64.f299703d;
                String str27 = w64.f299707h;
                w64 w642 = w64;
                w64 w643 = w64;
                view3 = view9;
                SnsInfo snsInfo3 = snsInfo2;
                C75375u uVar4 = uVar3;
                C96230u uVar5 = new C96230u(K72, N72, w642, str26, str27, viewHolder2.f278006d, 2, str16, snsInfo2.getTimeLine() != null ? snsInfo2.getTimeLine().f283893Id : null);
                uVar5.f281196f = viewHolder2;
                view3.setTag(uVar5);
                viewHolder2.f278006d.setTag(uVar5);
                SnsCommentDetailUI snsCommentDetailUI13 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                View.OnClickListener onClickListener2 = snsCommentDetailUI13.f277912w1;
                SnsMethodCalculate.markEndTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                view3.setOnClickListener(onClickListener2);
                C75355a0 a0Var = new C75355a0(SnsCommentDetailUI.this);
                w64 w644 = w643;
                if (C98242p.m126943e(snsInfo3, w644.f299703d)) {
                    SnsCommentDetailUI snsCommentDetailUI14 = SnsCommentDetailUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$6200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    C75354a aVar7 = snsCommentDetailUI14.f277848L1;
                    SnsMethodCalculate.markEndTimeMs("access$6200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    a0Var.f221527n = aVar7;
                    a0Var.f221528o = 0;
                    a0Var.f221529p = 31;
                }
                viewHolder2.f278006d.setOnTouchListener(a0Var);
                viewHolder2.f278007e.setTag(uVar5);
                FrameLayout frameLayout = viewHolder2.f278007e;
                SnsCommentDetailUI snsCommentDetailUI15 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                View.OnClickListener onClickListener3 = snsCommentDetailUI15.f277912w1;
                SnsMethodCalculate.markEndTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                frameLayout.setOnClickListener(onClickListener3);
                if (!snsInfo3.isAd() && w644.f299715s > 0) {
                    C75375u uVar6 = uVar4;
                    uVar6.mo105705b(new ForegroundColorSpan(SnsCommentDetailUI.this.getContext().getResources().getColor(C0966R.color.BW_50)), 0, uVar4.length(), 33);
                    viewHolder2.f278004b.setText(uVar6);
                    TextView textView3 = viewHolder2.f278006d;
                    AppCompatActivity context = SnsCommentDetailUI.this.getContext();
                    SnsMethodCalculate.markStartTimeMs("getDeletedCommentNoUsernameSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                    String string = context.getResources().getString(C0966R.string.jbf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.BW_50)), 0, string.length(), 0);
                    spannableStringBuilder2.setSpan(new BackgroundColorSpan(context.getResources().getColor(C0966R.color.BW_90)), 0, string.length(), 0);
                    SnsMethodCalculate.markEndTimeMs("getDeletedCommentNoUsernameSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
                    textView3.setText(spannableStringBuilder2);
                    viewHolder2.f278006d.setOnTouchListener((View.OnTouchListener) null);
                    viewHolder2.f278007e.setOnLongClickListener((View.OnLongClickListener) null);
                    viewHolder2.f278007e.setOnClickListener((View.OnClickListener) null);
                    view3.setOnClickListener((View.OnClickListener) null);
                    view3.setOnLongClickListener((View.OnLongClickListener) null);
                }
                str3 = str18;
                str2 = str4;
            } else {
                view3 = view2;
                str3 = "getView";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter";
            }
            SnsMethodCalculate.markEndTimeMs(str3, str2);
            return view3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp */
    public class ScrollUp implements Runnable {

        /* renamed from: d */
        public int f278013d = -1;

        /* renamed from: e */
        public int f278014e = 10;

        /* renamed from: f */
        public int f278015f = 0;

        /* renamed from: g */
        public int f278016g = -1;

        /* renamed from: h */
        public int f278017h;

        public ScrollUp() {
        }

        /* renamed from: a */
        public void mo132674a(int i) {
            SnsMethodCalculate.markStartTimeMs("setScrollPosition", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
            this.f278016g = i;
            SnsMethodCalculate.markEndTimeMs("setScrollPosition", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
            this.f278014e = 10;
            SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
            int i = SnsCommentDetailUI.f277824M1;
            SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            snsCommentDetailUI.f277919z = true;
            SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            int top = SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).getTop();
            this.f278013d = top;
            int i2 = top - this.f278017h;
            SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            int i3 = snsCommentDetailUI2.f277916y;
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            Log.m105925i("MicroMsg.SnsCommentDetailUI", "list.bottom: %d, listOriginalBottom: %d, footerTop: %d, commentFooter.getTop: %d, topSelection: %d", Integer.valueOf(SnsCommentDetailUI.m121976Y7(SnsCommentDetailUI.this).getBottom()), Integer.valueOf(i3), Integer.valueOf(this.f278013d), Integer.valueOf(SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).getTop()), Integer.valueOf(i2));
            if (i2 == this.f278015f) {
                SnsCommentDetailUI.m121976Y7(SnsCommentDetailUI.this).setSelectionFromTop(SnsCommentDetailUI.m121976Y7(SnsCommentDetailUI.this).getHeaderViewsCount() + this.f278016g, i2);
                this.f278014e = 0;
                this.f278015f = 0;
            } else {
                int i4 = this.f278014e;
                this.f278014e = i4 - 1;
                if (i4 > 0) {
                    new MMHandler().postDelayed(this, 100);
                    this.f278015f = i2;
                } else {
                    this.f278015f = 0;
                    this.f278014e = 0;
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        }
    }

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59346b = true;
        bVar.f59345a = true;
        bVar.mo32666a();
        new C100073d() {
            /* renamed from: r */
            public C101535a<Bitmap> mo132665r() {
                SnsMethodCalculate.markStartTimeMs("getHeadResourceTranscoder", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$6");
                C101539c cVar = new C101539c(true, 0.5f);
                cVar.f297267c = C101536b.C101538b.DECODED;
                C101535a<Bitmap> aVar = new C101535a<>(cVar);
                SnsMethodCalculate.markEndTimeMs("getHeadResourceTranscoder", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$6");
                return aVar;
            }
        };
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59346b = true;
        bVar2.f59345a = true;
        bVar2.mo32666a();
    }

    public SnsCommentDetailUI() {
        C40008f fVar = C40008f.f107254d;
        this.f277893n1 = new IListener<SnsTranslateFinishEvent>(fVar) {
            {
                this.__eventId = 2139223297;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                SnsTranslateFinishEvent snsTranslateFinishEvent = (SnsTranslateFinishEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                if (snsTranslateFinishEvent instanceof SnsTranslateFinishEvent) {
                    SnsTranslateFinishEvent.C92595a aVar = snsTranslateFinishEvent.f265201d;
                    String str = aVar.f265203b;
                    String str2 = aVar.f265204c;
                    String str3 = aVar.f265205d;
                    int i = aVar.f265202a;
                    if (i == 1) {
                        SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                        int i2 = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        SnsMethodCalculate.markStartTimeMs("finishPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        SnsInfo f8 = snsCommentDetailUI.mo132619f8(false);
                        if (f8 == null || !f8.getSnsId().equals(str)) {
                            SnsMethodCalculate.markEndTimeMs("finishPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            if (Util.isNullOrNil(str2)) {
                                snsCommentDetailUI.f277917y0.setVisibility(8);
                            } else {
                                C94965w1.m120620a(str, 4);
                                C94965w1.C94967b e = C94965w1.m120624e(str);
                                snsCommentDetailUI.f277917y0.setVisibility(0);
                                snsCommentDetailUI.f277917y0.mo133013a(e, 1, str2, str3, e.f275310h);
                            }
                            snsCommentDetailUI.f277881g.setTag(new C96113p5(snsCommentDetailUI.f277829C, f8.getLocalid(), true, false, 2));
                            SnsMethodCalculate.markEndTimeMs("finishPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        }
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else if (i == 2) {
                        SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                        int i3 = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("finishCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        C94965w1.m120620a(str, 4);
                        CommentListAdapter commentListAdapter = snsCommentDetailUI2.f277901r;
                        if (commentListAdapter != null) {
                            commentListAdapter.notifyDataSetChanged();
                        }
                        SnsMethodCalculate.markEndTimeMs("finishCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$1");
                return false;
            }
        };
        this.f277895o1 = new IListener<SnsTranslateStartEvent>(fVar) {
            {
                this.__eventId = 1200144606;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                SnsTranslateStartEvent snsTranslateStartEvent = (SnsTranslateStartEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                if (snsTranslateStartEvent instanceof SnsTranslateStartEvent) {
                    SnsTranslateStartEvent.C92597a aVar = snsTranslateStartEvent.f265208d;
                    String str = aVar.f265210b;
                    int i = aVar.f265209a;
                    if (i == 1) {
                        SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                        int i2 = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        SnsMethodCalculate.markStartTimeMs("startPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (!snsCommentDetailUI.mo132619f8(false).getSnsId().equals(str)) {
                            SnsMethodCalculate.markEndTimeMs("startPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            snsCommentDetailUI.f277917y0.setVisibility(0);
                            snsCommentDetailUI.f277917y0.mo133019j(1);
                            SnsMethodCalculate.markEndTimeMs("startPostDescTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        }
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else if (i == 2) {
                        SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                        int i3 = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("startCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        C94965w1.m120620a(str, 4);
                        CommentListAdapter commentListAdapter = snsCommentDetailUI2.f277901r;
                        if (commentListAdapter != null) {
                            commentListAdapter.notifyDataSetChanged();
                        }
                        SnsMethodCalculate.markEndTimeMs("startCommentTranslate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$2");
                return false;
            }
        };
        this.f277898p1 = new IListener<SnsUnTranslateEvent>(fVar) {
            {
                this.__eventId = -868441523;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                SnsUnTranslateEvent snsUnTranslateEvent = (SnsUnTranslateEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                if (snsUnTranslateEvent instanceof SnsUnTranslateEvent) {
                    SnsUnTranslateEvent.C92598a aVar = snsUnTranslateEvent.f265211d;
                    String str = aVar.f265213b;
                    int i = aVar.f265212a;
                    if (i == 1) {
                        SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                        int i2 = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI.getClass();
                        SnsMethodCalculate.markStartTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        SnsInfo f8 = snsCommentDetailUI.mo132619f8(false);
                        if (!f8.getSnsId().equals(str)) {
                            SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            C94965w1.m120629j(str, 4);
                            snsCommentDetailUI.f277917y0.setVisibility(8);
                            snsCommentDetailUI.f277881g.setTag(new C96113p5(snsCommentDetailUI.f277829C, f8.getLocalid(), true, false, 2));
                            SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        }
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else if (i == 2) {
                        SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                        int i3 = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        snsCommentDetailUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        C94965w1.m120629j(str, 4);
                        CommentListAdapter commentListAdapter = snsCommentDetailUI2.f277901r;
                        if (commentListAdapter != null) {
                            commentListAdapter.notifyDataSetChanged();
                        }
                        SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$3");
                return false;
            }
        };
        this.f277900q1 = new IListener<GalleryPhotoInfoEvent>(fVar) {
            {
                this.__eventId = 1036677180;
            }

            public boolean callback(IEvent iEvent) {
                TagImageView tagImageView;
                int i;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
                GalleryPhotoInfoEvent galleryPhotoInfoEvent = (GalleryPhotoInfoEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
                if (galleryPhotoInfoEvent instanceof GalleryPhotoInfoEvent) {
                    GalleryPhotoInfoEvent.C92522a aVar = galleryPhotoInfoEvent.f264882d;
                    int i2 = aVar.f264885b;
                    int i3 = aVar.f264884a;
                    SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                    int i4 = SnsCommentDetailUI.f277824M1;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    snsCommentDetailUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    if (i3 == -1) {
                        SnsInfo f8 = snsCommentDetailUI.mo132619f8(false);
                        if (f8 == null) {
                            SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        } else {
                            C101789j00 j002 = f8.getTimeLine().ContentObj;
                            if (j002.f298424e == 1 && j002.f298427h.size() == 4 && i2 > 1 && (i = i2 + 1) < 9) {
                                i2 = i;
                            }
                            PhotosContent photosContent = snsCommentDetailUI.f277840H1;
                            if (!(photosContent == null || (tagImageView = (TagImageView) photosContent.findViewById(C95713a5.f279140f[i2])) == null)) {
                                int[] iArr = new int[2];
                                tagImageView.getLocationOnScreen(iArr);
                                GalleryPhotoInfoEvent.C92523b bVar = galleryPhotoInfoEvent.f264883e;
                                bVar.f264888a = iArr[0];
                                bVar.f264889b = iArr[1];
                                bVar.f264890c = tagImageView.getWidth();
                                galleryPhotoInfoEvent.f264883e.f264891d = tagImageView.getHeight();
                            }
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$4");
                return false;
            }
        };
        this.f277902r1 = new IListener<SnsAdListScrollEvent>(fVar) {
            {
                this.__eventId = 574649668;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                SnsAdListScrollEvent snsAdListScrollEvent = (SnsAdListScrollEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                if ((snsAdListScrollEvent instanceof SnsAdListScrollEvent) && SnsCommentDetailUI.m121976Y7(SnsCommentDetailUI.this) != null) {
                    SnsCommentDetailUI.m121976Y7(SnsCommentDetailUI.this).requestDisallowInterceptTouchEvent(!snsAdListScrollEvent.f265121d.f265122a);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$5");
                return false;
            }
        };
        this.f277904s1 = new ScrollUp();
        this.f277906t1 = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
                r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121959H7(r6.f277992d).getCount() - 1) + com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121976Y7(r6.f277992d).getHeaderViewsCount();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                    java.lang.String r0 = "run"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    android.widget.ListView r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121976Y7(r2)
                    if (r2 == 0) goto L_0x0056
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121959H7(r2)
                    if (r2 == 0) goto L_0x0056
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121959H7(r2)
                    int r2 = r2.getCount()
                    int r2 = r2 + -1
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121976Y7(r3)
                    int r3 = r3.getHeaderViewsCount()
                    int r2 = r2 + r3
                    if (r2 < 0) goto L_0x0056
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    com.tencent.mm.plugin.sns.ui.SnsCommentFooter r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121977Z7(r3)
                    boolean r3 = r3.hasFocus()
                    if (r3 == 0) goto L_0x0046
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    android.widget.ListView r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121976Y7(r4)
                    r4.requestFocus()
                L_0x0046:
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    android.widget.ListView r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121976Y7(r4)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7$1 r5 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7$1
                    r5.<init>(r2, r3)
                    r2 = 0
                    r4.postDelayed(r5, r2)
                L_0x0056:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.C955247.run():void");
            }
        };
        this.f277908u1 = new View.OnClickListener() {
            public void onClick(View view) {
                ADXml adXml;
                int i;
                View view2 = view;
                Class cls = C11502f.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view2);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                String str = (String) view.getTag();
                Log.m105918d("MicroMsg.SnsCommentDetailUI", "onCommentClick:" + str);
                SnsInfo I7 = SnsCommentDetailUI.m121960I7(SnsCommentDetailUI.this, true);
                Object tag = view2.getTag(C0966R.C0970id.mlz);
                boolean booleanValue = tag instanceof Boolean ? ((Boolean) tag).booleanValue() : false;
                Object tag2 = view2.getTag(C0966R.C0970id.o3p);
                boolean booleanValue2 = tag2 instanceof Boolean ? ((Boolean) tag2).booleanValue() : false;
                if (I7 == null || !I7.isAd() || (!booleanValue && !booleanValue2)) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", str);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, SnsCommentDetailUI.this);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                try {
                    TimeLineObject timeLine = I7.getTimeLine();
                    if (C54550e.m61296a(I7) && ((i = timeLine.ContentObj.f298424e) == 15 || i == 5)) {
                        SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                        snsAdLivingStreamJumpEvent.f154872d.f154873a = C102236a0.m134728W(I7);
                        snsAdLivingStreamJumpEvent.publish();
                    }
                } catch (Throwable unused) {
                }
                String str2 = "Contact_User";
                SnsAdClick snsAdClick = new SnsAdClick(SnsCommentDetailUI.this.mo132622j8(), 2, I7.field_snsId, 1, 0);
                C102260r.m134864d(snsAdClick, SnsCommentDetailUI.m121961J7(SnsCommentDetailUI.this), I7, 1);
                if (booleanValue2) {
                    SnsMethodCalculate.markStartTimeMs("setSnsAdClickPos", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
                    snsAdClick.f267472g = 43;
                    SnsMethodCalculate.markEndTimeMs("setSnsAdClickPos", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
                }
                if (!(str == null || !str.equals(I7.getUserName()) || (adXml = I7.getAdXml()) == null)) {
                    if (adXml.headClickType != 1 || Util.isNullOrNil(adXml.headClickParam)) {
                        C101914d dVar = new C101914d();
                        dVar.mo141404b("ext_sns_ad_click", snsAdClick);
                        C101913c b = C101911a.m134113b(SnsCommentDetailUI.this);
                        if (b != null && b.mo126055b(view2, SnsCommentDetailUI.this.mo132622j8(), I7, dVar)) {
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    } else {
                        String str3 = adXml.headClickParam;
                        SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        ADInfo g8 = snsCommentDetailUI.mo132620g8(I7);
                        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (g8 != null) {
                            str3 = C102236a0.m134734b(str3, g8.uxInfo);
                        }
                        Log.m105924i("MicroMsg.SnsCommentDetailUI", "headClickParam url " + str3 + " " + adXml.headClickRightBarShow);
                        Intent intent2 = new Intent();
                        boolean z = adXml.headClickRightBarShow == 0;
                        SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        ADInfo g84 = snsCommentDetailUI2.mo132620g8(I7);
                        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        intent2.putExtra("KsnsViewId", g84.viewId);
                        intent2.putExtra("KRightBtn", z);
                        intent2.putExtra("jsapiargs", new Bundle());
                        intent2.putExtra("rawUrl", str3);
                        intent2.putExtra("useJs", true);
                        C102236a0.m134732a(intent2, 82);
                        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93190w(intent2, SnsCommentDetailUI.this);
                        C102236a0.m134773u0(snsAdClick);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                C101431r.m133118a(snsAdClick, 40);
                C102236a0.m134773u0(snsAdClick);
                Intent intent3 = new Intent();
                intent3.putExtra(str2, str);
                intent3.putExtra("Contact_Scene", 37);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent3, SnsCommentDetailUI.this);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$8");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        this.f277910v1 = new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$9");
                Log.m105920e("MicroMsg.SnsCommentDetailUI", "header scrollTopClickListener");
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.mo132632s8();
                SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                boolean z = snsCommentDetailUI2.f277919z;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                if (!z) {
                    Log.m105918d("MicroMsg.SnsCommentDetailUI", "scrollDownClickListener stateFooterHasUp false");
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$9");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                SnsCommentDetailUI snsCommentDetailUI3 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI3.getClass();
                SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI3.mo132630q8(true);
                SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$9");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        this.f277912w1 = new View.OnClickListener() {
            public void onClick(View view) {
                boolean z;
                String str;
                String str2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$14");
                Log.m105920e("MicroMsg.SnsCommentDetailUI", "itemView scrollTopClickListener");
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.getClass();
                SnsMethodCalculate.markStartTimeMs("processItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                CommentListAdapter.ViewHolder viewHolder = view.getTag() instanceof C96230u ? (CommentListAdapter.ViewHolder) ((C96230u) view.getTag()).f281196f : null;
                if (viewHolder == null) {
                    SnsMethodCalculate.markEndTimeMs("processItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                } else {
                    Object obj = viewHolder.f278009g;
                    if (obj instanceof w64) {
                        if (snsCommentDetailUI.f277919z) {
                            snsCommentDetailUI.mo132630q8(false);
                        }
                        w64 w64 = (w64) viewHolder.f278009g;
                        String charSequence = viewHolder.f278006d.getText().toString();
                        SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (C98242p.m126942d(w64.f299716t, 64)) {
                            C76879j.m92734e(snsCommentDetailUI.getContext(), (String) null, new String[]{snsCommentDetailUI.getContext().getString(C0966R.string.f7944x1)}, (String) null, snsCommentDetailUI.getContext().getString(C0966R.string.f7926wf), new C76879j.C11180n(w64) {

                                /* renamed from: a */
                                public final /* synthetic */ w64 f277924a;

                                {
                                    this.f277924a = r2;
                                }

                                /* renamed from: j */
                                public void mo782j(int i) {
                                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11");
                                    if (i == 0) {
                                        SnsCommentDetailUI.m121964M7(SnsCommentDetailUI.this, this.f277924a);
                                    }
                                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$11");
                                }
                            });
                        } else {
                            C76879j.m92734e(snsCommentDetailUI.getContext(), (String) null, new String[]{snsCommentDetailUI.getContext().getString(C0966R.string.f7936wt), snsCommentDetailUI.getContext().getString(C0966R.string.f7944x1)}, (String) null, snsCommentDetailUI.getContext().getString(C0966R.string.f7926wf), new C76879j.C11180n(charSequence, w64) {

                                /* renamed from: a */
                                public final /* synthetic */ CharSequence f277926a;

                                /* renamed from: b */
                                public final /* synthetic */ w64 f277927b;

                                {
                                    this.f277926a = r2;
                                    this.f277927b = r3;
                                }

                                /* renamed from: j */
                                public void mo782j(int i) {
                                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$12");
                                    if (i != 0) {
                                        if (i == 1) {
                                            SnsCommentDetailUI.m121964M7(SnsCommentDetailUI.this, this.f277927b);
                                        }
                                    } else if (ClipboardHelper.setTextSwallowException(this.f277926a)) {
                                        C76879j.m92726T(SnsCommentDetailUI.this.getContext(), SnsCommentDetailUI.this.getContext().getString(C0966R.string.f7938wv));
                                        String unsignedLongString = Util.getUnsignedLongString(C100417r0.m131425n(SnsCommentDetailUI.m121965N7(SnsCommentDetailUI.this)));
                                        if (!(this.f277927b == null || this.f277926a == null || unsignedLongString == null)) {
                                            C46562a aVar = C46562a.INSTANCE;
                                            aVar.F80(4, unsignedLongString + XVFSFile.PATH_SEPARATOR + this.f277927b.f299709j, Util.getUTF8ByteLength(this.f277926a.toString()));
                                        }
                                    } else {
                                        C76879j.m92726T(SnsCommentDetailUI.this.getContext(), SnsCommentDetailUI.this.getContext().getString(C0966R.string.f7937wu));
                                    }
                                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$12");
                                }
                            });
                        }
                        SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else if (obj instanceof Object[]) {
                        Object[] objArr = (Object[]) obj;
                        SnsCommentFooter snsCommentFooter = snsCommentDetailUI.f277913x;
                        String str3 = (String) objArr[2];
                        snsCommentFooter.getClass();
                        SnsMethodCalculate.markStartTimeMs("isReplyingTheSameUser", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        w64 w642 = snsCommentFooter.f278059r;
                        if ((w642 == null || (str2 = w642.f299703d) == null || !str2.equals(str3)) && !snsCommentFooter.mo132716t()) {
                            SnsMethodCalculate.markEndTimeMs("isReplyingTheSameUser", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                            z = false;
                        } else {
                            SnsMethodCalculate.markEndTimeMs("isReplyingTheSameUser", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                            z = true;
                        }
                        if (z) {
                            w64 w643 = (w64) objArr[1];
                            SnsInfo b = C100416r.m131409b(snsCommentDetailUI.f277831D);
                            snsCommentDetailUI.f277913x.mo132719x(0);
                            SnsCommentFooter snsCommentFooter2 = snsCommentDetailUI.f277913x;
                            snsCommentFooter2.setCommentHint(snsCommentDetailUI.getString(C0966R.string.jgh) + objArr[3]);
                            if (b != null && b.isAd() && (str = w643.f299703d) != null && str.equals(b.getUserName())) {
                                snsCommentDetailUI.f277913x.mo132719x(1);
                            }
                            snsCommentDetailUI.f277913x.setCommentInfo(w643);
                            snsCommentDetailUI.f277913x.setSnsInfo(b);
                            snsCommentDetailUI.f277913x.mo132680B(false);
                            snsCommentDetailUI.f277913x.setToSendTextColor(true);
                            snsCommentDetailUI.f277913x.mo132683E(true);
                            int intValue = ((Integer) objArr[0]).intValue();
                            if (C94897n1.m120367e(b).LikeUserList.size() > 0 && (intValue = intValue + 1) > snsCommentDetailUI.f277901r.getCount()) {
                                intValue = snsCommentDetailUI.f277901r.getCount() - 1;
                            }
                            snsCommentDetailUI.f277904s1.mo132674a(intValue);
                            ScrollUp scrollUp = snsCommentDetailUI.f277904s1;
                            int height = view.getHeight();
                            scrollUp.getClass();
                            SnsMethodCalculate.markStartTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
                            scrollUp.f278017h = height;
                            SnsMethodCalculate.markEndTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
                            snsCommentDetailUI.mo132631r8();
                        } else {
                            C76879j.m92734e(snsCommentDetailUI, (String) null, new String[]{snsCommentDetailUI.getString(C0966R.string.jgh) + objArr[3]}, (String) null, snsCommentDetailUI.getString(C0966R.string.f7926wf), new C76879j.C11180n(objArr) {

                                /* renamed from: a */
                                public final /* synthetic */ Object[] f277922a;

                                {
                                    this.f277922a = r2;
                                }

                                /* renamed from: j */
                                public void mo782j(int i) {
                                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10");
                                    if (i == 0) {
                                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132719x(0);
                                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132696p();
                                        SnsCommentFooter Z7 = SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this);
                                        Z7.setCommentHint(SnsCommentDetailUI.this.getString(C0966R.string.jgh) + this.f277922a[3]);
                                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setCommentInfo((w64) this.f277922a[1]);
                                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132680B(false);
                                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setToSendTextColor(true);
                                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132683E(true);
                                        int intValue = ((Integer) this.f277922a[0]).intValue();
                                        if (C94897n1.m120367e(C100416r.m131409b(SnsCommentDetailUI.m121962K7(SnsCommentDetailUI.this))).LikeUserList.size() > 0 && (intValue = intValue + 1) > SnsCommentDetailUI.m121959H7(SnsCommentDetailUI.this).getCount()) {
                                            intValue = SnsCommentDetailUI.m121959H7(SnsCommentDetailUI.this).getCount() - 1;
                                        }
                                        SnsCommentDetailUI.m121963L7(SnsCommentDetailUI.this).mo132674a(intValue);
                                        SnsCommentDetailUI.m121963L7(SnsCommentDetailUI.this).run();
                                    }
                                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$10");
                                }
                            });
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("processItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                }
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$14");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        this.f277915x1 = new IListener<SnsLuckyPayNotifyEvent>(fVar) {
            {
                this.__eventId = -702066263;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$19");
                SnsLuckyPayNotifyEvent snsLuckyPayNotifyEvent = (SnsLuckyPayNotifyEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$19");
                SnsCommentDetailUI.this.mo132635v8();
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$19");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$19");
                return false;
            }
        };
        this.f277918y1 = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
                if (r7 != 7) goto L_0x0075;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$20"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r7 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r7
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    boolean r2 = r7 instanceof com.tencent.p014mm.autogen.events.MusicPlayerEvent
                    if (r2 == 0) goto L_0x0075
                    com.tencent.mm.autogen.events.MusicPlayerEvent$a r7 = r7.f9336d
                    int r7 = r7.f9337a
                    java.lang.String r2 = "access$3200"
                    java.lang.String r3 = "access$3100"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
                    if (r7 == 0) goto L_0x005d
                    r5 = 1
                    if (r7 == r5) goto L_0x005d
                    r5 = 2
                    if (r7 == r5) goto L_0x005d
                    r5 = 3
                    if (r7 == r5) goto L_0x005d
                    r5 = 4
                    if (r7 == r5) goto L_0x002c
                    r5 = 7
                    if (r7 == r5) goto L_0x005d
                    goto L_0x0075
                L_0x002c:
                    java.lang.String r7 = "MicroMsg.SnsCommentDetailUI"
                    java.lang.String r5 = "musicPlayerListener error"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    int r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.f277824M1
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    r7.mo132638y8()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
                    r7.mo132637x8()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    androidx.appcompat.app.AppCompatActivity r2 = r7.getContext()
                    r3 = 2131833332(0x7f1131f4, float:1.9299743E38)
                    java.lang.String r2 = r2.getString(r3)
                    com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.m121971T7(r7, r2)
                    goto L_0x0075
                L_0x005d:
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    int r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.f277824M1
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    r7.mo132638y8()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.this
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
                    r7.mo132637x8()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
                L_0x0075:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r7 = 0
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.C9549120.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f277920z1 = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                Log.m105924i("MicroMsg.SnsCommentDetailUI", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.SnsCommentDetailUI", "musicCheckErrorListener, must has error.");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                } else {
                    SnsCommentDetailUI.m121971T7(SnsCommentDetailUI.this, !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : SnsCommentDetailUI.this.getContext().getString(C0966R.string.f361077h32));
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$21");
                return false;
            }
        };
        this.f277826A1 = new IListener<FullScreenHelperEvent>(this, fVar) {
            {
                this.__eventId = 1752709249;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                boolean z = ((FullScreenHelperEvent) iEvent) instanceof FullScreenHelperEvent;
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$22");
                return false;
            }
        };
        this.f277828B1 = new ScreenShotUtil.ScreenShotCallback() {
            public void onScreenShot(String str, long j) {
                SnsMethodCalculate.markStartTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
                Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "onScreenShot， path = " + str + "， dateAdded = " + j);
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.getClass();
                SnsMethodCalculate.markStartTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                try {
                    SnsInfo f8 = snsCommentDetailUI.mo132619f8(false);
                    if (f8 != null) {
                        if (f8.isAd()) {
                            String nullAsNil = Util.nullAsNil(f8.getAdInfo().uxInfo);
                            Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "uxInfo = " + nullAsNil);
                            String a = C98784a.m128574a(String.valueOf(2), nullAsNil, "");
                            Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "reportScreenShotParams = " + a);
                            C115669n.INSTANCE.kvStat(19213, a);
                            SnsMethodCalculate.markEndTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            SnsMethodCalculate.markEndTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.SnsCommentDetailUI.ScreenShot", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$23");
            }
        };
        this.f277832D1 = false;
        this.f277834E1 = null;
        this.f277836F1 = -1;
        this.f277838G1 = false;
        this.f277840H1 = null;
        this.f277842I1 = 0;
        this.f277844J1 = new C75597w2.C31525a() {
            /* renamed from: a */
            public void mo1109a(final String str, final boolean z) {
                SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35");
                Log.m105924i("MicroMsg.SnsCommentDetailUI", "setAvatar, getContactCallBack, userName=" + str + ", succ=" + z + ", retryCount=" + SnsCommentDetailUI.this.f277842I1);
                new MMHandler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35$1");
                        if (z && !SnsCommentDetailUI.this.isFinishing() && SnsCommentDetailUI.this.f277842I1 < 5) {
                            Log.m105924i("MicroMsg.SnsCommentDetailUI", "setAvatar, setHeader after getContact, userName=" + str);
                            SnsCommentDetailUI.this.mo132635v8();
                        }
                        SnsCommentDetailUI.this.f277842I1++;
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35$1");
                    }
                }, 500);
                SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$35");
            }
        };
        this.f277846K1 = null;
        this.f277848L1 = new C75354a() {
            /* renamed from: a */
            public void mo105675a(int i, int i2) {
                SnsMethodCalculate.markStartTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$36");
                try {
                    SnsInfo I7 = SnsCommentDetailUI.m121960I7(SnsCommentDetailUI.this, false);
                    if (I7 != null) {
                        Log.m105924i("AdTagClickableHelper", "In SnsCommentDetailUI, snsId = " + I7.field_snsId + ", source = " + SnsCommentDetailUI.this.mo132622j8() + ", clickPos = " + i2);
                        SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                        C98994k.m128904b(snsCommentDetailUI, snsCommentDetailUI.mo132622j8(), I7, i2);
                    } else {
                        Log.m105920e("AdTagClickableHelper", "In SnsCommentDetailUI, snsInfo is null");
                    }
                } catch (Throwable th) {
                    Log.m105920e("AdTagClickableHelper", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("doAdTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$36");
            }
        };
    }

    /* renamed from: H7 */
    public static /* synthetic */ CommentListAdapter m121959H7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        CommentListAdapter commentListAdapter = snsCommentDetailUI.f277901r;
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return commentListAdapter;
    }

    /* renamed from: I7 */
    public static /* synthetic */ SnsInfo m121960I7(SnsCommentDetailUI snsCommentDetailUI, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsInfo f8 = snsCommentDetailUI.mo132619f8(z);
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return f8;
    }

    /* renamed from: J7 */
    public static /* synthetic */ C98963o m121961J7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C98963o oVar = snsCommentDetailUI.f277866X;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return oVar;
    }

    /* renamed from: K7 */
    public static /* synthetic */ String m121962K7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        String str = snsCommentDetailUI.f277831D;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return str;
    }

    /* renamed from: L7 */
    public static /* synthetic */ ScrollUp m121963L7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ScrollUp scrollUp = snsCommentDetailUI.f277904s1;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return scrollUp;
    }

    /* renamed from: M7 */
    public static void m121964M7(SnsCommentDetailUI snsCommentDetailUI, w64 w64) {
        String str;
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        StringBuilder sb = new StringBuilder();
        sb.append("del snsId:");
        sb.append(snsCommentDetailUI.f277829C);
        sb.append(" commentId:");
        int i = 0;
        sb.append(w64 != null ? w64.f299709j : 0);
        Log.m105920e("MicroMsg.SnsCommentDetailUI", sb.toString());
        final C94877g0 g0Var = new C94877g0(C100417r0.m131425n(snsCommentDetailUI.f277829C), C100417r0.m131418g(snsCommentDetailUI.f277829C) ? 4 : 6, w64);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(g0Var);
        snsCommentDetailUI.f277841I = C76879j.m92723Q(snsCommentDetailUI, snsCommentDetailUI.getString(C0966R.string.a3h), snsCommentDetailUI.getString(C0966R.string.jbm), true, true, new DialogInterface.OnCancelListener(snsCommentDetailUI) {
            public void onCancel(DialogInterface dialogInterface) {
                SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$13");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d(g0Var);
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$13");
            }
        });
        SnsReportHelper.f275506m0.mo131361V().f265947r = 4;
        SnsInfo a = C100416r.m131408a(snsCommentDetailUI.f277829C);
        if (w64 != null) {
            i = w64.f299709j;
            str = w64.f299703d;
        } else {
            str = "";
        }
        SnsReportHelper.f275506m0.mo131353N(a, i, str, 1);
        SnsMethodCalculate.markEndTimeMs("dealWithDelete", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: N7 */
    public static /* synthetic */ String m121965N7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        String str = snsCommentDetailUI.f277829C;
        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return str;
    }

    /* renamed from: O7 */
    public static void m121966O7(SnsCommentDetailUI snsCommentDetailUI, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        AdSocialAttitudeView adSocialAttitudeView;
        SnsCommentDetailUI snsCommentDetailUI2 = snsCommentDetailUI;
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("dealWithLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (!C100417r0.m131419h(snsCommentDetailUI2.f277829C)) {
            SnsMethodCalculate.markEndTimeMs("dealWithLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            str = "access$2400";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
        } else {
            SnsInfo a = C100416r.m131408a(snsCommentDetailUI2.f277829C);
            if (a != null) {
                if (a.isSocialAttitudeAd()) {
                    C100165c cVar = snsCommentDetailUI2.f277864W;
                    if (cVar instanceof C100173h) {
                        C100173h hVar = (C100173h) cVar;
                        hVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                        C100151a.C100155d dVar = hVar.f293468s;
                        if (dVar == null || (adSocialAttitudeView = dVar.f293348D) == null) {
                            SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                        } else {
                            SnsMethodCalculate.markStartTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            SnsInfo snsInfo = adSocialAttitudeView.f274335x;
                            if (snsInfo != null) {
                                a.setLikeFlag(snsInfo.getLikeFlag());
                            }
                            SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            SnsMethodCalculate.markEndTimeMs("resetSnsInfoLikeFlag", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                        }
                    }
                }
                if (a.isAd()) {
                    if (a.getLikeFlag() == 0) {
                        C99567r.f291863a.mo138938b(a);
                    } else {
                        C99567r.f291863a.mo138939c(a);
                    }
                }
                if (a.getLikeFlag() == 0) {
                    a.setLikeFlag(1);
                    snsCommentDetailUI2.f277886i1 = true;
                    C100416r.m131411d(a.getSnsId(), a);
                    C5431p1.C5432a.m5340k(a, a.isAd() ? 7 : 1, "", snsCommentDetailUI.mo132622j8());
                    snsCommentDetailUI2.f277901r.notifyDataSetChanged();
                    SnsReportHelper.f275506m0.mo131361V().f265948s = 3;
                    C94891k2.f274975a.mo131069b(a, 3);
                } else {
                    a.setLikeFlag(0);
                    C100416r.m131411d(a.getSnsId(), a);
                    C5431p1.C5432a.m5338a(a.getSnsId());
                    SnsReportHelper.f275506m0.mo131361V().f265948s = 5;
                }
                LinearLayout linearLayout = snsCommentDetailUI2.f277909v;
                if (linearLayout != null) {
                    WeImageView weImageView = (WeImageView) linearLayout.findViewById(C0966R.C0970id.f5730n2);
                    TextView textView = (TextView) snsCommentDetailUI2.f277909v.findViewById(C0966R.C0970id.f5732n4);
                    if (a.getLikeFlag() == 1) {
                        if (snsCommentDetailUI2.f277875d) {
                            weImageView.setImageResource(C0966R.raw.icons_filled_like);
                            weImageView.setIconColor(snsCommentDetailUI.getContext().getResources().getColor(C0966R.color.f2966ao));
                            weImageView.setPadding(0, 0, 0, 0);
                        }
                        if (textView != null) {
                            textView.setImportantForAccessibility(2);
                            textView.setText(C0966R.string.jcy);
                            textView.announceForAccessibility(view.getResources().getString(C0966R.string.f361363j93));
                            textView.setImportantForAccessibility(1);
                        }
                        final LinearLayout linearLayout2 = (LinearLayout) view;
                        SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        final WeImageView weImageView2 = (WeImageView) linearLayout2.findViewById(C0966R.C0970id.f5730n2);
                        ScaleAnimation scaleAnimation = r10;
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
                        final ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation.setDuration(100);
                        scaleAnimation.setRepeatCount(0);
                        scaleAnimation.setFillAfter(true);
                        scaleAnimation3.setDuration(100);
                        scaleAnimation3.setRepeatCount(0);
                        scaleAnimation3.setFillAfter(true);
                        weImageView2.clearAnimation();
                        weImageView2.startAnimation(scaleAnimation);
                        scaleAnimation.setAnimationListener(new Animation.AnimationListener(snsCommentDetailUI2) {
                            public void onAnimationEnd(Animation animation) {
                                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$55");
                                weImageView2.startAnimation(scaleAnimation3);
                                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$55");
                            }

                            public void onAnimationRepeat(Animation animation) {
                                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$55");
                                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$55");
                            }

                            public void onAnimationStart(Animation animation) {
                                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$55");
                                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$55");
                            }
                        });
                        scaleAnimation3.setAnimationListener(new Animation.AnimationListener() {
                            public void onAnimationEnd(Animation animation) {
                                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$56");
                                if (linearLayout2 != null) {
                                    SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                                    View Q7 = SnsCommentDetailUI.m121968Q7(snsCommentDetailUI);
                                    SnsMethodCalculate.markStartTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                    snsCommentDetailUI.mo132618e8(Q7);
                                    SnsMethodCalculate.markEndTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                                    linearLayout2.setPressed(false);
                                }
                                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$56");
                            }

                            public void onAnimationRepeat(Animation animation) {
                                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$56");
                                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$56");
                            }

                            public void onAnimationStart(Animation animation) {
                                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$56");
                                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$56");
                            }
                        });
                        SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    } else {
                        weImageView.setImageResource(C0966R.raw.icons_outlined_like);
                        weImageView.setIconColor(snsCommentDetailUI.getContext().getResources().getColor(C0966R.color.f2975b6));
                        if (textView != null) {
                            textView.setImportantForAccessibility(2);
                            textView.setText(C0966R.string.je7);
                            textView.announceForAccessibility(view.getResources().getString(C0966R.string.j95));
                            textView.setImportantForAccessibility(1);
                        }
                        LinearLayout linearLayout3 = (LinearLayout) view;
                        SnsMethodCalculate.markStartTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (linearLayout3 != null) {
                            snsCommentDetailUI2.mo132618e8(snsCommentDetailUI2.f277896p);
                            linearLayout3.setPressed(false);
                        }
                        SnsMethodCalculate.markEndTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    }
                }
            }
            C100165c cVar2 = snsCommentDetailUI2.f277864W;
            if (cVar2 != null && (cVar2 instanceof C100189m)) {
                C100189m mVar = (C100189m) cVar2;
                SnsMethodCalculate.markStartTimeMs("dealWithPreLikedAnimation", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
                if (mVar.f293411d.ContentObj.f298427h.size() >= 2) {
                    int i3 = mVar.f293412e.getLikeFlag() == 1 ? 1 : 0;
                    if (mVar.f293551t != null && mVar.f293411d.ContentObj.f298427h.get(i3).f298690e == 6) {
                        C98963o oVar = mVar.f293551t;
                        SnsInfo snsInfo2 = mVar.f293412e;
                        oVar.mo138303j(snsInfo2.field_snsId, snsInfo2.getLikeFlag() == 1);
                    }
                    if (mVar.f293549r) {
                        Log.m105924i("MicroMsg.TurnCardAdDetailItem", "isPlayAnimation, return");
                        SnsMethodCalculate.markEndTimeMs("dealWithPreLikedAnimation", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
                    } else {
                        if (mVar.f293412e.getLikeFlag() == 1) {
                            i2 = 1;
                            i = 0;
                        } else {
                            i2 = 0;
                            i = 1;
                        }
                        View i4 = mVar.mo139479i(mVar.f293411d.ContentObj.f298427h.get(i2), i2, false);
                        View i5 = mVar.mo139479i(mVar.f293411d.ContentObj.f298427h.get(i), i, true);
                        int width = ((WindowManager) mVar.f293546o.getSystemService("window")).getDefaultDisplay().getWidth();
                        int[] iArr = new int[2];
                        mVar.f293413f.getLocationOnScreen(iArr);
                        mVar.f293413f.setPivotY((float) ((width / 2) - iArr[1]));
                        mVar.f293413f.setCameraDistance(8000.0f);
                        float width2 = ((float) mVar.f293413f.getWidth()) / 2.0f;
                        float height = ((float) mVar.f293413f.getHeight()) / 2.0f;
                        int i6 = 90;
                        int i7 = -90;
                        if (mVar.f293412e.getLikeFlag() != 1) {
                            i6 = -90;
                            i7 = 90;
                        }
                        C98231f fVar = new C98231f(mVar.f293546o, 0.0f, (float) i6, width2, height, 150.0f, true);
                        str3 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
                        fVar.setDuration(187);
                        fVar.setInterpolator(new AccelerateInterpolator());
                        C98231f fVar2 = fVar;
                        str = "access$2400";
                        str4 = "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem";
                        fVar2.setAnimationListener(new C100194n(mVar, i5, i4, i, i7, width2, height));
                        mVar.f293413f.startAnimation(fVar2);
                        mVar.f293549r = true;
                    }
                } else {
                    str = "access$2400";
                    str3 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
                    str4 = "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem";
                }
                SnsMethodCalculate.markEndTimeMs("dealWithPreLikedAnimation", str4);
                SnsObject f = C94897n1.m120368f(C100416r.m131408a(snsCommentDetailUI2.f277829C));
                LinkedList<w64> linkedList = f.LikeUserList;
                snsCommentDetailUI2.f277911w = linkedList;
                snsCommentDetailUI2.mo132636w8(linkedList, f.CommentUserList.isEmpty());
                CommentListAdapter commentListAdapter = snsCommentDetailUI2.f277901r;
                LinkedList<w64> linkedList2 = f.LikeUserList;
                commentListAdapter.getClass();
                SnsMethodCalculate.markStartTimeMs("setLikedList", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
                commentListAdapter.f278000e = linkedList2;
                commentListAdapter.notifyDataSetChanged();
                SnsMethodCalculate.markEndTimeMs("setLikedList", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
                str2 = str3;
                SnsMethodCalculate.markEndTimeMs("dealWithLiked", str2);
            }
            str = "access$2400";
            str3 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI";
            SnsObject f2 = C94897n1.m120368f(C100416r.m131408a(snsCommentDetailUI2.f277829C));
            LinkedList<w64> linkedList3 = f2.LikeUserList;
            snsCommentDetailUI2.f277911w = linkedList3;
            snsCommentDetailUI2.mo132636w8(linkedList3, f2.CommentUserList.isEmpty());
            CommentListAdapter commentListAdapter2 = snsCommentDetailUI2.f277901r;
            LinkedList<w64> linkedList22 = f2.LikeUserList;
            commentListAdapter2.getClass();
            SnsMethodCalculate.markStartTimeMs("setLikedList", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            commentListAdapter2.f278000e = linkedList22;
            commentListAdapter2.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("setLikedList", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter");
            str2 = str3;
            SnsMethodCalculate.markEndTimeMs("dealWithLiked", str2);
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: P7 */
    public static /* synthetic */ C100165c m121967P7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C100165c cVar = snsCommentDetailUI.f277864W;
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return cVar;
    }

    /* renamed from: Q7 */
    public static /* synthetic */ View m121968Q7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        View view = snsCommentDetailUI.f277896p;
        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return view;
    }

    /* renamed from: R7 */
    public static void m121969R7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("fixScollUp", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        Log.m105918d("MicroMsg.SnsCommentDetailUI", "fixScollUp: ");
        int count = snsCommentDetailUI.f277901r.getCount() - 1;
        w64 commentInfo = snsCommentDetailUI.f277913x.getCommentInfo();
        int i = commentInfo.f299709j;
        long j = i != 0 ? (long) i : commentInfo.f299714r;
        int i2 = 0;
        while (true) {
            if (i2 >= snsCommentDetailUI.f277901r.f277999d.size()) {
                break;
            }
            w64 w64 = snsCommentDetailUI.f277901r.f277999d.get(i2);
            int i3 = w64.f299709j;
            if ((i3 != 0 ? (long) i3 : w64.f299714r) == j) {
                count = i2;
                break;
            }
            i2++;
        }
        ScrollUp scrollUp = snsCommentDetailUI.f277904s1;
        int i8 = snsCommentDetailUI.mo132621i8();
        scrollUp.getClass();
        SnsMethodCalculate.markStartTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        scrollUp.f278017h = i8;
        SnsMethodCalculate.markEndTimeMs("setItemHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp");
        if (C94897n1.m120368f(C100416r.m131408a(snsCommentDetailUI.f277829C)).LikeUserList.size() > 0 && (count = count + 1) > snsCommentDetailUI.f277901r.getCount()) {
            count = snsCommentDetailUI.f277901r.getCount() - 1;
        }
        snsCommentDetailUI.f277904s1.mo132674a(count);
        Log.m105919d("MicroMsg.SnsCommentDetailUI", "fixScollUp: pos:%d", Integer.valueOf(count));
        snsCommentDetailUI.mo132631r8();
        SnsMethodCalculate.markEndTimeMs("fixScollUp", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: S7 */
    public static /* synthetic */ C95733b m121970S7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C95733b bVar = snsCommentDetailUI.f277870Z;
        SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return bVar;
    }

    /* renamed from: T7 */
    public static void m121971T7(SnsCommentDetailUI snsCommentDetailUI, String str) {
        SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C76912y0.m92767f(snsCommentDetailUI.getContext(), str);
        SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: U7 */
    public static /* synthetic */ View m121972U7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        View view = snsCommentDetailUI.f277879f;
        SnsMethodCalculate.markEndTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return view;
    }

    /* renamed from: V7 */
    public static void m121973V7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        snsCommentDetailUI.getClass();
        SnsMethodCalculate.markStartTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        Log.m105918d("MicroMsg.SnsCommentDetailUI", "onTouchIdleArea: ");
        SnsCommentFooter snsCommentFooter = snsCommentDetailUI.f277913x;
        if (snsCommentFooter != null) {
            snsCommentFooter.mo132683E(false);
            if (snsCommentDetailUI.f277913x.mo132716t()) {
                snsCommentDetailUI.f277913x.mo132719x(0);
                snsCommentDetailUI.f277913x.mo132696p();
                SnsInfo f8 = snsCommentDetailUI.mo132619f8(true);
                if (f8 != null) {
                    f8.getTimeLine();
                }
                snsCommentDetailUI.f277913x.setCommentHint(snsCommentDetailUI.getString(C0966R.string.jjl));
                if (f8 != null) {
                    if (!f8.isAd() || (f8.getTimeLine().ContentObj.f298428i & 8) == 0) {
                        snsCommentDetailUI.f277913x.mo132680B(false);
                    } else if (snsCommentDetailUI.mo132626m8(f8)) {
                        snsCommentDetailUI.f277913x.mo132680B(true);
                    } else {
                        Log.m105920e("MicroMsg.SnsCommentDetailUI", "isAtInfoValid is false！");
                        snsCommentDetailUI.f277913x.mo132680B(false);
                    }
                }
            } else {
                SnsCommentFooter snsCommentFooter2 = snsCommentDetailUI.f277913x;
                snsCommentFooter2.getClass();
                SnsMethodCalculate.markStartTimeMs("resetState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter2.f278061t = 0;
                SnsMethodCalculate.markEndTimeMs("resetState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onTouchIdleArea", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: W7 */
    public static /* synthetic */ TimelineClickListener m121974W7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        TimelineClickListener timelineClickListener = snsCommentDetailUI.f277868Y;
        SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return timelineClickListener;
    }

    /* renamed from: X7 */
    public static /* synthetic */ int m121975X7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int i = snsCommentDetailUI.f277862V;
        SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return i;
    }

    /* renamed from: Y7 */
    public static /* synthetic */ ListView m121976Y7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ListView listView = snsCommentDetailUI.f277894o;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return listView;
    }

    /* renamed from: Z7 */
    public static /* synthetic */ SnsCommentFooter m121977Z7(SnsCommentDetailUI snsCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsCommentFooter snsCommentFooter = snsCommentDetailUI.f277913x;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return snsCommentFooter;
    }

    /* renamed from: B0 */
    public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: a8 */
    public final void mo132614a8(PhotosContent photosContent) {
        SnsMethodCalculate.markStartTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent == null) {
            SnsMethodCalculate.markEndTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        try {
            ImageView imageView = new ImageView(getContext());
            int b = C76577a.m92151b(getContext(), 24);
            int b2 = C76577a.m92151b(getContext(), 4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.leftMargin = b2;
            layoutParams.topMargin = b2;
            imageView.setImageDrawable(C76577a.m92158i(getContext(), C0966R.C0969drawable.boh));
            imageView.setLayoutParams(layoutParams);
            photosContent.addView(imageView);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsCommentDetailUI", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("addAdWeAppIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: b7 */
    public C95733b mo67325b7() {
        SnsMethodCalculate.markStartTimeMs("getAdNotLikeHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C95733b bVar = this.f277870Z;
        SnsMethodCalculate.markEndTimeMs("getAdNotLikeHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return bVar;
    }

    /* renamed from: b8 */
    public final void mo132615b8(PhotosContent photosContent, int i) {
        SnsMethodCalculate.markStartTimeMs("addAdWeAppIconForPics", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (photosContent == null || i <= 1) {
            Log.m105920e("MicroMsg.SnsCommentDetailUI", "photosContent == null or imgNums <= 1");
            SnsMethodCalculate.markEndTimeMs("addAdWeAppIconForPics", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        try {
            int b = C76577a.m92151b(getContext(), 20);
            for (int i2 = 0; i2 < i; i2++) {
                if (photosContent.mo132426b(i2).getVisibility() == 8) {
                    Log.m105924i("MicroMsg.SnsCommentDetailUI", "current index " + i2 + " imageView is a placeholder, so visibility is gone");
                } else {
                    ImageView a = C46568m.m51894a(getContext(), photosContent, i2, b);
                    if (a != null) {
                        photosContent.addView(a);
                    }
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsCommentDetailUI", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("addAdWeAppIconForPics", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: c8 */
    public final void mo132616c8(SnsInfo snsInfo, PhotosContent photosContent, int i) {
        View findViewById;
        SnsMethodCalculate.markStartTimeMs("checkShowStatusIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo != null && snsInfo.isAd() && i == 2) {
            View view = null;
            try {
                ADXml adXml = snsInfo.getAdXml();
                if (!(adXml == null || !adXml.isShowPlayIconOnCover() || (findViewById = photosContent.findViewById(C0966R.C0970id.k1a)) == null)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photosContent.mo132426b(0).getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    int i2 = ((layoutParams.width / 2) - (layoutParams2.width / 2)) + layoutParams.leftMargin;
                    int i3 = ((layoutParams.height / 2) - (layoutParams2.height / 2)) + layoutParams.topMargin;
                    if (!(i2 == layoutParams2.leftMargin && i3 == layoutParams2.topMargin)) {
                        layoutParams2.leftMargin = i2;
                        layoutParams2.topMargin = i3;
                        findViewById.setLayoutParams(layoutParams2);
                    }
                }
            } catch (Throwable th) {
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "checkShowStatusIcon", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ui/PhotosContent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Log.m105920e("MicroMsg.SnsCommentDetailUI", "checkShowStatusIcon exp=" + th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkShowStatusIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: d8 */
    public final boolean mo132617d8(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkSnsInfoInvalidShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo == null) {
            Log.m105925i("MicroMsg.SnsCommentDetailUI", "checkSnsInfoInvalidShow: info null, snsId:%s, localSnsId=%s, forbidAccess=%b", this.f277829C, this.f277831D, Boolean.valueOf(this.f277878e1));
            if (!this.f277878e1) {
                finish();
            }
            SnsMethodCalculate.markEndTimeMs("checkSnsInfoInvalidShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("checkSnsInfoInvalidShow", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return false;
    }

    /* renamed from: e8 */
    public final void mo132618e8(final View view) {
        SnsMethodCalculate.markStartTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        view.clearAnimation();
        view.startAnimation(this.f277905t);
        this.f277905t.setAnimationListener(new Animation.AnimationListener(this) {
            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$57");
                View view = view;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$57", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$57", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$57");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$57");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$57");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$57");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$57");
            }
        });
        SnsMethodCalculate.markEndTimeMs("closeCommentView", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: f8 */
    public final SnsInfo mo132619f8(boolean z) {
        SnsInfo snsInfo;
        SnsMethodCalculate.markStartTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (!Util.isNullOrNil(this.f277831D)) {
            snsInfo = C100416r.m131409b(this.f277831D);
            if (snsInfo == null) {
                if (z) {
                    C76701a.makeText((Context) this, (int) C0966R.string.jf6, 0).show();
                }
                Log.m105921e("MicroMsg.SnsCommentDetailUI", "fixId: info null, localSnsId:%s, try finish", this.f277831D);
                finish();
                SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return null;
            }
            String snsId = snsInfo.getSnsId();
            this.f277829C = snsId;
            Log.m105925i("MicroMsg.SnsCommentDetailUI", "fixId: update snsId=%s", snsId);
        } else {
            snsInfo = C100416r.m131408a(this.f277829C);
            if (mo132617d8(snsInfo)) {
                Log.m105921e("MicroMsg.SnsCommentDetailUI", "fixId: info null, localSnsId empty, snsId:%s, try finish", this.f277829C);
                SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return null;
            }
            String localid = snsInfo.getLocalid();
            this.f277831D = localid;
            Log.m105925i("MicroMsg.SnsCommentDetailUI", "fixId: update localSnsId=%s", localid);
        }
        SnsMethodCalculate.markEndTimeMs("fixId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return snsInfo;
    }

    public void finish() {
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        Log.m105924i("MicroMsg.SnsCommentDetailUI", "finish: ");
        if (!Util.isNullOrNil(this.f277829C)) {
            Intent intent = new Intent();
            intent.putExtra("result_forbid_access", this.f277878e1);
            intent.putExtra("result_access_sns_id", C100417r0.m131425n(this.f277829C));
            setResult(-1, intent);
        }
        super.finish();
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: g8 */
    public final ADInfo mo132620g8(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return null;
        } else if (mo132622j8() == 2) {
            ADInfo atAdInfo = snsInfo.getAtAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return atAdInfo;
        } else {
            ADInfo adInfo = snsInfo.getAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return adInfo;
        }
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return C0966R.C0971layout.c2h;
    }

    /* renamed from: h4 */
    public C96104o8 mo67326h4() {
        SnsMethodCalculate.markStartTimeMs("getTimeLineCommentHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("getTimeLineCommentHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return null;
    }

    /* renamed from: i8 */
    public final int mo132621i8() {
        View childAt;
        SnsMethodCalculate.markStartTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ListView listView = this.f277894o;
        if (listView == null || listView.getChildCount() <= 1 || (childAt = this.f277894o.getChildAt(0)) == null) {
            SnsMethodCalculate.markEndTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return 0;
        }
        int height = childAt.getHeight();
        SnsMethodCalculate.markEndTimeMs("getCommentViewHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return height;
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x08fc  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0986  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0a31  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0aa8  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0acf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r40 = this;
            r7 = r40
            java.lang.String r8 = "initView"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            r0 = 2131836873(0x7f113fc9, float:1.9306925E38)
            r7.setMMTitle((int) r0)
            java.lang.String r0 = "setBackBtn"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$33 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$33
            r1.<init>()
            r7.setToTop(r1)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34
            r1.<init>()
            r7.setBackBtn(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            boolean r0 = r7.f277878e1
            r10 = 4
            r11 = 1
            java.lang.String r6 = "MicroMsg.SnsCommentDetailUI"
            if (r0 == 0) goto L_0x0056
            r0 = 2131305136(0x7f0922b0, float:1.8228434E38)
            android.view.View r0 = r7.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0045
            java.lang.String r1 = "initView: show Not Access Layout!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r0.inflate()
            r7.f277878e1 = r11
        L_0x0045:
            r0 = 2131313939(0x7f094513, float:1.8246289E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = "initView: forbid access container root"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r0.setImportantForAccessibility(r10)
        L_0x0056:
            java.lang.String r0 = eb0.C75592q0.m90789s()
            r7.f277837G = r0
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "initView: SnsCore InValid!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r40.finish()
        L_0x006a:
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r7.mo132619f8(r11)
            boolean r0 = r7.mo132617d8(r12)
            if (r0 == 0) goto L_0x008f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid pcid:"
            r0.append(r1)
            java.lang.String r1 = r7.f277829C
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        L_0x008f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "snsId: "
            r0.append(r1)
            java.lang.String r1 = r7.f277829C
            r0.append(r1)
            java.lang.String r1 = "localId "
            r0.append(r1)
            java.lang.String r1 = r7.f277831D
            r0.append(r1)
            java.lang.String r1 = "  username:"
            r0.append(r1)
            java.lang.String r1 = r12.getUserName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 2131300382(0x7f09101e, float:1.8218792E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r1 = r7.f277857S0
            r13 = 8
            r14 = 0
            if (r1 == 0) goto L_0x00d6
            r0.setVisibility(r14)
            java.lang.String r1 = r7.f277859T0
            r0.setText(r1)
            goto L_0x00d9
        L_0x00d6:
            r0.setVisibility(r13)
        L_0x00d9:
            java.lang.String r0 = r7.f277829C
            boolean r0 = os2.C100417r0.m131419h(r0)
            r15 = 2131314073(0x7f094599, float:1.824656E38)
            r4 = 2131314074(0x7f09459a, float:1.8246563E38)
            if (r0 != 0) goto L_0x04f1
            boolean r0 = r12.isDieItem()
            if (r0 == 0) goto L_0x04f1
            te3.lv2 r0 = r12.getPostInfo()
            r0.f298733G = r11
            android.view.View r1 = r7.findViewById(r4)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r18 = "initView"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r2 = 2131313972(0x7f094534, float:1.8246356E38)
            android.view.View r2 = r7.findViewById(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r4)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r18 = "initView"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r2 = 2131311130(0x7f093a1a, float:1.8240592E38)
            android.view.View r2 = r7.findViewById(r2)
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r2 = r0.f298755s
            r3 = 7
            r10 = 2131314075(0x7f09459b, float:1.8246565E38)
            if (r2 == r3) goto L_0x0485
            r3 = 201(0xc9, float:2.82E-43)
            if (r2 == r3) goto L_0x03de
            r3 = 210(0xd2, float:2.94E-43)
            if (r2 == r3) goto L_0x0382
            r3 = 211(0xd3, float:2.96E-43)
            if (r2 == r3) goto L_0x0325
            java.lang.String r2 = r0.f298732F
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0280
            java.lang.String r1 = r0.f298732F
            r4.setText(r1)
            int r0 = r0.f298755s
            r1 = 2006(0x7d6, float:2.811E-42)
            if (r0 != r1) goto L_0x0239
            android.view.View r0 = r7.findViewById(r15)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r28 = "initView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r28 = "initView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r27 = "initView"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x037e
        L_0x0239:
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.mo10233c(r2)
            java.lang.Object[] r33 = r1.mo10232b()
            java.lang.String r34 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r35 = "initView"
            java.lang.String r36 = "()V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            r32 = r0
            j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x037e
        L_0x0280:
            int r0 = r12.getTypeFlag()
            r2 = 28
            if (r0 != r2) goto L_0x02d9
            r0 = 2131837095(0x7f1140a7, float:1.9307375E38)
            r4.setText(r0)
            r1.setEnabled(r14)
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r28 = "initView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r0 = 0
            goto L_0x037f
        L_0x02d9:
            r0 = 2131837094(0x7f1140a6, float:1.9307373E38)
            r4.setText(r0)
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r28 = "initView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x037e
        L_0x0325:
            java.lang.String r1 = r0.f298732F
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0333
            java.lang.String r0 = r0.f298732F
            r4.setText(r0)
            goto L_0x0339
        L_0x0333:
            r0 = 2131837092(0x7f1140a4, float:1.930737E38)
            r4.setText(r0)
        L_0x0339:
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r28 = "initView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x037e:
            r0 = 1
        L_0x037f:
            r15 = 0
            goto L_0x04d4
        L_0x0382:
            java.lang.String r1 = r0.f298732F
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0390
            java.lang.String r0 = r0.f298732F
            r4.setText(r0)
            goto L_0x0396
        L_0x0390:
            r0 = 2131837093(0x7f1140a5, float:1.9307371E38)
            r4.setText(r0)
        L_0x0396:
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r28 = "initView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            r15 = 0
            goto L_0x04d3
        L_0x03de:
            java.lang.String r1 = r0.f298732F
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0439
            java.lang.String r1 = r0.f298737K
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0431
            java.lang.String r1 = r0.f298738L
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0431
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r1 = r0.f298738L
            r2.add(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r1 = r0.f298737K
            r3.add(r1)
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = r0.f298732F
            r5.append(r15)
            java.lang.String r0 = r0.f298737K
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r0 = r1
            r1 = r40
            r15 = r3
            r3 = r5
            r5 = r4
            r4 = r15
            r15 = 0
            r0.mo107047GG(r1, r2, r3, r4, r5)
            goto L_0x0441
        L_0x0431:
            r5 = r4
            r15 = 0
            java.lang.String r0 = r0.f298732F
            r5.setText(r0)
            goto L_0x0441
        L_0x0439:
            r5 = r4
            r15 = 0
            r0 = 2131837091(0x7f1140a3, float:1.9307367E38)
            r5.setText(r0)
        L_0x0441:
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x04d3
        L_0x0485:
            r5 = r4
            r15 = 0
            r1.setEnabled(r14)
            r0 = 2131837198(0x7f11410e, float:1.9307584E38)
            r5.setText(r0)
            android.view.View r0 = r7.findViewById(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r22 = "initView"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "initView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x04d3:
            r0 = 0
        L_0x04d4:
            java.lang.String r1 = "updateUnreadErrorNotify"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r9)
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$58 r3 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$58
            r3.<init>(r7)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            r1 = r0
            r20 = r12
            r0 = 2131314074(0x7f09459a, float:1.8246563E38)
            goto L_0x05f1
        L_0x04f1:
            r15 = 0
            int r0 = r7.f277833E
            if (r0 <= 0) goto L_0x0504
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            int r1 = r7.f277833E
            ms2.e r0 = r0.mo130960s(r1)
            r20 = r12
            goto L_0x059f
        L_0x0504:
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            long r1 = r12.field_snsId
            r0.getClass()
            java.lang.String r3 = "removeBySnsId"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            ms2.c r5 = r0.f274774a
            java.util.LinkedList<ms2.e> r5 = r5.f292905j
            java.util.Iterator r5 = r5.iterator()
            r10 = r15
        L_0x051e:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x0542
            java.lang.Object r17 = r5.next()
            r15 = r17
            ms2.e r15 = (ms2.C99965e) r15
            r20 = r12
            long r11 = r15.f292906d
            int r21 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r21 != 0) goto L_0x053d
            if (r10 == 0) goto L_0x053c
            int r11 = r10.f292907e
            int r12 = r15.f292907e
            if (r11 >= r12) goto L_0x053d
        L_0x053c:
            r10 = r15
        L_0x053d:
            r12 = r20
            r11 = 1
            r15 = 0
            goto L_0x051e
        L_0x0542:
            r20 = r12
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5[r14] = r1
            if (r10 != 0) goto L_0x0553
            java.lang.String r1 = "null"
            goto L_0x057b
        L_0x0553:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "snsID:"
            r1.append(r2)
            long r11 = r10.f292906d
            r1.append(r11)
            java.lang.String r2 = ", opTime:"
            r1.append(r2)
            int r2 = r10.f292907e
            r1.append(r2)
            java.lang.String r2 = ", type:"
            r1.append(r2)
            int r2 = r10.f292908f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x057b:
            r2 = 1
            r5[r2] = r1
            java.lang.String r1 = "MicroMsg.SnsAsyncQueueMgr"
            java.lang.String r2 = "removeBySnsId snsId:%s, toDel:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r5)
            if (r10 == 0) goto L_0x059b
            ms2.c r2 = r0.f274774a
            java.util.LinkedList<ms2.e> r2 = r2.f292905j
            r2.remove(r10)
            boolean r0 = r0.mo130956o()
            if (r0 != 0) goto L_0x059b
            java.lang.String r0 = "removeBySnsId error listToFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x059b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r0 = r10
        L_0x059f:
            if (r0 == 0) goto L_0x05a8
            r7.mo132629p8(r0)
            r0 = 2131314074(0x7f09459a, float:1.8246563E38)
            goto L_0x05f0
        L_0x05a8:
            r0 = 2131314074(0x7f09459a, float:1.8246563E38)
            android.view.View r1 = r7.findViewById(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2.mo10233c(r3)
            java.lang.Object[] r22 = r2.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r24 = "initView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r1
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r22 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r23 = "initView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x05f0:
            r1 = 0
        L_0x05f1:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$24 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$24
            r10 = r20
            r2.<init>(r10)
            if (r1 == 0) goto L_0x060b
            android.view.View r0 = r7.findViewById(r0)
            r0.setOnClickListener(r2)
            r0 = 2131314073(0x7f094599, float:1.824656E38)
            android.view.View r0 = r7.findViewById(r0)
            r0.setOnClickListener(r2)
        L_0x060b:
            r0 = 2131296802(0x7f090222, float:1.821153E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r7.f277894o = r0
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$25 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$25
            r1.<init>()
            r0.post(r1)
            android.widget.ListView r0 = r7.f277894o
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$26 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$26
            r1.<init>()
            r0.setOnScrollListener(r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r7.mo132619f8(r14)
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r0 == 0) goto L_0x063e
            int r0 = r40.getTaskId()
            boolean r0 = com.tencent.p014mm.p136ui.C85878m2.m106213b(r0)
            if (r0 != 0) goto L_0x063e
            r0 = 1
            goto L_0x063f
        L_0x063e:
            r0 = 0
        L_0x063f:
            r7.f277884h1 = r0
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106197n0()
            if (r0 == 0) goto L_0x065f
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r0 == 0) goto L_0x065f
            r0 = 30
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x065f
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.p136ui.C85878m2.m106212a(r0)
            r7.f277884h1 = r0
        L_0x065f:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r0 = r7.f277884h1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r14] = r0
            java.lang.String r0 = "initView: inLargeWindow:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r40.getContext()
            android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
            boolean r1 = r7.f277884h1
            if (r1 == 0) goto L_0x067f
            r1 = 2131497634(0x7f0c12a2, float:1.8618867E38)
            goto L_0x0682
        L_0x067f:
            r1 = 2131497633(0x7f0c12a1, float:1.8618865E38)
        L_0x0682:
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r7.f277879f = r0
            r1 = 2131306356(0x7f092774, float:1.8230909E38)
            android.view.View r0 = r0.findViewById(r1)
            r7.f277899q = r0
            android.view.View r0 = r7.f277879f
            android.view.View$OnClickListener r1 = r7.f277910v1
            r0.setOnClickListener(r1)
            android.widget.ListView r0 = r7.f277894o
            android.view.View r1 = r7.f277879f
            r0.addHeaderView(r1)
            boolean r0 = r40.mo132635v8()
            if (r0 != 0) goto L_0x06c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error isOk setheader "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            boolean r0 = r7.f277878e1
            if (r0 != 0) goto L_0x06c1
            r40.finish()
        L_0x06c1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return
        L_0x06c5:
            if (r11 == 0) goto L_0x06cd
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122255q(r11, r14)
            r7.f277862V = r0
        L_0x06cd:
            int r0 = r7.f277862V
            r1 = 10
            r2 = -2
            r12 = -1
            if (r0 != r1) goto L_0x06f9
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = r10.field_userName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06f9
            com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader r0 = new com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader
            r0.<init>(r7)
            r7.f277887j = r0
            android.widget.AbsListView$LayoutParams r0 = new android.widget.AbsListView$LayoutParams
            r0.<init>(r12, r2)
            com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader r1 = r7.f277887j
            r1.setLayoutParams(r0)
            com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader r0 = r7.f277887j
            android.view.View$OnClickListener r1 = r7.f277910v1
            r0.setOnClickListener(r1)
        L_0x06f9:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            androidx.appcompat.app.AppCompatActivity r1 = r40.getContext()
            r0.<init>(r1)
            r7.f277883h = r0
            android.widget.AbsListView$LayoutParams r0 = new android.widget.AbsListView$LayoutParams
            r0.<init>(r12, r2)
            android.widget.LinearLayout r1 = r7.f277883h
            r1.setLayoutParams(r0)
            android.widget.LinearLayout r0 = r7.f277883h
            android.view.View$OnClickListener r1 = r7.f277910v1
            r0.setOnClickListener(r1)
            java.lang.String r0 = "getLinearSeparator"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            r1 = 1073741824(0x40000000, float:2.0)
            com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r7, r1)
            android.widget.AbsListView$LayoutParams r1 = new android.widget.AbsListView$LayoutParams
            r2 = 1
            r1.<init>(r12, r2)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            androidx.appcompat.app.AppCompatActivity r4 = r40.getContext()
            r3.<init>(r4)
            r4 = 2131234964(0x7f081094, float:1.8086109E38)
            r3.setBackgroundResource(r4)
            r3.setLayoutParams(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            r7.f277892n = r3
            r7.mo132633t8(r10, r2)
            com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader r0 = r7.f277887j
            if (r0 == 0) goto L_0x074a
            r7.f277853Q0 = r2
            android.widget.ListView r1 = r7.f277894o
            r1.addHeaderView(r0)
        L_0x074a:
            com.tencent.mm.protocal.protobuf.SnsObject r15 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120368f(r10)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r10.getTimeLine()
            int r0 = r10.localid
            long r0 = (long) r0
            java.lang.String r2 = "sns_table_"
            java.lang.String r4 = os2.C100417r0.m131421j(r2, r0)
            te3.kr2 r5 = r3.Location
            int r0 = r10.getLocalPrivate()
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0768
            r0 = 1
            goto L_0x0769
        L_0x0768:
            r0 = 0
        L_0x0769:
            yn2.s0 r1 = yn2.C102882s0.f303681a
            int r2 = r15.GuideFinder
            int r6 = r10.getTypeFlag()
            java.lang.String r13 = "canShowSnsPostEntranceInDetails"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.SnsFinderPostManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            java.lang.Class<h81.h> r21 = h81.C32735h.class
            di3.d r21 = di3.C86312j.m106911c(r21)
            r22 = r8
            r8 = r21
            h81.h r8 = (h81.C32735h) r8
            r21 = r9
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_details_show_finder_entry
            boolean r8 = r8.mo58784wf(r9, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "canShowSnsPostEntranceInDetails entry = "
            r9.append(r14)
            r9.append(r8)
            java.lang.String r14 = ", isPrivate = "
            r9.append(r14)
            r9.append(r0)
            java.lang.String r14 = ", localSnsId = "
            r9.append(r14)
            r9.append(r4)
            java.lang.String r14 = ", guide = "
            r9.append(r14)
            r9.append(r2)
            java.lang.String r14 = ", typeFlag = "
            r9.append(r14)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r14 = "MicroMsg.SnsFinderPostManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r9)
            if (r8 != 0) goto L_0x07c9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
        L_0x07c7:
            r0 = 1
            goto L_0x07e1
        L_0x07c9:
            if (r0 == 0) goto L_0x07cf
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x07c7
        L_0x07cf:
            r0 = 1
            if (r6 == r0) goto L_0x07da
            r8 = 15
            if (r6 != r8) goto L_0x07d7
            goto L_0x07da
        L_0x07d7:
            r17 = 0
            goto L_0x07dc
        L_0x07da:
            r17 = 1
        L_0x07dc:
            if (r17 != 0) goto L_0x07e3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
        L_0x07e1:
            r0 = 0
            goto L_0x0823
        L_0x07e3:
            r2 = r2 & r0
            if (r2 <= 0) goto L_0x07e8
            r0 = 1
            goto L_0x07e9
        L_0x07e8:
            r0 = 0
        L_0x07e9:
            java.lang.String r2 = "getShowCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r12)
            java.lang.String r6 = "getKVKey"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "details_sc_"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r12)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = yn2.C102882s0.f303683c
            r9 = 0
            int r6 = r6.getInt(r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r12)
            if (r6 != 0) goto L_0x081c
            if (r0 == 0) goto L_0x0818
            r1.mo142589a(r4)
        L_0x0818:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x0823
        L_0x081c:
            boolean r0 = r1.mo142589a(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
        L_0x0823:
            if (r0 == 0) goto L_0x087b
            androidx.appcompat.app.AppCompatActivity r0 = r40.getContext()
            android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
            r1 = 2131497647(0x7f0c12af, float:1.8618893E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f277885i = r0
            android.widget.ListView r1 = r7.f277894o
            r1.addHeaderView(r0)
            android.widget.LinearLayout r8 = r7.f277885i
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$a r9 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$a
            r0 = r9
            r1 = r40
            r2 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.setOnClickListener(r9)
            android.widget.LinearLayout r0 = r7.f277885i
            r1 = 2131314079(0x7f09459f, float:1.8246573E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$27 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$27
            r1.<init>(r7, r10)
            zp3.C23564m.m28138h(r0, r1)
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r7, r0)
            android.widget.AbsListView$LayoutParams r1 = new android.widget.AbsListView$LayoutParams
            r2 = -1
            r1.<init>(r2, r0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            androidx.appcompat.app.AppCompatActivity r2 = r40.getContext()
            r0.<init>(r2)
            r0.setLayoutParams(r1)
            android.widget.ListView r1 = r7.f277894o
            r1.addHeaderView(r0)
        L_0x087b:
            java.util.LinkedList<te3.w64> r0 = r15.LikeUserList
            r7.f277911w = r0
            java.util.LinkedList<te3.w64> r1 = r15.CommentUserList
            boolean r1 = r1.isEmpty()
            r7.mo132636w8(r0, r1)
            com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader r0 = r7.f277887j
            if (r0 == 0) goto L_0x0891
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r7.f277868Y
            r0.mo130698b(r10, r1)
        L_0x0891:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r6 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter
            java.util.LinkedList<te3.w64> r2 = r15.CommentUserList
            java.util.LinkedList<te3.w64> r3 = r15.LikeUserList
            java.lang.String r5 = r10.getLocalid()
            r0 = r6
            r1 = r40
            r4 = r40
            r0.<init>(r2, r3, r4, r5)
            r7.f277901r = r6
            boolean r0 = r7.f277865W0
            if (r0 == 0) goto L_0x08c7
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct r0 = r0.mo131361V()
            java.util.LinkedList<te3.w64> r1 = r15.CommentUserList
            int r1 = r1.size()
            long r1 = (long) r1
            r0.f265945p = r1
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct r0 = r0.mo131361V()
            java.util.LinkedList<te3.w64> r1 = r15.LikeUserList
            int r1 = r1.size()
            long r1 = (long) r1
            r0.f265946q = r1
        L_0x08c7:
            android.widget.ListView r0 = r7.f277894o
            android.widget.LinearLayout r1 = r7.f277883h
            r0.addHeaderView(r1)
            android.widget.ListView r0 = r7.f277894o
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r1 = r7.f277901r
            r0.setAdapter(r1)
            r0 = 2131299999(0x7f090e9f, float:1.8218015E38)
            android.view.View r0 = r7.findViewById(r0)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = (com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter) r0
            r7.f277913x = r0
            pt2.b r1 = new pt2.b
            r1.<init>(r7, r0)
            r7.f277882g1 = r1
            java.lang.String r0 = "checkFeedCommentEmojiEnable"
            r1 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r10.getTimeLine()
            if (r2 == 0) goto L_0x0917
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r10.getTimeLine()
            te3.j00 r2 = r2.ContentObj
            if (r2 == 0) goto L_0x0917
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r10.getTimeLine()
            te3.j00 r2 = r2.ContentObj
            int r2 = r2.f298428i
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x090f
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r7.f277913x
            r3 = 0
            r2.setFeedEmojiCommentEnable(r3)
            goto L_0x091d
        L_0x090f:
            r3 = 0
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r7.f277913x
            r4 = 1
            r2.setFeedEmojiCommentEnable(r4)
            goto L_0x091d
        L_0x0917:
            r3 = 0
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r7.f277913x
            r2.setFeedEmojiCommentEnable(r3)
        L_0x091d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            r0.setTag(r10)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28
            r2.<init>(r10)
            r0.setOnEditTouchListener(r2)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$29 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$29
            r2.<init>()
            r0.setOnSmileyShowListener(r2)
            r0 = 1
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r7.mo132619f8(r0)
            if (r0 == 0) goto L_0x094d
            boolean r0 = r0.isExtFlag()
            if (r0 != 0) goto L_0x094d
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            r2 = 8
            r0.setVisibility(r2)
        L_0x094d:
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp r2 = r7.f277904s1
            r0.setAfterEditAction(r2)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            r0.mo132720z()
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$30 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$30
            r2.<init>(r10)
            r0.setOnCommentSendImp(r2)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            r0.setSnsInfo(r10)
            r10.getTimeLine()
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r0 = r7.f277913x
            r2 = 2131837232(0x7f114130, float:1.9307653E38)
            java.lang.String r2 = r7.getString(r2)
            r0.setCommentHint(r2)
            android.content.Intent r0 = r40.getIntent()
            java.lang.String r2 = "INTENT_FROMSUI"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r2, r3)
            r7.f277850N = r0
            if (r0 == 0) goto L_0x0a2d
            android.content.Intent r0 = r40.getIntent()
            r2 = 0
            java.lang.String r4 = "INTENT_FROMSUI_COMMENTID"
            long r4 = r0.getLongExtra(r4, r2)
            r7.f277851P = r4
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0a2d
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r0 = r7.f277901r
            java.util.LinkedList<te3.w64> r0 = r0.f277999d
            if (r0 == 0) goto L_0x0a2d
            r9 = 0
        L_0x099f:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r0 = r7.f277901r
            java.util.LinkedList<te3.w64> r0 = r0.f277999d
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x0a2d
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r0 = r7.f277901r
            java.util.LinkedList<te3.w64> r0 = r0.f277999d
            java.lang.Object r0 = r0.get(r9)
            te3.w64 r0 = (te3.w64) r0
            int r2 = r0.f299709j
            if (r2 == 0) goto L_0x09b9
            long r2 = (long) r2
            goto L_0x09bb
        L_0x09b9:
            long r2 = r0.f299714r
        L_0x09bb:
            long r4 = r7.f277851P
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0a28
            android.widget.ListView r2 = r7.f277894o
            r2.setSelection(r9)
            com.tencent.mm.storage.u3 r2 = r7.f277835F
            java.lang.String r3 = r0.f299703d
            com.tencent.mm.storage.z1 r2 = r2.get(r3)
            if (r2 == 0) goto L_0x09d5
            java.lang.String r2 = r2.mo62898f()
            goto L_0x09dc
        L_0x09d5:
            java.lang.String r2 = r0.f299704e
            if (r2 == 0) goto L_0x09da
            goto L_0x09dc
        L_0x09da:
            java.lang.String r2 = r0.f299703d
        L_0x09dc:
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r3 = r7.f277913x
            r4 = 0
            r3.mo132719x(r4)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r3 = r7.f277913x
            r3.mo132696p()
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r3 = r7.f277913x
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131837106(0x7f1140b2, float:1.9307398E38)
            java.lang.String r5 = r7.getString(r5)
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.setCommentHint(r2)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r7.f277913x
            r2.setCommentInfo(r0)
            java.util.LinkedList<te3.w64> r0 = r15.LikeUserList
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0a22
            int r9 = r9 + 1
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r0 = r7.f277901r
            int r0 = r0.getCount()
            if (r9 <= r0) goto L_0x0a22
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r0 = r7.f277901r
            int r0 = r0.getCount()
            r2 = -1
            int r9 = r0 + -1
        L_0x0a22:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp r0 = r7.f277904s1
            r0.mo132674a(r9)
            goto L_0x0a2d
        L_0x0a28:
            r2 = -1
            int r9 = r9 + 1
            goto L_0x099f
        L_0x0a2d:
            boolean r0 = r7.f277850N
            if (r0 == 0) goto L_0x0a40
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            r0.<init>()
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$31 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$31
            r2.<init>()
            r3 = 100
            r0.postDelayed(r2, r3)
        L_0x0a40:
            java.lang.String r0 = "initPostDescTranslateResultView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.view.View r2 = r7.f277879f
            r3 = 2131314140(0x7f0945dc, float:1.8246697E38)
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTranslateResultView) r2
            r7.f277917y0 = r2
            android.view.View r3 = r7.f277879f
            r4 = 2131300854(0x7f0911f6, float:1.821975E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            float r3 = r3.getTextSize()
            r2.setResultTextSize(r3)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r2 = r7.f277917y0
            android.widget.TextView r2 = r2.getResultTextView()
            r3 = 2131234949(0x7f081085, float:1.8086078E38)
            r2.setBackgroundResource(r3)
            com.tencent.mm.plugin.sns.ui.p5 r2 = new com.tencent.mm.plugin.sns.ui.p5
            java.lang.String r3 = r7.f277829C
            java.lang.String r26 = r10.getLocalid()
            r27 = 0
            r28 = 1
            r29 = 2
            r24 = r2
            r25 = r3
            r24.<init>(r25, r26, r27, r28, r29)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r3 = r7.f277917y0
            android.widget.TextView r3 = r3.getResultTextView()
            r3.setTag(r2)
            uo3.a r2 = r7.f277852Q
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r3 = r7.f277917y0
            android.widget.TextView r3 = r3.getResultTextView()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r7.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r5 = r4.f280384n
            com.tencent.mm.plugin.sns.ui.listener.c r4 = r4.f280381k
            r2.mo108275j(r3, r5, r4)
            java.lang.String r2 = r7.f277829C
            r3 = 4
            boolean r2 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120626g(r2, r3)
            if (r2 == 0) goto L_0x0acf
            java.lang.String r2 = r7.f277829C
            com.tencent.mm.plugin.sns.model.w1$b r2 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120624e(r2)
            if (r2 == 0) goto L_0x0ac7
            boolean r3 = r2.f275306d
            if (r3 == 0) goto L_0x0ac7
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r3 = r7.f277917y0
            r4 = 0
            r3.setVisibility(r4)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r8 = r7.f277917y0
            r9 = 0
            r10 = 1
            java.lang.String r11 = r2.f275304b
            java.lang.String r12 = r2.f275305c
            r13 = 0
            r8.mo133013a(r9, r10, r11, r12, r13)
            goto L_0x0ad6
        L_0x0ac7:
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r2 = r7.f277917y0
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x0ad6
        L_0x0acf:
            r3 = 8
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r2 = r7.f277917y0
            r2.setVisibility(r3)
        L_0x0ad6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.initView():void");
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: j8 */
    public int mo132622j8() {
        SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (this.f277863V0 == 16) {
            SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return 2;
        }
        SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return 1;
    }

    /* renamed from: k8 */
    public final LinearLayout mo132623k8(int i) {
        SnsMethodCalculate.markStartTimeMs("getUrlInker", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        LinearLayout linearLayout = this.f277834E1;
        if (linearLayout == null || i != this.f277836F1) {
            Log.m105925i("MicroMsg.SnsCommentDetailUI", "getUrlInker: inflate viewId:%d", Integer.valueOf(i));
            LinearLayout linearLayout2 = (LinearLayout) C85868k2.m106137b(this).inflate(i, (ViewGroup) null);
            this.f277834E1 = linearLayout2;
            this.f277836F1 = i;
            SnsMethodCalculate.markEndTimeMs("getUrlInker", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return linearLayout2;
        }
        this.f277832D1 = true;
        SnsMethodCalculate.markEndTimeMs("getUrlInker", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return linearLayout;
    }

    public int keyboardState() {
        SnsMethodCalculate.markStartTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C100905b bVar = this.f277882g1;
        if (bVar == null || !bVar.mo140370b()) {
            int keyboardState = super.keyboardState();
            SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return keyboardState;
        }
        int c = this.f277882g1.mo140371c();
        SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return c;
    }

    /* renamed from: l8 */
    public final ArrayList<String> mo132625l8(List<C101804kv2> list) {
        SnsMethodCalculate.markStartTimeMs("handleExportPic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        for (C101804kv2 m : list) {
            String m2 = C94901o.m120385m(m);
            Log.m105924i("MicroMsg.SnsCommentDetailUI", "[handleExportPic] path = " + m2);
            arrayList.add(m2);
        }
        SnsMethodCalculate.markEndTimeMs("handleExportPic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return arrayList;
    }

    /* renamed from: m8 */
    public final boolean mo132626m8(SnsInfo snsInfo) {
        C50903q2 remindInfoGroup;
        SnsMethodCalculate.markStartTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        boolean z = false;
        if (snsInfo == null || snsInfo.getAdSnsInfo() == null || (remindInfoGroup = snsInfo.getAdSnsInfo().getRemindInfoGroup()) == null) {
            Log.m105928w("MicroMsg.SnsCommentDetailUI", "isAtInfoValid called obj is null!");
            SnsMethodCalculate.markEndTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        } else if (mo132622j8() == 2) {
            boolean o8 = mo132628o8(remindInfoGroup.f140096e);
            SnsMethodCalculate.markEndTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return o8;
        } else {
            if (mo132628o8(remindInfoGroup.f140095d) || mo132628o8(remindInfoGroup.f140096e)) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isAtInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return z;
        }
    }

    /* renamed from: n8 */
    public boolean mo132627n8(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        boolean z = true;
        if ((C5431p1.C5432a.m5339j() & 1) > 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return z;
    }

    /* renamed from: o8 */
    public final boolean mo132628o8(C52156yq3 yq32) {
        SnsMethodCalculate.markStartTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (yq32 == null) {
            Log.m105928w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: remindInfo = [null]");
            SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        } else if (yq32.f145465d == 0 && yq32.f145470i == 0) {
            Log.m105928w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: remindInfo.ADGroupId = [" + yq32.f145465d + "] remindInfo.ADGroupId64 = [" + yq32.f145470i + "]");
            SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        } else {
            C51018qv3 qv32 = yq32.f145468g;
            if (qv32 == null || !qv32.f140575g) {
                Log.m105928w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: paidInfo is blank!");
                SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return false;
            }
            C51018qv3 qv33 = yq32.f145469h;
            if (qv33 == null || !qv33.f140575g) {
                Log.m105928w("MicroMsg.SnsCommentDetailUI", "isRemindInfoValid called with: extraInfo is blank!");
                SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("isRemindInfoValid", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return true;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C96014c cVar;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        Log.m105924i("MicroMsg.SnsCommentDetailUI", "onAcvityResult requestCode:" + i);
        if (i == 15) {
            TimelineClickListener timelineClickListener = this.f277868Y;
            if (!(timelineClickListener == null || (cVar = timelineClickListener.f280381k) == null)) {
                cVar.mo133563k(i, i2, intent);
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else if (i == 16) {
            Log.m105924i("MicroMsg.SnsCommentDetailUI", "REQUEST_CODE_FOR_FULLSCREEN");
            FullScreenHelperEvent fullScreenHelperEvent = new FullScreenHelperEvent();
            fullScreenHelperEvent.f264880d.f264881a = 1;
            fullScreenHelperEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else if (i == 2333) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("Select_Contact");
                if (!Util.isNullOrNil(stringExtra)) {
                    String[] split = stringExtra.split(",");
                    if (split.length > 0) {
                        this.f277913x.mo132681C();
                        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(split[0]);
                        if (!Util.isNullOrNil(displayName)) {
                            this.f277913x.mo132696p();
                            SnsCommentFooter snsCommentFooter = this.f277913x;
                            snsCommentFooter.setText("@" + displayName + " ");
                            SnsCommentFooter snsCommentFooter2 = this.f277913x;
                            snsCommentFooter2.setCommentAtPrefix("@" + displayName + " ");
                            this.f277913x.setCommentInfo(new w64());
                            this.f277913x.getCommentInfo().f299703d = split[0];
                            this.f277913x.setCommentFlag(8);
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            if (i == 1 && i2 == -1) {
                Cursor managedQuery = managedQuery(intent.getData(), (String[]) null, (String) null, (String[]) null, (String) null);
                if (managedQuery.moveToFirst()) {
                    String string = managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"));
                    Intent intent2 = new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + string));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        super.onConfigurationChanged(configuration);
        SnsInfo a = C100416r.m131408a(this.f277829C);
        SnsObject f = C94897n1.m120368f(a);
        mo132636w8(f.LikeUserList, f.CommentUserList.isEmpty());
        SnsDetailLuckyHeader snsDetailLuckyHeader = this.f277887j;
        if (snsDetailLuckyHeader != null) {
            snsDetailLuckyHeader.mo130698b(a, this.f277868Y);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Point point = new Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        C94866e1.uy0(point);
        if (this.f277840H1 != null) {
            int Hx0 = C94866e1.Hx0();
            this.f277858T = Hx0;
            this.f277840H1.setImageViewWidth(Hx0);
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onCreate(Bundle bundle) {
        int intExtra;
        Class cls = C102775d.class;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C85875k4.m106195m0(this);
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("checkUseNew", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        if (j == 0) {
            j = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_enhance_like_gallery, 2);
        }
        if (j == 1) {
            this.f277875d = false;
        } else {
            this.f277875d = true;
        }
        SnsMethodCalculate.markEndTimeMs("checkUseNew", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        this.f277869Y0 = ((C102775d) C86312j.m106911c(cls)).mo134167UO().mo142533c(C102776e.C102777a.TimeLine_Comment);
        this.f277871Z0 = ((C102775d) C86312j.m106911c(cls)).mo134167UO().mo142533c(C102776e.C102777a.TimeLine_Like);
        C74779i.m89536a(this, true);
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.BW_97));
        C5431p1.C5432a dy02 = C94866e1.dy0();
        dy02.getClass();
        SnsMethodCalculate.markStartTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        dy02.mo6423t(5, "@__weixintimtline", this);
        SnsMethodCalculate.markEndTimeMs("startServer", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        C100151a.m130851l(2);
        this.f277867X0 = C74942w4.m89784a(this, 14);
        this.f277856S = C85875k4.m106184h(this).y;
        this.f277877e = System.currentTimeMillis();
        this.f277852Q = new C78253a(this);
        this.f277878e1 = getIntent().getBooleanExtra("INTENT_COMMENT_forbid_access", false);
        this.f277876d1 = getIntent().getBooleanExtra("intent_content_enable_show_access_view", false);
        this.f277863V0 = getIntent().getIntExtra("INTENT_COMMENT_TYPE", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("INTENT_NEED_RPT_FEED", false);
        this.f277865W0 = booleanExtra;
        if (booleanExtra) {
            SnsReportHelper.f275506m0.mo131350K();
        }
        SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        ((C77049b) C86312j.m106911c(C77049b.class)).Kn0(this, new C45420d(1));
        SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        String nullAs = Util.nullAs(getIntent().getStringExtra("INTENT_SNSID"), "");
        this.f277829C = nullAs;
        if (Util.isNullOrNil(nullAs)) {
            this.f277829C = C100417r0.m131421j("sns_table_", getIntent().getLongExtra("INTENT_SNSID", 0));
        }
        String nullAs2 = Util.nullAs(getIntent().getStringExtra("INTENT_SNS_LOCAL_ID"), "");
        this.f277831D = nullAs2;
        if (Util.isNullOrNil(nullAs2) && (intExtra = getIntent().getIntExtra("INTENT_SNS_LOCAL_ID", -1)) != -1) {
            this.f277831D = C100417r0.m131421j("sns_table_", (long) intExtra);
        }
        Log.m105925i("MicroMsg.SnsCommentDetailUI", "onCreate: from intent, snsId=%s, localSnsId=%s", this.f277829C, this.f277831D);
        this.f277833E = getIntent().getIntExtra("INTENT_ERROR_OPTIME", -1);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.SnsCommentDetailUI).mo86136FZ(this, getClass().getSimpleName()).mo86179qs(this, C76986a.Moments);
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85932q("MomentsTogetherTailActionFeed", this.f277829C, "Scene", MomentsTogetherTailActionStruct.C1172a.feed);
        String str = this.f277829C;
        aVar.mo85932q("MomentsTogetherTailActionFeed", str, "PublishId", Long.valueOf(C100417r0.m131425n(str)));
        this.f277868Y = new TimelineClickListener(mo132622j8(), this, this.f277891m1) {
            /* renamed from: p */
            public void mo132095p(View view) {
                SnsMethodCalculate.markStartTimeMs("onAdAtBossClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsMethodCalculate.markEndTimeMs("onAdAtBossClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: q */
            public void mo132096q(View view) {
                SnsMethodCalculate.markStartTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsInfo I7 = SnsCommentDetailUI.m121960I7(SnsCommentDetailUI.this, true);
                if (I7 == null) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onCommentClick but snsInfo is null");
                    SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                } else if (SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this) == null || SnsCommentDetailUI.m121968Q7(SnsCommentDetailUI.this) == null) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onCommentClick but commentFooter or commentContainer is null");
                    SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                } else {
                    try {
                        if (!C92086h.m115756c(I7.getLocalid())) {
                            C45199a.m50003a(SnsCommentDetailUI.this.getContext(), SnsCommentDetailUI.this.f277840H1.mo132426b(0));
                            SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                            return;
                        }
                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setCommentInfo((w64) null);
                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setCommentFlag(0);
                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setCommentHint(SnsCommentDetailUI.this.getString(C0966R.string.jjl));
                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setCommentInfo(new w64());
                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).setToSendTextColor(true);
                        SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132683E(true);
                        if (!I7.isAd() || (I7.getTimeLine().ContentObj.f298428i & 8) == 0) {
                            SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132680B(false);
                        } else {
                            SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            boolean m8 = snsCommentDetailUI.mo132626m8(I7);
                            SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                            if (m8) {
                                SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132680B(true);
                            } else {
                                SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132680B(false);
                            }
                        }
                        View Q7 = SnsCommentDetailUI.m121968Q7(SnsCommentDetailUI.this);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(Q7, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$15", "onCommentClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        Q7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(Q7, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$15", "onCommentClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        SnsCommentDetailUI.m121969R7(SnsCommentDetailUI.this);
                        SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                    } catch (Throwable th) {
                        Log.m105920e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onCommentClick and exp is " + th.toString());
                    }
                }
            }

            /* renamed from: r */
            public void mo132097r(View view) {
                SnsMethodCalculate.markStartTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsInfo I7 = SnsCommentDetailUI.m121960I7(SnsCommentDetailUI.this, true);
                if (I7 == null) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onLikeClick but snsInfo is null");
                    SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                    return;
                }
                try {
                    if (this.f280378h != null && I7.getLikeFlag() == 0) {
                        this.f280378h.mo138297d(I7.field_snsId);
                    }
                    if (view instanceof LinearLayout) {
                        SnsCommentDetailUI.m121966O7(SnsCommentDetailUI.this, (LinearLayout) view);
                    }
                    if (C94753a.m119993e()) {
                        C102260r.m134853V(view);
                    }
                    SnsReportHelper.f275506m0.mo131361V().f265948s = 3;
                    if (SnsCommentDetailUI.m121967P7(SnsCommentDetailUI.this) != null && I7.isSocialAttitudeAd()) {
                        SnsCommentDetailUI.m121967P7(SnsCommentDetailUI.this).mo139454g();
                    }
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "In SnsCommentDetailUI, do onLikeClick and exp is " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: s */
            public void mo132098s() {
                SnsMethodCalculate.markStartTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsMethodCalculate.markEndTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: t */
            public void mo132099t(View view) {
                SnsMethodCalculate.markStartTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsCommentDetailUI.m121970S7(SnsCommentDetailUI.this).mo133177c();
                SnsMethodCalculate.markEndTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: u */
            public void mo132100u(View view) {
                SnsMethodCalculate.markStartTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                C43162z1 z1Var = snsCommentDetailUI.f277897p0;
                SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                z1Var.mo67390c();
                SnsCommentDetailUI.this.finish();
                SnsMethodCalculate.markEndTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: v */
            public void mo132101v(Object obj) {
                SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.mo132632s8();
                SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                C96227t4 t4Var = snsCommentDetailUI2.f277825A;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                View view = (View) obj;
                t4Var.mo133892c(view, 2, SnsCommentDetailUI.this.mo132622j8());
                if (view.getTag() instanceof C96235u4) {
                    C96235u4 u4Var = (C96235u4) view.getTag();
                    String str = u4Var.f281206a;
                    int i2 = u4Var.f281207b;
                    SnsInfo b = C100416r.m131409b(str);
                    SnsReportHelper.f275506m0.mo131368b(b, i2);
                    SnsReportHelper.f275506m0.mo131387t(b, i2);
                }
                SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: w */
            public void mo132102w(View view) {
                SnsMethodCalculate.markStartTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsCommentDetailUI.m121970S7(SnsCommentDetailUI.this).mo133178d();
                SnsMethodCalculate.markEndTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: x */
            public void mo132103x(View view) {
                SnsMethodCalculate.markStartTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                Intent intent = new Intent();
                intent.putExtra("result_finish", true);
                SnsCommentDetailUI.this.setResult(-1, intent);
                try {
                    if (view.getTag() != null) {
                        C102244f fVar = (C102244f) view.getTag();
                        SnsInfo DN = C94866e1.Yx0().mo139798DN(fVar.f301109c);
                        if (DN != null) {
                            if (DN.isAd()) {
                                int j8 = SnsCommentDetailUI.this.mo132622j8();
                                Log.m105924i("MicroMsg.TimelineClickListener", "source = " + j8);
                                C102259p.m134829b(2, fVar.f301110d, DN.getAdInfo(j8), DN.getAdXml());
                            }
                        }
                        Log.m105920e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: info is null or not ad");
                    }
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: " + th.toString());
                }
                if (!(view.getTag() == null || this.f280378h == null)) {
                    C102244f fVar2 = (C102244f) view.getTag();
                    this.f280378h.mo138312s(fVar2.f301108b, fVar2.f301109c, fVar2.f301110d, 2);
                }
                SnsCommentDetailUI.this.finish();
                SnsMethodCalculate.markEndTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: y */
            public void mo132104y(View view) {
                SnsMethodCalculate.markStartTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                Intent intent = new Intent();
                intent.putExtra("result_finish", true);
                SnsCommentDetailUI.this.setResult(-1, intent);
                SnsCommentDetailUI.this.finish();
                SnsMethodCalculate.markEndTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }

            /* renamed from: z */
            public void mo132105z(View view) {
                SnsMethodCalculate.markStartTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
                SnsCommentDetailUI.m121970S7(SnsCommentDetailUI.this).mo133176b(view);
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                C43162z1 z1Var = snsCommentDetailUI.f277897p0;
                SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                z1Var.mo67390c();
                SnsMethodCalculate.markEndTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$15");
            }
        };
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.kl8);
        C95733b bVar = r0;
        C95733b bVar2 = new C95733b(this, this.f277868Y, frameLayout, (View) null, new C99020a(this, this.f277868Y, frameLayout, (View) null));
        this.f277870Z = bVar;
        this.f277897p0 = new C43162z1((Context) this, this.f277868Y, frameLayout, (View) null);
        this.f277914x0 = new C43155u8(this, this.f277868Y, frameLayout, (View) null);
        TimelineClickListener timelineClickListener = this.f277868Y;
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.f280381k.mo133553a();
        timelineClickListener.f280368X.alive();
        timelineClickListener.f280369Y.alive();
        SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f277857S0 = getIntent().getBooleanExtra("intent_show_collapse_info", false);
        this.f277859T0 = getIntent().getStringExtra("intent_content_collapse_hint");
        this.f277854R = new C96085n8(this, new n8$$g0() {
            /* renamed from: a */
            public void mo132640a() {
                SnsMethodCalculate.markStartTimeMs("onDataChange", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$16");
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.mo132638y8();
                SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI2.mo132637x8();
                SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("onDataChange", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$16");
            }
        }, mo132622j8(), this.f277891m1);
        SnsMethodCalculate.markStartTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        long currentTimeMillis = System.currentTimeMillis();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("INTENT_SNS_TIMELINEOBJECT");
        if (byteArrayExtra == null) {
            SnsMethodCalculate.markEndTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        } else {
            TimeLineObject timeLineObject = new TimeLineObject();
            try {
                timeLineObject.parseFrom(byteArrayExtra);
                if (C94866e1.Yx0().mo139806SE(new BigInteger(timeLineObject.f283893Id).longValue()) == null) {
                    Log.m105924i("MicroMsg.SnsCommentDetailUI", "info is null, can insert to sns info");
                    SnsInfo snsInfo = new SnsInfo();
                    snsInfo.field_snsId = new BigInteger(timeLineObject.f283893Id).longValue();
                    try {
                        snsInfo.field_content = timeLineObject.toByteArray();
                    } catch (Exception unused) {
                    }
                    snsInfo.field_createTime = timeLineObject.CreateTime;
                    snsInfo.field_userName = timeLineObject.UserName;
                    snsInfo.field_type = timeLineObject.ContentObj.f298424e;
                    snsInfo.setExtFlag();
                    SnsObject snsObject = new SnsObject();
                    snsObject.ObjectDesc = new C51018qv3();
                    try {
                        snsInfo.field_attrBuf = snsObject.toByteArray();
                    } catch (IOException unused2) {
                    }
                    C94866e1.Yx0().insert(snsInfo);
                    Log.m105925i("MicroMsg.FTS.SnsComment", "insert sns obj use time %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } else {
                    Log.m105924i("MicroMsg.SnsCommentDetailUI", "info is not null, can not insert to sns info");
                }
                SnsMethodCalculate.markEndTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            } catch (IOException unused3) {
                SnsMethodCalculate.markEndTimeMs("checkFromSearch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            }
        }
        final SnsInfo f8 = mo132619f8(true);
        Log.m105924i("MicroMsg.SnsCommentDetailUI", "onCreate()  snsId : " + this.f277829C + " localSnsId: " + this.f277831D);
        if (f8 != null) {
            Log.m105925i("MicroMsg.SnsCommentDetailUI", "commentdetail %s", Util.nullAs(f8.getUserName(), ""));
        }
        this.f277889k1 = false;
        if (C100417r0.m131419h(this.f277829C)) {
            if (!C100417r0.m131418g(this.f277829C)) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C94835a0(C100417r0.m131425n(this.f277829C), 0, mo132620g8(f8).adInfoSyncBuffer));
            } else if (f8 == null) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C43036f0(C100417r0.m131425n(this.f277829C)));
            } else if (!C72996z1.m85796D5(f8.getUserName())) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C43036f0(C100417r0.m131425n(this.f277829C)));
            }
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(210, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(213, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1795c0.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(683, this);
        this.f277835F = C94866e1.Jx0();
        this.f277825A = new C96227t4(this);
        this.f277827B = new C95713a5(getContext());
        this.f277847L = new C96174r(this, mo132622j8(), this.f277891m1);
        if (f8 != null) {
            this.f277862V = SnsTimeLineBaseAdapter.m122255q(f8, false);
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("detailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            snsReportHelper.f275511E = System.currentTimeMillis();
            SnsMethodCalculate.markEndTimeMs("detailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            SnsReportHelper snsReportHelper2 = SnsReportHelper.f275506m0;
            snsReportHelper2.getClass();
            SnsMethodCalculate.markStartTimeMs("browsedetailFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            String p0 = C102236a0.m134763p0(f8.field_snsId);
            if (!((ArrayList) snsReportHelper2.f275568y).contains(p0)) {
                ((ArrayList) snsReportHelper2.f275568y).add(p0);
            }
            SnsMethodCalculate.markEndTimeMs("browsedetailFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            SnsReportHelper snsReportHelper3 = SnsReportHelper.f275506m0;
            snsReportHelper3.getClass();
            SnsMethodCalculate.markStartTimeMs("feedDetailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            snsReportHelper3.f275518L = System.currentTimeMillis();
            SnsMethodCalculate.markEndTimeMs("feedDetailPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        if (f8 != null && f8.isAd()) {
            if (this.f277863V0 == 16) {
                this.f277866X = new C98963o(2);
                C115669n.INSTANCE.mo175911u(1697, 17);
            } else {
                this.f277866X = new C98963o(1);
                C115669n.INSTANCE.mo175911u(1697, 16);
            }
            this.f277866X.mo138319z(this.f277856S, getSupportActionBar().mo91099j(), this);
            SnsTimeLineBaseAdapter.m122255q(f8, false);
            this.f277868Y.mo133543G(this.f277866X);
            C95733b bVar3 = this.f277870Z;
            C98963o oVar = this.f277866X;
            bVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            bVar3.f279211d = oVar;
            SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        }
        C102882s0.f303681a.mo142598j();
        initView();
        if (f8 != null && f8.isAd()) {
            this.f277866X.mo138311r(0, f8.getLocalid(), f8.isExposures(), this.f277879f, f8.field_snsId, C94897n1.m120368f(f8), this.f277862V, 2);
        }
        View view = this.f277879f;
        if (!(view == null || f8 == null)) {
            C94571a aVar2 = (C94571a) view.findViewById(C0966R.C0970id.f39);
            C98977w.m128887c(f8, true, (f8.getTimeLine().ContentObj == null || f8.getTimeLine().ContentObj.f298424e != 15 || !(aVar2 instanceof SightPlayImageView)) ? false : ((SightPlayImageView) aVar2).f273545M.mo130050j(), mo132622j8());
        }
        ListView listView = this.f277894o;
        if (listView == null) {
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        listView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$17", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$17");
                if (SnsCommentDetailUI.m121970S7(SnsCommentDetailUI.this) != null) {
                    SnsCommentDetailUI.m121970S7(SnsCommentDetailUI.this).mo133177c();
                }
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$17");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$17", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        });
        C94897n1.m120368f(f8);
        this.f277872a1 = new C57394a0(this);
        if (f8 != null && Util.isEqual(this.f277837G, f8.getUserName())) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                    try {
                        SnsInfo DN = C94866e1.Yx0().mo139798DN(f8.getLocalid());
                        SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                        int i = SnsCommentDetailUI.f277824M1;
                        SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        C57394a0 a0Var = snsCommentDetailUI.f277872a1;
                        SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        String str = snsCommentDetailUI2.f277837G;
                        SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        a0Var.mo80996a(Util.isEqual(str, f8.getUserName()), DN);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SnsCommentDetailUI", e, "", new Object[0]);
                    }
                    SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$18");
                    return true;
                }
            });
        }
        this.f277893n1.alive();
        this.f277895o1.alive();
        this.f277898p1.alive();
        this.f277900q1.alive();
        this.f277915x1.alive();
        this.f277826A1.alive();
        this.f277902r1.alive();
        C78538u.m94868d(this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onDestroy() {
        long j;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C94866e1.dy0().mo6412c(this, 5);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(210, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(213, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(683, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1795c0.CTRL_INDEX, this);
        C94866e1.Fx0().mo131089I(this);
        SnsMethodCalculate.markStartTimeMs("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C96174r rVar = this.f277847L;
        if (rVar != null) {
            SnsMethodCalculate.markStartTimeMs("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            rVar.f280963a = null;
            SnsMethodCalculate.markEndTimeMs("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
        }
        SnsMethodCalculate.markEndTimeMs("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C71253l1.m83680a();
        SnsCommentFooter snsCommentFooter = this.f277913x;
        if (snsCommentFooter != null) {
            snsCommentFooter.mo132717v();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f277877e;
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85930n("MomentsTogetherHistoryBrowsing", "withFriendDetailAction", C61926c.m72691p(C100417r0.m131425n(this.f277829C)), String.format("%d#%d#%d#%d#%d", new Object[]{1, Integer.valueOf(this.f277886i1 ? 1 : 0), Integer.valueOf(this.f277888j1 ? 1 : 0), 0, Long.valueOf(currentTimeMillis)}), C60242i.REPEAT);
        aVar.mo85927k("MomentsTogetherHistoryBrowsing", "withFriendDetailTime", Long.valueOf(System.currentTimeMillis() - this.f277877e), C60242i.APPEND);
        SnsInfo f8 = mo132619f8(false);
        if (f8 != null && f8.isAd()) {
            C98963o oVar = this.f277866X;
            if (oVar != null) {
                oVar.mo138312s(0, f8.getLocalid(), f8.field_snsId, 2);
            }
            ADInfo g8 = mo132620g8(f8);
            String str = g8 == null ? "" : g8.uxInfo;
            if (f8.isRecExpAd()) {
                C33615q Zx0 = C94866e1.Zx0();
                long j2 = f8.field_snsId;
                Zx0.mo59225h(14652, C98962n.m128836a(j2, C102236a0.m134765q0(j2), str, Long.valueOf(this.f277877e), Long.valueOf(System.currentTimeMillis())));
            } else {
                C33615q Zx02 = C94866e1.Zx0();
                long j3 = f8.field_snsId;
                Zx02.mo59225h(12012, C98962n.m128836a(j3, C102236a0.m134765q0(j3), str, Long.valueOf(this.f277877e), Long.valueOf(System.currentTimeMillis())));
            }
            C91998s.m115549c(TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION);
            C102236a0.m134765q0(f8.field_snsId);
            System.currentTimeMillis();
            C100165c cVar = this.f277864W;
            if (cVar != null) {
                cVar.mo139453e();
            }
        }
        TimelineClickListener timelineClickListener = this.f277868Y;
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.f280381k.mo133564l();
        timelineClickListener.f280368X.dead();
        timelineClickListener.f280369Y.dead();
        SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f277893n1.dead();
        this.f277895o1.dead();
        this.f277898p1.dead();
        this.f277900q1.dead();
        this.f277915x1.dead();
        this.f277826A1.dead();
        this.f277902r1.dead();
        if (this.f277830C1 != null) {
            C94866e1.Vx0().mo130997v(this.f277830C1);
        }
        super.onDestroy();
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("detailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsReportHelper.f275511E != 0) {
            snsReportHelper.f275512F += System.currentTimeMillis() - snsReportHelper.f275511E;
            j = 0;
            snsReportHelper.f275511E = 0;
        } else {
            j = 0;
        }
        SnsMethodCalculate.markEndTimeMs("detailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper snsReportHelper2 = SnsReportHelper.f275506m0;
        snsReportHelper2.getClass();
        SnsMethodCalculate.markStartTimeMs("feedDetailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsReportHelper2.f275518L != j) {
            snsReportHelper2.f275519M += System.currentTimeMillis() - snsReportHelper2.f275518L;
            snsReportHelper2.f275518L = 0;
        }
        SnsMethodCalculate.markEndTimeMs("feedDetailPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(!this.f277865W0 || f8 == null || f8.getTimeLine() == null || f8.getTimeLine().ContentObj == null)) {
            SnsAlbumFeedBehaviourStruct V = SnsReportHelper.f275506m0.mo131361V();
            V.f265934e = SnsReportHelper.f275506m0.mo131341B().f266213e;
            V.f265933d = V.mo86045b("ToUsername", SnsReportHelper.f275506m0.mo131341B().f266212d, true);
            V.f265935f = V.mo86045b("FeedId", C102236a0.m134763p0(f8.field_snsId), true);
            V.f265936g = (long) f8.getTimeLine().ContentObj.f298424e;
            SnsReportHelper.f275506m0.mo131377j();
        }
        aVar.mo85919c("MomentsTogetherTailActionFeed", MomentsTogetherTailActionStruct.class.getCanonicalName(), true);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onKeyboardStateChanged() {
        /*
            r6 = this;
            java.lang.String r0 = "onKeyboardStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r6.keyboardState()
            java.lang.String r3 = "MicroMsg.SnsCommentDetailUI"
            r4 = 2
            if (r2 != r4) goto L_0x001b
            java.lang.String r2 = "keybaordhide! "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = 0
            r6.f277919z = r2
            goto L_0x005e
        L_0x001b:
            int r2 = r6.keyboardState()
            r4 = 1
            if (r2 != r4) goto L_0x005e
            java.lang.String r2 = "keybaordShow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r6.mo132632s8()
            java.lang.String r2 = "checkScrollWhenKeyboardUp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r4 = "checkScrollWhenKeyboardUp: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r3 = r6.f277913x
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = "enableUseAdjustNothingConfig"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = ds2.C97532d.f286226a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r5 == 0) goto L_0x004f
            java.lang.Runnable r3 = r6.f277906t1
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$7 r3 = (com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.C955247) r3
            r3.run()
            goto L_0x0054
        L_0x004f:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$ScrollUp r3 = r6.f277904s1
            r3.run()
        L_0x0054:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.ui.b r2 = r6.f277870Z
            if (r2 == 0) goto L_0x005e
            r2.mo133177c()
        L_0x005e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.onKeyboardStateChanged():void");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C94866e1.Vx0().mo130997v(this);
        try {
            ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
            this.f277874c1 = false;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsCommentDetailUI.ScreenShot", th.toString());
        }
        super.onPause();
        C98519c2 c2Var = (C98519c2) C86312j.m106911c(C98519c2.class);
        if (c2Var != null) {
            c2Var.mo57045H5();
        }
        C100905b bVar = this.f277882g1;
        if (bVar != null) {
            bVar.mo140369a();
        }
        SnsCommentFooter snsCommentFooter = this.f277913x;
        if (snsCommentFooter != null) {
            snsCommentFooter.mo132697q();
            this.f277913x.mo132698q(false);
            SnsCommentFooter snsCommentFooter2 = this.f277913x;
            snsCommentFooter2.getClass();
            SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            ChatFooterPanel chatFooterPanel = snsCommentFooter2.f278057p;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100196h();
            }
            snsCommentFooter2.f278052h.onPause();
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        new UIStatusChangedEvent().f193971d.f193972a = 1;
        C98963o oVar = this.f277866X;
        if (oVar != null) {
            oVar.mo138313t();
        }
        C100165c cVar = this.f277864W;
        if (cVar != null) {
            cVar.mo139452b();
        }
        this.f277918y1.dead();
        this.f277920z1.dead();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        try {
            if (!this.f277874c1) {
                Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "onResume callback");
                ScreenShotUtil.setScreenShotCallback(this, this.f277828B1);
                this.f277874c1 = true;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsCommentDetailUI.ScreenShot", th.toString());
        }
        C94866e1.Vx0().mo130978c(this);
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
        aVar.f193973b = 0;
        aVar.f193974c = 1;
        aVar.f193975d = 0;
        aVar.f193972a = 0;
        uIStatusChangedEvent.publish();
        C98963o oVar = this.f277866X;
        if (oVar != null) {
            oVar.mo138315v();
        }
        C100165c cVar = this.f277864W;
        if (cVar != null) {
            cVar.mo139454g();
        }
        super.onResume();
        C100905b bVar = this.f277882g1;
        if (bVar != null) {
            bVar.mo140372d();
        }
        C98519c2 c2Var = (C98519c2) C86312j.m106911c(C98519c2.class);
        if (c2Var == null || !c2Var.mo57046b2(this)) {
            this.f277918y1.alive();
            this.f277920z1.alive();
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r21, int r22, java.lang.String r23, ob0.C117747y r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "onSceneEnd"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            int r7 = r24.getType()
            r8 = 218(0xda, float:3.05E-43)
            if (r7 != r8) goto L_0x0021
            qo3.i0 r7 = r0.f277841I
            if (r7 == 0) goto L_0x0021
            r7.dismiss()
        L_0x0021:
            r7 = 4
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r8[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r22)
            r11 = 1
            r8[r11] = r9
            r9 = 2
            r8[r9] = r3
            r12 = 3
            java.lang.String r13 = r24.toString()
            r8[r12] = r13
            java.lang.String r12 = "MicroMsg.SnsCommentDetailUI"
            java.lang.String r13 = "onSceneEnd errType:%d, errCode:%d, errMsg:%s, scene:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r8)
            if (r1 != 0) goto L_0x0236
            if (r2 != 0) goto L_0x0236
            com.tencent.mm.plugin.sns.ui.a0 r8 = r0.f277872a1
            if (r8 == 0) goto L_0x005d
            qo3.i0 r8 = r8.f164402a
            if (r8 == 0) goto L_0x005d
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L_0x005d
            com.tencent.mm.plugin.sns.ui.a0 r8 = r0.f277872a1
            qo3.i0 r8 = r8.f164402a
            r8.dismiss()
        L_0x005d:
            boolean r8 = r4 instanceof com.tencent.p014mm.plugin.sns.model.C43036f0
            if (r8 == 0) goto L_0x00e2
            r8 = r4
            com.tencent.mm.plugin.sns.model.f0 r8 = (com.tencent.p014mm.plugin.sns.model.C43036f0) r8
            com.tencent.mm.protocal.protobuf.SnsObject r8 = r8.mo67229k1()
            boolean r13 = r0.f277876d1
            if (r13 == 0) goto L_0x00bd
            if (r8 == 0) goto L_0x0076
            long r13 = r8.f283891Id
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x00bd
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onSceneEnd from NetSceneSnsObjectDetial, respObject empty, snsId= "
            r1.append(r2)
            java.lang.String r2 = r0.f277829C
            long r2 = os2.C100417r0.m131425n(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            r1 = 2131305136(0x7f0922b0, float:1.8228434E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00a7
            java.lang.String r2 = "onSceneEnd: show Not Access Layout!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            r1.inflate()
            r0.f277878e1 = r11
        L_0x00a7:
            r1 = 2131313939(0x7f094513, float:1.8246289E38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x00b9
            java.lang.String r2 = "onSceneEnd: forbid access container root"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            r1.setImportantForAccessibility(r7)
        L_0x00b9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x00bd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "onSceneEnd from NetSceneSnsObjectDetial, respObject id= "
            r7.append(r13)
            long r13 = r8.f283891Id
            r7.append(r13)
            java.lang.String r8 = ", snsId= "
            r7.append(r8)
            java.lang.String r8 = r0.f277829C
            long r13 = os2.C100417r0.m131425n(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
        L_0x00e2:
            java.lang.String r7 = r0.f277829C
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = os2.C100416r.m131408a(r7)
            if (r7 != 0) goto L_0x0108
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid pcid:"
            r1.append(r2)
            java.lang.String r2 = r0.f277829C
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            r20.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0108:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "snsId: "
            r8.append(r13)
            java.lang.String r13 = r0.f277829C
            r8.append(r13)
            java.lang.String r13 = "  username:"
            r8.append(r13)
            java.lang.String r13 = r7.getUserName()
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r8)
            android.view.View r8 = r0.f277879f
            if (r8 != 0) goto L_0x013b
            java.lang.String r1 = "fatal error! Sns onSceneEnd before initView and infoHeader is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            r20.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x013b:
            r20.mo132635v8()
            r0.mo132633t8(r7, r10)
            com.tencent.mm.protocal.protobuf.SnsObject r8 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120368f(r7)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "onSceneEnd "
            r13.append(r14)
            java.util.LinkedList<te3.w64> r14 = r8.LikeUserList
            int r14 = r14.size()
            r13.append(r14)
            java.lang.String r14 = " "
            r13.append(r14)
            java.util.LinkedList<te3.w64> r14 = r8.CommentUserList
            int r14 = r14.size()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            java.util.LinkedList<te3.w64> r13 = r0.f277911w
            java.util.LinkedList<te3.w64> r14 = r8.LikeUserList
            java.lang.String r15 = "isTheSameContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
            if (r13 == 0) goto L_0x01bd
            if (r14 != 0) goto L_0x017d
            goto L_0x01bd
        L_0x017d:
            int r11 = r13.size()
            int r10 = r14.size()
            if (r11 == r10) goto L_0x018b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
            goto L_0x01c0
        L_0x018b:
            int r10 = r13.size()
            r11 = 0
        L_0x0190:
            if (r11 >= r10) goto L_0x01b8
            java.lang.Object r18 = r13.get(r11)
            r9 = r18
            te3.w64 r9 = (te3.w64) r9
            java.lang.String r9 = r9.f299703d
            java.lang.Object r18 = r14.get(r11)
            r19 = r10
            r10 = r18
            te3.w64 r10 = (te3.w64) r10
            java.lang.String r10 = r10.f299703d
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01b2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
            goto L_0x01c0
        L_0x01b2:
            int r11 = r11 + 1
            r10 = r19
            r9 = 2
            goto L_0x0190
        L_0x01b8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
            r9 = 1
            goto L_0x01c1
        L_0x01bd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
        L_0x01c0:
            r9 = 0
        L_0x01c1:
            if (r9 != 0) goto L_0x01e1
            java.util.LinkedList<te3.w64> r9 = r8.LikeUserList
            java.util.LinkedList<te3.w64> r10 = r8.CommentUserList
            boolean r10 = r10.isEmpty()
            r0.mo132636w8(r9, r10)
            java.util.LinkedList<te3.w64> r9 = r8.LikeUserList
            r0.f277911w = r9
            nt2.c r9 = r0.f277864W
            if (r9 == 0) goto L_0x01e1
            boolean r9 = r7.isSocialAttitudeAd()
            if (r9 == 0) goto L_0x01e1
            nt2.c r9 = r0.f277864W
            r9.mo139454g()
        L_0x01e1:
            com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader r9 = r0.f277887j
            if (r9 == 0) goto L_0x01ea
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r10 = r0.f277868Y
            r9.mo130698b(r7, r10)
        L_0x01ea:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r7 = r0.f277901r
            java.util.LinkedList<te3.w64> r9 = r8.CommentUserList
            java.util.LinkedList<te3.w64> r8 = r8.LikeUserList
            r7.getClass()
            java.lang.String r10 = "setListInfo"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            r7.f277999d = r9
            r7.f278000e = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$CommentListAdapter r7 = r0.f277901r
            r7.notifyDataSetChanged()
            int r7 = r24.getType()
            r8 = 683(0x2ab, float:9.57E-43)
            if (r7 == r8) goto L_0x0217
            int r7 = r24.getType()
            r8 = 210(0xd2, float:2.94E-43)
            if (r7 != r8) goto L_0x0236
        L_0x0217:
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r24.getType()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            boolean r8 = r0.f277889k1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r9 = 1
            r7[r9] = r8
            java.lang.String r8 = "onScene objectDetail type:%s, isRequestDetail:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r7)
            r0.f277889k1 = r9
        L_0x0236:
            int r7 = r24.getType()
            r8 = 213(0xd5, float:2.98E-43)
            if (r7 != r8) goto L_0x025e
            if (r1 != 0) goto L_0x0242
            if (r2 == 0) goto L_0x025e
        L_0x0242:
            com.tencent.mm.plugin.sns.model.b1 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            r8 = r4
            com.tencent.mm.plugin.sns.model.d0 r8 = (com.tencent.p014mm.plugin.sns.model.C94850d0) r8
            java.lang.String r9 = "getFailOpTime"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.NetSceneSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            int r8 = r8.f274812p
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            ms2.e r7 = r7.mo130960s(r8)
            if (r7 == 0) goto L_0x025e
            r0.mo132629p8(r7)
        L_0x025e:
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122281C8(r1, r2, r3, r4, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C98519c2 c2Var = (C98519c2) C86312j.m106911c(C98519c2.class);
        if (c2Var != null) {
            c2Var.mo57047w2();
        }
        super.onStart();
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        super.onWindowFocusChanged(z);
        Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "hasFocus = " + z);
        if (!z) {
            try {
                ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
                this.f277874c1 = false;
            } catch (Throwable th) {
                Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "hasFocus = " + z);
                Log.m105920e("MicroMsg.SnsCommentDetailUI.ScreenShot", th.toString());
            }
        } else if (!this.f277874c1) {
            Log.m105924i("MicroMsg.SnsCommentDetailUI.ScreenShot", "onWindowFocusChanged callback");
            ScreenShotUtil.setScreenShotCallback(this, this.f277828B1);
            this.f277874c1 = true;
        }
        C100905b bVar = this.f277882g1;
        if (bVar != null && z) {
            bVar.mo140372d();
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: p8 */
    public final void mo132629p8(C99965e eVar) {
        C99965e eVar2 = eVar;
        SnsMethodCalculate.markStartTimeMs("refreshCommentError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        View findViewById = findViewById(C0966R.C0970id.jv_);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.jva);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358941i03);
        int i = eVar2.f292908f;
        if (i == 2) {
            textView.setText(C0966R.string.m9_);
        } else if (i == 1) {
            textView.setText(C0966R.string.m9a);
        }
        if (Util.isNullOrNil(eVar2.f292909g) || Util.isNullOrNil(eVar2.f292910h)) {
            View findViewById3 = findViewById(C0966R.C0970id.jv_);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "refreshCommentError", "(Lcom/tencent/mm/plugin/sns/snstimeline/SnsFailComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.mjc);
            textView2.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar2.f292910h);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(eVar2.f292909g);
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(this, arrayList, eVar2.f292909g, arrayList2, textView2);
        }
        SnsMethodCalculate.markStartTimeMs("updateUnreadErrorNotify", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ((C119157j) C119157j.f356862d).mo183895z(new Runnable(this) {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$58");
                Log.m105924i("MicroMsg.SnsCommentDetailUI", "updateUnreadErrorNotify: ");
                C99966g.f292911a.mo139307a();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$58");
            }
        });
        SnsMethodCalculate.markEndTimeMs("updateUnreadErrorNotify", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("refreshCommentError", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: q8 */
    public final void mo132630q8(boolean z) {
        SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        Log.m105919d("MicroMsg.SnsCommentDetailUI", "scrollDown: needScrollList:%b", Boolean.valueOf(z));
        this.f277919z = false;
        if (this.f277913x.mo132716t()) {
            this.f277913x.mo132719x(0);
            this.f277913x.mo132696p();
            this.f277913x.setCommentHint(getString(C0966R.string.jjl));
        }
        this.f277913x.mo132683E(false);
        if (z) {
            ListView listView = this.f277894o;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "scrollDown", "(Z)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "scrollDown", "(Z)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        }
        SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: r8 */
    public final void mo132631r8() {
        SnsMethodCalculate.markStartTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (keyboardState() == 1 || this.f277913x.mo132700s()) {
            Log.m105924i("MicroMsg.SnsCommentDetailUI", "scrollToKeyBoard: run");
            this.f277904s1.run();
        } else {
            Log.m105924i("MicroMsg.SnsCommentDetailUI", "scrollToKeyBoard: waitForKeyBoardUp");
        }
        SnsMethodCalculate.markEndTimeMs("scrollToKeyBoard", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: s8 */
    public final void mo132632s8() {
        SnsMethodCalculate.markStartTimeMs("setCommentContainerGone", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        Log.m105918d("MicroMsg.SnsCommentDetailUI", "setCommentContainerGone: ");
        View view = this.f277896p;
        if (view == null || view.getVisibility() == 8) {
            SnsMethodCalculate.markEndTimeMs("setCommentContainerGone", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        this.f277896p.startAnimation(this.f277905t);
        this.f277905t.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$54");
                Log.m105918d("MicroMsg.SnsCommentDetailUI", "onAnimationEnd");
                if (SnsCommentDetailUI.m121968Q7(SnsCommentDetailUI.this) != null) {
                    SnsCommentDetailUI.m121968Q7(SnsCommentDetailUI.this).clearAnimation();
                    View Q7 = SnsCommentDetailUI.m121968Q7(SnsCommentDetailUI.this);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(Q7, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$54", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Q7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(Q7, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI$54", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$54");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$54");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$54");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$54");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$54");
            }
        });
        SnsMethodCalculate.markEndTimeMs("setCommentContainerGone", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        SnsMethodCalculate.markStartTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        super.superImportUIComponents(hashSet);
        hashSet.add(C53798a.class);
        SnsMethodCalculate.markEndTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: t8 */
    public final void mo132633t8(SnsInfo snsInfo, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (this.f277873b1 == null) {
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
            TextView textView = new TextView(this);
            this.f277873b1 = textView;
            textView.setLayoutParams(layoutParams);
            this.f277873b1.setText(getString(C0966R.string.jbq));
            this.f277873b1.setTextColor(getResources().getColor(C0966R.color.a7f));
            this.f277873b1.setGravity(17);
            this.f277873b1.setPadding(0, BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 7.0f), 0, BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 12.0f));
            this.f277873b1.setVisibility(8);
            this.f277894o.addFooterView(this.f277873b1);
        }
        if (snsInfo != null) {
            SnsObject f = C94897n1.m120368f(snsInfo);
            SnsMethodCalculate.markStartTimeMs("setSnsInfoPrivateFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            int i = f.ExtFlag;
            if ((i & 32) > 0 || (i & 64) > 0) {
                snsInfo.setLocalPrivate();
            }
            SnsMethodCalculate.markEndTimeMs("setSnsInfoPrivateFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            if ((snsInfo.getLocalPrivate() & 1) != 0) {
                View findViewById = findViewById(C0966R.C0970id.bjo);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setFooter", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setFooter", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TimeLineObject timeLine = snsInfo.getTimeLine();
                if (timeLine != null) {
                    int i2 = timeLine.ContentObj.f298424e;
                    if (i2 == 1) {
                        this.f277873b1.setText(getString(C0966R.string.jbr));
                    } else if (i2 == 2) {
                        this.f277873b1.setText(getString(C0966R.string.jbs));
                    } else if (i2 == 15) {
                        this.f277873b1.setText(getString(C0966R.string.jbt));
                    }
                }
                int i3 = f.ExtFlag;
                if ((i3 & 32) > 0 || (i3 & 64) > 0) {
                    this.f277873b1.setText(C0966R.string.jbp);
                }
                this.f277873b1.setVisibility(0);
            } else {
                SnsCommentFooter snsCommentFooter = this.f277913x;
                if (!(snsCommentFooter == null || snsCommentFooter.getVisibility() == 0 || !snsInfo.isExtFlag())) {
                    this.f277913x.setVisibility(0);
                }
                this.f277873b1.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: u8 */
    public final void mo132634u8(SnsObject snsObject, SnsInfo snsInfo) {
        String str;
        SnsMethodCalculate.markStartTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        View findViewById = this.f277879f.findViewById(C0966R.C0970id.f5715mn);
        if (findViewById == null) {
            Log.m105924i("MicroMsg.SnsCommentDetailUI", "[setGroupIcon] failed, view not found");
            SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        if (!(snsObject == null || (str = this.f277837G) == null || !str.equals(snsObject.Username))) {
            C65874b0.C65875a aVar = C65874b0.f189421a;
            SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupIconBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            boolean z = aVar.mo89926e(snsObject) || aVar.mo89924c(snsObject);
            SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupIconBySnsObject", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (z) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setTag(Integer.valueOf(snsInfo.localid));
                findViewById.setOnClickListener(new SnsCommentDetailUI$$b(this));
                SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            }
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI", "setGroupIcon", "(Lcom/tencent/mm/protocal/protobuf/SnsObject;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.lang.Class<ht1.t1>} */
    /* JADX WARNING: type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v107 */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x05b9, code lost:
        r8 = r34;
        r12 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x06e3, code lost:
        if (r0.getLayoutResource() == -1) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x06e5, code lost:
        r1 = r0.inflate();
        r2 = r10.f277864W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x06eb, code lost:
        if (r2 == null) goto L_0x0703;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x06ed, code lost:
        r2.f293416i = r10.f277879f;
        r3 = r10.f277864W;
        r3.f293417j = (android.widget.FrameLayout) findViewById(com.tencent.p014mm.C0966R.C0970id.kl8);
        r3.mo139451a(r1, r10.f277899q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0703, code lost:
        r10.f277838G1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0707, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x1d61, code lost:
        r14 = r0.f298435s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x20a0, code lost:
        r6 = r4.f298431o;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1003:0x2c51  */
    /* JADX WARNING: Removed duplicated region for block: B:1011:0x2cfc  */
    /* JADX WARNING: Removed duplicated region for block: B:1023:0x2d6f  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x070b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x072d  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0f2d  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x1001  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x1a29  */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x1a35  */
    /* JADX WARNING: Removed duplicated region for block: B:576:0x1a46  */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x1a4f  */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x1a56  */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x1a77  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x1a86  */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x1bbf  */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x1c6f  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x1c86  */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x1cdd  */
    /* JADX WARNING: Removed duplicated region for block: B:622:0x1d2e  */
    /* JADX WARNING: Removed duplicated region for block: B:626:0x1d44  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x029d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:778:0x2468  */
    /* JADX WARNING: Removed duplicated region for block: B:792:0x24f4  */
    /* JADX WARNING: Removed duplicated region for block: B:815:0x25e7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:857:0x276e  */
    /* JADX WARNING: Removed duplicated region for block: B:860:0x277f  */
    /* JADX WARNING: Removed duplicated region for block: B:861:0x27bc  */
    /* JADX WARNING: Removed duplicated region for block: B:864:0x27d4  */
    /* JADX WARNING: Removed duplicated region for block: B:865:0x27d6  */
    /* JADX WARNING: Removed duplicated region for block: B:868:0x2818  */
    /* JADX WARNING: Removed duplicated region for block: B:869:0x2821  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:944:0x29ee  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:950:0x2a4b  */
    /* JADX WARNING: Removed duplicated region for block: B:957:0x2a61  */
    /* JADX WARNING: Removed duplicated region for block: B:958:0x2a7f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:968:0x2acd  */
    /* JADX WARNING: Removed duplicated region for block: B:969:0x2afa  */
    /* JADX WARNING: Removed duplicated region for block: B:972:0x2b12  */
    /* JADX WARNING: Removed duplicated region for block: B:973:0x2b17  */
    /* renamed from: v8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132635v8() {
        /*
            r55 = this;
            r10 = r55
            pl1.e0$a r9 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            java.lang.Class<ny.h> r12 = p629ny.C76979h.class
            java.lang.String r13 = "setHeader"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            boolean r1 = r10.f277889k1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8 = 0
            r0[r8] = r1
            java.lang.String r7 = "MicroMsg.SnsCommentDetailUI"
            java.lang.String r1 = "setHeader isRequestDetail:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            boolean r0 = r10.f277889k1
            r0 = r0 ^ r15
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r10.mo132619f8(r0)
            if (r6 != 0) goto L_0x0031
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r8
        L_0x0031:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setheader "
            r0.append(r1)
            android.view.View r1 = r10.f277879f
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            int r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Hx0()
            r10.f277858T = r0
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r6.getTimeLine()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.ContentDesc
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            zr2.C66976a.m79133d(r0)
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122255q(r6, r8)
            r10.f277862V = r0
            android.view.View r0 = r10.f277879f
            r2 = 2131296773(0x7f090205, float:1.8211472E38)
            android.view.View r0 = r0.findViewById(r2)
            r2 = r0
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r2 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView) r2
            java.lang.Object[] r0 = new java.lang.Object[r15]
            int r3 = r10.f277862V
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r8] = r3
            java.lang.String r3 = "setHeader start: viewType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r0)
            if (r2 == 0) goto L_0x2dcb
            r2.setWeakContext(r10)
            java.lang.String r0 = r6.getLocalid()
            r2.f285320i = r0
            java.lang.String r0 = r6.getUserName()
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            if (r0 == 0) goto L_0x0118
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.usePreferedInfo
            if (r0 == 0) goto L_0x0118
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            java.lang.String r0 = r0.preferAvatar
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01c7
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            java.lang.String r0 = r0.preferAvatar
            java.lang.String r3 = "adId"
            java.lang.String r0 = ps2.C100891r.m132217l(r3, r0)
            r3 = 2131314082(0x7f0945a2, float:1.8246579E38)
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r6.getAdXml()
            java.lang.String r4 = r4.preferAvatar
            r2.setTag(r3, r4)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r3 == 0) goto L_0x00f0
            boolean r3 = jq2.C99009x.m128943d()
            if (r3 == 0) goto L_0x00e3
            jq2.C99009x.m128942c(r2, r0, r15)
            goto L_0x01c7
        L_0x00e3:
            jp2.v r3 = jp2.C98974v.f290191c
            android.graphics.Bitmap r0 = r3.mo138336c(r0)
            if (r0 == 0) goto L_0x01c7
            r2.setImageBitmap(r0)
            goto L_0x01c7
        L_0x00f0:
            boolean r0 = jq2.C99009x.m128943d()
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "detail: download use avatar with cdn, but the statement should not reach!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            java.lang.String r0 = r0.preferAvatar
            jq2.C99009x.m128940a(r2, r0, r15)
            goto L_0x01c7
        L_0x0106:
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            java.lang.String r0 = r0.preferAvatar
            r3 = 41
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$37 r4 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$37
            r4.<init>(r10, r2)
            ps2.C100891r.m132206a(r0, r8, r3, r8, r4)
            goto L_0x01c7
        L_0x0118:
            java.lang.String r0 = r6.getUserName()
            java.lang.String r3 = "@ad"
            boolean r0 = r0.endsWith(r3)
            if (r0 != 0) goto L_0x01c7
            boolean r0 = r6.isAd()
            if (r0 == 0) goto L_0x01a5
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x018a }
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x018a }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x018a }
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = r6.getUserName()     // Catch:{ Exception -> 0x018a }
            com.tencent.mm.storage.z1 r0 = r0.get(r3)     // Catch:{ Exception -> 0x018a }
            if (r0 == 0) goto L_0x0171
            int r0 = r0.mo62907i3()     // Catch:{ Exception -> 0x018a }
            if (r0 == 0) goto L_0x0171
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x018a }
            ln.f r0 = (p196ln.C76705f) r0     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = r6.getUserName()     // Catch:{ Exception -> 0x018a }
            r0.mo106841jW(r2, r3, r15)     // Catch:{ Exception -> 0x018a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018a }
            r0.<init>()     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = "has contact before setAvatar, userName="
            r0.append(r3)     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = r6.getUserName()     // Catch:{ Exception -> 0x018a }
            r0.append(r3)     // Catch:{ Exception -> 0x018a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x018a }
            goto L_0x01b4
        L_0x0171:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018a }
            r0.<init>()     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = "has no contact before setAvatar, userName="
            r0.append(r3)     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = r6.getUserName()     // Catch:{ Exception -> 0x018a }
            r0.append(r3)     // Catch:{ Exception -> 0x018a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ Exception -> 0x018a }
            goto L_0x01b4
        L_0x018a:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAvatar exp="
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x01b4
        L_0x01a5:
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            java.lang.String r3 = r6.getUserName()
            r0.mo106841jW(r2, r3, r15)
        L_0x01b4:
            java.lang.String r0 = r6.getUserName()
            r3 = 2
            r2.mo134068q(r0, r3)
            java.lang.String r0 = r10.f277837G
            java.lang.String r3 = r6.getUserName()
            com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r3)
            r0 = 0
            goto L_0x01c8
        L_0x01c7:
            r0 = 1
        L_0x01c8:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r10.f277868Y
            android.view.View$OnClickListener r3 = r3.f280382l
            r2.setOnClickListener(r3)
            android.view.View r3 = r10.f277879f
            r4 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            boolean r4 = r6.isAd()
            if (r4 != 0) goto L_0x01ee
            java.lang.String r4 = r6.getUserName()
            r3.setTag(r4)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r10.f277868Y
            android.view.View$OnClickListener r4 = r4.f280382l
            r3.setOnClickListener(r4)
        L_0x01ee:
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r8 = r6.getUserName()
            com.tencent.mm.storage.z1 r8 = r4.get(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "snsinfo username "
            r4.append(r15)
            java.lang.String r15 = r6.getUserName()
            r4.append(r15)
            r4.append(r1)
            java.lang.String r15 = r6.getSnsId()
            r4.append(r15)
            r4.append(r1)
            int r15 = r6.getCreateTime()
            r4.append(r15)
            java.lang.String r15 = ", isAdAndUsePreferedInfo="
            r4.append(r15)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            java.lang.String r15 = ""
            if (r8 == 0) goto L_0x0266
            int r4 = r8.mo62907i3()
            if (r4 != 0) goto L_0x0266
            if (r0 != 0) goto L_0x0266
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r6.getUserName()
            r17 = 0
            r0[r17] = r4
            java.lang.String r4 = "getContact %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
            eb0.w2 r0 = eb0.C31519v2.m39436a()
            java.lang.String r4 = r6.getUserName()
            r24 = r7
            eb0.w2$a r7 = r10.f277844J1
            r0.mo55988e(r4, r15, r7)
            goto L_0x0268
        L_0x0266:
            r24 = r7
        L_0x0268:
            if (r8 != 0) goto L_0x026f
            java.lang.String r0 = r6.getUserName()
            goto L_0x0273
        L_0x026f:
            java.lang.String r0 = r8.mo62898f()
        L_0x0273:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r15)
            boolean r4 = r6.isAd()
            if (r4 == 0) goto L_0x029d
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r6.getAdXml()
            if (r4 == 0) goto L_0x0289
            boolean r7 = r4.usePreferedInfo
            if (r7 == 0) goto L_0x028c
            java.lang.String r0 = r4.preferNickName
        L_0x0289:
            r25 = r9
            goto L_0x02ed
        L_0x028c:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r7 == 0) goto L_0x0289
            java.lang.String r7 = r4.nickname
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0289
            java.lang.String r0 = r4.nickname
            goto L_0x0289
        L_0x029d:
            if (r8 == 0) goto L_0x0289
            java.lang.String r4 = r8.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            if (r4 == 0) goto L_0x0289
            java.lang.String r4 = r8.mo73980x2()
            java.lang.String r7 = "3552365301"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0289
            int r4 = r0.length()
            java.lang.Class<he0.j> r7 = he0.C76158j.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            he0.j r7 = (he0.C76158j) r7
            r17 = r4
            java.lang.String r4 = r8.mo73980x2()
            r25 = r9
            java.lang.String r9 = r8.mo73976t2()
            java.lang.String r4 = r7.mo106373wo(r4, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = " @"
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            int r4 = r0.length()
            r9 = r0
            r0 = r17
            goto L_0x02f0
        L_0x02ed:
            r9 = r0
            r0 = 0
            r4 = 0
        L_0x02f0:
            r9.getClass()
            int r7 = r10.f277862V
            r26 = r11
            r11 = 10
            r31 = r13
            if (r7 != r11) goto L_0x02ff
            r7 = 3
            goto L_0x0300
        L_0x02ff:
            r7 = 2
        L_0x0300:
            de3.u r11 = new de3.u
            di3.d r17 = di3.C86312j.m106911c(r12)
            r13 = r17
            ny.h r13 = (p629ny.C76979h) r13
            android.text.SpannableString r13 = r13.mo107057T1(r10, r9)
            r11.<init>((android.text.SpannableString) r13)
            de3.c0 r13 = new de3.c0
            r32 = r14
            vr2.e r14 = new vr2.e
            r33 = r12
            boolean r12 = r6.isAd()
            r27 = r1
            java.lang.String r1 = r8.getUsername()
            r28 = r5
            java.lang.String r5 = r6.getLocalid()
            r34 = r15
            r15 = 2
            r14.<init>(r12, r1, r5, r15)
            com.tencent.mm.plugin.sns.ui.r r1 = r10.f277847L
            r13.<init>(r10, r14, r1, r7)
            r12 = 33
            r11.mo105704a(r13, r9, r12)
            if (r0 < 0) goto L_0x0355
            if (r4 <= r0) goto L_0x0355
            java.lang.Class<he0.j> r1 = he0.C76158j.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            he0.j r1 = (he0.C76158j) r1
            java.lang.String r5 = r8.mo73980x2()
            int r7 = r10.f277867X0
            r13 = 2131099866(0x7f0600da, float:1.7812097E38)
            android.text.style.TextAppearanceSpan r1 = r1.mo106367cY(r10, r5, r7, r13)
            r11.setSpan(r1, r0, r4, r12)
        L_0x0355:
            com.tencent.mm.plugin.sns.ui.l1 r0 = new com.tencent.mm.plugin.sns.ui.l1
            r0.<init>()
            r3.setOnTouchListener(r0)
            boolean r0 = r6.isAd()
            if (r0 == 0) goto L_0x0369
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r3.setText(r11, r0)
            goto L_0x0391
        L_0x0369:
            java.lang.Class<yy.k> r0 = p773yy.C79168k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r17 = r0
            yy.k r17 = (p773yy.C79168k) r17
            java.lang.String r19 = r8.getUsername()
            qy2.a$c r21 = qy2.C63347a.C47892c.SNS_TIMELINE_DETAIL
            float r0 = r3.getTextSize()
            double r0 = (double) r0
            r4 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r0 = r0 * r4
            int r0 = (int) r0
            float r0 = (float) r0
            r18 = r3
            r20 = r11
            r22 = r0
            java.lang.CharSequence r0 = r17.mo74108Fe(r18, r19, r20, r21, r22)
            r3.setText(r0)
        L_0x0391:
            android.content.res.Resources r0 = r55.getResources()
            r1 = 2131836509(0x7f113e5d, float:1.9306187E38)
            java.lang.String r0 = r0.getString(r1)
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r9
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r2.setContentDescription(r0)
            android.view.View r0 = r10.f277879f
            r1 = 2131315898(0x7f094cba, float:1.8250262E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11 = r34
            r0.setText(r11)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f277846K1
            if (r0 != 0) goto L_0x03ce
            com.tencent.mm.plugin.sns.ui.m8 r0 = new com.tencent.mm.plugin.sns.ui.m8
            android.view.View r1 = r10.f277879f
            jp2.o r2 = r10.f277866X
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38 r3 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$38
            r3.<init>()
            r4 = 1
            r0.<init>(r1, r2, r4, r3)
            r10.f277846K1 = r0
        L_0x03ce:
            boolean r0 = r6.isAd()
            r13 = 8
            if (r0 == 0) goto L_0x041d
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f277846K1
            long r1 = r6.field_snsId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            vr2.f r2 = new vr2.f
            com.tencent.mm.plugin.sns.ui.m8 r3 = r10.f277846K1
            r36 = 0
            java.lang.String r4 = r10.f277831D
            long r14 = r6.field_snsId
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = r10.mo132620g8(r6)
            java.lang.String r5 = r5.viewId
            r34 = r2
            r35 = r3
            r37 = r4
            r38 = r14
            r40 = r5
            r34.<init>(r35, r36, r37, r38, r40)
            r0.mo133605d(r1, r2)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f277846K1
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r6.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADInfo r2 = r10.mo132620g8(r6)
            r0.mo133602a(r6, r1, r2)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f277846K1
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r10.f277868Y
            android.view.View$OnClickListener r2 = r1.f280392v
            android.view.View$OnClickListener r1 = r1.f280355K
            r0.mo133606e(r2, r1)
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f277846K1
            r1 = 0
            r0.mo133607f(r1)
            goto L_0x0422
        L_0x041d:
            com.tencent.mm.plugin.sns.ui.m8 r0 = r10.f277846K1
            r0.mo133607f(r13)
        L_0x0422:
            r5 = r28
            java.lang.String r0 = r5.ContentDesc
            android.view.View r1 = r10.f277879f
            r2 = 2131300854(0x7f0911f6, float:1.821975E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r10.f277881g = r1
            com.tencent.mm.plugin.sns.ui.p5 r1 = new com.tencent.mm.plugin.sns.ui.p5
            java.lang.String r2 = r10.f277829C
            java.lang.String r19 = r6.getLocalid()
            r20 = 1
            r21 = 0
            r22 = 2
            r17 = r1
            r18 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            android.widget.TextView r2 = r10.f277881g
            r2.setTag(r1)
            uo3.a r1 = r10.f277852Q
            android.widget.TextView r2 = r10.f277881g
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r4 = r3.f280384n
            com.tencent.mm.plugin.sns.ui.listener.c r3 = r3.f280381k
            r1.mo108275j(r2, r4, r3)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0469
            android.widget.TextView r0 = r10.f277881g
            r0.setVisibility(r13)
            r4 = 2
            r14 = 0
            goto L_0x053d
        L_0x0469:
            android.widget.TextView r1 = r10.f277881g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r3 = r27
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_wxa_short_link_launch_scene"
            java.lang.String r2 = "TIME_LINE"
            r0.putString(r1, r2)
            java.lang.String r1 = "ShareScene"
            r2 = 3
            r0.putInt(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getUserName()
            r1.append(r2)
            java.lang.String r2 = "#"
            r1.append(r2)
            long r2 = r6.field_snsId
            java.lang.String r2 = vr2.C102236a0.m134765q0(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ShareSceneId"
            r0.putString(r2, r1)
            int r1 = r6.field_createTime
            long r1 = (long) r1
            java.lang.String r3 = "CreateTime"
            r0.putLong(r3, r1)
            java.lang.String r1 = "TimelineEnterSource"
            r2 = 3
            r0.putInt(r1, r2)
            int r1 = r6.field_type
            java.lang.String r2 = "SnsContentType"
            r0.putInt(r2, r1)
            long r1 = r6.field_snsId
            java.lang.String r1 = vr2.C102236a0.m134765q0(r1)
            java.lang.String r2 = "serverMsgID"
            r0.putString(r2, r1)
            java.lang.String r1 = r6.getUserName()
            java.lang.String r2 = "msgUsername"
            r0.putString(r2, r1)
            boolean r1 = r6.isAd()
            int r2 = r10.f277862V
            boolean r1 = jq2.C98994k.m128903a(r1, r2)
            if (r1 == 0) goto L_0x050a
            di3.d r1 = di3.C86312j.m106911c(r33)
            r34 = r1
            ny.h r34 = (p629ny.C76979h) r34
            android.widget.TextView r1 = r10.f277881g
            r36 = 2
            r37 = 2
            de3.a r2 = r10.f277848L1
            r39 = 30
            r35 = r1
            r38 = r2
            r40 = r0
            r34.mt0(r35, r36, r37, r38, r39, r40)
            r4 = 2
            r14 = 0
            goto L_0x0526
        L_0x050a:
            di3.d r1 = di3.C86312j.m106911c(r33)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f277881g
            r4 = 2
            r1.Fv0(r2, r4, r4, r0)
            android.widget.TextView r0 = r10.f277881g
            long r1 = r6.field_snsId
            java.lang.CharSequence r3 = r0.getText()
            r14 = 0
            java.lang.CharSequence r1 = zr2.C66976a.m79134f(r1, r3, r14, r4)
            r0.setText(r1)
        L_0x0526:
            android.widget.TextView r0 = r10.f277881g
            r0.setVisibility(r14)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct r0 = r0.mo131361V()
            r1 = 1
            r0.mo126628s(r1)
            ls2.a$a r0 = ls2.C99591a.f291957a
            android.widget.TextView r1 = r10.f277881g
            r0.mo138966a(r6, r1)
        L_0x053d:
            android.view.View r0 = r10.f277879f
            r1 = 2131306355(0x7f092773, float:1.8230907E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            boolean r1 = r10.f277838G1
            r15 = -1
            if (r1 != 0) goto L_0x070b
            r0.setLayoutResource(r15)
            int r1 = r10.f277862V
            switch(r1) {
                case 2: goto L_0x06d2;
                case 3: goto L_0x06c4;
                case 4: goto L_0x06b6;
                case 5: goto L_0x06a8;
                case 6: goto L_0x0555;
                case 7: goto L_0x0555;
                case 8: goto L_0x0555;
                case 9: goto L_0x069a;
                case 10: goto L_0x068c;
                case 11: goto L_0x0672;
                case 12: goto L_0x0555;
                case 13: goto L_0x0658;
                case 14: goto L_0x0555;
                case 15: goto L_0x0640;
                case 16: goto L_0x0555;
                case 17: goto L_0x0555;
                case 18: goto L_0x0631;
                case 19: goto L_0x0617;
                case 20: goto L_0x0608;
                case 21: goto L_0x05f9;
                case 22: goto L_0x0555;
                case 23: goto L_0x05df;
                case 24: goto L_0x0555;
                case 25: goto L_0x0608;
                case 26: goto L_0x05bf;
                case 27: goto L_0x0596;
                case 28: goto L_0x0596;
                case 29: goto L_0x0596;
                case 30: goto L_0x0596;
                case 31: goto L_0x0596;
                case 32: goto L_0x0596;
                case 33: goto L_0x0608;
                case 34: goto L_0x0561;
                case 35: goto L_0x0596;
                case 36: goto L_0x0555;
                case 37: goto L_0x0555;
                case 38: goto L_0x0555;
                case 39: goto L_0x0596;
                case 40: goto L_0x0555;
                case 41: goto L_0x0596;
                default: goto L_0x0555;
            }
        L_0x0555:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r0.setVisibility(r13)
            goto L_0x06df
        L_0x0561:
            r1 = 2131497742(0x7f0c130e, float:1.8619086E38)
            r0.setLayoutResource(r1)
            nt2.a r7 = new nt2.a
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r10.f277868Y
            jp2.o r2 = r10.f277866X
            int r16 = r55.mo132622j8()
            com.tencent.mm.plugin.sns.model.h1 r1 = r10.f277891m1
            r17 = r1
            r1 = r7
            r18 = r2
            r2 = r5
            r19 = r3
            r3 = r6
            r14 = 2
            r4 = r19
            r34 = r5
            r5 = r18
            r35 = r6
            r6 = r55
            r12 = r7
            r41 = r24
            r7 = r16
            r42 = r8
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.f277864W = r12
            goto L_0x05b9
        L_0x0596:
            r34 = r5
            r35 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r1 = 2131497743(0x7f0c130f, float:1.8619088E38)
            r0.setLayoutResource(r1)
            nt2.h r8 = new nt2.h
            int r3 = r10.f277862V
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r6 = r10.f277868Y
            jp2.o r7 = r10.f277866X
            r1 = r8
            r2 = r55
            r4 = r34
            r5 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.f277864W = r8
        L_0x05b9:
            r8 = r34
            r12 = r35
            goto L_0x06df
        L_0x05bf:
            r34 = r5
            r35 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r1 = 2131497604(0x7f0c1284, float:1.8618806E38)
            r0.setLayoutResource(r1)
            nt2.j r1 = new nt2.j
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            jp2.o r3 = r10.f277866X
            r8 = r34
            r12 = r35
            r1.<init>(r8, r12, r2, r3)
            r10.f277864W = r1
            goto L_0x06df
        L_0x05df:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497552(0x7f0c1250, float:1.86187E38)
            r0.setLayoutResource(r1)
            nt2.l r1 = new nt2.l
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            jp2.o r3 = r10.f277866X
            r1.<init>(r8, r12, r2, r3)
            r10.f277864W = r1
            goto L_0x06df
        L_0x05f9:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497657(0x7f0c12b9, float:1.8618913E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x0608:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497654(0x7f0c12b6, float:1.8618907E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x0617:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497690(0x7f0c12da, float:1.861898E38)
            r0.setLayoutResource(r1)
            nt2.b r1 = new nt2.b
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            jp2.o r3 = r10.f277866X
            r1.<init>(r8, r12, r2, r3)
            r10.f277864W = r1
            goto L_0x06df
        L_0x0631:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497657(0x7f0c12b9, float:1.8618913E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x0640:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497744(0x7f0c1310, float:1.861909E38)
            r0.setLayoutResource(r1)
            nt2.k r1 = new nt2.k
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            r1.<init>(r8, r12, r2)
            r10.f277864W = r1
            goto L_0x06df
        L_0x0658:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497546(0x7f0c124a, float:1.8618688E38)
            r0.setLayoutResource(r1)
            nt2.e r1 = new nt2.e
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            jp2.o r3 = r10.f277866X
            r1.<init>(r8, r12, r2, r3)
            r10.f277864W = r1
            goto L_0x06df
        L_0x0672:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497754(0x7f0c131a, float:1.861911E38)
            r0.setLayoutResource(r1)
            nt2.m r1 = new nt2.m
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            jp2.o r3 = r10.f277866X
            r1.<init>(r8, r12, r2, r3)
            r10.f277864W = r1
            goto L_0x06df
        L_0x068c:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497670(0x7f0c12c6, float:1.861894E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x069a:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497690(0x7f0c12da, float:1.861898E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x06a8:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497749(0x7f0c1315, float:1.86191E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x06b6:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497748(0x7f0c1314, float:1.8619098E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x06c4:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497747(0x7f0c1313, float:1.8619096E38)
            r0.setLayoutResource(r1)
            goto L_0x06df
        L_0x06d2:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
            r1 = 2131497750(0x7f0c1316, float:1.8619102E38)
            r0.setLayoutResource(r1)
        L_0x06df:
            int r1 = r0.getLayoutResource()
            if (r1 == r15) goto L_0x0707
            android.view.View r1 = r0.inflate()
            nt2.c r2 = r10.f277864W
            if (r2 == 0) goto L_0x0703
            android.view.View r3 = r10.f277879f
            r2.f293416i = r3
            r2 = 2131315244(0x7f094a2c, float:1.8248936E38)
            android.view.View r2 = r10.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            nt2.c r3 = r10.f277864W
            r3.f293417j = r2
            android.view.View r2 = r10.f277899q
            r3.mo139451a(r1, r2)
        L_0x0703:
            r1 = 1
            r10.f277838G1 = r1
            goto L_0x0712
        L_0x0707:
            r0.setVisibility(r13)
            goto L_0x0712
        L_0x070b:
            r12 = r6
            r42 = r8
            r41 = r24
            r14 = 2
            r8 = r5
        L_0x0712:
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getWidth()
            int r2 = r10.f277862V
            r3 = 6
            r5 = 4
            if (r2 != r3) goto L_0x0730
            r7 = 0
            goto L_0x0ca3
        L_0x0730:
            r3 = 5
            r6 = 32
            if (r2 == r14) goto L_0x21e7
            r7 = 3
            if (r2 == r7) goto L_0x21e7
            if (r2 == r5) goto L_0x21e7
            if (r2 != r3) goto L_0x073e
            goto L_0x21e7
        L_0x073e:
            r7 = 10
            if (r2 != r7) goto L_0x08a8
            r0 = 2131305865(0x7f092589, float:1.8229913E38)
            android.view.View r0 = r10.findViewById(r0)
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = (com.tencent.p014mm.plugin.sns.p106ui.PhotosContent) r0
            r10.f277840H1 = r0
            r0.getClass()
            java.lang.String r1 = "clearImageView"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.PhotosContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.ArrayList<com.tencent.mm.plugin.sns.ui.TagImageView> r0 = r0.f277344e
            r0.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r10.f277840H1
            r1 = 2131296831(0x7f09023f, float:1.821159E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.sns.ui.TagImageView r0 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r0
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            r1.mo132425a(r0)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r10.f277868Y
            android.view.View$OnClickListener r1 = r1.f280385o
            r0.setOnClickListener(r1)
            java.lang.String r1 = r12.getLocalid()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r0)
            com.tencent.mm.plugin.sns.ui.u4 r2 = new com.tencent.mm.plugin.sns.ui.u4
            r2.<init>()
            r2.f281206a = r1
            r7 = 0
            r2.f281207b = r7
            r1 = 1
            r2.f281210e = r1
            r0.setTag(r2)
            android.view.View r0 = r10.f277879f
            r1 = 2131305868(0x7f09258c, float:1.822992E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = eb0.C75592q0.m90789s()
            java.lang.String r2 = r8.UserName
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07d0
            com.tencent.mm.protocal.protobuf.SnsObject r1 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r12)
            te3.h84 r1 = r1.SnsRedEnvelops
            if (r1 == 0) goto L_0x07cc
            int r1 = r1.f134504d
            if (r1 == 0) goto L_0x07cc
            r2 = 2131832564(0x7f112ef4, float:1.9298185E38)
            r3 = 1
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15[r7] = r1
            java.lang.String r1 = r10.getString(r2, r15)
            r0.setText(r1)
            r0.setVisibility(r7)
            goto L_0x07d3
        L_0x07cc:
            r0.setVisibility(r13)
            goto L_0x07d3
        L_0x07d0:
            r0.setVisibility(r13)
        L_0x07d3:
            te3.lv2 r0 = r12.getPostInfo()
            if (r0 == 0) goto L_0x088b
            java.lang.String r1 = eb0.C75592q0.m90789s()
            java.lang.String r2 = r8.UserName
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0810
            com.tencent.mm.plugin.sns.ui.a5 r0 = r10.f277827B
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            java.lang.String r19 = r12.getLocalid()
            r20 = 0
            r21 = 0
            int r22 = r55.hashCode()
            int r2 = r10.f277862V
            r24 = -1
            boolean r25 = r12.isSourceExist(r6)
            r26 = 0
            com.tencent.mm.storage.o3 r27 = com.tencent.p014mm.storage.C96983o3.f284138j
            r28 = 1
            r16 = r0
            r17 = r1
            r18 = r8
            r23 = r2
            r16.mo133157b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0ca3
        L_0x0810:
            boolean r1 = as2.C92086h.m115754a(r12)
            if (r1 == 0) goto L_0x0841
            com.tencent.mm.plugin.sns.ui.a5 r0 = r10.f277827B
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            java.lang.String r19 = r12.getLocalid()
            r20 = 0
            r21 = 0
            int r22 = r55.hashCode()
            int r2 = r10.f277862V
            r24 = -1
            boolean r25 = r12.isSourceExist(r6)
            r26 = 0
            com.tencent.mm.storage.o3 r27 = com.tencent.p014mm.storage.C96983o3.f284138j
            r28 = 0
            r16 = r0
            r17 = r1
            r18 = r8
            r23 = r2
            r16.mo133157b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0ca3
        L_0x0841:
            int r1 = r0.f298730D
            if (r1 != 0) goto L_0x0870
            com.tencent.mm.plugin.sns.ui.a5 r0 = r10.f277827B
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            java.lang.String r19 = r12.getLocalid()
            r20 = 0
            r21 = 0
            int r22 = r55.hashCode()
            int r2 = r10.f277862V
            r24 = -1
            boolean r25 = r12.isSourceExist(r6)
            r26 = 0
            com.tencent.mm.storage.o3 r27 = com.tencent.p014mm.storage.C96983o3.f284138j
            r28 = 1
            r16 = r0
            r17 = r1
            r18 = r8
            r23 = r2
            r16.mo133157b(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0ca3
        L_0x0870:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mediaPostInfo.hbStatus is "
            r1.append(r2)
            int r0 = r0.f298730D
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r41
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0ca3
        L_0x088b:
            r1 = r41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "mediaPostInfo is null "
            r0.append(r2)
            java.lang.String r2 = r12.getLocalid()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0ca3
        L_0x08a8:
            r1 = r41
            r7 = 0
            r0 = 19
            if (r2 != r0) goto L_0x08b1
            goto L_0x0ca3
        L_0x08b1:
            r0 = 9
            if (r2 != r0) goto L_0x0ba5
            com.tencent.mm.plugin.sns.ui.m2 r0 = new com.tencent.mm.plugin.sns.ui.m2
            r0.<init>()
            android.view.View r2 = r10.f277879f
            r6 = 2131299182(0x7f090b6e, float:1.8216358E38)
            android.view.View r6 = r2.findViewById(r6)
            r15 = 2131306251(0x7f09270b, float:1.8230696E38)
            android.view.View r15 = r2.findViewById(r15)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r15 = (com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView) r15
            r0.f280501d = r2
            r0.f280505h = r6
            r14 = 2131314332(0x7f09469c, float:1.8247086E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0.f280506i = r14
            r14 = 2131311498(0x7f093b8a, float:1.8241338E38)
            android.view.View r14 = r2.findViewById(r14)
            com.tencent.mm.ui.widget.MMPinProgressBtn r14 = (com.tencent.p014mm.p136ui.widget.MMPinProgressBtn) r14
            r0.f280507j = r14
            r14 = 2131301687(0x7f091537, float:1.8221439E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0.f280508k = r14
            r14 = 2131301661(0x7f09151d, float:1.8221386E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0.f280509l = r14
            r0.f280502e = r15
            r14 = 1
            r15.setMute(r14)
            java.lang.String r14 = r12.getLocalid()
            boolean r5 = r12.isAd()
            r0.mo133598a(r8, r7, r14, r5)
            android.widget.TextView r5 = r0.f280508k
            r5.setVisibility(r13)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            r5.setTagObject(r0)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            boolean r14 = r12.isAd()
            r5.setIsAdVideo(r14)
            r0.f280512o = r3
            r6.setTag(r0)
            android.view.View r5 = r0.f280505h
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r10.f277868Y
            android.view.View$OnClickListener r14 = r14.f280353I
            r5.setOnClickListener(r14)
            boolean r5 = r12.isAd()
            if (r5 != 0) goto L_0x093f
            uo3.a r5 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r14 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r4 = r14.f280345A
            com.tencent.mm.plugin.sns.ui.listener.c r14 = r14.f280381k
            r5.mo108275j(r6, r4, r14)
        L_0x093f:
            boolean r4 = r12.isAd()
            if (r4 == 0) goto L_0x0996
            boolean r4 = vr2.C102260r.m134846O(r8)
            if (r4 == 0) goto L_0x0996
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r12.getAdXml()
            int r4 = r4.verticalVideoDisplayType
            r5 = 1
            if (r4 != r5) goto L_0x095f
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r4 = r0.f280502e
            android.content.Context r4 = r4.getUIContext()
            android.util.Pair r4 = ad0.C91999u.m115568n(r4)
            goto L_0x0969
        L_0x095f:
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r4 = r0.f280502e
            android.content.Context r4 = r4.getUIContext()
            android.util.Pair r4 = ad0.C91999u.m115566l(r8, r4, r7)
        L_0x0969:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "isVerticalAdVideo=true, snsId="
            r5.append(r14)
            long r13 = r12.field_snsId
            r5.append(r13)
            java.lang.String r13 = ", showW="
            r5.append(r13)
            java.lang.Object r13 = r4.first
            r5.append(r13)
            java.lang.String r13 = ", showH="
            r5.append(r13)
            java.lang.Object r13 = r4.second
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            r1 = 1
            goto L_0x09a5
        L_0x0996:
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r1 = r0.f280502e
            android.content.Context r1 = r1.getUIContext()
            boolean r4 = r12.isAd()
            android.util.Pair r4 = ad0.C91999u.m115566l(r8, r1, r4)
            r1 = 0
        L_0x09a5:
            if (r4 == 0) goto L_0x0a44
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView
            if (r5 == 0) goto L_0x09dd
            boolean r5 = r12.isAd()
            if (r5 != 0) goto L_0x09c1
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            r13 = 1
            r5.setScaleMode(r13)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            com.tencent.mm.ui.widget.QImageView$a r14 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r5.setScaleType(r14)
            goto L_0x09dd
        L_0x09c1:
            r13 = 1
            if (r1 == 0) goto L_0x09d1
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            r5.setScaleMode(r13)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            com.tencent.mm.ui.widget.QImageView$a r13 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r5.setScaleType(r13)
            goto L_0x09dd
        L_0x09d1:
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            r5.setScaleMode(r7)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            com.tencent.mm.ui.widget.QImageView$a r13 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.FIT_XY
            r5.setScaleType(r13)
        L_0x09dd:
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r13 = r4.second
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r15.mo130072c(r5, r13)
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r5 = r0.f280502e
            boolean r13 = r5 instanceof com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView
            if (r13 == 0) goto L_0x09ff
            if (r1 == 0) goto L_0x09fc
            r5.mo130097q()
            goto L_0x09ff
        L_0x09fc:
            r5.setDrawWidthAndHeightFix(r7)
        L_0x09ff:
            android.widget.TextView r1 = r0.f280509l
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.width = r5
            java.lang.Object r5 = r4.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.height = r5
            android.widget.TextView r5 = r0.f280509l
            r5.setLayoutParams(r1)
            r1 = 2131314162(0x7f0945f2, float:1.8246741E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            java.lang.Object r5 = r4.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.width = r5
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.height = r4
            r1.setLayoutParams(r2)
        L_0x0a44:
            te3.j00 r1 = r8.ContentObj
            if (r1 == 0) goto L_0x0a5c
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            int r1 = r1.size()
            r2 = 1
            if (r1 < r2) goto L_0x0a5c
            te3.j00 r1 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            java.lang.Object r1 = r1.get(r7)
            te3.kv2 r1 = (te3.C101804kv2) r1
            goto L_0x0a5d
        L_0x0a5c:
            r1 = 0
        L_0x0a5d:
            te3.j00 r2 = r8.ContentObj
            if (r2 == 0) goto L_0x0ca3
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            int r2 = r2.size()
            r4 = 1
            if (r2 < r4) goto L_0x0ca3
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r2 = r2.mo131141x(r1)
            if (r2 != 0) goto L_0x0adc
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r2 = r2.mo131140w(r1)
            if (r2 == 0) goto L_0x0a91
            android.widget.ImageView r2 = r0.f280506i
            r4 = 8
            r2.setVisibility(r4)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.setVisibility(r7)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.mo153891a()
            goto L_0x0b55
        L_0x0a91:
            boolean r2 = r12.isAd()
            if (r2 == 0) goto L_0x0abb
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r2 = r2.mo131133p(r12)
            if (r2 != r3) goto L_0x0abb
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131097Q(r1)
            android.widget.ImageView r2 = r0.f280506i
            r4 = 8
            r2.setVisibility(r4)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.setVisibility(r7)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.mo153891a()
            goto L_0x0b55
        L_0x0abb:
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131098R(r1)
            android.widget.ImageView r2 = r0.f280506i
            r2.setVisibility(r7)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r4 = 8
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.f280506i
            r4 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r10, r4)
            r2.setImageDrawable(r4)
            goto L_0x0b55
        L_0x0adc:
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r2 = r2.mo131143z(r1)
            if (r2 == 0) goto L_0x0aff
            android.widget.ImageView r2 = r0.f280506i
            r2.setVisibility(r7)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r4 = 8
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.f280506i
            r5 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r10, r5)
            r2.setImageDrawable(r5)
            goto L_0x0b4e
        L_0x0aff:
            r4 = 8
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r2 = r2.mo131139v(r1)
            if (r2 == 0) goto L_0x0b16
            android.widget.ImageView r2 = r0.f280506i
            r2.setVisibility(r4)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.setVisibility(r4)
            goto L_0x0b4e
        L_0x0b16:
            boolean r2 = r12.isAd()
            if (r2 == 0) goto L_0x0b31
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r2 = r2.mo131133p(r12)
            if (r2 > r3) goto L_0x0b31
            android.widget.ImageView r2 = r0.f280506i
            r2.setVisibility(r4)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.setVisibility(r4)
            goto L_0x0b4e
        L_0x0b31:
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131098R(r1)
            android.widget.ImageView r2 = r0.f280506i
            r2.setVisibility(r7)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r0.f280507j
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.f280506i
            r4 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r10, r4)
            r2.setImageDrawable(r4)
        L_0x0b4e:
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView r2 = r0.f280502e
            com.tencent.mm.plugin.sight.decode.model.SightPlayController r2 = r2.f273545M
            r2.mo130049i()
        L_0x0b55:
            r15.setTagObject(r0)
            com.tencent.mm.plugin.sns.model.o r16 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r20 = -1
            int r21 = r55.hashCode()
            r22 = 0
            com.tencent.mm.storage.o3 r23 = com.tencent.p014mm.storage.C96983o3.f284138j
            boolean r24 = r12.isAd()
            r17 = r12
            r18 = r1
            r19 = r15
            r16.mo131110c0(r17, r18, r19, r20, r21, r22, r23, r24)
            r15.start()
            r6.setTag(r0)
            jp2.o r0 = r10.f277866X
            if (r0 == 0) goto L_0x0ca3
            boolean r0 = r12.isAd()
            if (r0 == 0) goto L_0x0b8e
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r0 = r0.mo131133p(r12)
            if (r0 != r3) goto L_0x0b9a
            goto L_0x0b98
        L_0x0b8e:
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r0 = r0.mo131135r(r12)
            if (r0 != r3) goto L_0x0b9a
        L_0x0b98:
            r0 = 1
            goto L_0x0b9b
        L_0x0b9a:
            r0 = 0
        L_0x0b9b:
            jp2.o r1 = r10.f277866X
            long r2 = r12.field_snsId
            r4 = 1
            r1.mo138290E(r2, r0, r4)
            goto L_0x0ca3
        L_0x0ba5:
            r0 = -2
            r4 = 12
            r5 = 2131312533(0x7f093f95, float:1.8243437E38)
            r6 = 2131315436(0x7f094aec, float:1.8249325E38)
            r13 = 2131306309(0x7f092745, float:1.8230813E38)
            r14 = 2131314040(0x7f094578, float:1.8246494E38)
            if (r2 != 0) goto L_0x0cab
            android.view.View r1 = r10.f277879f
            android.view.View r1 = r1.findViewById(r14)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131497691(0x7f0c12db, float:1.8618982E38)
            android.widget.LinearLayout r2 = r10.mo132623k8(r2)
            boolean r3 = r10.f277832D1
            if (r3 != 0) goto L_0x0bf8
            com.tencent.mm.plugin.sns.ui.PhotosContent r3 = r10.f277840H1
            r1.removeView(r3)
            r3 = 3
            r1.addView(r2, r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 == 0) goto L_0x0be2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0.<init>(r1)
            goto L_0x0be8
        L_0x0be2:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r0)
            r0 = r1
        L_0x0be8:
            int r1 = r0.leftMargin
            int r3 = kg3.C76577a.m92151b(r10, r4)
            int r4 = r0.rightMargin
            int r14 = r0.bottomMargin
            r0.setMargins(r1, r3, r4, r14)
            r2.setLayoutParams(r0)
        L_0x0bf8:
            te3.j00 r0 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0c9e
            te3.j00 r0 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            java.lang.Object r0 = r0.get(r7)
            te3.kv2 r0 = (te3.C101804kv2) r0
            android.view.View r1 = r2.findViewById(r13)
            com.tencent.mm.ui.MMImageView r1 = (com.tencent.p014mm.p136ui.MMImageView) r1
            com.tencent.mm.plugin.sns.model.o r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r17 = 2131755090(0x7f100052, float:1.914105E38)
            int r18 = r55.hashCode()
            com.tencent.mm.storage.o3 r19 = com.tencent.p014mm.storage.C96983o3.f284138j
            r15 = r0
            r16 = r1
            r14.mo131104X(r15, r16, r17, r18, r19)
            r3 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r4 = r2.findViewById(r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r10.f277843J = r4
            android.view.View$OnTouchListener r3 = r10.f277839H
            r4.setOnTouchListener(r3)
            java.lang.String r3 = r8.f283893Id
            r10.f277849M = r3
            r55.mo132638y8()
            android.content.Intent r3 = r55.getIntent()
            java.lang.String r4 = "SNS_FROM_MUSIC_ITEM"
            boolean r3 = r3.getBooleanExtra(r4, r7)
            com.tencent.mm.plugin.sns.ui.g0 r4 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r13 = r10.f277831D
            r4.<init>((com.tencent.p014mm.protocal.protobuf.TimeLineObject) r8, (java.lang.String) r13, (boolean) r3)
            r1.setTag(r4)
            com.tencent.mm.plugin.sns.ui.n8 r3 = r10.f277854R
            android.view.View$OnClickListener r3 = r3.f280599q
            r1.setOnClickListener(r3)
            java.lang.String r3 = r0.f298691f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0c68
            android.view.View r4 = r2.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
        L_0x0c68:
            java.lang.String r0 = r0.f298697o
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0c80
            android.view.View r3 = r2.findViewById(r6)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r3.setText(r4, r0)
        L_0x0c80:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r3 = r10.f277831D
            r0.<init>(r8, r3)
            r2.setTag(r0)
            uo3.a r0 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r4 = r3.f280396z
            com.tencent.mm.plugin.sns.ui.listener.c r3 = r3.f280381k
            r0.mo108275j(r2, r4, r3)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r2.setOnClickListener(r0)
            vr2.C102236a0.m134779x0(r1, r10)
            goto L_0x0ca3
        L_0x0c9e:
            r1 = 8
            r2.setVisibility(r1)
        L_0x0ca3:
            r17 = r9
        L_0x0ca5:
            r3 = r31
            r9 = r32
            goto L_0x1d49
        L_0x0cab:
            r3 = 24
            if (r2 != r3) goto L_0x1008
            android.view.View r2 = r10.f277879f
            android.view.View r2 = r2.findViewById(r14)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 2131497688(0x7f0c12d8, float:1.8618976E38)
            android.widget.LinearLayout r3 = r10.mo132623k8(r3)
            boolean r5 = r10.f277832D1
            if (r5 != 0) goto L_0x0cf1
            com.tencent.mm.plugin.sns.ui.PhotosContent r5 = r10.f277840H1
            r2.removeView(r5)
            r5 = 3
            r2.addView(r3, r5)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L_0x0cdb
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r0.<init>(r2)
            goto L_0x0ce1
        L_0x0cdb:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r15, r0)
            r0 = r2
        L_0x0ce1:
            int r2 = r0.leftMargin
            int r4 = kg3.C76577a.m92151b(r10, r4)
            int r5 = r0.rightMargin
            int r6 = r0.bottomMargin
            r0.setMargins(r2, r4, r5, r6)
            r3.setLayoutParams(r0)
        L_0x0cf1:
            java.lang.String r0 = r8.f283893Id
            r10.f277849M = r0
            r0 = 2131312651(0x7f09400b, float:1.8243677E38)
            android.view.View r0 = r3.findViewById(r0)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r0
            if (r0 != 0) goto L_0x0d08
            r4 = r31
            r2 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            return r7
        L_0x0d08:
            r4 = r31
            r2 = r32
            androidx.appcompat.app.AppCompatActivity r5 = r55.getContext()
            r6 = 4
            int r5 = kg3.C76577a.m92151b(r5, r6)
            float r5 = (float) r5
            r0.setRadius(r5)
            r5 = 2131298170(0x7f09077a, float:1.8214306E38)
            android.view.View r5 = r0.findViewById(r5)
            r6 = 2131309768(0x7f0934c8, float:1.823783E38)
            android.view.View r0 = r0.findViewById(r6)
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r6 == 0) goto L_0x0d34
            r6 = 2131234979(0x7f0810a3, float:1.808614E38)
            r0.setBackgroundResource(r6)
            goto L_0x0d3a
        L_0x0d34:
            r6 = 2131234980(0x7f0810a4, float:1.8086141E38)
            r0.setBackgroundResource(r6)
        L_0x0d3a:
            r6 = 2131299373(0x7f090c2d, float:1.8216746E38)
            android.view.View r6 = r0.findViewById(r6)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r6 = (com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView) r6
            r13 = 2131299377(0x7f090c31, float:1.8216754E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131299378(0x7f090c32, float:1.8216756E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = 2131299375(0x7f090c2f, float:1.821675E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r7 = 2131299374(0x7f090c2e, float:1.8216748E38)
            android.view.View r7 = r0.findViewById(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            r10.f277845K = r7
            r32 = r2
            android.view.View$OnTouchListener r2 = r10.f277839H
            r7.setOnTouchListener(r2)
            te3.j00 r2 = r8.ContentObj
            if (r2 == 0) goto L_0x0ecb
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0d88
            te3.j00 r2 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            r7 = 0
            java.lang.Object r2 = r2.get(r7)
            te3.kv2 r2 = (te3.C101804kv2) r2
            goto L_0x0d89
        L_0x0d88:
            r2 = 0
        L_0x0d89:
            te3.j00 r7 = r8.ContentObj
            te3.t23 r7 = r7.f298439w
            if (r7 == 0) goto L_0x0ea8
            java.lang.String r7 = r7.f185462g
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r16 != 0) goto L_0x0e32
            r16 = r2
            r31 = r4
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = 0
            r4[r2] = r7
            java.lang.String r2 = "has mvInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r17 = r9
            r9 = 6
            int r4 = kg3.C76577a.m92151b(r4, r9)
            r2.topMargin = r4
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2
            int r4 = kg3.C76577a.m92151b(r4, r9)
            r2.topMargin = r4
            r2 = 2131310717(0x7f09387d, float:1.8239754E38)
            android.view.View r2 = r0.findViewById(r2)
            k20.a r4 = new k20.a
            r4.<init>()
            r9 = 0
            k20.C60958c.m71442b(r9, r4)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "setHeader"
            java.lang.String r22 = "()Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r9 = 0
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r20 = "setHeader"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r2 = 0
            r15.setVisibility(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            androidx.appcompat.app.AppCompatActivity r4 = r55.getContext()
            r9 = 2131833324(0x7f1131ec, float:1.9299727E38)
            java.lang.String r4 = r4.getString(r9)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r15.setText(r2)
            goto L_0x0ea1
        L_0x0e32:
            r16 = r2
            r31 = r4
            r17 = r9
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r4 = 0
            r2.topMargin = r4
            android.view.ViewGroup$LayoutParams r2 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 4
            int r4 = kg3.C76577a.m92151b(r4, r9)
            r2.topMargin = r4
            r2 = 2131310717(0x7f09387d, float:1.8239754E38)
            android.view.View r2 = r0.findViewById(r2)
            k20.a r4 = new k20.a
            r4.<init>()
            r9 = 8
            k20.C60958c.m71442b(r9, r4)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "setHeader"
            java.lang.String r22 = "()Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r9 = 0
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r20 = "setHeader"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r15.setText(r11)
            r2 = 8
            r15.setVisibility(r2)
        L_0x0ea1:
            te3.j00 r2 = r8.ContentObj
            te3.t23 r2 = r2.f298439w
            java.lang.String r2 = r2.f185461f
            goto L_0x0eb0
        L_0x0ea8:
            r16 = r2
            r31 = r4
            r17 = r9
            r2 = r11
            r7 = r2
        L_0x0eb0:
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r15 = 1
            r4 = r4 ^ r15
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r18 = 0
            r9[r18] = r4
            r9[r15] = r7
            java.lang.String r4 = "coverInfo: hasCover:%b, postInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r9)
            r4 = r16
            goto L_0x0ed1
        L_0x0ecb:
            r31 = r4
            r17 = r9
            r2 = r11
            r4 = 0
        L_0x0ed1:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 != 0) goto L_0x0edf
            java.lang.String r7 = za2.C102984b.m136166c(r2)
        L_0x0edb:
            r9 = r0
            r41 = r1
            goto L_0x0f27
        L_0x0edf:
            if (r4 == 0) goto L_0x0f23
            java.lang.String r2 = r4.f298694i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0ef0
            java.lang.String r2 = r4.f298694i
            java.lang.String r7 = za2.C102984b.m136166c(r2)
            goto L_0x0edb
        L_0x0ef0:
            os2.j0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            int r7 = r4.f298701s
            r9 = r0
            r41 = r1
            long r0 = (long) r7
            os2.i0 r0 = r2.mo139867LL(r0)
            java.lang.String r1 = r0.mo139851e()
            java.lang.String r1 = vr2.C102236a0.m134733a0(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r0 = r0.mo139851e()
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r7, r0)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r7 = r2
            goto L_0x0f27
        L_0x0f23:
            r9 = r0
            r41 = r1
            r7 = r11
        L_0x0f27:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x1001
            hc0.c$b r0 = new hc0.c$b
            r0.<init>()
            r0.mo32671f(r7)
            r1 = 1
            r0.mo32677l(r1)
            r0.mo32675j(r1)
            r0.mo32668c(r1)
            r0.mo32678m(r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2
            int r1 = kg3.C76577a.m92151b(r1, r3)
            float r1 = (float) r1
            r0.mo32676k(r1)
            hc0.c r0 = r0.mo32666a()
            gc0.a r1 = gc0.C20828a.m22825b()
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$41 r3 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$41
            r3.<init>(r10, r5)
            r1.mo32520i(r2, r6, r0, r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f277845K
            r1 = 0
            r0.setPressed(r1)
            r55.mo132637x8()
            if (r4 == 0) goto L_0x0f6d
            java.lang.String r0 = r4.f298691f
            goto L_0x0f6e
        L_0x0f6d:
            r0 = r11
        L_0x0f6e:
            te3.j00 r1 = r8.ContentObj
            te3.t23 r1 = r1.f298439w
            if (r1 == 0) goto L_0x0f8a
            java.lang.String r1 = r1.f185463h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0f8a
            r1 = 0
            r13.setVisibility(r1)
            te3.j00 r0 = r8.ContentObj
            te3.t23 r0 = r0.f298439w
            java.lang.String r0 = r0.f185463h
            r13.setText(r0)
            goto L_0x0f9e
        L_0x0f8a:
            r1 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0f98
            r13.setVisibility(r1)
            r13.setText(r0)
            goto L_0x0f9e
        L_0x0f98:
            r13.setText(r11)
            r13.setVisibility(r1)
        L_0x0f9e:
            if (r4 == 0) goto L_0x0fa3
            java.lang.String r0 = r4.f298697o
            goto L_0x0fa4
        L_0x0fa3:
            r0 = r11
        L_0x0fa4:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0fb8
            r14.setVisibility(r1)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r14.setText(r1, r0)
            goto L_0x0fbf
        L_0x0fb8:
            java.lang.String r0 = "Not allow title is empty"
            r1 = r41
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0fbf:
            te3.j00 r0 = r8.ContentObj
            te3.t23 r1 = r0.f298439w
            if (r1 != 0) goto L_0x0fcc
            te3.t23 r1 = new te3.t23
            r1.<init>()
            r0.f298439w = r1
        L_0x0fcc:
            te3.j00 r0 = r8.ContentObj
            te3.t23 r0 = r0.f298439w
            r0.f185472t = r7
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r1 = 2
            r0.f279454e = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r10.f277845K
            r1.setTag(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r10.f277845K
            com.tencent.mm.plugin.sns.ui.n8 r2 = r10.f277854R
            android.view.View$OnClickListener r2 = r2.f280600r
            r1.setOnClickListener(r2)
            r9.setTag(r0)
            uo3.a r0 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r2 = r1.f280396z
            com.tencent.mm.plugin.sns.ui.listener.c r1 = r1.f280381k
            r0.mo108275j(r9, r2, r1)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280589g
            r9.setOnClickListener(r0)
            goto L_0x0ca5
        L_0x1001:
            r7 = 8
            r3.setVisibility(r7)
            goto L_0x0ca5
        L_0x1008:
            r17 = r9
            r3 = r31
            r9 = r32
            r7 = 8
            r5 = 13
            if (r2 != r5) goto L_0x1025
            android.widget.TextView r1 = r10.f277881g
            r1.setVisibility(r7)
            android.view.View r1 = r10.f277899q
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r15, r0)
            r1.setLayoutParams(r2)
            goto L_0x1d49
        L_0x1025:
            r5 = 11
            if (r2 != r5) goto L_0x102b
            goto L_0x1d49
        L_0x102b:
            r5 = 34
            if (r2 != r5) goto L_0x1031
            goto L_0x1d49
        L_0x1031:
            boolean r2 = nu2.C100202d.m130999b(r2)
            if (r2 == 0) goto L_0x1039
            goto L_0x1d49
        L_0x1039:
            int r2 = r10.f277862V
            r5 = 15
            if (r2 != r5) goto L_0x1041
            goto L_0x1d49
        L_0x1041:
            r7 = 16
            if (r2 != r7) goto L_0x16ff
            android.view.View r2 = r10.f277879f
            android.view.View r2 = r2.findViewById(r14)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r7 = 2131497687(0x7f0c12d7, float:1.8618974E38)
            android.widget.LinearLayout r7 = r10.mo132623k8(r7)
            boolean r14 = r10.f277832D1
            if (r14 != 0) goto L_0x1087
            com.tencent.mm.plugin.sns.ui.PhotosContent r14 = r10.f277840H1
            r2.removeView(r14)
            r14 = 3
            r2.addView(r7, r14)
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            if (r2 == 0) goto L_0x1071
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            r0.<init>(r2)
            goto L_0x1077
        L_0x1071:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r15, r0)
            r0 = r2
        L_0x1077:
            int r2 = r0.leftMargin
            int r4 = kg3.C76577a.m92151b(r10, r4)
            int r14 = r0.rightMargin
            int r5 = r0.bottomMargin
            r0.setMargins(r2, r4, r14, r5)
            r7.setLayoutParams(r0)
        L_0x1087:
            android.view.View r0 = r7.findViewById(r13)
            com.tencent.mm.ui.MMImageView r0 = (com.tencent.p014mm.p136ui.MMImageView) r0
            r2 = 0
            r0.setVisibility(r2)
            android.view.View r2 = r7.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            te3.j00 r4 = r8.ContentObj
            te3.rk1 r5 = r4.f298431o
            if (r5 == 0) goto L_0x11a5
            java.lang.String r4 = "tlObj.ContentObj.finderShareObject not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            te3.j00 r1 = r8.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = vr2.C102236a0.m134703A(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x10c4
            te3.j00 r1 = r8.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185187h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x10c4
            te3.j00 r1 = r8.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185187h
            goto L_0x1108
        L_0x10c4:
            te3.j00 r1 = r8.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = r1.f185187h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x10f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            te3.j00 r4 = r8.ContentObj
            te3.rk1 r4 = r4.f298431o
            java.lang.String r4 = vr2.C102236a0.m134703A(r4)
            r1.append(r4)
            java.lang.String r4 = ": "
            r1.append(r4)
            te3.j00 r4 = r8.ContentObj
            te3.rk1 r4 = r4.f298431o
            java.lang.String r4 = r4.f185187h
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x1108
        L_0x10f3:
            r1 = 2131837137(0x7f1140d1, float:1.930746E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            te3.j00 r4 = r8.ContentObj
            te3.rk1 r4 = r4.f298431o
            java.lang.String r4 = vr2.C102236a0.m134703A(r4)
            r6 = 0
            r5[r6] = r4
            java.lang.String r1 = r10.getString(r1, r5)
        L_0x1108:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.j00 r1 = r8.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.util.LinkedList<te3.pk1> r1 = r1.f185190n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x1194
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r2 = r8.ContentObj
            te3.rk1 r2 = r2.f298431o
            java.util.LinkedList<te3.pk1> r2 = r2.f185190n
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            te3.pk1 r2 = (te3.C64628pk1) r2
            java.lang.String r2 = r2.f184828f
            r1.f298692g = r2
            te3.j00 r2 = r8.ContentObj
            te3.rk1 r2 = r2.f298431o
            java.util.LinkedList<te3.pk1> r2 = r2.f185190n
            java.lang.Object r2 = r2.get(r4)
            te3.pk1 r2 = (te3.C64628pk1) r2
            java.lang.String r2 = r2.f184828f
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            te3.j00 r2 = r8.ContentObj
            te3.rk1 r2 = r2.f298431o
            java.util.LinkedList<te3.pk1> r2 = r2.f185190n
            r5 = 0
            java.lang.Object r2 = r2.get(r5)
            te3.pk1 r2 = (te3.C64628pk1) r2
            float r2 = r2.f184829g
            r4.f298875d = r2
            te3.mv2 r2 = r1.f298698p
            te3.j00 r4 = r8.ContentObj
            te3.rk1 r4 = r4.f298431o
            java.util.LinkedList<te3.pk1> r4 = r4.f185190n
            java.lang.Object r4 = r4.get(r5)
            te3.pk1 r4 = (te3.C64628pk1) r4
            float r4 = r4.f184830h
            r2.f298876e = r4
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r55.hashCode()
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r8.CreateTime
            r5.mo135628a(r6)
            r2.mo131105Y(r1, r0, r4, r5)
        L_0x1194:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x11a5:
            te3.fw2 r5 = r4.f298436t
            if (r5 == 0) goto L_0x12c0
            java.lang.String r4 = "tlObj.ContentObj.megaVideoShareObject not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            te3.j00 r1 = r8.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183243f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x11ce
            te3.j00 r1 = r8.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183245h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x11ce
            te3.j00 r1 = r8.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183245h
            goto L_0x120e
        L_0x11ce:
            te3.j00 r1 = r8.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183245h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x11fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            te3.j00 r4 = r8.ContentObj
            te3.fw2 r4 = r4.f298436t
            java.lang.String r4 = r4.f183243f
            r1.append(r4)
            java.lang.String r4 = ": "
            r1.append(r4)
            te3.j00 r4 = r8.ContentObj
            te3.fw2 r4 = r4.f298436t
            java.lang.String r4 = r4.f183245h
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x120e
        L_0x11fb:
            r1 = 2131837137(0x7f1140d1, float:1.930746E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            te3.j00 r4 = r8.ContentObj
            te3.fw2 r4 = r4.f298436t
            java.lang.String r4 = r4.f183243f
            r6 = 0
            r5[r6] = r4
            java.lang.String r1 = r10.getString(r1, r5)
        L_0x120e:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.j00 r1 = r8.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.util.LinkedList<te3.ew2> r1 = r1.f183247j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x12af
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r2 = r8.ContentObj
            te3.fw2 r2 = r2.f298436t
            java.util.LinkedList<te3.ew2> r2 = r2.f183247j
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            te3.ew2 r2 = (te3.C64350ew2) r2
            java.lang.String r2 = r2.f183043h
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x1251
            te3.j00 r2 = r8.ContentObj
            te3.fw2 r2 = r2.f298436t
            java.util.LinkedList<te3.ew2> r2 = r2.f183247j
            java.lang.Object r2 = r2.get(r4)
            te3.ew2 r2 = (te3.C64350ew2) r2
            java.lang.String r2 = r2.f183043h
            goto L_0x125f
        L_0x1251:
            te3.j00 r2 = r8.ContentObj
            te3.fw2 r2 = r2.f298436t
            java.util.LinkedList<te3.ew2> r2 = r2.f183247j
            java.lang.Object r2 = r2.get(r4)
            te3.ew2 r2 = (te3.C64350ew2) r2
            java.lang.String r2 = r2.f183040e
        L_0x125f:
            r1.f298692g = r2
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            te3.j00 r2 = r8.ContentObj
            te3.fw2 r2 = r2.f298436t
            java.util.LinkedList<te3.ew2> r2 = r2.f183247j
            r5 = 0
            java.lang.Object r2 = r2.get(r5)
            te3.ew2 r2 = (te3.C64350ew2) r2
            float r2 = r2.f183041f
            r4.f298875d = r2
            te3.mv2 r2 = r1.f298698p
            te3.j00 r4 = r8.ContentObj
            te3.fw2 r4 = r4.f298436t
            java.util.LinkedList<te3.ew2> r4 = r4.f183247j
            java.lang.Object r4 = r4.get(r5)
            te3.ew2 r4 = (te3.C64350ew2) r4
            float r4 = r4.f183042g
            r2.f298876e = r4
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r55.hashCode()
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r8.CreateTime
            r5.mo135628a(r6)
            r2.mo131105Y(r1, r0, r4, r5)
        L_0x12af:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x12c0:
            te3.tk1 r5 = r4.f298438v
            if (r5 == 0) goto L_0x137d
            java.lang.String r4 = "tlObj.ContentObj.finderShareTopic not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r1 = 2131821537(0x7f1103e1, float:1.927582E38)
            java.lang.String r1 = r10.getString(r1)
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298438v
            if (r4 == 0) goto L_0x1306
            int r5 = r4.f185604e
            r6 = 7
            if (r5 != r6) goto L_0x12e4
            te3.bf0 r4 = r4.f185609j
            if (r4 == 0) goto L_0x12e4
            java.lang.String r1 = com.tencent.p014mm.modelstat.C92859v.m117125c(r4)
        L_0x12e4:
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298438v
            java.lang.String r4 = r4.f185606g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x1306
            r4 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r5 = r8.ContentObj
            te3.tk1 r5 = r5.f298432p
            java.lang.String r5 = r5.f185606g
            r4.setText(r5)
        L_0x1306:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.j00 r1 = r8.ContentObj
            te3.tk1 r1 = r1.f298438v
            java.lang.String r1 = r1.f185605f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x135e
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r2 = r8.ContentObj
            te3.tk1 r2 = r2.f298438v
            java.lang.String r2 = r2.f185605f
            r1.f298692g = r2
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            r2 = 0
            r4.f298875d = r2
            r4.f298876e = r2
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            di3.d r1 = di3.C86312j.m106911c(r26)
            ht1.t1 r1 = (ht1.C60200t1) r1
            te3.j00 r2 = r8.ContentObj
            te3.tk1 r2 = r2.f298438v
            java.lang.String r2 = r2.f185605f
            r1.mo76882tg(r2, r0)
            goto L_0x136c
        L_0x135e:
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2 = 2131755877(0x7f100365, float:1.9142646E38)
            int r4 = r55.hashCode()
            r1.mo131095O(r0, r15, r2, r4)
        L_0x136c:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x137d:
            te3.tk1 r5 = r4.f298442z
            if (r5 == 0) goto L_0x143b
            java.lang.String r4 = "tlObj.ContentObj.finderShareMusicTopic not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r1 = 2131821537(0x7f1103e1, float:1.927582E38)
            java.lang.String r1 = r10.getString(r1)
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298442z
            if (r4 == 0) goto L_0x13c4
            int r5 = r4.f185604e
            r6 = 15
            if (r5 != r6) goto L_0x13a2
            te3.bf0 r4 = r4.f185609j
            if (r4 == 0) goto L_0x13a2
            java.lang.String r1 = com.tencent.p014mm.modelstat.C92859v.m117125c(r4)
        L_0x13a2:
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298442z
            java.lang.String r4 = r4.f185606g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x13c4
            r4 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r5 = r8.ContentObj
            te3.tk1 r5 = r5.f298442z
            java.lang.String r5 = r5.f185606g
            r4.setText(r5)
        L_0x13c4:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.j00 r1 = r8.ContentObj
            te3.tk1 r1 = r1.f298442z
            java.lang.String r1 = r1.f185605f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x141c
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r2 = r8.ContentObj
            te3.tk1 r2 = r2.f298442z
            java.lang.String r2 = r2.f185605f
            r1.f298692g = r2
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            r2 = 0
            r4.f298875d = r2
            r4.f298876e = r2
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r1)
            di3.d r1 = di3.C86312j.m106911c(r26)
            ht1.t1 r1 = (ht1.C60200t1) r1
            te3.j00 r2 = r8.ContentObj
            te3.tk1 r2 = r2.f298442z
            java.lang.String r2 = r2.f185605f
            r1.mo76882tg(r2, r0)
            goto L_0x142a
        L_0x141c:
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2 = 2131234159(0x7f080d6f, float:1.8084476E38)
            int r4 = r55.hashCode()
            r1.mo131095O(r0, r15, r2, r4)
        L_0x142a:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x143b:
            te3.tk1 r5 = r4.f298432p
            if (r5 == 0) goto L_0x14fe
            java.lang.String r4 = "tlObj.ContentObj.finderShareTopic not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r1 = 2131821537(0x7f1103e1, float:1.927582E38)
            java.lang.String r1 = r10.getString(r1)
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r5 = r4.f298432p
            if (r5 == 0) goto L_0x14a3
            int r1 = r5.f185604e
            r6 = 1
            if (r1 != r6) goto L_0x146f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "#"
            r1.append(r4)
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298432p
            java.lang.String r4 = r4.f185603d
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x1481
        L_0x146f:
            r6 = 7
            if (r1 != r6) goto L_0x147f
            te3.bf0 r1 = r5.f185609j
            if (r1 == 0) goto L_0x147f
            te3.tk1 r1 = r4.f298438v
            te3.bf0 r1 = r1.f185609j
            java.lang.String r1 = com.tencent.p014mm.modelstat.C92859v.m117125c(r1)
            goto L_0x1481
        L_0x147f:
            java.lang.String r1 = r5.f185603d
        L_0x1481:
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298432p
            java.lang.String r4 = r4.f185606g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x14a3
            r4 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r5 = r8.ContentObj
            te3.tk1 r5 = r5.f298432p
            java.lang.String r5 = r5.f185606g
            r4.setText(r5)
        L_0x14a3:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.kv2 r2 = new te3.kv2
            r2.<init>()
            te3.j00 r4 = r8.ContentObj
            te3.tk1 r4 = r4.f298432p
            java.lang.String r4 = r4.f185605f
            r2.f298692g = r4
            r2.f298694i = r4
            r2.f298690e = r1
            r1 = 1
            r2.f298695j = r1
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r2.f298698p = r4
            r2.f298693h = r1
            r1 = 0
            r4.f298875d = r1
            r4.f298876e = r1
            java.lang.String r1 = r12.getSnsId()
            r2.f298689d = r1
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r55.hashCode()
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r8.CreateTime
            r5.mo135628a(r6)
            r1.mo131105Y(r2, r0, r4, r5)
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x14fe:
            te3.nk1 r5 = r4.f298434r
            if (r5 == 0) goto L_0x1582
            java.lang.String r1 = r5.f184476e
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            te3.j00 r4 = r8.ContentObj
            te3.nk1 r4 = r4.f298434r
            java.util.LinkedList<java.lang.String> r4 = r4.f184478g
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            te3.j00 r4 = r8.ContentObj
            te3.nk1 r4 = r4.f298434r
            java.util.LinkedList<java.lang.String> r4 = r4.f184479h
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.f298692g = r2
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            r2 = 0
            r4.f298875d = r2
            r4.f298876e = r2
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r55.hashCode()
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r8.CreateTime
            r5.mo135628a(r6)
            r2.mo131105Y(r1, r0, r4, r5)
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x1582:
            te3.p81 r5 = r4.f298435s
            if (r5 == 0) goto L_0x165a
            java.lang.String r4 = "tlObj.ContentObj.finderLiveShareObject not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            te3.j00 r1 = r8.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184781g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x15ab
            te3.j00 r1 = r8.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184782h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x15ab
            te3.j00 r1 = r8.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184782h
            goto L_0x15eb
        L_0x15ab:
            te3.j00 r1 = r8.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184782h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x15d8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            te3.j00 r4 = r8.ContentObj
            te3.p81 r4 = r4.f298435s
            java.lang.String r4 = r4.f184781g
            r1.append(r4)
            java.lang.String r4 = ": "
            r1.append(r4)
            te3.j00 r4 = r8.ContentObj
            te3.p81 r4 = r4.f298435s
            java.lang.String r4 = r4.f184782h
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L_0x15eb
        L_0x15d8:
            r1 = 2131837137(0x7f1140d1, float:1.930746E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            te3.j00 r4 = r8.ContentObj
            te3.p81 r4 = r4.f298435s
            java.lang.String r4 = r4.f184781g
            r6 = 0
            r5[r6] = r4
            java.lang.String r1 = r10.getString(r1, r5)
        L_0x15eb:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r4, r1)
            r1 = 2
            r2.setMaxLines(r1)
            te3.j00 r1 = r8.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184783i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x1649
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r2 = r8.ContentObj
            te3.p81 r2 = r2.f298435s
            java.lang.String r2 = r2.f184783i
            r1.f298692g = r2
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            te3.j00 r2 = r8.ContentObj
            te3.p81 r2 = r2.f298435s
            float r5 = r2.f184784j
            r4.f298875d = r5
            float r2 = r2.f184785n
            r4.f298876e = r2
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r55.hashCode()
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r8.CreateTime
            r5.mo135628a(r6)
            r2.mo131105Y(r1, r0, r4, r5)
        L_0x1649:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x165a:
            te3.sk1 r4 = r4.f298440x
            if (r4 == 0) goto L_0x1d49
            java.lang.String r4 = "tlObj.ContentObj.finderSharePoi not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            te3.j00 r1 = r8.ContentObj
            te3.sk1 r1 = r1.f298440x
            java.lang.String r4 = r1.f185424f
            java.lang.String r1 = r1.f185429n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x1688
            r1 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5 = 0
            r1.setVisibility(r5)
            te3.j00 r5 = r8.ContentObj
            te3.sk1 r5 = r5.f298440x
            java.lang.String r5 = r5.f185429n
            r1.setText(r5)
        L_0x1688:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r4)
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r2.setText(r1, r4)
            r1 = 2
            r2.setMaxLines(r1)
            te3.j00 r1 = r8.ContentObj
            te3.sk1 r1 = r1.f298440x
            java.lang.String r1 = r1.f185427i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x16e0
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r2 = r8.ContentObj
            te3.sk1 r2 = r2.f298440x
            java.lang.String r2 = r2.f185427i
            r1.f298692g = r2
            r1.f298694i = r2
            r2 = 2
            r1.f298690e = r2
            r2 = 1
            r1.f298695j = r2
            te3.mv2 r4 = new te3.mv2
            r4.<init>()
            r1.f298698p = r4
            r1.f298693h = r2
            r2 = 0
            r4.f298875d = r2
            r4.f298876e = r2
            java.lang.String r2 = r12.getSnsId()
            r1.f298689d = r2
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r4 = r55.hashCode()
            com.tencent.mm.storage.o3 r5 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r6 = r8.CreateTime
            r5.mo135628a(r6)
            r2.mo131105Y(r1, r0, r4, r5)
            goto L_0x16ee
        L_0x16e0:
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2 = 2131756337(0x7f100531, float:1.9143579E38)
            int r4 = r55.hashCode()
            r1.mo131095O(r0, r15, r2, r4)
        L_0x16ee:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r7.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r7.setOnClickListener(r0)
            goto L_0x1d49
        L_0x16ff:
            r5 = 17
            if (r2 != r5) goto L_0x1800
            android.view.View r1 = r10.f277879f
            android.view.View r1 = r1.findViewById(r14)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131497687(0x7f0c12d7, float:1.8618974E38)
            android.widget.LinearLayout r2 = r10.mo132623k8(r2)
            boolean r5 = r10.f277832D1
            if (r5 != 0) goto L_0x1745
            com.tencent.mm.plugin.sns.ui.PhotosContent r5 = r10.f277840H1
            r1.removeView(r5)
            r5 = 3
            r1.addView(r2, r5)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 == 0) goto L_0x172f
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0.<init>(r1)
            goto L_0x1735
        L_0x172f:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r0)
            r0 = r1
        L_0x1735:
            int r1 = r0.leftMargin
            int r4 = kg3.C76577a.m92151b(r10, r4)
            int r5 = r0.rightMargin
            int r7 = r0.bottomMargin
            r0.setMargins(r1, r4, r5, r7)
            r2.setLayoutParams(r0)
        L_0x1745:
            te3.j00 r0 = r8.ContentObj
            te3.fa r0 = r0.f298433q
            if (r0 == 0) goto L_0x17f9
            android.view.View r0 = r2.findViewById(r13)
            com.tencent.mm.ui.MMImageView r0 = (com.tencent.p014mm.p136ui.MMImageView) r0
            r1 = 0
            r0.setVisibility(r1)
            te3.kv2 r1 = new te3.kv2
            r1.<init>()
            te3.j00 r4 = r8.ContentObj
            te3.fa r4 = r4.f298433q
            java.lang.String r4 = r4.f133370h
            r1.f298692g = r4
            r1.f298694i = r4
            r4 = 2
            r1.f298690e = r4
            r4 = 1
            r1.f298695j = r4
            te3.mv2 r5 = new te3.mv2
            r5.<init>()
            r1.f298698p = r5
            r1.f298693h = r4
            te3.j00 r4 = r8.ContentObj
            te3.fa r4 = r4.f298433q
            int r7 = r4.f133372j
            float r7 = (float) r7
            r5.f298875d = r7
            int r4 = r4.f133373n
            float r4 = (float) r4
            r5.f298876e = r4
            java.lang.String r4 = r12.getSnsId()
            r1.f298689d = r4
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r5 = r55.hashCode()
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r13 = r8.CreateTime
            r7.mo135628a(r13)
            r4.mo131105Y(r1, r0, r5, r7)
            r1 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r4 = r2.findViewById(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 0
            r4.setVisibility(r1)
            android.content.Context r1 = r4.getContext()
            r5 = 2131756476(0x7f1005bc, float:1.914386E38)
            android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r5, r15)
            r4.setImageDrawable(r1)
            te3.j00 r1 = r8.ContentObj
            te3.fa r1 = r1.f298433q
            java.lang.String r1 = r1.f133369g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x17d6
            android.view.View r4 = r2.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2
            r4.setMaxLines(r5)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r1)
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.SPANNABLE
            r4.setText(r5, r1)
        L_0x17d6:
            com.tencent.mm.plugin.sns.ui.q1 r1 = new com.tencent.mm.plugin.sns.ui.q1
            java.lang.String r4 = r12.getLocalid()
            r1.<init>(r8, r0, r4)
            r2.setTag(r1)
            com.tencent.mm.plugin.sns.ui.n8 r1 = r10.f277854R
            android.view.View$OnClickListener r1 = r1.f280586d
            r2.setOnClickListener(r1)
            uo3.a r1 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r5 = r4.f280349E
            com.tencent.mm.plugin.sns.ui.listener.c r4 = r4.f280381k
            r1.mo108275j(r2, r5, r4)
            vr2.C102236a0.m134779x0(r0, r10)
            goto L_0x1d49
        L_0x17f9:
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x1d49
        L_0x1800:
            r5 = 18
            if (r2 == r5) goto L_0x2067
            r5 = 21
            if (r2 != r5) goto L_0x180a
            goto L_0x2067
        L_0x180a:
            r5 = 20
            if (r2 == r5) goto L_0x1d54
            r5 = 33
            if (r2 != r5) goto L_0x1814
            goto L_0x1d54
        L_0x1814:
            r5 = 23
            if (r2 != r5) goto L_0x1820
            java.lang.String r0 = "this is finder topic card item"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            goto L_0x1d49
        L_0x1820:
            r5 = 26
            if (r2 != r5) goto L_0x182c
            java.lang.String r0 = "this is slide full card item"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            goto L_0x1d49
        L_0x182c:
            android.view.View r1 = r10.f277879f
            android.view.View r1 = r1.findViewById(r14)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131497687(0x7f0c12d7, float:1.8618974E38)
            android.widget.LinearLayout r2 = r10.mo132623k8(r2)
            android.view.View r5 = r2.findViewById(r13)
            com.tencent.mm.ui.MMImageView r5 = (com.tencent.p014mm.p136ui.MMImageView) r5
            boolean r7 = r10.f277832D1
            if (r7 != 0) goto L_0x1874
            com.tencent.mm.plugin.sns.ui.PhotosContent r7 = r10.f277840H1
            r1.removeView(r7)
            r7 = 3
            r1.addView(r2, r7)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 == 0) goto L_0x185e
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0.<init>(r1)
            goto L_0x1864
        L_0x185e:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r0)
            r0 = r1
        L_0x1864:
            int r1 = r0.leftMargin
            int r7 = kg3.C76577a.m92151b(r10, r4)
            int r13 = r0.rightMargin
            int r14 = r0.bottomMargin
            r0.setMargins(r1, r7, r13, r14)
            r2.setLayoutParams(r0)
        L_0x1874:
            boolean r0 = r12.isAd()
            if (r0 == 0) goto L_0x1897
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r12.getAdXml()
            boolean r0 = r0.isLinkAd()
            if (r0 == 0) goto L_0x1a25
            r2.setTag(r12)
            r0 = 2131307321(0x7f092b39, float:1.8232866E38)
            r2.setTag(r0, r5)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r10.f277868Y
            android.view.View$OnClickListener r0 = r0.f280370Z
            r2.setOnClickListener(r0)
            r0 = 1
            goto L_0x1a26
        L_0x1897:
            te3.j00 r0 = r8.ContentObj
            int r1 = r0.f298424e
            r7 = 9
            if (r1 != r7) goto L_0x18ba
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280593k
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x18ba:
            r7 = 10
            if (r1 != r7) goto L_0x18d9
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280595m
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x18d9:
            r7 = 17
            if (r1 != r7) goto L_0x18f8
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280596n
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x18f8:
            r7 = 22
            if (r1 == r7) goto L_0x1a0c
            r7 = 49
            if (r1 != r7) goto L_0x1902
            goto L_0x1a0c
        L_0x1902:
            r7 = 23
            if (r1 != r7) goto L_0x1921
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280598p
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x1921:
            r7 = 14
            if (r1 != r7) goto L_0x1940
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280594l
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x1940:
            if (r1 != r4) goto L_0x195d
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280602t
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x195d:
            r4 = 30
            if (r1 != r4) goto L_0x1974
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280601s
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x1974:
            r4 = 13
            if (r1 != r4) goto L_0x1993
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280603u
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x1993:
            r4 = 15
            if (r1 != r4) goto L_0x19b2
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r10.f277868Y
            android.view.View$OnClickListener r0 = r0.f280354J
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x19b2:
            r4 = 26
            if (r1 != r4) goto L_0x19c8
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280604v
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x19c8:
            r0 = 41
            if (r1 != r0) goto L_0x19de
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280605w
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x19de:
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x19f4
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280606x
            r2.setOnClickListener(r0)
            goto L_0x1a25
        L_0x19f4:
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            android.view.View$OnClickListener r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.f280580B
            r2.setOnClickListener(r0)
            int r0 = r8.contentattr
            r1 = 1
            r0 = r0 & r1
            if (r0 <= 0) goto L_0x1a25
            r0 = 0
            r1 = 1
            goto L_0x1a27
        L_0x1a0c:
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x1a25
            com.tencent.mm.plugin.sns.ui.g0 r0 = new com.tencent.mm.plugin.sns.ui.g0
            java.lang.String r1 = r10.f277831D
            r0.<init>(r8, r1)
            r2.setTag(r0)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280597o
            r2.setOnClickListener(r0)
        L_0x1a25:
            r0 = 0
        L_0x1a26:
            r1 = 0
        L_0x1a27:
            if (r0 == 0) goto L_0x1a35
            uo3.a r4 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r7 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r13 = r7.f280347C
            com.tencent.mm.plugin.sns.ui.listener.c r7 = r7.f280381k
            r4.mo108275j(r2, r13, r7)
            goto L_0x1a40
        L_0x1a35:
            uo3.a r4 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r7 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r13 = r7.f280396z
            com.tencent.mm.plugin.sns.ui.listener.c r7 = r7.f280381k
            r4.mo108275j(r2, r13, r7)
        L_0x1a40:
            boolean r4 = r10.mo132627n8(r8)
            if (r4 == 0) goto L_0x1a4f
            te3.j00 r4 = r8.ContentObj
            java.lang.String r4 = r4.f298426g
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122253o(r4)
            goto L_0x1a50
        L_0x1a4f:
            r4 = r11
        L_0x1a50:
            te3.j00 r7 = r8.ContentObj
            java.lang.String r13 = r7.f298425f
            if (r0 == 0) goto L_0x1a58
            java.lang.String r4 = r7.f298423d
        L_0x1a58:
            te3.st2 r0 = r7.f298430n
            if (r0 == 0) goto L_0x1a6c
            int r0 = r0.f299453q
            r7 = 1
            if (r0 != r7) goto L_0x1a6c
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131833058(0x7f1130e2, float:1.9299187E38)
            java.lang.String r4 = r0.getString(r4)
        L_0x1a6c:
            r7 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r0 = r2.findViewById(r7)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x1a7c
            r7 = 8
            r0.setVisibility(r7)
        L_0x1a7c:
            te3.j00 r7 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x1bbf
            r7 = 0
            r5.setVisibility(r7)
            te3.j00 r14 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r14 = r14.f298427h
            java.lang.Object r14 = r14.get(r7)
            te3.kv2 r14 = (te3.C101804kv2) r14
            te3.j00 r15 = r8.ContentObj
            int r15 = r15.f298424e
            r6 = 15
            if (r15 != r6) goto L_0x1ad4
            r6 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r15 = r2.findViewById(r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r7 = 2131234211(0x7f080da3, float:1.8084581E38)
            r15.setImageResource(r7)
            android.view.View r7 = r2.findViewById(r6)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6 = 0
            r7.setVisibility(r6)
            com.tencent.mm.plugin.sns.model.o r20 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r23 = 2131755116(0x7f10006c, float:1.9141102E38)
            int r24 = r55.hashCode()
            com.tencent.mm.storage.o3 r6 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r7 = r8.CreateTime
            r6.mo135628a(r7)
            r21 = r14
            r22 = r5
            r25 = r6
            r20.mo131104X(r21, r22, r23, r24, r25)
            goto L_0x1c1b
        L_0x1ad4:
            r6 = 5
            if (r15 != r6) goto L_0x1b3d
            java.lang.String r4 = r14.f298692g
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122253o(r4)
            java.lang.String r13 = r14.f298697o
            r6 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r7 = r2.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            r15 = 0
            k20.C60958c.m71442b(r15, r6)
            java.lang.Object[] r44 = r6.mo10232b()
            java.lang.String r45 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r46 = "setHeader"
            java.lang.String r47 = "()Z"
            java.lang.String r48 = "android/view/View_EXEC_"
            java.lang.String r49 = "setVisibility"
            java.lang.String r50 = "(I)V"
            r43 = r7
            j20.C117292a.m165358d(r43, r44, r45, r46, r47, r48, r49, r50)
            r15 = 0
            java.lang.Object r6 = r6.mo10231a(r15)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7.setVisibility(r6)
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r22 = "setHeader"
            java.lang.String r23 = "()Z"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r20 = r7
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            com.tencent.mm.plugin.sns.model.o r20 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r23 = 2131755116(0x7f10006c, float:1.9141102E38)
            int r24 = r55.hashCode()
            com.tencent.mm.storage.o3 r25 = com.tencent.p014mm.storage.C96983o3.f284138j
            r21 = r14
            r22 = r5
            r20.mo131104X(r21, r22, r23, r24, r25)
            goto L_0x1c1b
        L_0x1b3d:
            r6 = 18
            if (r15 != r6) goto L_0x1bb1
            r6 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r7 = r2.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            r15 = 0
            k20.C60958c.m71442b(r15, r6)
            java.lang.Object[] r44 = r6.mo10232b()
            java.lang.String r45 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r46 = "setHeader"
            java.lang.String r47 = "()Z"
            java.lang.String r48 = "android/view/View_EXEC_"
            java.lang.String r49 = "setVisibility"
            java.lang.String r50 = "(I)V"
            r43 = r7
            j20.C117292a.m165358d(r43, r44, r45, r46, r47, r48, r49, r50)
            r15 = 0
            java.lang.Object r6 = r6.mo10231a(r15)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7.setVisibility(r6)
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r22 = "setHeader"
            java.lang.String r23 = "()Z"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r20 = r7
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            r6 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r7 = r2.findViewById(r6)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6 = 2131235407(0x7f08124f, float:1.8087007E38)
            r7.setImageResource(r6)
            r6 = 0
            r5.setVisibility(r6)
            com.tencent.mm.plugin.sns.model.o r20 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r23 = 2131755116(0x7f10006c, float:1.9141102E38)
            int r24 = r55.hashCode()
            com.tencent.mm.storage.o3 r25 = com.tencent.p014mm.storage.C96983o3.f284138j
            r21 = r14
            r22 = r5
            r20.mo131104X(r21, r22, r23, r24, r25)
            goto L_0x1c1b
        L_0x1bb1:
            com.tencent.mm.plugin.sns.model.o r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            int r7 = r55.hashCode()
            com.tencent.mm.storage.o3 r15 = com.tencent.p014mm.storage.C96983o3.f284138j
            r6.mo131105Y(r14, r5, r7, r15)
            goto L_0x1c1b
        L_0x1bbf:
            te3.j00 r6 = r8.ContentObj
            int r6 = r6.f298424e
            r7 = 18
            if (r6 != r7) goto L_0x1bf2
            r7 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r6 = r2.findViewById(r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r14 = 0
            r6.setVisibility(r14)
            android.view.View r6 = r2.findViewById(r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131235407(0x7f08124f, float:1.8087007E38)
            r6.setImageResource(r7)
            r5.setVisibility(r14)
            com.tencent.mm.plugin.sns.model.o r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r7 = 2131755116(0x7f10006c, float:1.9141102E38)
            int r14 = r55.hashCode()
            r6.mo131095O(r5, r15, r7, r14)
            goto L_0x1c1b
        L_0x1bf2:
            r7 = 26
            if (r6 != r7) goto L_0x1c09
            r6 = 0
            r5.setVisibility(r6)
            com.tencent.mm.plugin.sns.model.o r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r7 = 2131756754(0x7f1006d2, float:1.9144424E38)
            int r6 = r55.hashCode()
            r14.mo131095O(r5, r15, r7, r6)
            goto L_0x1c1b
        L_0x1c09:
            r6 = 0
            r5.setVisibility(r6)
            com.tencent.mm.plugin.sns.model.o r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r7 = 2131755119(0x7f10006f, float:1.9141108E38)
            int r14 = r55.hashCode()
            r6.mo131095O(r5, r15, r7, r14)
        L_0x1c1b:
            vr2.C102236a0.m134779x0(r5, r10)
            te3.j00 r5 = r8.ContentObj
            int r5 = r5.f298424e
            r6 = 101(0x65, float:1.42E-43)
            if (r5 != r6) goto L_0x1c67
            te3.ms1 r5 = r8.gameShareCardObject
            int r5 = r5.f298869f
            if (r5 == 0) goto L_0x1c67
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.content.res.Resources r6 = r55.getResources()
            r7 = 2131165807(0x7f07026f, float:1.7945842E38)
            float r6 = r6.getDimension(r7)
            int r6 = (int) r6
            r5.width = r6
            android.content.res.Resources r6 = r55.getResources()
            float r6 = r6.getDimension(r7)
            int r6 = (int) r6
            r5.height = r6
            r0.setLayoutParams(r5)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r5)
            r5 = 0
            r0.setVisibility(r5)
            android.content.Context r5 = r0.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            r0.setImageDrawable(r5)
        L_0x1c67:
            te3.j00 r0 = r8.ContentObj
            int r0 = r0.f298424e
            r5 = 15
            if (r0 != r5) goto L_0x1c77
            r0 = 2131836926(0x7f113ffe, float:1.9307033E38)
            java.lang.String r13 = r10.getString(r0)
            r4 = r11
        L_0x1c77:
            r0 = 2131315436(0x7f094aec, float:1.8249325E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x1cdd
            r5 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r6 = r2.findViewById(r5)
            k20.a r5 = new k20.a
            r5.<init>()
            r7 = 0
            k20.C60958c.m71442b(r7, r5)
            java.lang.Object[] r20 = r5.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r22 = "setHeader"
            java.lang.String r23 = "()Z"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r6
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = 0
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "setHeader"
            java.lang.String r22 = "()Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r5 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r2 = r2.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r4)
            r2 = 1
            r0.setMaxLines(r2)
            goto L_0x1d28
        L_0x1cdd:
            r5 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r2 = r2.findViewById(r5)
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 8
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "setHeader"
            java.lang.String r22 = "()Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r20 = "setHeader"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r2 = 2
            r0.setMaxLines(r2)
        L_0x1d28:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r2 != 0) goto L_0x1d44
            r2 = 0
            r0.setVisibility(r2)
            if (r1 == 0) goto L_0x1d40
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.text.SpannableString r1 = vr2.C102236a0.m134766r(r13, r1, r0)
            r0.setText(r1)
            goto L_0x1d49
        L_0x1d40:
            r0.setText(r13)
            goto L_0x1d49
        L_0x1d44:
            r1 = 8
            r0.setVisibility(r1)
        L_0x1d49:
            r53 = r3
            r54 = r9
            r31 = r12
            r15 = r17
            r12 = r8
            goto L_0x2062
        L_0x1d54:
            android.view.View r0 = r10.f277879f
            r2 = 2131313983(0x7f09453f, float:1.8246378E38)
            android.view.View r13 = r0.findViewById(r2)
            te3.j00 r0 = r8.ContentObj
            if (r0 == 0) goto L_0x1d49
            te3.p81 r14 = r0.f298435s
            if (r14 == 0) goto L_0x1d49
            android.content.Context r0 = r13.getContext()
            int[] r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121130b(r0)
            r2 = 0
            r4 = r0[r2]
            r5 = 1
            r0 = r0[r5]
            android.content.Context r5 = r13.getContext()
            android.util.Pair r0 = ad0.C91999u.m115565k(r4, r0, r5, r2)
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.view.ViewGroup$LayoutParams r4 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r4.width = r2
            r4.height = r0
            r13.setLayoutParams(r4)
            r13.requestLayout()
            android.view.View r0 = r10.f277879f
            r4 = 2131313987(0x7f094543, float:1.8246386E38)
            android.view.View r0 = r0.findViewById(r4)
            r15 = r0
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            android.view.View r0 = r10.f277879f
            r4 = 2131302686(0x7f09191e, float:1.8223465E38)
            android.view.View r0 = r0.findViewById(r4)
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x1dba
            r4 = 8
            r7.setVisibility(r4)
        L_0x1dba:
            int r0 = r14.f184791t
            r4 = 1
            if (r0 != r4) goto L_0x1de9
            int r0 = r14.f184772Q
            if (r0 != r4) goto L_0x1ddc
            di3.d r0 = di3.C86312j.m106911c(r26)
            ht1.t1 r0 = (ht1.C60200t1) r0
            java.lang.String r4 = r14.f184783i
            r5 = r25
            r0.mo76808S7(r4, r15, r5)
            if (r7 == 0) goto L_0x1de9
            java.lang.String r0 = r14.f184773R
            r7.setText(r0)
            r4 = 0
            r7.setVisibility(r4)
            goto L_0x1de9
        L_0x1ddc:
            r5 = r25
            di3.d r0 = di3.C86312j.m106911c(r26)
            ht1.t1 r0 = (ht1.C60200t1) r0
            java.lang.String r4 = r14.f184783i
            r0.mo76741Cm(r4, r15, r5)
        L_0x1de9:
            android.view.View r0 = r10.f277879f
            r4 = 2131304550(0x7f092066, float:1.8227246E38)
            android.view.View r6 = r0.findViewById(r4)
            java.lang.String r0 = r14.f184765I
            if (r0 == 0) goto L_0x1f43
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1f43
            int r0 = r14.f184791t
            r4 = 2
            if (r0 == r4) goto L_0x1f43
            java.lang.String r0 = r14.f184768L
            java.lang.String r4 = "1"
            boolean r0 = java.util.Objects.equals(r0, r4)
            if (r0 == 0) goto L_0x1f43
            r0 = 2131304546(0x7f092062, float:1.8227238E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4 = 2131304547(0x7f092063, float:1.822724E38)
            android.view.View r4 = r6.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Class<ir.n> r5 = p565ir.C60606n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ir.n r5 = (p565ir.C60606n) r5
            r31 = r3
            ks3.t r3 = ks3.C61165t.SHARE_BG
            r32 = r9
            r9 = 2131232945(0x7f0808b1, float:1.8082014E38)
            r5.x30(r0, r3, r9)
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            ks3.t r3 = ks3.C61165t.SHARE_ICON
            r5 = 2131232946(0x7f0808b2, float:1.8082016E38)
            r0.x30(r4, r3, r5)
            r0 = 2131304549(0x7f092065, float:1.8227244E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = 1096810496(0x41600000, float:14.0)
            r4 = 1
            r0.setTextSize(r4, r3)
            r3 = 2131304548(0x7f092064, float:1.8227242E38)
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r4, r5)
            r5 = 2131304551(0x7f092067, float:1.8227248E38)
            android.view.View r5 = r6.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r9 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r4, r9)
            android.text.TextPaint r4 = r0.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r9)
            android.text.TextPaint r4 = r3.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r9)
            android.text.TextPaint r4 = r5.getPaint()
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r5)
            java.lang.String r4 = r14.f184766J
            if (r4 == 0) goto L_0x1ea6
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x1e92
            goto L_0x1ea6
        L_0x1e92:
            di3.d r4 = di3.C86312j.m106911c(r33)
            ny.h r4 = (p629ny.C76979h) r4
            java.lang.String r5 = r14.f184766J
            android.text.SpannableString r4 = r4.mo107057T1(r10, r5)
            r3.setText(r4)
            r4 = 0
            r3.setVisibility(r4)
            goto L_0x1eac
        L_0x1ea6:
            r4 = 0
            r5 = 8
            r3.setVisibility(r5)
        L_0x1eac:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r5 = r14.f184765I
            r9[r4] = r5
            r4 = 2131829356(0x7f11226c, float:1.9291679E38)
            java.lang.String r3 = r3.getString(r4, r9)
            androidx.appcompat.app.AppCompatActivity r4 = r55.getContext()
            r5 = 12
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r5 = 2
            int r4 = r4 * 2
            int r48 = r2 - r4
            java.lang.String r2 = "\n"
            java.lang.String r2 = r3.replace(r2, r11)
            android.text.StaticLayout r4 = new android.text.StaticLayout
            r45 = 0
            int r46 = r2.length()
            android.text.TextPaint r47 = r0.getPaint()
            android.text.Layout$Alignment r49 = android.text.Layout.Alignment.ALIGN_NORMAL
            r50 = 1065353216(0x3f800000, float:1.0)
            r51 = 0
            r52 = 1
            r43 = r4
            r44 = r2
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52)
            int r4 = r4.getLineCount()
            r5 = 1
            if (r4 > r5) goto L_0x1efa
            r3 = r2
        L_0x1efa:
            r0.setText(r3)
            k20.a r0 = new k20.a
            r0.<init>()
            r2 = 0
            k20.C60958c.m71442b(r2, r0)
            java.lang.Object[] r19 = r0.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "setHeader"
            java.lang.String r22 = "()Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.setVisibility(r0)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r20 = "setHeader"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r2 = 8
            r15.setVisibility(r2)
            r9 = 0
            goto L_0x1f8b
        L_0x1f43:
            r31 = r3
            r32 = r9
            r2 = 8
            k20.a r0 = new k20.a
            r0.<init>()
            k20.C60958c.m71442b(r2, r0)
            java.lang.Object[] r19 = r0.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r21 = "setHeader"
            java.lang.String r22 = "()Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.setVisibility(r0)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r20 = "setHeader"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r9 = 0
            r15.setVisibility(r9)
        L_0x1f8b:
            r2 = 0
            java.lang.String r0 = r14.f184778d     // Catch:{ NumberFormatException -> 0x1f96 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x1f96 }
            r18 = r0
            goto L_0x1fa0
        L_0x1f96:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r18 = r2
        L_0x1fa0:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$43 r0 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$43
            r1 = r0
            r2 = r55
            r53 = r31
            r5 = 2131314316(0x7f09468c, float:1.8247054E38)
            r3 = r18
            r31 = r12
            r12 = 4
            r5 = r14
            r16 = r6
            r12 = 0
            r6 = r8
            r9 = 26
            r12 = r8
            r8 = r15
            r15 = r17
            r54 = r32
            r9 = r16
            r1.<init>(r3, r5, r6, r7, r8, r9)
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            r4 = 0
            ks3.c r2 = ks3.C99207c.SNS
            int r7 = r2.mo138559a()
            r9 = 0
            java.lang.String r8 = ""
            r2 = r18
            r5 = r55
            r6 = r0
            r1.Kc0(r2, r4, r5, r6, r7, r8, r9)
            r13.setTag(r12)
            com.tencent.mm.plugin.sns.ui.n8 r0 = r10.f277854R
            android.view.View$OnClickListener r0 = r0.f280588f
            r13.setOnClickListener(r0)
            uo3.a r0 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r2 = r1.f280350F
            com.tencent.mm.plugin.sns.ui.listener.c r1 = r1.f280381k
            r0.mo108275j(r13, r2, r1)
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            r0.se0(r13)
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            boolean r0 = r0.mo85005G0(r14)
            if (r0 != 0) goto L_0x2062
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r14.f184780f
            java.lang.String r2 = "feed_id"
            r0.put(r2, r1)
            java.lang.String r1 = r14.f184778d
            java.lang.String r2 = "live_id"
            r0.put(r2, r1)
            java.lang.String r1 = "comment_scene"
            java.lang.String r2 = "temp_6"
            r0.put(r1, r2)
            java.lang.String r1 = r14.f184779e
            java.lang.String r2 = "finder_username"
            r0.put(r2, r1)
            java.lang.String r1 = "session_buffer"
            r0.put(r1, r11)
            java.lang.String r1 = r14.f184778d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 0
            t91.C64208c.m75548b(r1, r2)
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "live_room_card"
            l31.e r1 = r1.o30(r13, r2)
            r2 = 40
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$45 r3 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$45
            r3.<init>(r14, r12)
            l31.e r1 = r1.r80(r13, r2, r3)
            l31.e r0 = r1.mo86149PM(r13, r0)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$44 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$44
            r1.<init>(r10, r14, r12)
            r0.E60(r13, r1)
        L_0x2062:
            r3 = r31
            r7 = 0
            goto L_0x2454
        L_0x2067:
            r53 = r3
            r54 = r9
            r31 = r12
            r15 = r17
            r5 = r25
            r12 = r8
            android.view.View r0 = r10.f277879f
            r1 = 2131313983(0x7f09453f, float:1.8246378E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.View r1 = r10.f277879f
            r2 = 2131313986(0x7f094542, float:1.8246384E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.view.View r2 = r10.f277879f
            r3 = 2131313984(0x7f094540, float:1.824638E38)
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r2 = (com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView) r2
            android.view.View r3 = r10.f277879f
            r4 = 2131313987(0x7f094543, float:1.8246386E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            te3.j00 r4 = r12.ContentObj
            if (r4 == 0) goto L_0x2165
            te3.rk1 r6 = r4.f298431o
            if (r6 == 0) goto L_0x2165
            java.util.LinkedList<te3.pk1> r4 = r6.f185190n
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x211b
            java.util.LinkedList<te3.pk1> r4 = r6.f185190n
            r7 = 0
            java.lang.Object r4 = r4.get(r7)
            te3.pk1 r4 = (te3.C64628pk1) r4
            if (r4 == 0) goto L_0x211c
            int r8 = r6.f185188i
            r9 = 4
            if (r8 != r9) goto L_0x20e6
            float r8 = r4.f184829g
            int r8 = (int) r8
            float r9 = r4.f184830h
            int r9 = (int) r9
            android.util.Pair r8 = ad0.C91999u.m115565k(r8, r9, r10, r7)
            java.lang.Object r9 = r8.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.view.ViewGroup$LayoutParams r13 = r0.getLayoutParams()
            r13.width = r9
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            r9.height = r8
            r0.requestLayout()
            goto L_0x210f
        L_0x20e6:
            float r8 = r4.f184829g
            int r8 = (int) r8
            float r9 = r4.f184830h
            int r9 = (int) r9
            android.util.Pair r8 = ad0.C91999u.m115567m(r8, r9, r10)
            java.lang.Object r9 = r8.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r8 = r8.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.view.ViewGroup$LayoutParams r13 = r0.getLayoutParams()
            r13.width = r9
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            r9.height = r8
            r0.requestLayout()
        L_0x210f:
            di3.d r8 = di3.C86312j.m106911c(r26)
            ht1.t1 r8 = (ht1.C60200t1) r8
            java.lang.String r4 = r4.f184828f
            r8.mo76741Cm(r4, r3, r5)
            goto L_0x211c
        L_0x211b:
            r7 = 0
        L_0x211c:
            int r3 = r6.f185188i
            r4 = 4
            if (r3 != r4) goto L_0x212a
            r1.setVisibility(r7)
            r4 = 8
            r2.setVisibility(r4)
            goto L_0x2146
        L_0x212a:
            r4 = 8
            r5 = 2
            if (r3 != r5) goto L_0x213b
            r1.setVisibility(r7)
            r2.setVisibility(r4)
            int r1 = r6.f185189j
            r2.mo6498a(r1)
            goto L_0x2146
        L_0x213b:
            r1.setVisibility(r4)
            r2.setVisibility(r4)
            int r1 = r6.f185189j
            r2.mo6498a(r1)
        L_0x2146:
            r0.setTag(r12)
            com.tencent.mm.plugin.sns.ui.n8 r1 = r10.f277854R
            android.view.View$OnClickListener r1 = r1.f280591i
            r0.setOnClickListener(r1)
            uo3.a r1 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r3 = r2.f280350F
            com.tencent.mm.plugin.sns.ui.listener.c r2 = r2.f280381k
            r1.mo108275j(r0, r3, r2)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$42 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$42
            r1.<init>(r10, r6, r0)
            zp3.C23564m.m28138h(r0, r1)
            goto L_0x21e3
        L_0x2165:
            r7 = 0
            if (r4 == 0) goto L_0x21e3
            te3.fw2 r4 = r4.f298436t
            if (r4 == 0) goto L_0x21e3
            java.util.LinkedList<te3.ew2> r6 = r4.f183247j
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 != 0) goto L_0x21c6
            java.util.LinkedList<te3.ew2> r4 = r4.f183247j
            java.lang.Object r4 = r4.get(r7)
            te3.ew2 r4 = (te3.C64350ew2) r4
            if (r4 == 0) goto L_0x21c6
            float r6 = r4.f183041f
            int r6 = (int) r6
            float r8 = r4.f183042g
            int r8 = (int) r8
            android.util.Pair r6 = ad0.C91999u.m115565k(r6, r8, r10, r7)
            java.lang.Object r8 = r6.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            r9.width = r8
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            r8.height = r6
            r0.requestLayout()
            java.lang.String r6 = r4.f183043h
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x21bb
            di3.d r6 = di3.C86312j.m106911c(r26)
            ht1.t1 r6 = (ht1.C60200t1) r6
            java.lang.String r4 = r4.f183043h
            r6.mo76741Cm(r4, r3, r5)
            goto L_0x21c6
        L_0x21bb:
            di3.d r6 = di3.C86312j.m106911c(r26)
            ht1.t1 r6 = (ht1.C60200t1) r6
            java.lang.String r4 = r4.f183040e
            r6.mo76741Cm(r4, r3, r5)
        L_0x21c6:
            r1.setVisibility(r7)
            r1 = 8
            r2.setVisibility(r1)
            r0.setTag(r12)
            com.tencent.mm.plugin.sns.ui.n8 r1 = r10.f277854R
            android.view.View$OnClickListener r1 = r1.f280591i
            r0.setOnClickListener(r1)
            uo3.a r1 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r3 = r2.f280350F
            com.tencent.mm.plugin.sns.ui.listener.c r2 = r2.f280381k
            r1.mo108275j(r0, r3, r2)
        L_0x21e3:
            r3 = r31
            goto L_0x2454
        L_0x21e7:
            r15 = r9
            r53 = r31
            r54 = r32
            r4 = r41
            r7 = 0
            r31 = r12
            r12 = r8
            r2 = 2131310955(0x7f09396b, float:1.8240237E38)
            android.view.View r2 = r10.findViewById(r2)
            com.tencent.mm.plugin.sns.ui.PhotosContent r2 = (com.tencent.p014mm.plugin.sns.p106ui.PhotosContent) r2
            r10.f277840H1 = r2
            if (r2 == 0) goto L_0x242f
            java.lang.String r0 = "clearImageView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.PhotosContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.util.ArrayList<com.tencent.mm.plugin.sns.ui.TagImageView> r2 = r2.f277344e
            r2.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            int r0 = r10.f277862V
            r2 = 2
            if (r0 != r2) goto L_0x2215
            r0 = 1
            goto L_0x2219
        L_0x2215:
            int[] r2 = com.tencent.p014mm.plugin.sns.p106ui.C95713a5.f279136b
            r0 = r2[r0]
        L_0x2219:
            r8 = 0
        L_0x221a:
            if (r8 >= r0) goto L_0x2242
            com.tencent.mm.plugin.sns.ui.PhotosContent r2 = r10.f277840H1
            int[] r3 = com.tencent.p014mm.plugin.sns.p106ui.C95713a5.f279140f
            r3 = r3[r8]
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.sns.ui.TagImageView r2 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r2
            com.tencent.mm.plugin.sns.ui.PhotosContent r3 = r10.f277840H1
            r3.mo132425a(r2)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r10.f277868Y
            android.view.View$OnClickListener r3 = r3.f280385o
            r2.setOnClickListener(r3)
            uo3.a r3 = r10.f277852Q
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r10.f277868Y
            com.tencent.mm.plugin.sns.ui.listener.p0 r5 = r4.f280395y
            com.tencent.mm.plugin.sns.ui.listener.c r4 = r4.f280381k
            r3.mo108275j(r2, r5, r4)
            int r8 = r8 + 1
            goto L_0x221a
        L_0x2242:
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r10.f277840H1
            int r2 = r10.f277858T
            r0.setImageViewWidth(r2)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            boolean r2 = r31.isAd()
            if (r2 == 0) goto L_0x23bc
            int r2 = r10.f277862V
            r3 = 2
            if (r2 != r3) goto L_0x23bc
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r31.getAdXml()
            com.tencent.mm.plugin.sns.ui.PhotosContent r3 = r10.f277840H1
            com.tencent.mm.plugin.sns.ui.TagImageView r3 = r3.mo132426b(r7)
            com.tencent.mm.ui.widget.QImageView$a r4 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r3.setScaleType(r4)
            if (r2 == 0) goto L_0x2380
            boolean r3 = r2.isCardAd()
            if (r3 != 0) goto L_0x2380
            float r3 = r2.adMediaDisplayWidth
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x2380
            float r5 = r2.adMediaDisplayHeight
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x2380
            double r3 = (double) r3
            int r5 = r2.adBasicRemWidth
            int r8 = r2.adBasicRootFontSize
            r9 = 1
            float r3 = ps2.C100894u.m132234n(r3, r9, r5, r8)
            float r4 = r2.adMediaDisplayHeight
            double r4 = (double) r4
            int r8 = r2.adBasicRemWidth
            int r13 = r2.adBasicRootFontSize
            float r4 = ps2.C100894u.m132234n(r4, r9, r8, r13)
            int r5 = r2.adMediaDisplayMode
            r8 = 2131165590(0x7f070196, float:1.7945401E38)
            r9 = 2131165651(0x7f0701d3, float:1.7945525E38)
            r13 = 2131167200(0x7f0707e0, float:1.7948667E38)
            if (r5 != 0) goto L_0x22f9
            int r5 = kg3.C76577a.m92157h(r10, r13)
            int r5 = r1 - r5
            int r14 = kg3.C76577a.m92157h(r10, r9)
            int r5 = r5 - r14
            android.content.res.Resources r14 = r55.getResources()
            int r14 = r14.getDimensionPixelSize(r8)
            int r5 = r5 - r14
            android.content.res.Resources r14 = r55.getResources()
            int r14 = r14.getDimensionPixelSize(r8)
            int r5 = r5 - r14
            float r5 = (float) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x22e7
            int r3 = kg3.C76577a.m92157h(r10, r13)
            int r1 = r1 - r3
            int r3 = kg3.C76577a.m92157h(r10, r9)
            int r1 = r1 - r3
            android.content.res.Resources r3 = r55.getResources()
            int r3 = r3.getDimensionPixelSize(r8)
            int r1 = r1 - r3
            android.content.res.Resources r3 = r55.getResources()
            int r3 = r3.getDimensionPixelSize(r8)
            int r1 = r1 - r3
            float r3 = (float) r1
            float r1 = r2.adMediaDisplayHeight
            float r1 = r1 * r3
            float r4 = r2.adMediaDisplayWidth
            float r1 = r1 / r4
            int r1 = (int) r1
            float r4 = (float) r1
        L_0x22e7:
            te3.mv2 r1 = new te3.mv2
            r1.<init>()
            r1.f298875d = r3
            r1.f298876e = r4
            float r3 = r3 * r4
            r1.f298877f = r3
            r0.add(r1)
            goto L_0x2380
        L_0x22f9:
            r14 = 1
            if (r5 != r14) goto L_0x2342
            int r5 = kg3.C76577a.m92157h(r10, r13)
            int r1 = r1 - r5
            int r5 = kg3.C76577a.m92157h(r10, r13)
            int r1 = r1 - r5
            int r5 = kg3.C76577a.m92157h(r10, r9)
            int r1 = r1 - r5
            int r5 = kg3.C76577a.m92157h(r10, r9)
            int r1 = r1 - r5
            android.content.res.Resources r5 = r55.getResources()
            int r5 = r5.getDimensionPixelSize(r8)
            int r1 = r1 - r5
            android.content.res.Resources r5 = r55.getResources()
            int r5 = r5.getDimensionPixelSize(r8)
            int r1 = r1 - r5
            float r5 = (float) r1
            float r8 = r2.adMediaDisplayHeight
            float r8 = r8 * r5
            float r9 = r2.adMediaDisplayWidth
            float r8 = r8 / r9
            int r8 = (int) r8
            te3.mv2 r9 = new te3.mv2
            r9.<init>()
            if (r1 <= 0) goto L_0x2333
            r3 = r5
        L_0x2333:
            r9.f298875d = r3
            if (r8 <= 0) goto L_0x2338
            float r4 = (float) r8
        L_0x2338:
            r9.f298876e = r4
            float r3 = r3 * r4
            r9.f298877f = r3
            r0.add(r9)
            goto L_0x2380
        L_0x2342:
            r14 = 2
            if (r5 != r14) goto L_0x2380
            int r5 = kg3.C76577a.m92157h(r10, r13)
            int r1 = r1 - r5
            int r5 = kg3.C76577a.m92157h(r10, r9)
            int r1 = r1 - r5
            android.content.res.Resources r5 = r55.getResources()
            int r5 = r5.getDimensionPixelSize(r8)
            int r1 = r1 - r5
            android.content.res.Resources r5 = r55.getResources()
            int r5 = r5.getDimensionPixelSize(r8)
            int r1 = r1 - r5
            float r5 = (float) r1
            float r8 = r2.adMediaDisplayHeight
            float r8 = r8 * r5
            float r9 = r2.adMediaDisplayWidth
            float r8 = r8 / r9
            int r8 = (int) r8
            te3.mv2 r9 = new te3.mv2
            r9.<init>()
            if (r1 <= 0) goto L_0x2372
            r3 = r5
        L_0x2372:
            r9.f298875d = r3
            if (r8 <= 0) goto L_0x2377
            float r4 = (float) r8
        L_0x2377:
            r9.f298876e = r4
            float r3 = r3 * r4
            r9.f298877f = r3
            r0.add(r9)
        L_0x2380:
            int r1 = r55.mo132622j8()
            r3 = r31
            boolean r1 = vr2.C102260r.m134867g(r3, r1)
            if (r1 == 0) goto L_0x2397
            boolean r1 = vr2.C102260r.m134866f(r3)
            if (r1 != 0) goto L_0x2397
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            r10.mo132614a8(r1)
        L_0x2397:
            java.lang.String r1 = r2.adMediaIconUrl
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x23be
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r1.mo132426b(r7)
            java.lang.String r5 = r2.adMediaIconUrl
            r18 = 0
            r19 = 41
            r20 = 0
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$39 r8 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$39
            r8.<init>(r10, r1, r2, r4)
            java.lang.String r16 = "adId"
            r17 = r5
            r21 = r8
            ps2.C100891r.m132207b(r16, r17, r18, r19, r20, r21)
            goto L_0x23be
        L_0x23bc:
            r3 = r31
        L_0x23be:
            android.view.View r1 = r10.f277879f
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$40 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$40
            r2.<init>(r12, r3, r0)
            r1.addOnAttachStateChangeListener(r2)
            com.tencent.mm.plugin.sns.ui.a5 r1 = r10.f277827B
            com.tencent.mm.plugin.sns.ui.PhotosContent r2 = r10.f277840H1
            java.lang.String r19 = r3.getLocalid()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r10.f277868Y
            android.view.View$OnClickListener r4 = r4.f280385o
            r21 = 0
            int r22 = r55.hashCode()
            int r5 = r10.f277862V
            r24 = -1
            boolean r25 = r3.isSourceExist(r6)
            r26 = 0
            com.tencent.mm.storage.o3 r27 = com.tencent.p014mm.storage.C96983o3.f284138j
            java.lang.String r29 = r3.getSnsId()
            r16 = r1
            r17 = r2
            r18 = r12
            r20 = r4
            r23 = r5
            r28 = r0
            r30 = r3
            r16.mo133159d(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r10.f277840H1
            int r1 = r10.f277862V
            r10.mo132616c8(r3, r0, r1)
            boolean r0 = r3.isAd()
            if (r0 == 0) goto L_0x2454
            int r0 = r10.f277862V
            r1 = 3
            if (r0 == r1) goto L_0x2413
            r1 = 4
            if (r0 == r1) goto L_0x2413
            r1 = 5
            if (r0 != r1) goto L_0x2454
        L_0x2413:
            int r0 = r55.mo132622j8()
            boolean r0 = vr2.C102260r.m134867g(r3, r0)
            if (r0 == 0) goto L_0x2454
            boolean r0 = vr2.C102260r.m134866f(r3)
            if (r0 != 0) goto L_0x2454
            int[] r0 = com.tencent.p014mm.plugin.sns.p106ui.C95713a5.f279136b
            int r1 = r10.f277862V
            r0 = r0[r1]
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r10.f277840H1
            r10.mo132615b8(r1, r0)
            goto L_0x2454
        L_0x242f:
            r3 = r31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "the imagesKeeper is null,when viewtype = "
            r1.append(r2)
            int r2 = r10.f277862V
            r1.append(r2)
            java.lang.String r2 = ",stub is "
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x2454:
            android.view.View r0 = r10.f277879f
            r1 = 2131296771(0x7f090203, float:1.8211468E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r11)
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L_0x24f4
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r10.mo132620g8(r3)
            if (r1 == 0) goto L_0x24e3
            java.lang.String r2 = r1.adActionPOIName
            java.lang.String r1 = r1.adActionPOILink
            java.lang.String r4 = r3.getLocalid()
            r0.setTag(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x2485
            r4 = 8
            r0.setVisibility(r4)
            goto L_0x24e8
        L_0x2485:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x24a7
            r0.setVisibility(r7)
            r0.setText(r2)
            r0.setClickable(r7)
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100381(0x7f0602dd, float:1.7813142E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x24e8
        L_0x24a7:
            r0.setVisibility(r7)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 != 0) goto L_0x24ca
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
            r1 = 1
            r0.setClickable(r1)
            r0.setText(r2)
            goto L_0x24e8
        L_0x24ca:
            r0.setText(r2)
            r0.setClickable(r7)
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100381(0x7f0602dd, float:1.7813142E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x24e8
        L_0x24e3:
            r1 = 8
            r0.setVisibility(r1)
        L_0x24e8:
            android.view.View r1 = r10.f277879f
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$46 r2 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$46
            r2.<init>()
            r1.post(r2)
            goto L_0x257d
        L_0x24f4:
            te3.kr2 r1 = r12.Location
            if (r1 != 0) goto L_0x24fa
            r6 = 0
            goto L_0x24fc
        L_0x24fa:
            java.lang.String r6 = r1.f298649f
        L_0x24fc:
            if (r1 != 0) goto L_0x2500
            r1 = 0
            goto L_0x2502
        L_0x2500:
            java.lang.String r1 = r1.f298650g
        L_0x2502:
            java.lang.String r2 = r3.getLocalid()
            r0.setTag(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x251b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x251b
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x257d
        L_0x251b:
            r0.setVisibility(r7)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x2565
            androidx.appcompat.app.AppCompatActivity r2 = r55.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r2 = r2.getColor(r4)
            r0.setTextColor(r2)
            r2 = 1
            r0.setClickable(r2)
            long r4 = r3.field_snsId
            r8 = 0
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x2561
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 != 0) goto L_0x2561
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r4 = "·"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.setText(r1)
            goto L_0x257d
        L_0x2561:
            r0.setText(r1)
            goto L_0x257d
        L_0x2565:
            r0.setText(r6)
            r0.setClickable(r7)
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100381(0x7f0602dd, float:1.7813142E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x257d:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r10.f277868Y
            android.view.View$OnClickListener r1 = r1.f280352H
            r0.setOnClickListener(r1)
            android.view.View r0 = r10.f277879f
            r1 = 2131296858(0x7f09025a, float:1.8211645E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            androidx.appcompat.app.AppCompatActivity r2 = r55.getContext()
            int r4 = r3.getCreateTime()
            long r4 = (long) r4
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r8
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123537c(r2, r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.view.View r0 = r10.f277879f
            r1 = 2131296768(0x7f090200, float:1.8211462E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r1 = r10.f277868Y
            android.view.View$OnClickListener r1 = r1.f280356L
            r0.setOnClickListener(r1)
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r2 = r10.f277879f
            r4 = 2131296767(0x7f0901ff, float:1.821146E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$47 r4 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$47
            r5 = r42
            r4.<init>(r3, r5)
            r2.setOnClickListener(r4)
            r2.setVisibility(r1)
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L_0x27c1
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r10.mo132620g8(r3)
            java.lang.String r4 = r3.getLocalid()
            r0.setTag(r4)
            boolean r4 = jq2.C98995n.m128905a(r1)
            if (r4 == 0) goto L_0x2603
            com.tencent.mm.protocal.protobuf.SnsObject r4 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r3)
            jq2.C98995n.m128908d(r0, r4, r1)
        L_0x25ff:
            r4 = 8
            goto L_0x2744
        L_0x2603:
            int r4 = r1.adActionExtTailType
            int r5 = com.tencent.p014mm.plugin.sns.storage.ADInfo.ADChainStrengthenDefaultWording
            if (r4 != r5) goto L_0x2621
            java.lang.String r4 = r1.adActionExtTailWording
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x261a
            java.lang.String r4 = r1.adActionExtTailWording
            r0.setText(r4)
            r0.setVisibility(r7)
            goto L_0x25ff
        L_0x261a:
            r4 = 8
            r0.setVisibility(r4)
            goto L_0x2744
        L_0x2621:
            int r5 = com.tencent.p014mm.plugin.sns.storage.ADInfo.ADChainStrengthenUserInfoFormatWording
            if (r4 != r5) goto L_0x25ff
            java.lang.String r4 = r1.adActionExtTailWording
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x273f
            java.util.LinkedList<java.lang.String> r4 = r1.adActionExtUserList
            java.util.Iterator r4 = r4.iterator()
            r5 = r11
        L_0x2634:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x269b
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.tencent.mm.storage.u3 r8 = r10.f277835F
            com.tencent.mm.storage.z1 r8 = r8.mo69656H3(r6)
            if (r8 == 0) goto L_0x2672
            java.lang.String r8 = r8.mo62898f()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x2662
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r8)
            java.lang.String r5 = r9.toString()
            goto L_0x2681
        L_0x2662:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            goto L_0x2681
        L_0x2672:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
        L_0x2681:
            java.util.LinkedList<java.lang.String> r8 = r1.adActionExtUserList
            java.lang.Object r8 = r8.getLast()
            if (r8 == r6) goto L_0x2634
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ","
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x2634
        L_0x269b:
            java.lang.String r4 = r1.adActionExtTailWording
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r7] = r5
            java.lang.String r4 = java.lang.String.format(r4, r8)
            de3.u r8 = new de3.u
            di3.d r9 = di3.C86312j.m106911c(r33)
            ny.h r9 = (p629ny.C76979h) r9
            float r13 = r0.getTextSize()
            android.text.SpannableString r9 = r9.Eb0(r10, r4, r13, r6)
            r8.<init>((android.text.SpannableString) r9)
            r6 = 0
            r9 = 33
            r8.mo105704a(r6, r4, r9)
            android.text.TextPaint r4 = r0.getPaint()
            int r6 = r8.length()
            float r6 = android.text.Layout.getDesiredWidth(r8, r7, r6, r4)
            int r6 = (int) r6
            int r6 = kg3.C76577a.m92152c(r10, r6)
            int r9 = r10.f277860U
            if (r6 <= r9) goto L_0x2735
        L_0x26d4:
            int r6 = r5.length()
            r8 = 1
            if (r6 <= r8) goto L_0x25ff
            int r6 = r5.length()
            r9 = 2
            int r6 = r6 - r9
            java.lang.String r5 = r5.substring(r7, r6)
            java.lang.String r6 = r1.adActionExtTailWording
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r13 = "..."
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            r9[r7] = r8
            java.lang.String r6 = java.lang.String.format(r6, r9)
            de3.u r8 = new de3.u
            di3.d r9 = di3.C86312j.m106911c(r33)
            ny.h r9 = (p629ny.C76979h) r9
            float r13 = r0.getTextSize()
            r14 = 1
            android.text.SpannableString r9 = r9.Eb0(r10, r6, r13, r14)
            r8.<init>((android.text.SpannableString) r9)
            r9 = 0
            r13 = 33
            r8.mo105704a(r9, r6, r13)
            int r6 = r8.length()
            float r6 = android.text.Layout.getDesiredWidth(r8, r7, r6, r4)
            int r6 = (int) r6
            int r6 = kg3.C76577a.m92152c(r10, r6)
            android.widget.TextView$BufferType r9 = android.widget.TextView.BufferType.SPANNABLE
            r0.setText(r8, r9)
            r0.setVisibility(r7)
            int r8 = r10.f277860U
            if (r6 > r8) goto L_0x26d4
            goto L_0x25ff
        L_0x2735:
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r0.setText(r8, r4)
            r0.setVisibility(r7)
            goto L_0x25ff
        L_0x273f:
            r4 = 8
            r0.setVisibility(r4)
        L_0x2744:
            int r5 = r0.getVisibility()
            if (r5 == r4) goto L_0x2764
            java.lang.String r1 = r1.adActionExtTailLink
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x2764
            android.content.res.Resources r1 = r55.getResources()
            r4 = 2131101556(0x7f060774, float:1.7815525E38)
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
            r1 = 0
            r0.setOnClickListener(r1)
        L_0x2764:
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            boolean r1 = vr2.C102260r.m134842K(r1)
            if (r1 == 0) goto L_0x2773
            r1 = 8
            r0.setVisibility(r1)
        L_0x2773:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r3.getTimeLine()
            te3.j00 r0 = r0.ContentObj
            int r0 = r0.f298428i
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x27bc
            java.lang.String r0 = r3.getLocalid()
            r2.setTag(r0)
            r2.setVisibility(r7)
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131836740(0x7f113f44, float:1.9306655E38)
            java.lang.String r1 = r1.getString(r4)
            r0[r7] = r1
            r1 = 1
            r0[r1] = r15
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131836741(0x7f113f45, float:1.9306657E38)
            java.lang.String r1 = r1.getString(r4)
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "%s%s%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r2.setText(r0)
            goto L_0x27c1
        L_0x27bc:
            r1 = 8
            r2.setVisibility(r1)
        L_0x27c1:
            android.view.View r0 = r10.f277879f
            r1 = 2131296895(0x7f09027f, float:1.821172E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            te3.j00 r1 = r12.ContentObj
            int r1 = r1.f298424e
            r2 = 30
            if (r1 != r2) goto L_0x27d6
            r8 = 0
            goto L_0x27d8
        L_0x27d6:
            r8 = 8
        L_0x27d8:
            r0.setVisibility(r8)
            android.content.res.Resources r1 = r55.getResources()
            r2 = 2131099669(0x7f060015, float:1.7811698E38)
            int r1 = r1.getColor(r2)
            r0.setIconColor(r1)
            android.view.View r0 = r10.f277879f
            r1 = 2131296820(0x7f090234, float:1.8211567E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.sns.ui.l1 r1 = new com.tencent.mm.plugin.sns.ui.l1
            r1.<init>()
            r0.setOnTouchListener(r1)
            java.lang.Class<om.f> r1 = p214om.C11502f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            om.f r1 = (p214om.C11502f) r1
            wc3.y r1 = r1.mo11461Sr()
            te3.r5 r2 = r12.AppInfo
            java.lang.String r2 = r2.f299236d
            java.lang.String r1 = r1.mo93159l5(r10, r2)
            te3.j00 r2 = r12.ContentObj
            int r4 = r2.f298424e
            r5 = 26
            if (r4 != r5) goto L_0x2821
            r1 = 2131825615(0x7f1113cf, float:1.9284091E38)
            java.lang.String r1 = r10.getString(r1)
            goto L_0x29d9
        L_0x2821:
            r5 = 30
            if (r4 != r5) goto L_0x2897
            te3.d05 r1 = r12.weappInfo
            java.lang.String r1 = r1.f298070d
            java.lang.Class<kr0.w0> r2 = kr0.C76629w0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            kr0.w0 r2 = (kr0.C76629w0) r2
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r1 = r2.mo106879N2(r1)
            if (r1 == 0) goto L_0x2842
            java.lang.String r2 = r1.field_nickname
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x2842
            java.lang.String r1 = r1.field_nickname
            goto L_0x2849
        L_0x2842:
            r1 = 2131821750(0x7f1104b6, float:1.9276252E38)
            java.lang.String r1 = r10.getString(r1)
        L_0x2849:
            te3.d05 r2 = r12.weappInfo
            int r2 = r2.f298077n
            r4 = 1
            if (r2 != r4) goto L_0x29d9
            android.widget.LinearLayout r2 = r10.f277834E1
            r4 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r2 = r2.findViewById(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r7, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r16 = "setHeader"
            java.lang.String r17 = "()Z"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r15 = "setHeader"
            java.lang.String r16 = "()Z"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x29d9
        L_0x2897:
            r5 = 28
            r6 = 2131826159(0x7f1115ef, float:1.9285195E38)
            if (r4 != r5) goto L_0x28d8
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
            te3.j00 r2 = r12.ContentObj
            te3.rk1 r2 = r2.f298431o
            if (r2 == 0) goto L_0x29d9
            java.lang.String r2 = vr2.C102236a0.m134703A(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x29d9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " · "
            r2.append(r1)
            te3.j00 r1 = r12.ContentObj
            te3.rk1 r1 = r1.f298431o
            java.lang.String r1 = vr2.C102236a0.m134703A(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x29d9
        L_0x28d8:
            r5 = 36
            if (r4 != r5) goto L_0x2912
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
            te3.j00 r2 = r12.ContentObj
            te3.fw2 r2 = r2.f298436t
            if (r2 == 0) goto L_0x29d9
            java.lang.String r2 = r2.f183243f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x29d9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " · "
            r2.append(r1)
            te3.j00 r1 = r12.ContentObj
            te3.fw2 r1 = r1.f298436t
            java.lang.String r1 = r1.f183243f
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x29d9
        L_0x2912:
            r5 = 29
            if (r4 == r5) goto L_0x29cd
            r5 = 46
            if (r4 != r5) goto L_0x291c
            goto L_0x29cd
        L_0x291c:
            r5 = 38
            if (r4 != r5) goto L_0x292e
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
            goto L_0x29d9
        L_0x292e:
            r5 = 37
            if (r4 != r5) goto L_0x2940
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
            goto L_0x29d9
        L_0x2940:
            r5 = 39
            if (r4 != r5) goto L_0x295e
            int r2 = r2.f298437u
            r4 = 3
            if (r2 == r4) goto L_0x2950
            r4 = 100000000(0x5f5e100, float:2.3122341E-35)
            if (r2 == r4) goto L_0x2950
            goto L_0x29d9
        L_0x2950:
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
            goto L_0x29d9
        L_0x295e:
            boolean r2 = r3.isAd()
            if (r2 == 0) goto L_0x29b3
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r3.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADInfo r4 = r3.getAdInfo()
            boolean r2 = lo2.C99542h0.m129910h(r2, r4)
            if (r2 == 0) goto L_0x29d9
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r3.getAdXml()
            if (r1 == 0) goto L_0x29b1
            int r2 = r1.adActionLinkHidden
            r4 = 1
            if (r2 != r4) goto L_0x29b1
            boolean r2 = r1.isCardAd()
            if (r2 != 0) goto L_0x29b1
            boolean r1 = r1.isFullCardAd()
            if (r1 != 0) goto L_0x29b1
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r3.getAdInfo()
            if (r1 == 0) goto L_0x29a1
            java.lang.String r2 = r1.adActionExtTailWording
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x299f
            java.lang.String r1 = r1.adActionExtTailFormattedWording
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x29a1
        L_0x299f:
            r8 = 1
            goto L_0x29a2
        L_0x29a1:
            r8 = 0
        L_0x29a2:
            if (r8 != 0) goto L_0x29b1
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
            goto L_0x29d9
        L_0x29b1:
            r1 = r11
            goto L_0x29d9
        L_0x29b3:
            te3.j00 r2 = r12.ContentObj
            int r4 = r2.f298424e
            r5 = 1
            if (r4 != r5) goto L_0x29d9
            te3.p81 r2 = r2.f298435s
            if (r2 == 0) goto L_0x29d9
            java.lang.String r2 = r2.f184781g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x29d9
            te3.j00 r1 = r12.ContentObj
            te3.p81 r1 = r1.f298435s
            java.lang.String r1 = r1.f184781g
            goto L_0x29d9
        L_0x29cd:
            androidx.appcompat.app.AppCompatActivity r1 = r55.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r6)
        L_0x29d9:
            com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122250e(r12, r10)
            java.lang.Class<om.f> r2 = p214om.C11502f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            om.f r2 = (p214om.C11502f) r2
            wc3.y r2 = r2.mo11461Sr()
            boolean r2 = r2.mo93144L1(r1)
            if (r2 == 0) goto L_0x2a4b
            r0.setVisibility(r7)
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131836867(0x7f113fc3, float:1.9306913E38)
            java.lang.String r5 = r10.getString(r5)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan r4 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$AppClickSpan
            r4.<init>()
            int r5 = r2.length()
            r6 = 33
            r2.setSpan(r4, r7, r5, r6)
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r0.setText(r2, r4)
            te3.r5 r2 = r12.AppInfo
            if (r2 == 0) goto L_0x2a35
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            te3.r5 r4 = r12.AppInfo
            java.lang.String r4 = r4.f299236d
            boolean r2 = r2.cg0(r4)
            if (r2 != 0) goto L_0x2a47
        L_0x2a35:
            android.content.res.Resources r2 = r55.getResources()
            r4 = 2131101556(0x7f060774, float:1.7815525E38)
            int r2 = r2.getColor(r4)
            r0.setTextColor(r2)
            r2 = 0
            r0.setOnTouchListener(r2)
        L_0x2a47:
            r0.setTag(r12)
            goto L_0x2a50
        L_0x2a4b:
            r2 = 8
            r0.setVisibility(r2)
        L_0x2a50:
            te3.j00 r2 = r12.ContentObj
            int r4 = r2.f298424e
            r5 = 1
            if (r4 != r5) goto L_0x2a7f
            te3.p81 r2 = r2.f298435s
            if (r2 == 0) goto L_0x2a7f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x2a7f
            android.content.res.Resources r1 = r55.getResources()
            r2 = 2131101521(0x7f060751, float:1.7815454E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            r1 = 0
            r0.setOnTouchListener(r1)
            r0.setTag(r12)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$48 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$48
            r1.<init>(r12)
            r0.setOnClickListener(r1)
            goto L_0x2ab6
        L_0x2a7f:
            te3.j00 r1 = r12.ContentObj
            int r1 = r1.f298424e
            r2 = 28
            if (r1 != r2) goto L_0x2ab6
            android.content.res.Resources r1 = r55.getResources()
            r2 = 2131101521(0x7f060751, float:1.7815454E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            r1 = 0
            r0.setOnTouchListener(r1)
            android.view.View r1 = r10.f277879f
            if (r1 == 0) goto L_0x2aab
            r2 = 2131313985(0x7f094541, float:1.8246382E38)
            android.view.View r1 = r1.findViewById(r2)
            androidx.constraintlayout.widget.Guideline r1 = (androidx.constraintlayout.widget.Guideline) r1
            if (r1 == 0) goto L_0x2aab
            r1.setGuidelineEnd(r7)
        L_0x2aab:
            r0.setTag(r12)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$49 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$49
            r1.<init>(r10, r12)
            r0.setOnClickListener(r1)
        L_0x2ab6:
            android.view.View r0 = r10.f277879f
            r1 = 2131296813(0x7f09022d, float:1.8211553E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r3.getUserName()
            java.lang.String r2 = r10.f277837G
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x2afa
            r0.setVisibility(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getLocalid()
            r1.append(r2)
            java.lang.String r2 = ";"
            r1.append(r2)
            java.lang.String r2 = r3.getSnsId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setTag(r1)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$50 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$50
            r1.<init>()
            r0.setOnClickListener(r1)
            r1 = 8
            goto L_0x2aff
        L_0x2afa:
            r1 = 8
            r0.setVisibility(r1)
        L_0x2aff:
            android.view.View r0 = r10.f277879f
            r2 = 2131317137(0x7f095191, float:1.8252775E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.protocal.protobuf.SnsObject r2 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120368f(r3)
            int r4 = r2.NewWithTaListCount
            if (r4 <= 0) goto L_0x2b17
            r0.setVisibility(r1)
            goto L_0x2c00
        L_0x2b17:
            java.util.LinkedList<te3.w64> r4 = r2.WithUserList
            int r4 = r4.size()
            if (r4 > 0) goto L_0x2b24
            r0.setVisibility(r1)
            goto L_0x2c00
        L_0x2b24:
            java.lang.String r1 = r10.f277837G
            java.lang.String r4 = r2.Username
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x2bc1
            r0.setVisibility(r7)
            java.util.LinkedList<te3.w64> r1 = r2.WithUserList
            java.util.Iterator r1 = r1.iterator()
            r15 = r11
            r8 = 0
        L_0x2b39:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x2ba3
            java.lang.Object r4 = r1.next()
            te3.w64 r4 = (te3.w64) r4
            if (r8 != 0) goto L_0x2b5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = "  "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r8 = 1
            goto L_0x2b6b
        L_0x2b5a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r15)
            java.lang.String r6 = ",  "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L_0x2b6b:
            java.lang.String r6 = r4.f299704e
            if (r6 == 0) goto L_0x2b82
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r4 = r4.f299704e
            r6.append(r4)
            java.lang.String r4 = r6.toString()
        L_0x2b80:
            r15 = r4
            goto L_0x2b39
        L_0x2b82:
            com.tencent.mm.storage.u3 r6 = r10.f277835F
            java.lang.String r9 = r4.f299703d
            com.tencent.mm.storage.z1 r6 = r6.get(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            if (r6 != 0) goto L_0x2b97
            java.lang.String r4 = r4.f299703d
            goto L_0x2b9b
        L_0x2b97:
            java.lang.String r4 = r6.mo62898f()
        L_0x2b9b:
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            goto L_0x2b80
        L_0x2ba3:
            r1 = 2131837217(0x7f114121, float:1.9307623E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r7] = r15
            java.lang.String r1 = r10.getString(r1, r5)
            di3.d r4 = di3.C86312j.m106911c(r33)
            ny.h r4 = (p629ny.C76979h) r4
            float r5 = r0.getTextSize()
            android.text.SpannableString r1 = r4.yp0(r10, r1, r5)
            r0.setText(r1)
            goto L_0x2c00
        L_0x2bc1:
            r1 = 8
            r0.setVisibility(r1)
            java.util.LinkedList<te3.w64> r1 = r2.WithUserList
            java.util.Iterator r1 = r1.iterator()
        L_0x2bcc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x2c00
            java.lang.Object r4 = r1.next()
            te3.w64 r4 = (te3.w64) r4
            java.lang.String r5 = r10.f277837G
            java.lang.String r4 = r4.f299703d
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x2bcc
            r0.setVisibility(r7)
            r1 = 2131837218(0x7f114122, float:1.9307625E38)
            java.lang.String r1 = r10.getString(r1)
            r0.setVisibility(r7)
            di3.d r4 = di3.C86312j.m106911c(r33)
            ny.h r4 = (p629ny.C76979h) r4
            float r5 = r0.getTextSize()
            android.text.SpannableString r1 = r4.yp0(r10, r1, r5)
            r0.setText(r1)
        L_0x2c00:
            r10.mo132634u8(r2, r3)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 1
            r22 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1
            r19 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r10.f277903s = r0
            r8 = 100
            r0.setStartOffset(r8)
            android.view.animation.ScaleAnimation r0 = r10.f277903s
            r8 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r8)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r16 = 0
            r14 = r0
            r17 = r1
            r18 = r4
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r10.f277905t = r0
            r4 = 100
            r0.setStartOffset(r4)
            android.view.animation.ScaleAnimation r0 = r10.f277905t
            r4 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r4)
            android.view.View r0 = r10.f277896p
            if (r0 != 0) goto L_0x2c9a
            android.view.View r0 = r10.f277879f
            r1 = 2131296794(0x7f09021a, float:1.8211515E38)
            android.view.View r0 = r0.findViewById(r1)
            r10.f277896p = r0
            k20.a r1 = new k20.a
            r1.<init>()
            r4 = 8
            k20.C60958c.m71442b(r4, r1)
            java.lang.Object[] r12 = r1.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r14 = "setHeader"
            java.lang.String r15 = "()Z"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r13 = "setHeader"
            java.lang.String r14 = "()Z"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x2c9a:
            android.view.View r0 = r10.f277879f
            r1 = 2131296801(0x7f090221, float:1.8211529E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f277907u = r0
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$51 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$51
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r10.f277907u
            android.view.View$OnTouchListener r1 = r10.f277839H
            r0.setOnTouchListener(r1)
            android.view.View r0 = r10.f277879f
            r1 = 2131296842(0x7f09024a, float:1.8211612E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f277909v = r0
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$52 r1 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$52
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r10.f277909v
            android.view.View$OnTouchListener r1 = r10.f277839H
            r0.setOnTouchListener(r1)
            android.view.View r0 = r10.f277879f
            r1 = 2131296865(0x7f090261, float:1.8211659E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1 = 1
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r10.mo132619f8(r1)
            java.lang.String r1 = "setSnsInfoPrivateFlag"
            r8 = r54
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            int r2 = r2.ExtFlag
            r5 = r2 & 32
            if (r5 > 0) goto L_0x2cf4
            r2 = r2 & 64
            if (r2 <= 0) goto L_0x2cf7
        L_0x2cf4:
            r4.setLocalPrivate()
        L_0x2cf7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            if (r4 == 0) goto L_0x2d13
            int r1 = r4.getLocalPrivate()
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x2d0a
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x2d13
        L_0x2d0a:
            boolean r1 = r4.isSocialAttitudeAd()
            if (r1 != 0) goto L_0x2d13
            r0.setVisibility(r7)
        L_0x2d13:
            if (r4 == 0) goto L_0x2d20
            boolean r1 = r4.isExtFlag()
            if (r1 != 0) goto L_0x2d20
            r1 = 8
            r0.setVisibility(r1)
        L_0x2d20:
            android.widget.LinearLayout r1 = r10.f277909v
            r2 = 2131296841(0x7f090249, float:1.821161E38)
            android.view.View r1 = r1.findViewById(r2)
            r6 = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            android.widget.LinearLayout r1 = r10.f277907u
            r2 = 2131296800(0x7f090220, float:1.8211527E38)
            android.view.View r1 = r1.findViewById(r2)
            r7 = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            android.content.res.Resources r1 = r55.getResources()
            r2 = 2131099940(0x7f060124, float:1.7812247E38)
            int r1 = r1.getColor(r2)
            r6.setIconColor(r1)
            android.content.res.Resources r1 = r55.getResources()
            int r1 = r1.getColor(r2)
            r7.setIconColor(r1)
            android.widget.LinearLayout r1 = r10.f277909v
            r2 = 2131296843(0x7f09024b, float:1.8211614E38)
            android.view.View r1 = r1.findViewById(r2)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.widget.LinearLayout r1 = r10.f277907u
            r2 = 2131296810(0x7f09022a, float:1.8211547E38)
            android.view.View r1 = r1.findViewById(r2)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r1 = r10.f277862V
            r2 = 10
            if (r1 != r2) goto L_0x2db9
            android.view.View r1 = r10.f277879f
            r2 = 2131296794(0x7f09021a, float:1.8211515E38)
            android.view.View r1 = r1.findViewById(r2)
            r2 = 2131233140(0x7f080974, float:1.808241E38)
            r1.setBackgroundResource(r2)
            r1 = 2131233764(0x7f080be4, float:1.8083675E38)
            r0.setImageResource(r1)
            r1 = 2131233765(0x7f080be5, float:1.8083677E38)
            r6.setImageResource(r1)
            r1 = 2131233766(0x7f080be6, float:1.8083679E38)
            r7.setImageResource(r1)
            android.content.res.Resources r1 = r55.getResources()
            r2 = 2131101527(0x7f060757, float:1.7815466E38)
            int r1 = r1.getColor(r2)
            r4.setTextColor(r1)
            android.content.res.Resources r1 = r55.getResources()
            int r1 = r1.getColor(r2)
            r5.setTextColor(r1)
            android.widget.LinearLayout r1 = r10.f277909v
            r2 = 2131233956(0x7f080ca4, float:1.8084064E38)
            r1.setBackgroundResource(r2)
            android.widget.LinearLayout r1 = r10.f277907u
            r2 = 2131233957(0x7f080ca5, float:1.8084066E38)
            r1.setBackgroundResource(r2)
        L_0x2db9:
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$53 r9 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$53
            r1 = r9
            r2 = r55
            r1.<init>(r3, r4, r5, r6, r7)
            r0.setOnClickListener(r9)
            r1 = r53
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r5 = 1
            return r5
        L_0x2dcb:
            r3 = r1
            r4 = r7
            r1 = r13
            r8 = r14
            r5 = 1
            r7 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "unknow error ? "
            r0.append(r6)
            if (r2 != 0) goto L_0x2de0
            r15 = 1
            goto L_0x2de1
        L_0x2de0:
            r15 = 0
        L_0x2de1:
            r0.append(r15)
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.mo132635v8():boolean");
    }

    /* renamed from: w2 */
    public C43155u8 mo67327w2() {
        SnsMethodCalculate.markStartTimeMs("getTimelineEmojiInfoHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C43155u8 u8Var = this.f277914x0;
        SnsMethodCalculate.markEndTimeMs("getTimelineEmojiInfoHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return u8Var;
    }

    /* renamed from: w8 */
    public final boolean mo132636w8(List<w64> list, boolean z) {
        boolean z2;
        Class cls = C76705f.class;
        SnsMethodCalculate.markStartTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 32.0f);
        int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 6.0f);
        int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 10.0f);
        int fromDPToPix4 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 17.0f);
        if (this.f277883h == null) {
            SnsMethodCalculate.markEndTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("guessWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        int width = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getWidth();
        float dimension = getResources().getDimension(C0966R.dimen.f3926j6);
        Log.m105919d("MicroMsg.SnsCommentDetailUI", "guess size %d %f", Integer.valueOf(width), Float.valueOf(dimension));
        float f = ((float) width) - (dimension * 2.0f);
        SnsMethodCalculate.markEndTimeMs("guessWidth", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        if (list.size() <= 0) {
            if (this.f277883h.getParent() != null) {
                this.f277883h.setVisibility(8);
            }
            this.f277883h.removeAllViews();
            this.f277883h.setVisibility(8);
            this.f277892n.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return false;
        }
        this.f277883h.getParent();
        this.f277883h.removeAllViews();
        this.f277883h.setVisibility(0);
        if (this.f277862V != 10) {
            this.f277883h.setBackgroundResource(C0966R.C0969drawable.a6s);
        } else if (!this.f277853Q0) {
            this.f277883h.setBackgroundResource(C0966R.C0969drawable.c3_);
        } else {
            SnsInfo f8 = mo132619f8(false);
            if (f8 == null) {
                this.f277883h.setBackgroundResource(C0966R.C0969drawable.c3_);
            } else if (this.f277837G.equals(f8.getUserName())) {
                this.f277883h.setBackgroundResource(C0966R.C0969drawable.c3a);
            } else {
                this.f277883h.setBackgroundResource(C0966R.C0969drawable.c3_);
            }
        }
        this.f277883h.setPadding(0, fromDPToPix2, 0, fromDPToPix2);
        ImageView imageView = new ImageView(getContext());
        SnsInfo f84 = mo132619f8(true);
        if (this.f277862V == 10) {
            imageView.setImageResource(C0966R.raw.friendactivity_likeicon_golden);
        } else if (f84 == null || !f84.isSocialAttitudeAd()) {
            imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.friendactivity_likeicon, getContext().getResources().getColor(C0966R.color.f2958ae)));
        } else {
            C63489a.m74831f(f84.getAdXml().adSocialInfo.f294141a, new DownloadCallback(imageView));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        if (f84 == null || !f84.isSocialAttitudeAd()) {
            z2 = false;
            imageView.setPadding(fromDPToPix3, fromDPToPix4, fromDPToPix3, 0);
            imageView.setLayoutParams(layoutParams);
        } else {
            z2 = false;
        }
        imageView.setClickable(z2);
        imageView.setFocusable(z2);
        this.f277883h.addView(imageView);
        int b = (int) (f - ((float) C76577a.m92151b(getContext(), 34)));
        int i = fromDPToPix2 + fromDPToPix;
        int i2 = b / i;
        if (b % i > fromDPToPix) {
            i2++;
        }
        Log.m105919d("MicroMsg.SnsCommentDetailUI", "guess size %d", Integer.valueOf(i2));
        C96077n nVar = new C96077n(getContext());
        nVar.setClipChildren(false);
        nVar.setClipToPadding(false);
        nVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nVar.setLineMaxCounte(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            w64 w64 = list.get(i3);
            StoryTouchImageView storyTouchImageView = new StoryTouchImageView(getContext(), (AttributeSet) null);
            storyTouchImageView.setContentDescription(String.format(getString(C0966R.string.j3b), new Object[]{w64.f299704e}));
            storyTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            storyTouchImageView.setImageResource(C0966R.C0969drawable.a6u);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(fromDPToPix, fromDPToPix);
            layoutParams2.setMargins(0, fromDPToPix2, fromDPToPix2, 0);
            storyTouchImageView.setLayoutParams(layoutParams2);
            storyTouchImageView.setTag(w64.f299703d);
            storyTouchImageView.setTag(C0966R.C0970id.o3p, Boolean.FALSE);
            if (i3 != 0 || !C102260r.m134838G(f84, w64)) {
                ((C76705f) C86312j.m106911c(cls)).mo106841jW(storyTouchImageView, w64.f299703d, true);
            } else {
                storyTouchImageView.setTag(C0966R.C0970id.o3p, Boolean.TRUE);
                if (!C98242p.m126945g(storyTouchImageView, f84, w64.f299703d)) {
                    ((C76705f) C86312j.m106911c(cls)).mo106841jW(storyTouchImageView, w64.f299703d, true);
                }
            }
            storyTouchImageView.setOnClickListener(this.f277908u1);
            nVar.addView(storyTouchImageView);
        }
        this.f277883h.addView(nVar);
        this.f277892n.setVisibility(z ? 8 : 0);
        SnsMethodCalculate.markEndTimeMs("setLikedHeader", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return true;
    }

    /* renamed from: x8 */
    public final void mo132637x8() {
        SnsMethodCalculate.markStartTimeMs("updateMusicMvIconState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        WeImageView weImageView = this.f277845K;
        if (weImageView == null) {
            SnsMethodCalculate.markEndTimeMs("updateMusicMvIconState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        weImageView.setPressed(false);
        if (C96085n8.m123116x(this.f277849M)) {
            this.f277845K.setImageResource(C0966R.raw.icons_outlined_pause2);
            this.f277845K.setContentDescription(getString(C0966R.string.jhg));
        } else {
            this.f277845K.setImageResource(C0966R.raw.icons_outlined_play2);
            this.f277845K.setContentDescription(getString(C0966R.string.f361384jg1));
        }
        this.f277845K.setIconColor(getContext().getResources().getColor(C0966R.color.f3133gi));
        SnsMethodCalculate.markEndTimeMs("updateMusicMvIconState", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: y8 */
    public final void mo132638y8() {
        SnsMethodCalculate.markStartTimeMs("updateMusicPlaystate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        ImageView imageView = this.f277843J;
        if (imageView == null) {
            SnsMethodCalculate.markEndTimeMs("updateMusicPlaystate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            return;
        }
        imageView.setPressed(false);
        if (C96085n8.m123116x(this.f277849M)) {
            this.f277843J.setImageResource(C0966R.C0969drawable.ajq);
        } else {
            this.f277843J.setImageResource(C0966R.C0969drawable.ajs);
        }
        SnsMethodCalculate.markEndTimeMs("updateMusicPlaystate", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
    }

    /* renamed from: z6 */
    public C43162z1 mo67328z6() {
        SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        C43162z1 z1Var = this.f277897p0;
        SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        return z1Var;
    }
}
