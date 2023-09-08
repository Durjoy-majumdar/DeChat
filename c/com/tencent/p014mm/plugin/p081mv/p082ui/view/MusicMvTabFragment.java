package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import db2.C7261e;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C8480h;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ma2.C61454t;
import nb2.C61645c0;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p385u2.C111105a;
import p749xh.C102658n6;
import rx3.C13598b0;
import sb2.C63844s;
import sx3.C110818d0;
import sx3.C64197v;
import ub2.C14143c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0005xyz\u0012\u0018B\u001b\b\u0016\u0012\u0006\u0010q\u001a\u00020p\u0012\b\u0010s\u001a\u0004\u0018\u00010r¢\u0006\u0004\bt\u0010uB#\b\u0016\u0012\u0006\u0010q\u001a\u00020p\u0012\b\u0010s\u001a\u0004\u0018\u00010r\u0012\u0006\u0010v\u001a\u00020\u0003¢\u0006\u0004\bt\u0010wJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H&R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0004X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00170\tj\b\u0012\u0004\u0012\u00020\u0017`\u000b8\u0004X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u000e\u001a\u0004\u0018\u0001038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010A\u001a\u0004\u0018\u00010:8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010H\u001a\u0004\u0018\u00010\u00018\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0004@\u0004X.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010h8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006{"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Landroid/widget/LinearLayout;", "Lob0/n;", "", "videoMinDuration", "Lrx3/b0;", "setVideoDuration", "visibility", "setResultView", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$c;", "Lkotlin/collections/ArrayList;", "getAllDataList", "Landroidx/recyclerview/widget/RecyclerView$n;", "listener", "setOnFlingListener", "getFeedFrom", "getType", "d", "Ljava/util/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "dataList", "", "e", "getFeedIdMap", "feedIdMap", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "getAdapter", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "setAdapter", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;)V", "adapter", "Lxh/n6;", "g", "Lxh/n6;", "getMusic", "()Lxh/n6;", "setMusic", "(Lxh/n6;)V", "music", "", "h", "Ljava/lang/String;", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "keyword", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$a;", "i", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$a;", "getListener", "()Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$a;", "setListener", "(Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$a;)V", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$b;", "j", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$b;", "getResultListener", "()Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$b;", "setResultListener", "(Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$b;)V", "resultListener", "n", "Landroid/widget/LinearLayout;", "getEmptyLL", "()Landroid/widget/LinearLayout;", "setEmptyLL", "(Landroid/widget/LinearLayout;)V", "emptyLL", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "getLoadingTv", "()Landroid/widget/TextView;", "setLoadingTv", "(Landroid/widget/TextView;)V", "loadingTv", "", "p", "Z", "getHasMore", "()Z", "setHasMore", "(Z)V", "hasMore", "q", "I", "getScreenWidth", "()I", "setScreenWidth", "(I)V", "screenWidth", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "t", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "getRlLayout", "()Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "setRlLayout", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout;)V", "rlLayout", "Lkotlin/Function0;", "u", "Lfy3/a;", "getOnSceneEndListener", "()Lfy3/a;", "setOnSceneEndListener", "(Lfy3/a;)V", "onSceneEndListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment */
public abstract class MusicMvTabFragment extends LinearLayout implements C11385n {

    /* renamed from: d */
    public final ArrayList<C57117c> f163630d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<Long> f163631e = new ArrayList<>();

    /* renamed from: f */
    public WxRecyclerAdapter<C57117c> f163632f;

    /* renamed from: g */
    public C102658n6 f163633g;

    /* renamed from: h */
    public String f163634h;

    /* renamed from: i */
    public C57115a f163635i;

    /* renamed from: j */
    public C57116b f163636j;

    /* renamed from: n */
    public LinearLayout f163637n;

    /* renamed from: o */
    public TextView f163638o;

    /* renamed from: p */
    public boolean f163639p;

    /* renamed from: q */
    public int f163640q;

    /* renamed from: r */
    public int f163641r = Integer.MAX_VALUE;

    /* renamed from: s */
    public int f163642s = 10001;

    /* renamed from: t */
    public RefreshLoadMoreLayout f163643t;

    /* renamed from: u */
    public C32224a<C13598b0> f163644u;

    /* renamed from: v */
    public C7261e f163645v = C7261e.m7442a(LayoutInflater.from(getContext()), this, true);

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$a */
    public interface C57115a {
        /* renamed from: a */
        void mo80633a(int i, C57119e eVar, int i2, View view, RecyclerView recyclerView, int i3);

        /* renamed from: b */
        boolean mo80634b(boolean z, C57119e eVar, int i);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$b */
    public interface C57116b {
        /* renamed from: a */
        void mo80635a(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$c */
    public static final class C57117c implements C9493c {

        /* renamed from: d */
        public final C57119e f163646d;

        public C57117c(C57119e eVar) {
            C87412m.m108594g(eVar, "itemData");
            this.f163646d = eVar;
        }

        /* renamed from: c */
        public int mo75c() {
            return 3;
        }

        public long getItemId() {
            return (long) this.f163646d.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$d */
    public final class C57118d extends C60896i<C57117c> {
        public C57118d() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.biw;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            String str;
            LinkedList<FinderMedia> linkedList2;
            FinderMedia finderMedia2;
            C60905o oVar2 = oVar;
            List list2 = list;
            C57117c cVar2 = (C57117c) cVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(cVar2, "item");
            Log.m105918d("Music.MusicMvTabFragment", "onBindViewHolder " + cVar2.f163646d.f163648a + ' ' + cVar2.f163646d.f163649b);
            boolean z2 = true;
            if (list2 == null || !list2.contains(1)) {
                View D = oVar2.mo85812D(C0966R.C0970id.l7m);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                D.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                FinderObject finderObject = cVar2.f163646d.f163649b;
                if (finderObject != null) {
                    MusicMvTabFragment musicMvTabFragment = MusicMvTabFragment.this;
                    FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                    if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59350f = C61454t.f174766a.mo86430b("thumb_" + cVar2.f163646d.f163648a);
                        bVar.f59346b = true;
                        bVar.f59345a = true;
                        String str2 = finderMedia.thumbUrl + finderMedia.thumb_url_token;
                        Log.m105918d("Music.MusicMvTabFragment", cVar2.f163646d.f163648a + " thumb load " + str2);
                        C20828a.m22825b().mo32519h(str2, (ImageView) oVar2.mo85812D(C0966R.C0970id.l7m), bVar.mo32666a());
                        View D2 = oVar2.mo85812D(C0966R.C0970id.l7m);
                        if (finderMedia.videoDuration < C61645c0.m72363c(musicMvTabFragment.f163642s) || finderMedia.videoDuration > C61645c0.m72362b(musicMvTabFragment.f163641r)) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(Float.valueOf(0.1f));
                            View view2 = D2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            D2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        } else {
                            if (D2.getAlpha() != 0.1f) {
                                z2 = false;
                            }
                            if (z2) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(Float.valueOf(1.0f));
                                View view3 = D2;
                                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                D2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                        }
                        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.l5l);
                        if (textView != null) {
                            int i3 = finderMedia.videoDuration;
                            if (i3 > 0) {
                                long j = (long) i3;
                                if (j < 86400) {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(j < 3600 ? "mm:ss" : "HH:mm:ss");
                                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
                                    str = simpleDateFormat.format(Long.valueOf(j * 1000));
                                    textView.setText(str);
                                }
                            }
                            str = null;
                            textView.setText(str);
                        }
                    }
                }
                C39818r rVar = C39818r.f106831a;
                Context context = MusicMvTabFragment.this.getContext();
                C87412m.m108593f(context, "context");
                C39622i0 a = rVar.mo62443b(context).mo75002a(C63844s.class);
                MusicMvTabFragment musicMvTabFragment2 = MusicMvTabFragment.this;
                C63844s sVar = (C63844s) a;
                CheckBox checkBox = (CheckBox) oVar2.mo85812D(C0966R.C0970id.ea4);
                if (checkBox != null) {
                    checkBox.setOnClickListener(new C57134d(cVar2, i, musicMvTabFragment2, checkBox));
                }
                if (sVar.mo88634d3()) {
                    checkBox.setChecked(cVar2.f163646d.f163650c);
                    View D3 = oVar2.mo85812D(C0966R.C0970id.l7m);
                    if (checkBox.isChecked()) {
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(Float.valueOf(0.1f));
                        View view4 = D3;
                        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        D3.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    } else {
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(Float.valueOf(1.0f));
                        View view5 = D3;
                        C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        D3.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    checkBox.setVisibility(0);
                    return;
                }
                checkBox.setVisibility(8);
                return;
            }
            View D4 = oVar2.mo85812D(C0966R.C0970id.l7m);
            FinderObject finderObject2 = cVar2.f163646d.f163649b;
            if (finderObject2 != null) {
                MusicMvTabFragment musicMvTabFragment3 = MusicMvTabFragment.this;
                FinderObjectDesc finderObjectDesc2 = finderObject2.objectDesc;
                if (finderObjectDesc2 != null && (linkedList2 = finderObjectDesc2.media) != null && (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2)) != null) {
                    if (finderMedia2.videoDuration < C61645c0.m72363c(musicMvTabFragment3.f163642s) || finderMedia2.videoDuration > C61645c0.m72362b(musicMvTabFragment3.f163641r)) {
                        if (D4.getAlpha() != 1.0f) {
                            z2 = false;
                        }
                        if (z2) {
                            C9556a aVar6 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar6.mo10233c(Float.valueOf(0.1f));
                            View view6 = D4;
                            C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            D4.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            return;
                        }
                        return;
                    }
                    if (D4.getAlpha() != 0.1f) {
                        z2 = false;
                    }
                    if (z2) {
                        C9556a aVar7 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar7.mo10233c(Float.valueOf(1.0f));
                        View view7 = D4;
                        C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        D4.setAlpha(((Float) aVar7.mo10231a(0)).floatValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
            int screenWidth = (MusicMvTabFragment.this.getScreenWidth() - C76577a.m92151b(MusicMvTabFragment.this.getContext(), 4)) / 3;
            RelativeLayout relativeLayout = (RelativeLayout) oVar.mo85812D(C0966R.C0970id.iwf);
            ViewGroup.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.width = screenWidth;
            }
            if (relativeLayout != null) {
                layoutParams = relativeLayout.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.height = screenWidth;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$e */
    public static final class C57119e {

        /* renamed from: a */
        public long f163648a;

        /* renamed from: b */
        public FinderObject f163649b;

        /* renamed from: c */
        public boolean f163650c;

        public C57119e(long j, String str, FinderObject finderObject, boolean z, int i, C8480h hVar) {
            z = (i & 8) != 0 ? false : z;
            this.f163648a = j;
            this.f163649b = finderObject;
            this.f163650c = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$f */
    public static final class C57120f extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ MusicMvTabFragment f163651a;

        public C57120f(MusicMvTabFragment musicMvTabFragment) {
            this.f163651a = musicMvTabFragment;
        }

        /* renamed from: a */
        public void mo3747a(int i) {
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            Log.m105924i("Music.MusicMvTabFragment", "onLoadMoreBegin");
            if (this.f163651a.getHasMore()) {
                MusicMvTabFragment musicMvTabFragment = this.f163651a;
                musicMvTabFragment.mo80601c(musicMvTabFragment.getMusic(), this.f163651a.getKeyword());
                return;
            }
            this.f163651a.getRlLayout().mo82440F(0);
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            if (!this.f163651a.getHasMore()) {
                RefreshLoadMoreLayout.m66896C(this.f163651a.getRlLayout(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment$g */
    public static final class C57121g implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvTabFragment f163652d;

        public C57121g(MusicMvTabFragment musicMvTabFragment) {
            this.f163652d = musicMvTabFragment;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C57119e eVar2;
            FinderObjectDesc finderObjectDesc;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) eVar;
            if (i >= 0 || i < wxRecyclerAdapter.getItemCount()) {
                C57117c cVar = (C57117c) C110818d0.m150917O(wxRecyclerAdapter.getData(), i);
                if (cVar != null && (eVar2 = cVar.f163646d) != null) {
                    MusicMvTabFragment musicMvTabFragment = this.f163652d;
                    FinderObject finderObject = eVar2.f163649b;
                    if (finderObject != null && (finderObjectDesc = finderObject.objectDesc) != null && (linkedList = finderObjectDesc.media) != null && (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) != null) {
                        C39818r rVar = C39818r.f106831a;
                        Context context = musicMvTabFragment.getContext();
                        C87412m.m108593f(context, "context");
                        if (((C63844s) rVar.mo62443b(context).mo75002a(C63844s.class)).mo88634d3()) {
                            eVar.notifyItemChanged(i);
                            C57115a listener = musicMvTabFragment.getListener();
                            if (listener != null) {
                                WxRecyclerView wxRecyclerView = musicMvTabFragment.f163645v.f25322a;
                                C87412m.m108593f(wxRecyclerView, "uiBinding.musicFeedsRecyclerView");
                                listener.mo80633a(0, eVar2, i, view, wxRecyclerView, musicMvTabFragment.getType());
                            }
                        } else if (finderMedia.videoDuration < C61645c0.m72363c(musicMvTabFragment.f163642s)) {
                            Log.m105924i("Music.MusicMvTabFragment", "post fail, duration:" + finderMedia.videoDuration);
                            C76912y0.m92773l(musicMvTabFragment.getContext(), musicMvTabFragment.getContext().getString(C0966R.string.mpf, new Object[]{Integer.valueOf(C61645c0.m72363c(musicMvTabFragment.f163642s))}));
                        } else if (finderMedia.videoDuration > C61645c0.m72362b(musicMvTabFragment.f163641r)) {
                            Log.m105924i("Music.MusicMvTabFragment", "post fail, duration:" + finderMedia.videoDuration);
                            C76912y0.m92773l(musicMvTabFragment.getContext(), musicMvTabFragment.getContext().getString(C0966R.string.mpg, new Object[]{Integer.valueOf(C61645c0.m72362b(musicMvTabFragment.f163641r))}));
                        } else {
                            String p = C61926c.m72691p(eVar2.f163648a);
                            Log.m105924i("Music.MusicMvTabFragment", "post feedId:" + p);
                            MvCreateReportHelper.f163008d = i;
                            MvCreateReportHelper.f163007c = musicMvTabFragment.getFeedFrom();
                            C57115a listener2 = musicMvTabFragment.getListener();
                            if (listener2 != null) {
                                WxRecyclerView wxRecyclerView2 = musicMvTabFragment.f163645v.f25322a;
                                C87412m.m108593f(wxRecyclerView2, "uiBinding.musicFeedsRecyclerView");
                                listener2.mo80633a(0, eVar2, i, view, wxRecyclerView2, musicMvTabFragment.getType());
                            }
                        }
                    }
                }
            } else {
                Log.m105920e("Music.MusicMvTabFragment", "invalid position:" + i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvTabFragment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo80599a();
    }

    /* renamed from: a */
    public final void mo80599a() {
        this.f163637n = (LinearLayout) findViewById(C0966R.C0970id.cj9);
        this.f163638o = (TextView) findViewById(C0966R.C0970id.g3r);
        View findViewById = findViewById(C0966R.C0970id.kd5);
        C87412m.m108593f(findViewById, "findViewById(R.id.tab_rl_layout)");
        setRlLayout((RefreshLoadMoreLayout) findViewById);
        getRlLayout().setEnablePullDownHeader(false);
        getRlLayout().setEnableRefresh(false);
        getRlLayout().setActionCallback(new C57120f(this));
        setAdapter(new WxRecyclerAdapter(new MusicMvTabFragment$initContentView$2(this), this.f163630d, true));
        WxRecyclerView wxRecyclerView = this.f163645v.f25322a;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(getAdapter());
        }
        FirstRowLayoutManager firstRowLayoutManager = new FirstRowLayoutManager(getContext(), 3);
        WxRecyclerView wxRecyclerView2 = this.f163645v.f25322a;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(firstRowLayoutManager);
        }
        Context context = getContext();
        Resources resources = context.getResources();
        C14143c cVar = new C14143c(resources.getDimensionPixelSize(C0966R.dimen.aik), resources.getDimensionPixelSize(C0966R.dimen.aik), C111105a.m151500b(context, C0966R.color.f3496v_), false, (C14143c.C14144a) null);
        WxRecyclerView wxRecyclerView3 = this.f163645v.f25322a;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.mo17085h0(cVar);
        }
        getAdapter().f173488o = new C57121g(this);
    }

    /* renamed from: b */
    public final void mo80600b(ArrayList<Long> arrayList) {
        C87412m.m108594g(arrayList, "feedIdList");
        int i = 0;
        for (T next : this.f163630d) {
            int i2 = i + 1;
            if (i >= 0) {
                C57117c cVar = (C57117c) next;
                C57119e eVar = cVar.f163646d;
                boolean z = eVar.f163650c;
                if (arrayList.contains(Long.valueOf(eVar.f163648a))) {
                    if (!z) {
                        cVar.f163646d.f163650c = true;
                        getAdapter().notifyItemChanged(i);
                    }
                } else if (z) {
                    cVar.f163646d.f163650c = false;
                    getAdapter().notifyItemChanged(i);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: c */
    public void mo80601c(C102658n6 n6Var, String str) {
        this.f163633g = n6Var;
        this.f163634h = str;
    }

    /* renamed from: d */
    public final void mo80602d(long j) {
        int i = 0;
        for (T next : this.f163630d) {
            int i2 = i + 1;
            if (i >= 0) {
                C57119e eVar = ((C57117c) next).f163646d;
                if (eVar.f163648a == j) {
                    eVar.f163650c = false;
                    getAdapter().notifyItemChanged(i);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public final WxRecyclerAdapter<C57117c> getAdapter() {
        WxRecyclerAdapter<C57117c> wxRecyclerAdapter = this.f163632f;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public final ArrayList<C57117c> getAllDataList() {
        return this.f163630d;
    }

    public final ArrayList<C57117c> getDataList() {
        return this.f163630d;
    }

    public final LinearLayout getEmptyLL() {
        return this.f163637n;
    }

    public int getFeedFrom() {
        return 0;
    }

    public final ArrayList<Long> getFeedIdMap() {
        return this.f163631e;
    }

    public final boolean getHasMore() {
        return this.f163639p;
    }

    public final String getKeyword() {
        return this.f163634h;
    }

    public final C57115a getListener() {
        return this.f163635i;
    }

    public final TextView getLoadingTv() {
        return this.f163638o;
    }

    public final C102658n6 getMusic() {
        return this.f163633g;
    }

    public final C32224a<C13598b0> getOnSceneEndListener() {
        return this.f163644u;
    }

    public final C57116b getResultListener() {
        return this.f163636j;
    }

    public final RefreshLoadMoreLayout getRlLayout() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f163643t;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    public final int getScreenWidth() {
        return this.f163640q;
    }

    public abstract int getType();

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    public final void setAdapter(WxRecyclerAdapter<C57117c> wxRecyclerAdapter) {
        C87412m.m108594g(wxRecyclerAdapter, "<set-?>");
        this.f163632f = wxRecyclerAdapter;
    }

    public final void setEmptyLL(LinearLayout linearLayout) {
        this.f163637n = linearLayout;
    }

    public final void setHasMore(boolean z) {
        this.f163639p = z;
    }

    public final void setKeyword(String str) {
        this.f163634h = str;
    }

    public final void setListener(C57115a aVar) {
        this.f163635i = aVar;
    }

    public final void setLoadingTv(TextView textView) {
        this.f163638o = textView;
    }

    public final void setMusic(C102658n6 n6Var) {
        this.f163633g = n6Var;
    }

    public final void setOnFlingListener(RecyclerView.C16633n nVar) {
        getRlLayout().getRecyclerView().setOnFlingListener(nVar);
    }

    public final void setOnSceneEndListener(C32224a<C13598b0> aVar) {
        this.f163644u = aVar;
    }

    public final void setResultListener(C57116b bVar) {
        this.f163636j = bVar;
    }

    public final void setResultView(int i) {
        WxRecyclerView wxRecyclerView = this.f163645v.f25322a;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(i);
        }
    }

    public final void setRlLayout(RefreshLoadMoreLayout refreshLoadMoreLayout) {
        C87412m.m108594g(refreshLoadMoreLayout, "<set-?>");
        this.f163643t = refreshLoadMoreLayout;
    }

    public final void setScreenWidth(int i) {
        this.f163640q = i;
    }

    public final void setVideoDuration(int i) {
        this.f163642s = i;
        int i2 = 0;
        for (T next : getAdapter().getData()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C57117c cVar = (C57117c) next;
                getAdapter().notifyItemChanged(i2, 1);
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvTabFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo80599a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvTabFragment(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C87412m.m108594g(context, "context");
        mo80599a();
        this.f163640q = context.getResources().getDisplayMetrics().widthPixels;
    }
}
