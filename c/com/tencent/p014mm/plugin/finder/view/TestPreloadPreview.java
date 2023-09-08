package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bo1.C28357x;
import bo1.C54511w;
import cm1.C0740i2;
import co1.C55048e;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eo1.C58638b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import k20.C60958c;
import k20.C9556a;
import kf1.C9833k9;
import kotlin.Metadata;
import o40.C61926c;
import p501dz.C58466h;
import rx3.C13601g;
import rx3.C13605o;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C64175a0;
import te3.C64689rq2;
import te3.C64850yb1;
import up1.C37521f;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u001a\u0005\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/TestPreloadPreview;", "Landroid/widget/FrameLayout;", "", "getTranslateOffset", "Landroidx/recyclerview/widget/RecyclerView;", "d", "Lrx3/g;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "e", "getGlobalPreloadTv", "()Landroid/widget/TextView;", "globalPreloadTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview */
public final class TestPreloadPreview extends FrameLayout {

    /* renamed from: B */
    public static final /* synthetic */ int f162156B = 0;

    /* renamed from: A */
    public final C56626j8 f162157A;

    /* renamed from: d */
    public final C13601g f162158d = C36568h.m40985a(new C56637m8(this));

    /* renamed from: e */
    public final C13601g f162159e = C36568h.m40985a(new C56611g8(this));

    /* renamed from: f */
    public final boolean f162160f;

    /* renamed from: g */
    public final boolean f162161g;

    /* renamed from: h */
    public DataBuffer<C0740i2> f162162h;

    /* renamed from: i */
    public FinderVideoCore f162163i;

    /* renamed from: j */
    public long f162164j;

    /* renamed from: n */
    public int f162165n;

    /* renamed from: o */
    public boolean f162166o;

    /* renamed from: p */
    public int f162167p;

    /* renamed from: q */
    public final ArrayList<Long> f162168q;

    /* renamed from: r */
    public final ConcurrentHashMap<String, C56580b> f162169r;

    /* renamed from: s */
    public final ConcurrentHashMap<Integer, C56579a> f162170s;

    /* renamed from: t */
    public final C56595d8 f162171t;

    /* renamed from: u */
    public final C56609f8 f162172u;

    /* renamed from: v */
    public final C56590c8 f162173v;

    /* renamed from: w */
    public final MMHandler f162174w;

    /* renamed from: x */
    public long f162175x;

    /* renamed from: y */
    public int f162176y;

    /* renamed from: z */
    public int f162177z;

    /* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$e */
    public static final class C41566e extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f111884z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41566e(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f111884z = (TextView) view.findViewById(C0966R.C0970id.gqa);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$a */
    public static final class C56579a {

        /* renamed from: a */
        public final int f162178a;

        /* renamed from: b */
        public long f162179b;

        /* renamed from: c */
        public long f162180c;

        /* renamed from: d */
        public int f162181d;

        public C56579a(int i, long j, long j2, int i2) {
            this.f162178a = i;
            this.f162179b = j;
            this.f162180c = j2;
            this.f162181d = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56579a)) {
                return false;
            }
            C56579a aVar = (C56579a) obj;
            return this.f162178a == aVar.f162178a && this.f162179b == aVar.f162179b && this.f162180c == aVar.f162180c && this.f162181d == aVar.f162181d;
        }

        public int hashCode() {
            long j = this.f162179b;
            long j2 = this.f162180c;
            return (((((this.f162178a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f162181d;
        }

        public String toString() {
            return "CgiActionInfo(tabType=" + this.f162178a + ", startTimeMs=" + this.f162179b + ", endTimeMs=" + this.f162180c + ", respItemSize=" + this.f162181d + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$b */
    public static final class C56580b {

        /* renamed from: a */
        public long f162182a;

        /* renamed from: b */
        public int f162183b;

        /* renamed from: c */
        public int f162184c;

        /* renamed from: d */
        public int f162185d;

        /* renamed from: e */
        public String f162186e;

        /* renamed from: f */
        public String f162187f;

        /* renamed from: g */
        public int f162188g;

        /* renamed from: h */
        public long f162189h;

        /* renamed from: i */
        public C56581c f162190i = C56581c.DOWNLOADER_IDLE;

        /* renamed from: j */
        public C56581c f162191j = C56581c.PLAYER_IDLE;

        /* renamed from: k */
        public int f162192k;

        /* renamed from: l */
        public long f162193l;

        /* renamed from: m */
        public long f162194m;

        /* renamed from: n */
        public long f162195n;

        /* renamed from: o */
        public String f162196o = "";
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$c */
    public enum C56581c {
        DOWNLOADER_IDLE("未启动"),
        DOWNLOADER_START("启动下载"),
        DOWNLOADER_RUNNING("下载中"),
        DOWNLOADER_COMPLETE("下载完成"),
        DOWNLOADER_STOP("停止下载"),
        DOWNLOADER_LOCAL_CACHE("本地缓存"),
        PLAYER_IDLE("未启动"),
        PLAYER_PRE_RENDER("预渲染"),
        PLAYER_PRE_RENDER_COMPLETE("预渲染完成"),
        PLAYER_START("启动播放"),
        PLAYER_RUNNING("播放中"),
        PLAYER_PAUSE("暂停播放"),
        PLAYER_STOP("停止播放");
        

        /* renamed from: d */
        public final String f162211d;

        /* access modifiers changed from: public */
        C56581c(String str) {
            this.f162211d = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.TestPreloadPreview$d */
    public final class C56582d extends RecyclerView.C16613e<C41566e> {
        public C56582d() {
        }

        public int getItemCount() {
            DataBuffer<C0740i2> dataBuffer = TestPreloadPreview.this.f162162h;
            if (dataBuffer != null) {
                return dataBuffer.getTotalSize();
            }
            C87412m.m108603p("data");
            throw null;
        }

        public long getItemId(int i) {
            List list = TestPreloadPreview.this.f162162h;
            if (list != null) {
                C0740i2 i2Var = (C0740i2) C110818d0.m150917O(list, i);
                if (i2Var != null) {
                    return i2Var.getItemId();
                }
                return 0;
            }
            C87412m.m108603p("data");
            throw null;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C56580b bVar;
            C0740i2 i2Var;
            TextView textView;
            C41566e eVar;
            String str;
            CharSequence charSequence;
            int i2;
            int i3;
            String str2;
            long j;
            long j2;
            String str3;
            String str4;
            long j3;
            CharSequence charSequence2;
            int i4;
            C56581c cVar;
            String str5;
            String str6;
            C56581c cVar2;
            String str7;
            C56581c cVar3;
            String str8;
            C56581c cVar4;
            C56581c cVar5;
            C64850yb1 yb12;
            int i5 = i;
            C41566e eVar2 = (C41566e) zVar;
            C87412m.m108594g(eVar2, "holder");
            List list = TestPreloadPreview.this.f162162h;
            if (list != null) {
                C0740i2 i2Var2 = (C0740i2) C110818d0.m150917O(list, i5);
                if (i2Var2 == null) {
                    eVar2.f111884z.setText("unknown");
                    return;
                }
                TestPreloadPreview testPreloadPreview = TestPreloadPreview.this;
                long itemId = i2Var2.getItemId();
                testPreloadPreview.getClass();
                String p = C61926c.m72691p(itemId);
                String obj = p.subSequence(Math.max(0, p.length() - 4), p.length()).toString();
                C64689rq2 c = TestPreloadPreview.m65248c(TestPreloadPreview.this, i2Var2);
                String str9 = c.f185275p;
                if (str9 == null || str9.length() == 0) {
                    eVar2.f111884z.setText("unknown feedType(" + i2Var2.mo75c() + ')');
                    return;
                }
                eVar2.f111884z.setOnLongClickListener(new C41568b8(eVar2, TestPreloadPreview.this));
                ConcurrentHashMap<String, C56580b> concurrentHashMap = TestPreloadPreview.this.f162169r;
                String str10 = c.f185275p;
                if (str10 == null) {
                    str10 = "";
                }
                C56580b bVar2 = concurrentHashMap.get(str10);
                TextView textView2 = eVar2.f111884z;
                TestPreloadPreview testPreloadPreview2 = TestPreloadPreview.this;
                int i6 = 5;
                if (testPreloadPreview2.f162161g) {
                    i2Var2.getItemId();
                    String str11 = c.f185275p;
                    if (str11 != null) {
                        int length = str11.length();
                        if (5 > length) {
                            i6 = length;
                        }
                        charSequence2 = str11.subSequence(0, i6);
                    } else {
                        charSequence2 = null;
                    }
                    String valueOf = String.valueOf(charSequence2);
                    int i7 = c.f185268f;
                    int i8 = bVar2 != null ? bVar2.f162183b : 0;
                    if (bVar2 != null) {
                        i4 = bVar2.f162184c;
                        if (i4 == 0) {
                            i4 = bVar2.f162183b;
                        }
                    } else {
                        i4 = 0;
                    }
                    Math.max(i8, i4);
                    String str12 = bVar2 != null ? bVar2.f162186e : null;
                    long itemId2 = i2Var2.getItemId();
                    String b = TestPreloadPreview.m65247b(TestPreloadPreview.this, i2Var2);
                    eVar = eVar2;
                    boolean isLongVideo = i2Var2 instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var2).mo3513o().isLongVideo() : false;
                    int i9 = c.f185269g;
                    textView = textView2;
                    C56581c cVar6 = C56581c.PLAYER_IDLE;
                    C56581c cVar7 = C56581c.DOWNLOADER_IDLE;
                    i2Var = i2Var2;
                    StringBuilder sb = new StringBuilder();
                    if (itemId2 != 0) {
                        sb.append("> ");
                    }
                    if (isLongVideo) {
                        sb.append(i5 + "-[长视频-#" + obj + "] ");
                    } else if (i7 == 4) {
                        sb.append(i5 + "-[视频-#" + obj + "] ");
                    } else if (i7 == 2) {
                        sb.append(i5 + "-[图片-#" + obj + "] ");
                        if (bVar2 != null) {
                            bVar2.f162190i = cVar7;
                        }
                        if (bVar2 != null) {
                            bVar2.f162191j = cVar6;
                        }
                    } else if (i7 == 9) {
                        sb.append(i5 + "-[直播-#" + obj + "] ");
                        if (bVar2 != null) {
                            bVar2.f162190i = cVar7;
                        }
                        if (bVar2 != null) {
                            bVar2.f162191j = cVar6;
                        }
                    } else {
                        sb.append("[?-" + i5 + '#' + obj + "] ");
                    }
                    sb.append(valueOf + ' ');
                    if (str12 != null) {
                        sb.append(str12);
                    }
                    C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0();
                    C13605o oVar = (C13605o) Hx0.f154563r.get(bVar2 != null ? bVar2.f162196o : null);
                    int longValue = oVar != null ? (int) ((Number) oVar.f38559f).longValue() : 0;
                    C13605o oVar2 = (C13605o) Hx0.f154563r.get(bVar2 != null ? bVar2.f162196o : null);
                    int i15 = (oVar2 == null || (yb12 = (C64850yb1) oVar2.f38557d) == null) ? 0 : yb12.f186468f;
                    C13605o oVar3 = (C13605o) Hx0.f154563r.get(bVar2 != null ? bVar2.f162196o : null);
                    if (oVar3 != null) {
                        C64850yb1 yb13 = (C64850yb1) oVar3.f38557d;
                    }
                    sb.append(' ' + b + " PBitRate:" + i15 + XVFSFile.SEPARATOR_CHAR + longValue + "Bps");
                    String str13 = "未启动";
                    if (bVar2 == null || (cVar5 = bVar2.f162190i) == cVar7 || cVar5 == C56581c.DOWNLOADER_LOCAL_CACHE) {
                        cVar = cVar6;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("下载器：");
                        if (bVar2 == null || (cVar4 = bVar2.f162190i) == null || (str8 = cVar4.f162211d) == null) {
                            str8 = str13;
                        }
                        sb4.append(str8);
                        str5 = sb4.toString();
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        cVar = cVar6;
                        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(((float) i9) * ((((float) bVar2.f162194m) * 1.0f) / ((float) bVar2.f162195n)))}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        sb5.append(format);
                        sb5.append(XVFSFile.SEPARATOR_CHAR);
                        sb5.append(i9);
                        sb5.append(31186);
                        String sb6 = sb5.toString();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("下载器:");
                        String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((float) bVar2.f162194m) * 100.0f) / ((float) bVar2.f162195n))}, 1));
                        C87412m.m108593f(format2, "format(format, *args)");
                        sb7.append(format2);
                        sb7.append("%  ");
                        sb7.append(Util.getSizeKB(bVar2.f162194m));
                        sb7.append(XVFSFile.SEPARATOR_CHAR);
                        sb7.append(Util.getSizeKB(bVar2.f162195n));
                        sb7.append(' ');
                        sb7.append(sb6);
                        sb7.append(' ');
                        sb7.append(bVar2.f162190i.f162211d);
                        str5 = sb7.toString();
                    }
                    if (bVar2 == null || (cVar3 = bVar2.f162191j) == cVar || cVar3 == C56581c.PLAYER_STOP || cVar3 == C56581c.PLAYER_PRE_RENDER || cVar3 == C56581c.PLAYER_PRE_RENDER_COMPLETE) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("播放器：");
                        if (!(bVar2 == null || (cVar2 = bVar2.f162191j) == null || (str7 = cVar2.f162211d) == null)) {
                            str13 = str7;
                        }
                        sb8.append(str13);
                        str6 = sb8.toString();
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("播放器: ");
                        String format3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((float) bVar2.f162192k) * 100.0f) / ((float) bVar2.f162193l))}, 1));
                        C87412m.m108593f(format3, "format(format, *args)");
                        sb9.append(format3);
                        sb9.append("%  ");
                        sb9.append(bVar2.f162192k);
                        sb9.append(XVFSFile.SEPARATOR_CHAR);
                        sb9.append(bVar2.f162193l);
                        sb9.append("秒 ");
                        sb9.append(bVar2.f162191j.f162211d);
                        str6 = sb9.toString();
                    }
                    sb.append(APLogFileUtil.SEPARATOR_LINE);
                    sb.append(str5);
                    sb.append(APLogFileUtil.SEPARATOR_LINE);
                    sb.append(str6);
                    str = sb.toString();
                    C87412m.m108593f(str, "ss.toString()");
                    bVar = bVar2;
                } else {
                    eVar = eVar2;
                    C0740i2 i2Var3 = i2Var2;
                    textView = textView2;
                    long itemId3 = i2Var3.getItemId();
                    String str14 = c.f185275p;
                    if (str14 != null) {
                        int length2 = str14.length();
                        if (5 > length2) {
                            i6 = length2;
                        }
                        charSequence = str14.subSequence(0, i6);
                    } else {
                        charSequence = null;
                    }
                    String valueOf2 = String.valueOf(charSequence);
                    int i16 = c.f185268f;
                    int i17 = bVar2 != null ? bVar2.f162183b : 0;
                    if (bVar2 != null) {
                        i2 = bVar2.f162184c;
                        if (i2 == 0) {
                            i2 = bVar2.f162183b;
                        }
                    } else {
                        i2 = 0;
                    }
                    int max = Math.max(i17, i2);
                    if (bVar2 != null) {
                        i3 = bVar2.f162184c;
                        if (i3 == 0) {
                            i3 = bVar2.f162183b;
                        }
                    } else {
                        i3 = 0;
                    }
                    if (bVar2 != null) {
                        str2 = "ss.toString()";
                        j = bVar2.f162182a;
                    } else {
                        str2 = "ss.toString()";
                        j = 0;
                    }
                    String str15 = bVar2 != null ? bVar2.f162186e : null;
                    if (bVar2 != null) {
                        j2 = itemId3;
                        str3 = bVar2.f162187f;
                    } else {
                        j2 = itemId3;
                        str3 = null;
                    }
                    int i18 = bVar2 != null ? bVar2.f162188g : 0;
                    long itemId4 = i2Var3.getItemId();
                    int i19 = i18;
                    long j4 = j;
                    C0740i2 i2Var4 = i2Var3;
                    String b2 = TestPreloadPreview.m65247b(TestPreloadPreview.this, i2Var4);
                    boolean isLongVideo2 = i2Var4 instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var4).mo3513o().isLongVideo() : false;
                    if (bVar2 != null) {
                        str4 = b2;
                        i2Var = i2Var4;
                        j3 = bVar2.f162189h;
                        bVar = bVar2;
                    } else {
                        str4 = b2;
                        i2Var = i2Var4;
                        bVar = bVar2;
                        j3 = 0;
                    }
                    StringBuilder sb10 = new StringBuilder();
                    if (itemId4 != 0) {
                        sb10.append("> ");
                    }
                    if (isLongVideo2) {
                        sb10.append("[LV-" + i5 + '#' + obj + "] ");
                    } else if (i16 == 4) {
                        sb10.append("[V-" + i5 + '#' + obj + "] ");
                    } else if (i16 == 2) {
                        sb10.append("[P-" + i5 + '#' + obj + "] ");
                    } else if (i16 == 9) {
                        sb10.append("[L-" + i5 + '#' + obj + "] ");
                    } else {
                        sb10.append("[?-" + i5 + '#' + obj + "] ");
                    }
                    sb10.append(valueOf2 + ' ');
                    if (testPreloadPreview2.f162160f && str15 != null) {
                        sb10.append(str15);
                    }
                    if (!testPreloadPreview2.f162160f && str3 != null) {
                        sb10.append(' ' + str3);
                    }
                    if (i16 == 4) {
                        sb10.append(' ' + max + "% (" + i3 + "%:" + Util.getSizeKB(j4) + ") ");
                        if (j3 > 0) {
                            sb10.append("tc:" + j3);
                        }
                    } else {
                        sb10.append("size=" + Util.getSizeKB((long) i19));
                    }
                    sb10.append(' ' + str4);
                    if (testPreloadPreview2.f162168q.contains(Long.valueOf(j2))) {
                        sb10.append(" (preload)");
                    }
                    str = sb10.toString();
                    C87412m.m108593f(str, str2);
                }
                textView.setText(str);
                int i25 = bVar != null ? bVar.f162185d : 0;
                if (TestPreloadPreview.this.f162164j == i2Var.getItemId()) {
                    eVar.f111884z.setTextColor(TestPreloadPreview.this.getContext().getResources().getColor(C0966R.color.f2966ao));
                    return;
                }
                C41566e eVar3 = eVar;
                if (i25 == 2) {
                    eVar3.f111884z.setTextColor(TestPreloadPreview.this.getContext().getResources().getColor(C0966R.color.f2976b7));
                } else if (i25 == 3) {
                    eVar3.f111884z.setTextColor(TestPreloadPreview.this.getContext().getResources().getColor(C0966R.color.f2955ab));
                } else {
                    eVar3.f111884z.setTextColor(TestPreloadPreview.this.getContext().getResources().getColor(C0966R.color.f2975b6));
                }
            } else {
                C87412m.m108603p("data");
                throw null;
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "p0");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c8r, viewGroup, false);
            C87412m.m108593f(inflate, "from(p0.context).inflate…oad_item_view, p0, false)");
            return new C41566e(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestPreloadPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C37521f fVar = C37521f.f99374d;
        this.f162160f = fVar.mo61171Y();
        fVar.getClass();
        this.f162161g = C37521f.f99418h8.mo60266n().intValue() == 1;
        this.f162168q = new ArrayList<>();
        setId(C0966R.C0970id.khh);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c8s, this, true);
        View findViewById = findViewById(C0966R.C0970id.khg);
        View findViewById2 = findViewById(C0966R.C0970id.cmy);
        View findViewById3 = findViewById(C0966R.C0970id.cmz);
        View findViewById4 = findViewById(C0966R.C0970id.brz);
        findViewById4.getLayoutParams().width = MMApplicationContext.getResources().getDisplayMetrics().widthPixels;
        findViewById4.requestLayout();
        View findViewById5 = findViewById(C0966R.C0970id.f357790bs1);
        findViewById5.getLayoutParams().width = MMApplicationContext.getResources().getDisplayMetrics().widthPixels + ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3743cv));
        findViewById5.requestLayout();
        findViewById.getLayoutParams().width = MMApplicationContext.getResources().getDisplayMetrics().widthPixels + ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3743cv));
        findViewById.requestLayout();
        findViewById.requestLayout();
        findViewById2.setTag(Boolean.FALSE);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view = findViewById3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        getRecyclerView().setLayoutFrozen(true);
        findViewById.post(new C56585a8(findViewById, this));
        C56601e8 e8Var = new C56601e8(findViewById2, findViewById3, findViewById, this);
        findViewById2.setOnClickListener(e8Var);
        findViewById3.setOnClickListener(e8Var);
        this.f162169r = new ConcurrentHashMap<>();
        this.f162170s = new ConcurrentHashMap<>();
        this.f162171t = new C56595d8(this);
        this.f162172u = new C56609f8(this);
        this.f162173v = new C56590c8(this);
        this.f162174w = new MMHandler(Looper.getMainLooper());
        C40008f fVar2 = C40008f.f107254d;
        new TestPreloadPreview$notifyListener$1(this, fVar2);
        new TestPreloadPreview$listener$1(this, fVar2);
        this.f162157A = new C56626j8(this);
    }

    /* renamed from: a */
    public static final C56580b m65246a(TestPreloadPreview testPreloadPreview, String str) {
        C56580b bVar = testPreloadPreview.f162169r.get(str);
        if (bVar != null) {
            return bVar;
        }
        C56580b bVar2 = new C56580b();
        testPreloadPreview.f162169r.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: b */
    public static final String m65247b(TestPreloadPreview testPreloadPreview, C0740i2 i2Var) {
        FinderItem o;
        String description;
        testPreloadPreview.getClass();
        if (i2Var instanceof BaseFinderFeed) {
            String description2 = ((BaseFinderFeed) i2Var).mo3513o().getDescription();
            if (description2 != null) {
                String substring = description2.substring(0, Math.min(description2.length(), 3));
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        } else if (i2Var instanceof C9833k9) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150916N(((C9833k9) i2Var).f30389f);
            if (baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || (description = o.getDescription()) == null) {
                return "Card";
            }
            String substring2 = description.substring(0, Math.min(description.length(), 3));
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
        return "";
    }

    /* renamed from: c */
    public static final C64689rq2 m65248c(TestPreloadPreview testPreloadPreview, C0740i2 i2Var) {
        FinderItem o;
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        testPreloadPreview.getClass();
        if (i2Var instanceof BaseFinderFeed) {
            C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(FeedData.Companion.mo78883a((BaseFinderFeed) i2Var).getMediaList());
            return rq23 == null ? new C64689rq2() : rq23;
        } else if (!(i2Var instanceof C9833k9)) {
            return new C64689rq2();
        } else {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150916N(((C9833k9) i2Var).f30389f);
            return (baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || (mediaList = o.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) ? new C64689rq2() : rq22;
        }
    }

    /* renamed from: d */
    public static final String m65249d(TestPreloadPreview testPreloadPreview, String str) {
        testPreloadPreview.getClass();
        String n = C112551y.m153814n(str, "finder_video_", "", false);
        int length = n.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (n.charAt(i) == '_') {
                break;
            }
            i++;
        }
        return i >= 0 ? n.subSequence(i + 1, n.length()).toString() : str;
    }

    /* renamed from: f */
    public static final void m65251f(TestPreloadPreview testPreloadPreview) {
        testPreloadPreview.getClass();
        ((C119157j) C119157j.f356862d).mo183875f(new C56619i8(testPreloadPreview));
    }

    /* access modifiers changed from: private */
    public final float getTranslateOffset() {
        return (float) (((float) getRecyclerView().getWidth()) <= 0.0f ? MMApplicationContext.getResources().getDisplayMetrics().widthPixels : getRecyclerView().getWidth());
    }

    /* renamed from: g */
    public final C56579a mo79909g(int i) {
        C56579a aVar = this.f162170s.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        C56579a aVar2 = new C56579a(i, 0, 0, 0);
        this.f162170s.put(Integer.valueOf(i), aVar2);
        return aVar2;
    }

    public final TextView getGlobalPreloadTv() {
        Object value = this.f162159e.getValue();
        C87412m.m108593f(value, "<get-globalPreloadTv>(...)");
        return (TextView) value;
    }

    public final RecyclerView getRecyclerView() {
        Object value = this.f162158d.getValue();
        C87412m.m108593f(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    public void onDetachedFromWindow() {
        ConcurrentLinkedQueue<C54511w> concurrentLinkedQueue;
        super.onDetachedFromWindow();
        if (this.f162166o) {
            FinderVideoCore finderVideoCore = this.f162163i;
            if (finderVideoCore != null) {
                MediaPreloadCore mediaPreloadCore = finderVideoCore.f161830p;
                if (mediaPreloadCore != null) {
                    C56590c8 c8Var = this.f162173v;
                    C87412m.m108594g(c8Var, "callback");
                    C58638b bVar = mediaPreloadCore.f160307f;
                    if (!(bVar == null || (concurrentLinkedQueue = bVar.f167880i) == null)) {
                        C64175a0.m75511s(concurrentLinkedQueue, new C28357x(c8Var));
                    }
                }
                ((C58466h) C86312j.m106911c(C58466h.class)).Qi0().mo32059g(this.f162172u);
                ConcurrentHashMap<String, RefreshLoadMoreLayout.C7080c<Object>> concurrentHashMap = FinderTimelinePresenter.f13239Q0;
                C56595d8 d8Var = this.f162171t;
                C87412m.m108594g(d8Var, "callback");
                FinderTimelinePresenter.f13240R0.remove(d8Var);
                this.f162166o = false;
                return;
            }
            C87412m.m108603p("videoCore");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestPreloadPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C37521f fVar = C37521f.f99374d;
        this.f162160f = fVar.mo61171Y();
        fVar.getClass();
        this.f162161g = C37521f.f99418h8.mo60266n().intValue() == 1;
        this.f162168q = new ArrayList<>();
        setId(C0966R.C0970id.khh);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c8s, this, true);
        View findViewById = findViewById(C0966R.C0970id.khg);
        View findViewById2 = findViewById(C0966R.C0970id.cmy);
        View findViewById3 = findViewById(C0966R.C0970id.cmz);
        View findViewById4 = findViewById(C0966R.C0970id.brz);
        findViewById4.getLayoutParams().width = MMApplicationContext.getResources().getDisplayMetrics().widthPixels;
        findViewById4.requestLayout();
        View findViewById5 = findViewById(C0966R.C0970id.f357790bs1);
        findViewById5.getLayoutParams().width = MMApplicationContext.getResources().getDisplayMetrics().widthPixels + ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3743cv));
        findViewById5.requestLayout();
        findViewById.getLayoutParams().width = MMApplicationContext.getResources().getDisplayMetrics().widthPixels + ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3743cv));
        findViewById.requestLayout();
        findViewById.requestLayout();
        findViewById2.setTag(Boolean.FALSE);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view = findViewById3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/TestPreloadPreview", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        getRecyclerView().setLayoutFrozen(true);
        findViewById.post(new C56585a8(findViewById, this));
        C56601e8 e8Var = new C56601e8(findViewById2, findViewById3, findViewById, this);
        findViewById2.setOnClickListener(e8Var);
        findViewById3.setOnClickListener(e8Var);
        this.f162169r = new ConcurrentHashMap<>();
        this.f162170s = new ConcurrentHashMap<>();
        this.f162171t = new C56595d8(this);
        this.f162172u = new C56609f8(this);
        this.f162173v = new C56590c8(this);
        this.f162174w = new MMHandler(Looper.getMainLooper());
        C40008f fVar2 = C40008f.f107254d;
        new TestPreloadPreview$notifyListener$1(this, fVar2);
        new TestPreloadPreview$listener$1(this, fVar2);
        this.f162157A = new C56626j8(this);
    }
}
