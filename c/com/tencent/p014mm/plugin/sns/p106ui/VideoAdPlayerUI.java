package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.modelstat.C29038l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.VideoPlayView;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import eb0.C97621e;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import jp2.C98960j;
import jp2.C98973p;
import jp2.C98977w;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kp2.C99158b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C89137b0;
import p214om.C11502f;
import p740wo.C53193b;
import pb1.C100714h1;
import te3.C101786i2;
import te3.C101804kv2;
import te3.C64509l2;
import vr2.C102236a0;
import vr2.C102268v;
import xn2.C102692b;
import xn2.C102700e;
import xn2.C102701f;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI */
public class VideoAdPlayerUI extends MMActivity implements C94853e.C94860g, C94853e.C94861h {

    /* renamed from: T */
    public static final /* synthetic */ int f279066T = 0;

    /* renamed from: A */
    public String f279067A = "";

    /* renamed from: B */
    public long f279068B = 0;

    /* renamed from: C */
    public int f279069C = 0;

    /* renamed from: D */
    public int f279070D = 0;

    /* renamed from: E */
    public String f279071E = "";

    /* renamed from: F */
    public String f279072F = "";

    /* renamed from: G */
    public boolean f279073G = false;

    /* renamed from: H */
    public boolean f279074H = false;

    /* renamed from: I */
    public String f279075I;

    /* renamed from: J */
    public C101804kv2 f279076J = null;

    /* renamed from: K */
    public String f279077K;

    /* renamed from: L */
    public int f279078L;

    /* renamed from: M */
    public String f279079M;

    /* renamed from: N */
    public String f279080N;

    /* renamed from: P */
    public boolean f279081P = false;

    /* renamed from: Q */
    public String[] f279082Q = null;

    /* renamed from: R */
    public String[] f279083R = null;

    /* renamed from: S */
    public SnsInfo f279084S;

    /* renamed from: d */
    public C97621e f279085d;

    /* renamed from: e */
    public VideoPlayView f279086e;

    /* renamed from: f */
    public C98973p f279087f = new C98973p("VideoAdPlayerUI");

    /* renamed from: g */
    public String f279088g = "";

    /* renamed from: h */
    public String f279089h = "";

    /* renamed from: i */
    public String f279090i = "";

    /* renamed from: j */
    public String f279091j = "";

    /* renamed from: n */
    public String f279092n = "";

    /* renamed from: o */
    public String f279093o = "";

    /* renamed from: p */
    public boolean f279094p = false;

    /* renamed from: q */
    public int f279095q = 0;

    /* renamed from: r */
    public String f279096r = "";

    /* renamed from: s */
    public String f279097s = "";

    /* renamed from: t */
    public String f279098t = "";

    /* renamed from: u */
    public String f279099u = "";

    /* renamed from: v */
    public String f279100v = "";

    /* renamed from: w */
    public int f279101w = 0;

    /* renamed from: x */
    public int f279102x = 0;

    /* renamed from: y */
    public String f279103y = "";

    /* renamed from: z */
    public String f279104z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$a */
    public class C95705a implements VideoPlayView.C94586g {
        public C95705a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$b */
    public class C95706b implements View.OnClickListener {
        public C95706b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$2");
            VideoAdPlayerUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$c */
    public class C95707c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$c$a */
        public class C95708a implements C76879j.C11180n {
            public C95708a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                String str;
                String str2;
                String str3;
                int i2;
                int i3 = i;
                String str4 = "onClick";
                SnsMethodCalculate.markStartTimeMs(str4, "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1");
                if (i3 == 0) {
                    str3 = str4;
                    str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
                    String str5 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("mutil_select_is_ret", true);
                    VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
                    int i4 = VideoAdPlayerUI.f279066T;
                    SnsMethodCalculate.markStartTimeMs("access$1300", str5);
                    String str6 = videoAdPlayerUI.f279096r;
                    SnsMethodCalculate.markEndTimeMs("access$1300", str5);
                    intent.putExtra("ad_video_title", str6);
                    intent.putExtra("Retr_Msg_Type", 2);
                    C88144b.m109802t(VideoAdPlayerUI.this, ".ui.transmit.SelectConversationUI", intent, 4097);
                } else if (i3 == 1) {
                    str3 = str4;
                    str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
                    String str7 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
                    VideoAdPlayerUI videoAdPlayerUI2 = VideoAdPlayerUI.this;
                    int i5 = VideoAdPlayerUI.f279066T;
                    SnsMethodCalculate.markStartTimeMs("access$1400", str7);
                    videoAdPlayerUI2.getClass();
                    SnsMethodCalculate.markStartTimeMs("shareSns", str7);
                    Intent intent2 = new Intent();
                    intent2.putExtra("Ksnsupload_link", videoAdPlayerUI2.f279090i);
                    intent2.putExtra("Ksnsupload_type", 11);
                    intent2.putExtra("Ksnsupload_title", videoAdPlayerUI2.f279096r);
                    intent2.putExtra("Ksnsupload_imgurl", videoAdPlayerUI2.f279092n);
                    intent2.putExtra("KSnsStreamVideoTotalTime", videoAdPlayerUI2.f279076J.f298668A);
                    intent2.putExtra("KSnsStreamVideoWroding", videoAdPlayerUI2.f279097s);
                    intent2.putExtra("KSnsStreamVideoWebUrl", videoAdPlayerUI2.f279098t);
                    intent2.putExtra("KSnsStreamVideoAduxInfo", videoAdPlayerUI2.f279099u);
                    intent2.putExtra("KSnsStreamVideoPublishId", videoAdPlayerUI2.f279100v);
                    intent2.putExtra("need_result", true);
                    intent2.putExtra("key_snsad_statextstr", videoAdPlayerUI2.f279075I);
                    int i6 = videoAdPlayerUI2.f279102x;
                    String str8 = "sns_";
                    if (i6 == 1 || i6 == 2) {
                        str8 = str8 + videoAdPlayerUI2.f279067A;
                    } else if (i6 == 3 || i6 == 4) {
                        str8 = "msg_" + videoAdPlayerUI2.f279068B;
                    } else if (i6 == 5) {
                        str8 = "fav_" + C75592q0.m90789s() + "_" + videoAdPlayerUI2.f279069C;
                    }
                    String a = C86493v0.m107223a(str8);
                    C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", str8);
                    intent2.putExtra("reportSessionId", a);
                    C88144b.m109795m(videoAdPlayerUI2, "sns", ".ui.SnsUploadUI", intent2, 4098);
                    if (videoAdPlayerUI2.f279078L != 0) {
                        C99158b bVar = videoAdPlayerUI2.f279087f.f290185j;
                        int i7 = bVar.f290741c;
                        if (videoAdPlayerUI2.f279081P) {
                            long j = bVar.f290745g;
                            if (j != 0) {
                                i7 += (int) (Util.ticksToNow(j) / 1000);
                            }
                        }
                        C29038l lVar = new C29038l(13228, "1,4," + i7 + "," + videoAdPlayerUI2.f279079M + "," + videoAdPlayerUI2.f279080N + "," + Util.nowSecond() + "," + videoAdPlayerUI2.f279077K + "," + videoAdPlayerUI2.f279095q, (int) Util.nowSecond());
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(lVar);
                    }
                    SnsMethodCalculate.markEndTimeMs("shareSns", str7);
                    SnsMethodCalculate.markEndTimeMs("access$1400", str7);
                } else if (i3 != 2) {
                    str = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
                    SnsMethodCalculate.markEndTimeMs(str4, str);
                } else {
                    VideoAdPlayerUI videoAdPlayerUI3 = VideoAdPlayerUI.this;
                    int i8 = VideoAdPlayerUI.f279066T;
                    SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    videoAdPlayerUI3.getClass();
                    SnsMethodCalculate.markStartTimeMs("favVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C101804kv2 kv22 = videoAdPlayerUI3.f279076J;
                    str3 = str4;
                    str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3$1";
                    String str9 = "access$1500";
                    String str10 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
                    ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135056NB(doFavoriteEvent, 0, kv22.f298668A, videoAdPlayerUI3.f279096r, "", kv22.f298706x, videoAdPlayerUI3.f279097s, videoAdPlayerUI3.f279098t, videoAdPlayerUI3.f279092n, videoAdPlayerUI3.f279089h, videoAdPlayerUI3.f279103y, videoAdPlayerUI3.f279099u, videoAdPlayerUI3.f279100v, videoAdPlayerUI3.f279075I);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = videoAdPlayerUI3;
                    aVar.f264688m = 24;
                    doFavoriteEvent.publish();
                    if (doFavoriteEvent.f264675e.f9046a == 0 && (i2 = videoAdPlayerUI3.f279102x) != 0) {
                        C98977w.m128889e(C98977w.C98980c.Fav, videoAdPlayerUI3.f279100v, videoAdPlayerUI3.f279099u, videoAdPlayerUI3.f279101w, i2, videoAdPlayerUI3.f279103y, videoAdPlayerUI3.f279104z, videoAdPlayerUI3.f279067A, videoAdPlayerUI3.f279068B, videoAdPlayerUI3.f279069C, videoAdPlayerUI3.f279070D, 0);
                    }
                    if (videoAdPlayerUI3.f279094p) {
                        C102236a0.m134773u0(new SnsAdClick(0, 6, videoAdPlayerUI3.f279084S.field_snsId, 11, 0));
                    }
                    if (videoAdPlayerUI3.f279078L != 0) {
                        C99158b bVar2 = videoAdPlayerUI3.f279087f.f290185j;
                        int i9 = bVar2.f290741c;
                        if (videoAdPlayerUI3.f279081P) {
                            long j2 = bVar2.f290745g;
                            if (j2 != 0) {
                                i9 += (int) (Util.ticksToNow(j2) / 1000);
                            }
                        }
                        C29038l lVar2 = new C29038l(13228, "1,5," + i9 + "," + videoAdPlayerUI3.f279079M + "," + videoAdPlayerUI3.f279080N + "," + Util.nowSecond() + "," + videoAdPlayerUI3.f279077K + "," + videoAdPlayerUI3.f279095q, (int) Util.nowSecond());
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(lVar2);
                    }
                    String str11 = str10;
                    SnsMethodCalculate.markEndTimeMs("favVideo", str11);
                    SnsMethodCalculate.markEndTimeMs(str9, str11);
                }
                str4 = str3;
                str = str2;
                SnsMethodCalculate.markEndTimeMs(str4, str);
            }
        }

        public C95707c() {
        }

        public void onClick(View view) {
            String[] strArr;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3");
            VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
            int i = VideoAdPlayerUI.f279066T;
            SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z = videoAdPlayerUI.f279073G;
            SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            VideoAdPlayerUI videoAdPlayerUI2 = VideoAdPlayerUI.this;
            if (z) {
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                strArr = videoAdPlayerUI2.f279083R;
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            } else {
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                strArr = videoAdPlayerUI2.f279082Q;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            }
            C76879j.m92736g(videoAdPlayerUI, (String) null, strArr, (String) null, new C95708a());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$d */
    public class C95709d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$d$a */
        public class C95710a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f279110d;

            public C95710a(Intent intent) {
                this.f279110d = intent;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4$1");
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(this.f279110d, VideoAdPlayerUI.this);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4$1");
            }
        }

        public C95709d() {
        }

        public void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4");
            VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
            int i = VideoAdPlayerUI.f279066T;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i2 = videoAdPlayerUI.f279102x;
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i2 != 0) {
                C98977w.C98978a aVar = C98977w.C98978a.DetailInVideo;
                VideoAdPlayerUI videoAdPlayerUI2 = VideoAdPlayerUI.this;
                String str3 = videoAdPlayerUI2.f279100v;
                String str4 = videoAdPlayerUI2.f279099u;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                int i3 = videoAdPlayerUI2.f279101w;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI3 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                int i4 = videoAdPlayerUI3.f279102x;
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI4 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str5 = videoAdPlayerUI4.f279103y;
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI5 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str6 = videoAdPlayerUI5.f279104z;
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI6 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str7 = videoAdPlayerUI6.f279067A;
                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI7 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4";
                long j = videoAdPlayerUI7.f279068B;
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI8 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                int i5 = videoAdPlayerUI8.f279069C;
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoAdPlayerUI videoAdPlayerUI9 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                int i6 = videoAdPlayerUI9.f279070D;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                C98977w.m128886b(aVar, str3, str4, i3, i4, str5, str6, str7, j, i5, i6);
            } else {
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4";
            }
            VideoAdPlayerUI videoAdPlayerUI10 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i7 = videoAdPlayerUI10.f279078L;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i7 != 0) {
                int i8 = VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290741c;
                VideoAdPlayerUI videoAdPlayerUI11 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                boolean z = videoAdPlayerUI11.f279081P;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                if (z && VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290745g != 0) {
                    i8 += (int) (Util.ticksToNow(VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290745g) / 1000);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("1,1,");
                sb.append(i8);
                sb.append(",");
                VideoAdPlayerUI videoAdPlayerUI12 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str8 = videoAdPlayerUI12.f279079M;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb.append(str8);
                sb.append(",");
                VideoAdPlayerUI videoAdPlayerUI13 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str9 = videoAdPlayerUI13.f279080N;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb.append(str9);
                sb.append(",");
                sb.append(Util.nowSecond());
                sb.append(",");
                VideoAdPlayerUI videoAdPlayerUI14 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str10 = videoAdPlayerUI14.f279077K;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb.append(str10);
                sb.append(",");
                sb.append(VideoAdPlayerUI.m122504J7(VideoAdPlayerUI.this));
                C29038l lVar = new C29038l(13228, sb.toString(), (int) Util.nowSecond());
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(lVar);
            }
            VideoAdPlayerUI.this.finish();
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            VideoAdPlayerUI videoAdPlayerUI15 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            String str11 = videoAdPlayerUI15.f279075I;
            SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            bundle.putString("key_snsad_statextstr", str11);
            VideoAdPlayerUI videoAdPlayerUI16 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            String str12 = videoAdPlayerUI16.f279098t;
            SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            VideoAdPlayerUI videoAdPlayerUI17 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z2 = videoAdPlayerUI17.f279094p;
            SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (z2 && !TextUtils.isEmpty(VideoAdPlayerUI.this.f279099u)) {
                str12 = C102236a0.m134734b(str12, VideoAdPlayerUI.this.f279099u);
            }
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("rawUrl", str12);
            intent.putExtra("useJs", true);
            VideoAdPlayerUI videoAdPlayerUI18 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z3 = videoAdPlayerUI18.f279094p;
            SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (z3) {
                VideoAdPlayerUI videoAdPlayerUI19 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                SnsInfo snsInfo = videoAdPlayerUI19.f279084S;
                SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                C102236a0.m134773u0(new SnsAdClick(0, 6, snsInfo.field_snsId, 18, 0));
            }
            new MMHandler(Looper.getMainLooper()).post(new C95710a(intent));
            String str13 = str;
            SnsMethodCalculate.markEndTimeMs(str13, str2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$4", "android/view/View$OnClickListener", str13, "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ C98973p m122502H7(VideoAdPlayerUI videoAdPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        C98973p pVar = videoAdPlayerUI.f279087f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return pVar;
    }

    /* renamed from: I7 */
    public static /* synthetic */ boolean m122503I7(VideoAdPlayerUI videoAdPlayerUI, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        videoAdPlayerUI.f279081P = z;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return z;
    }

    /* renamed from: J7 */
    public static /* synthetic */ int m122504J7(VideoAdPlayerUI videoAdPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        int i = videoAdPlayerUI.f279095q;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return i;
    }

    /* renamed from: K7 */
    public final void mo133141K7(int i) {
        SnsMethodCalculate.markStartTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (!this.f279094p) {
            SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            return;
        }
        this.f279087f.mo138332e(this.f279086e.getDuration());
        this.f279087f.f290185j.f290745g = Util.currentTicks();
        C99158b bVar = this.f279087f.f290185j;
        bVar.f290744f = i == 2 ? 2 : 1;
        bVar.f290743e = 2;
        Log.m105924i("MicroMsg.VideoPlayerUI", "duration  orient " + this.f279087f.f290185j.f290744f);
        SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void finish() {
        String str;
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (this.f279081P) {
            this.f279086e.mo130123f(-1);
        }
        if (!(this.f279087f == null || (str = this.f279071E) == null || str.length() <= 0)) {
            this.f279087f.mo138333f();
            Intent intent = new Intent();
            intent.putExtra("KComponentCid", this.f279071E);
            intent.putExtra("KStreamVideoPlayCount", this.f279087f.f290181f);
            intent.putExtra("KStreamVideoPlayCompleteCount", this.f279087f.f290182g);
            intent.putExtra("KStreamVideoTotalPlayTimeInMs", this.f279087f.f290183h);
            setResult(-1, intent);
        }
        super.finish();
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public int getForceOrientation() {
        SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (this.f279074H) {
            SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            return 0;
        }
        SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return 4;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        return C0966R.C0971layout.cbo;
    }

    /* renamed from: n7 */
    public void mo131007n7(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        Log.m105924i("MicroMsg.VideoPlayerUI", "isPlaying " + this.f279086e.isPlaying());
        if (this.f279086e.isPlaying()) {
            SnsMethodCalculate.markEndTimeMs("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            return;
        }
        this.f279086e.setLoop(false);
        if (str2.equals(this.f279086e.getVideoPath())) {
            VideoPlayView videoPlayView = this.f279086e;
            videoPlayView.mo24788d(videoPlayView.getLastProgresstime());
            this.f279086e.mo130125h(true);
            Log.m105924i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + str + " path: " + str2);
        } else {
            this.f279086e.setVideoPath(str2);
            VideoPlayView videoPlayView2 = this.f279086e;
            videoPlayView2.mo24788d(videoPlayView2.getLastProgresstime());
            Log.m105924i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + str + " path: " + str2);
        }
        SnsMethodCalculate.markEndTimeMs("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Iterator<String> it;
        String str9;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        String str10 = "onActivityResult";
        String str11 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI";
        SnsMethodCalculate.markStartTimeMs(str10, str11);
        int i5 = 1;
        int i6 = 0;
        String str12 = "MicroMsg.VideoPlayerUI";
        Log.m105925i(str12, "onActivityResult %d", Integer.valueOf(i));
        if (4097 != i3) {
            str2 = str10;
            str = str11;
        } else if (-1 == i4) {
            String stringExtra = intent2.getStringExtra("Select_Conv_User");
            String stringExtra2 = intent2.getStringExtra("custom_send_text");
            String str13 = ",";
            Iterator<String> it4 = Util.stringsToList(stringExtra.split(str13)).iterator();
            while (it4.hasNext()) {
                String next = it4.next();
                Object[] objArr = new Object[i5];
                objArr[i6] = next;
                Log.m105925i(str12, "send sight to %s", objArr);
                SnsMethodCalculate.markStartTimeMs("sendAppMsg", str11);
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195570f = this.f279096r;
                bVar.f195582i = 4;
                if (!Util.isNullOrNil(this.f279076J.f298692g)) {
                    bVar.f195586j = this.f279076J.f298692g;
                } else {
                    bVar.f195586j = this.f279076J.f298706x;
                }
                bVar.f195646y = Util.isNullOrNil(this.f279076J.f298669B) ? this.f279076J.f298694i : this.f279076J.f298669B;
                C101804kv2 kv22 = this.f279076J;
                bVar.f195541W1 = kv22.f298706x;
                bVar.f195544X1 = kv22.f298668A;
                bVar.f195547Y1 = this.f279096r;
                bVar.f195553a2 = this.f279098t;
                bVar.f195550Z1 = this.f279097s;
                bVar.f195557b2 = this.f279092n;
                bVar.f195561c2 = this.f279099u;
                bVar.f195565d2 = this.f279100v;
                bVar.f195535U1 = this.f279075I;
                byte[] O = C86013q1.m106433O(this.f279089h, i6, -1);
                Object[] objArr2 = new Object[1];
                objArr2[0] = Integer.valueOf(O == null ? 0 : O.length);
                Log.m105925i(str12, "read buf size %d", objArr2);
                if (C80996q.C1279a.m1369a() != null) {
                    str3 = "sendAppMsg";
                    C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", next, "", O);
                } else {
                    str3 = "sendAppMsg";
                }
                if (this.f279078L != 0) {
                    C99158b bVar2 = this.f279087f.f290185j;
                    int i7 = bVar2.f290741c;
                    if (this.f279081P) {
                        long j = bVar2.f290745g;
                        if (j != 0) {
                            i7 += (int) (Util.ticksToNow(j) / 1000);
                        }
                    }
                    str4 = str10;
                    C29038l lVar = new C29038l(13228, "1,3," + i7 + str13 + this.f279079M + str13 + this.f279080N + str13 + Util.nowSecond() + str13 + this.f279077K + str13 + this.f279095q, (int) Util.nowSecond());
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(lVar);
                } else {
                    str4 = str10;
                }
                SnsMethodCalculate.markEndTimeMs(str3, str11);
                C7250m.m7431a().mo136252Ar(stringExtra2, next);
                if (this.f279094p) {
                    C102236a0.m134773u0(new SnsAdClick(0, 6, this.f279084S.field_snsId, 12, 0));
                }
                if (this.f279102x != 0) {
                    boolean U5 = C72996z1.m85820U5(next);
                    str9 = str12;
                    it = it4;
                    str8 = stringExtra2;
                    str7 = str13;
                    str6 = str4;
                    str5 = str11;
                    C98977w.m128889e(U5 ? C98977w.C98980c.Chatroom : C98977w.C98980c.Chat, this.f279100v, this.f279099u, this.f279101w, this.f279102x, this.f279103y, this.f279104z, this.f279067A, this.f279068B, this.f279069C, this.f279070D, U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(next) : 0);
                } else {
                    str5 = str11;
                    str9 = str12;
                    it = it4;
                    str8 = stringExtra2;
                    str7 = str13;
                    str6 = str4;
                }
                Intent intent3 = intent;
                str12 = str9;
                it4 = it;
                stringExtra2 = str8;
                str13 = str7;
                str10 = str6;
                str11 = str5;
                i5 = 1;
                i6 = 0;
            }
            str2 = str10;
            str = str11;
            C75026b.m89951a(this, getString(C0966R.string.fjh));
        } else {
            str2 = str10;
            str = str11;
            if (this.f279094p) {
                C102236a0.m134773u0(new SnsAdClick(0, 6, this.f279084S.field_snsId, 13, 0));
            }
        }
        if (4098 == i3) {
            int i8 = this.f279102x;
            if (i8 != 0) {
                C98977w.m128889e(C98977w.C98980c.Sns, this.f279100v, this.f279099u, this.f279101w, i8, this.f279103y, this.f279104z, this.f279067A, this.f279068B, this.f279069C, this.f279070D, 0);
            }
            if (-1 == i4) {
                if (this.f279094p) {
                    C102236a0.m134773u0(new SnsAdClick(0, 6, this.f279084S.field_snsId, 15, 0));
                }
            } else if (this.f279094p) {
                C102236a0.m134773u0(new SnsAdClick(0, 6, this.f279084S.field_snsId, 16, 0));
            }
        }
        super.onActivityResult(i, i2, intent);
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onConfigurationChanged(configuration);
        VideoPlayView videoPlayView = this.f279086e;
        videoPlayView.getClass();
        Log.m105924i("MicroMsg.VideoPlayView", "onConfigurationChanged " + configuration.orientation + " " + videoPlayView.f273579G);
        int i = videoPlayView.f273579G;
        int i2 = configuration.orientation;
        if (i != i2) {
            if (i2 == 1) {
                videoPlayView.mo130126i(1);
            } else {
                videoPlayView.mo130126i(2);
            }
            int i3 = configuration.orientation;
            videoPlayView.f273579G = i3;
            if (i3 == 2) {
                View view = videoPlayView.f273589p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "updateConfig", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "updateConfig", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        mo133141K7(configuration.orientation);
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onCreate(Bundle bundle) {
        VideoPlayView videoPlayView;
        ImageView imageView;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onCreate(bundle);
        hideTitleView();
        if (C85875k4.m106205t(getContext(), false)) {
            getController().mo177081j0(getResources().getColor(C0966R.color.f3008c5));
        }
        this.f279082Q = new String[]{getString(C0966R.string.jah), getString(C0966R.string.jai), getString(C0966R.string.jaf)};
        this.f279083R = new String[]{getString(C0966R.string.jah), getString(C0966R.string.jai)};
        String stringExtra = getIntent().getStringExtra("KSta_SnSId");
        this.f279084S = C94866e1.Yx0().mo139807TE("" + C102236a0.m134706B0(stringExtra));
        this.f279085d = new C97621e();
        C91998s.m115551f(getIntent());
        this.f279088g = getIntent().getStringExtra("KFullVideoPath");
        this.f279090i = getIntent().getStringExtra("KStremVideoUrl");
        this.f279092n = getIntent().getStringExtra("KThumUrl");
        this.f279093o = getIntent().getStringExtra("KMediaId");
        this.f279094p = getIntent().getBooleanExtra("KFromTimeLine", false);
        this.f279091j = getIntent().getStringExtra("KUrl");
        this.f279096r = Util.nullAs(getIntent().getStringExtra("KMediaTitle"), "");
        this.f279095q = getIntent().getIntExtra("KMediaVideoTime", 0);
        this.f279073G = getIntent().getBooleanExtra("KBlockFav", false);
        this.f279074H = getIntent().getBooleanExtra("ForceLandscape", false);
        this.f279097s = getIntent().getStringExtra("StreamWording");
        this.f279098t = getIntent().getStringExtra("StremWebUrl");
        this.f279071E = getIntent().getStringExtra("KComponentCid");
        this.f279099u = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
        this.f279100v = getIntent().getStringExtra("KSta_StremVideoPublishId");
        this.f279101w = getIntent().getIntExtra("KSta_SourceType", 0);
        this.f279102x = getIntent().getIntExtra("KSta_Scene", 0);
        this.f279103y = getIntent().getStringExtra("KSta_FromUserName");
        this.f279104z = getIntent().getStringExtra("KSta_ChatName");
        this.f279067A = getIntent().getStringExtra("KSta_SnSId");
        this.f279068B = getIntent().getLongExtra("KSta_MsgId", 0);
        this.f279069C = getIntent().getIntExtra("KSta_FavID", 0);
        this.f279070D = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
        this.f279075I = getIntent().getStringExtra("KSta_SnsStatExtStr");
        this.f279072F = Util.nullAs(getIntent().getStringExtra("KViewId"), "");
        this.f279077K = Util.nullAs(getIntent().getStringExtra("ReportArgs"), "");
        int intExtra = getIntent().getIntExtra("NeedReportData", 0);
        this.f279078L = intExtra;
        if (intExtra != 0) {
            ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
            this.f279079M = companion.getFormattedWiFiSsid();
            this.f279080N = companion.getFormattedWiFiBssid();
        }
        C101804kv2 kv22 = new C101804kv2();
        this.f279076J = kv22;
        kv22.f298694i = this.f279092n;
        kv22.f298706x = this.f279090i;
        kv22.f298689d = this.f279093o;
        kv22.f298692g = this.f279091j;
        kv22.f298693h = 1;
        kv22.f298668A = this.f279095q;
        this.f279087f.f290179d = Util.currentTicks();
        Log.m105924i("MicroMsg.VideoPlayerUI", "init streamvideo " + this.f279076J.f298689d + " attachurl:" + this.f279076J.f298706x + " videoattachTotalTime:" + this.f279076J.f298668A + " streamvideowording: " + this.f279097s + " streamvideoweburl: " + this.f279098t + " mediaTitle: " + this.f279096r + " thumburl " + this.f279092n + " streamvideoaduxinfo " + this.f279099u + " streamvideopublishid " + this.f279100v);
        if (Util.isNullOrNil(this.f279088g)) {
            this.f279088g = C94938q1.m120518e(C94866e1.m120262YO(), this.f279076J.f298689d) + C102236a0.m134716K(this.f279076J);
        }
        if (Util.isNullOrNil(this.f279089h) || !C86013q1.m106450k(this.f279089h)) {
            String str = "attach" + this.f279076J.f298689d;
            this.f279089h = C94938q1.m120518e(C94866e1.m120262YO(), str) + C102236a0.m134730Y(str);
        }
        if (!C86013q1.m106450k(this.f279089h)) {
            try {
                C101804kv2 kv23 = new C101804kv2();
                kv23.parseFrom(this.f279076J.toByteArray());
                kv23.f298689d = "attach" + kv23.f298689d;
                C102268v vVar = new C102268v(this.f279076J);
                vVar.mo141832d(1);
                vVar.mo141833e(this.f279076J.f298689d);
                C94866e1.Vx0().mo130979d(kv23, 7, vVar, C96983o3.f284139k);
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.VideoPlayerUI", "error for download thumb");
            }
            getWindow().addFlags(128);
        }
        VideoPlayView videoPlayView2 = (VideoPlayView) findViewById(C0966R.C0970id.l6s);
        this.f279086e = videoPlayView2;
        AdVideoPlayerLoadingBar adVideoPlayerLoadingBar = new AdVideoPlayerLoadingBar(getContext());
        videoPlayView2.getClass();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = videoPlayView2.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3917iw);
        videoPlayView2.f273587n = adVideoPlayerLoadingBar;
        videoPlayView2.f273586j.setPlayProgressCallback(true);
        videoPlayView2.addView((View) videoPlayView2.f273587n, layoutParams);
        videoPlayView2.f273587n.setIplaySeekCallback(new C102700e(videoPlayView2));
        videoPlayView2.f273587n.setOnPlayButtonClickListener(new C102701f(videoPlayView2));
        videoPlayView2.f273587n.setIsPlay(videoPlayView2.f273586j.isPlaying());
        C102692b bVar = videoPlayView2.f273587n;
        if (bVar != null) {
            View view = (View) bVar;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "addProgressBarView", "(Lcom/tencent/mm/plugin/sight/decode/ui/IVideoPlayProgressBar;Landroid/widget/RelativeLayout$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "addProgressBarView", "(Lcom/tencent/mm/plugin/sight/decode/ui/IVideoPlayProgressBar;Landroid/widget/RelativeLayout$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        adVideoPlayerLoadingBar.seek(0);
        this.f279086e.setVideoPlayViewEvent(new C95705a());
        this.f279086e.setVideoTotalTime(this.f279076J.f298668A);
        if (C86013q1.m106450k(this.f279088g)) {
            this.f279087f.f290177b = 1;
            this.f279086e.setVideoPath(this.f279088g);
        } else {
            this.f279086e.f273583g.setVisibility(0);
            this.f279086e.setIsDownloading(true);
            C94866e1.Vx0().mo130979d(this.f279076J, 6, (C102268v) null, C96983o3.f284139k);
        }
        this.f279086e.setLeftButtonOnClickListener(new C95706b());
        this.f279086e.setRightButtonOnCliclListener(new C95707c());
        VideoPlayView videoPlayView3 = this.f279086e;
        String str2 = this.f279097s;
        C95709d dVar = new C95709d();
        videoPlayView3.f273591r = str2;
        videoPlayView3.f273590q.setText(str2);
        videoPlayView3.f273590q.setOnClickListener(dVar);
        this.f279086e.mo130121b();
        if (!(getIntent().getIntExtra("ShareBtnHidden", 0) == 0 || (imageView = videoPlayView.f273594u) == null)) {
            (videoPlayView = this.f279086e).f273595v = false;
            imageView.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onDestroy();
        getWindow().clearFlags(128);
        int i = this.f279102x;
        if (i != 0) {
            C98977w.m128886b(C98977w.C98978a.LeaveCompleteVideo, this.f279100v, this.f279099u, this.f279101w, i, this.f279103y, this.f279104z, this.f279067A, this.f279068B, this.f279069C, this.f279070D);
        }
        SnsMethodCalculate.markStartTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (!this.f279094p) {
            SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        } else {
            SnsInfo snsInfo = this.f279084S;
            int adRecSrc = snsInfo == null ? 0 : snsInfo.getAdRecSrc();
            if (this.f279084S == null) {
                SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            } else {
                String d = this.f279087f.mo138331d();
                C98973p pVar = this.f279087f;
                int i2 = pVar.f290178c;
                long j = ((long) i2) - pVar.f290180e;
                if (j < 0) {
                    Log.m105921e("MicroMsg.VideoPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", Integer.valueOf(i2), Long.valueOf(this.f279087f.f290180e));
                    j = (long) this.f279087f.f290178c;
                }
                int i3 = (int) j;
                ADInfo adInfo = this.f279084S.getAdInfo();
                String str = adInfo == null ? "" : adInfo.waidPkg;
                C86709a0.m107528h();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                C98960j jVar = r8;
                C98960j jVar2 = new C98960j(this.f279072F, 6, 2, this.f279087f.f290178c, (C101786i2) null, (C64509l2) null, 2, d, -1, adRecSrc, i3, i3, 0, this.f279084S.getAdSnsInfo().getTimelineRemindInfoSourceInfo(), this.f279084S.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), str);
                b0Var.mo123460f(jVar);
                SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            }
        }
        SnsMethodCalculate.markStartTimeMs("exitCgiReport", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (this.f279078L != 0) {
            C99158b bVar = this.f279087f.f290185j;
            int i4 = bVar.f290741c;
            if (this.f279081P) {
                long j2 = bVar.f290745g;
                if (j2 != 0) {
                    i4 += (int) (Util.ticksToNow(j2) / 1000);
                }
            }
            C29038l lVar = new C29038l(13228, "1,2," + i4 + "," + this.f279079M + "," + this.f279080N + "," + Util.nowSecond() + "," + this.f279077K + "," + this.f279095q, (int) Util.nowSecond());
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(lVar);
        }
        SnsMethodCalculate.markEndTimeMs("exitCgiReport", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        setResult(-1, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onPause();
        int i = getResources().getConfiguration().orientation;
        Log.m105924i("MicroMsg.VideoPlayerUI", "onpause  " + i);
        mo133141K7(i);
        VideoPlayView videoPlayView = this.f279086e;
        if (videoPlayView != null && videoPlayView.isPlaying()) {
            this.f279086e.mo130123f(-1);
        }
        if (this.f279086e != null) {
            Log.m105924i("MicroMsg.VideoPlayerUI", "onDetach");
            this.f279086e.onDetach();
        }
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("removeSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        ((HashSet) Vx0.f274824k).remove(this);
        SnsMethodCalculate.markEndTimeMs("removeSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C94866e1.Vx0().mo130997v(this);
        C98973p pVar = this.f279087f;
        if (pVar != null) {
            pVar.mo138329b();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        super.onResume();
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("addSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        ((HashSet) Vx0.f274824k).add(this);
        SnsMethodCalculate.markEndTimeMs("addSightDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C94866e1.Vx0().mo130978c(this);
        C98973p pVar = this.f279087f;
        if (pVar != null) {
            pVar.mo138330c();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onSightFinish(String str, boolean z) {
        C101804kv2 kv22;
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        Log.m105924i("MicroMsg.VideoPlayerUI", "onSightFinish " + str);
        this.f279086e.setIsDownloading(false);
        this.f279086e.setVideoPath(this.f279088g);
        VideoPlayView videoPlayView = this.f279086e;
        videoPlayView.mo24788d(videoPlayView.getLastProgresstime());
        this.f279086e.setLoop(false);
        if (this.f279094p && !Util.isNullOrNil(str) && (kv22 = this.f279076J) != null && str.equals(kv22.f298689d) && C86013q1.m106450k(this.f279088g)) {
            this.f279087f.f290177b = 1;
        }
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
    }
}
