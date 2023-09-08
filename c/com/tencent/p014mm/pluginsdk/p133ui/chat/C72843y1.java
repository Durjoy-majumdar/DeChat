package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconStruct;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import jp3.C46566c;
import jp3.C9486a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ky2.C10432i;
import nj3.C76901s0;
import o40.C61926c;
import p534gl.C32470c;
import p534gl.C32471d;
import p534gl.C32476i;
import p534gl.C32481n;
import p534gl.C32482o;
import p534gl.C32483p;
import sx3.C110818d0;
import u61.C37343a;
import z51.C39315g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1 */
public class C72843y1 implements C72806l1 {

    /* renamed from: a */
    public Context f212277a;

    /* renamed from: b */
    public View f212278b;

    /* renamed from: c */
    public int f212279c;

    /* renamed from: d */
    public int f212280d;

    /* renamed from: e */
    public C76901s0 f212281e;

    /* renamed from: f */
    public View f212282f;

    /* renamed from: g */
    public C72837v1 f212283g;

    /* renamed from: h */
    public C72806l1.C44611a f212284h;

    /* renamed from: i */
    public String f212285i = "";

    /* renamed from: j */
    public boolean f212286j = true;

    /* renamed from: k */
    public RecyclerView f212287k;

    /* renamed from: l */
    public final ArrayList<C32482o> f212288l = new ArrayList<>();

    /* renamed from: m */
    public C72848g f212289m;

    /* renamed from: n */
    public C46566c<C9486a> f212290n;

    /* renamed from: o */
    public SuggestEmoiconStruct f212291o = new SuggestEmoiconStruct();

    /* renamed from: p */
    public int f212292p = 0;

    /* renamed from: q */
    public long f212293q = 0;

    /* renamed from: r */
    public boolean f212294r = false;

    /* renamed from: s */
    public C72806l1.C72807b f212295s;

    /* renamed from: t */
    public int f212296t = 0;

    /* renamed from: u */
    public MMHandler f212297u = new C72844a();

    /* renamed from: v */
    public C72847f f212298v = new C72845b();

    /* renamed from: w */
    public RecyclerView.C16622o f212299w = new C44615c();

    /* renamed from: x */
    public RecyclerView.C0130p f212300x = new C72846d();

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$e */
    public class C30702e implements C32481n {

        /* renamed from: a */
        public final /* synthetic */ long f82609a;

        public C30702e(long j) {
            this.f82609a = j;
        }

        /* renamed from: a */
        public void mo57547a(List<C32482o> list, C32483p pVar) {
            C72843y1.this.f212293q = Util.nowMilliSecond();
            C72843y1.this.f212288l.clear();
            C72843y1.this.f212288l.addAll(list);
            C72843y1 y1Var = C72843y1.this;
            y1Var.f212291o.f79173i = (long) y1Var.f212288l.size();
            SuggestEmoiconStruct suggestEmoiconStruct = C72843y1.this.f212291o;
            suggestEmoiconStruct.f79177m = suggestEmoiconStruct.mo86045b("WordVersion", String.valueOf(pVar.f86296a), true);
            SuggestEmoiconStruct suggestEmoiconStruct2 = C72843y1.this.f212291o;
            suggestEmoiconStruct2.f79178n = (long) pVar.f86297b;
            suggestEmoiconStruct2.f79179o = (long) pVar.f86298c;
            suggestEmoiconStruct2.f79180p = suggestEmoiconStruct2.mo86045b("RecSessionId", pVar.f86299d, true);
            SuggestEmoiconStruct suggestEmoiconStruct3 = C72843y1.this.f212291o;
            C87412m.m108594g(list, "<this>");
            suggestEmoiconStruct3.f79182r = suggestEmoiconStruct3.mo86045b("md5Type", C110818d0.m150921S(list, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C37343a.f98740d, 30, (Object) null), true);
            if (list.isEmpty()) {
                C72843y1.this.f212297u.removeMessages(20003);
                C72843y1.this.f212297u.sendEmptyMessage(20001);
                return;
            }
            long nowMilliSecond = Util.nowMilliSecond();
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_show_delay, 250);
            Log.m105925i("MicroMsg.emoji.SuggestEmoticonBubble", "onResult: delay show %s, %s", Long.valueOf(nowMilliSecond - this.f82609a), Integer.valueOf(Qe));
            long j = this.f82609a;
            long j2 = (long) Qe;
            if (nowMilliSecond - j > j2) {
                C72843y1.this.f212297u.sendEmptyMessage(20003);
                C115669n.INSTANCE.mo175913w(1418, (long) 23, 1);
                return;
            }
            C72843y1.this.f212297u.sendEmptyMessageDelayed(20003, j2 - (nowMilliSecond - j));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$c */
    public class C44615c implements RecyclerView.C16622o {
        public C44615c() {
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                C72843y1.this.f212297u.sendEmptyMessage(20002);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                C72843y1.this.f212297u.sendEmptyMessageDelayed(20001, 3000);
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$a */
    public class C72844a extends MMHandler {
        public C72844a() {
        }

        public void handleMessage(Message message) {
            int i;
            int i2;
            switch (message.what) {
                case 20001:
                    C72843y1.this.mo100683b();
                    return;
                case 20002:
                    removeMessages(20001);
                    return;
                case 20003:
                    C72843y1 y1Var = C72843y1.this;
                    Log.m105925i("MicroMsg.emoji.SuggestEmoticonBubble", "show: %s", Boolean.valueOf(y1Var.f212286j));
                    y1Var.f212297u.removeMessages(20001);
                    if (y1Var.f212286j) {
                        C72848g gVar = y1Var.f212289m;
                        ArrayList<C32482o> arrayList = y1Var.f212288l;
                        gVar.f212304d.clear();
                        gVar.f212304d.addAll(arrayList);
                        gVar.notifyDataSetChanged();
                        RecyclerView recyclerView = y1Var.f212287k;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        RecyclerView recyclerView2 = recyclerView;
                        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView2, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                        int size = y1Var.f212288l.size() + y1Var.f212296t;
                        if (size > 2) {
                            i2 = (int) (((float) y1Var.f212279c) * 2.5f);
                            i = y1Var.f212280d;
                        } else if (size == 2) {
                            i2 = y1Var.f212279c * 2;
                            i = y1Var.f212280d;
                        } else {
                            i2 = y1Var.f212279c;
                            i = y1Var.f212280d;
                        }
                        int i3 = i2 + (i * 2);
                        if (y1Var.f212281e.isShowing()) {
                            y1Var.f212281e.update(i3, -2);
                        } else {
                            y1Var.f212281e.setWidth(i3);
                            View view = y1Var.f212282f;
                            if (view != null) {
                                int[] iArr = new int[2];
                                view.getLocationInWindow(iArr);
                                int height = iArr[1] - y1Var.f212281e.getHeight();
                                y1Var.f212281e.showAtLocation(y1Var.f212282f, 0, iArr[0] - ((y1Var.f212281e.getWidth() - y1Var.f212282f.getWidth()) / 2), height);
                            }
                        }
                        if (size >= 3) {
                            y1Var.f212297u.sendEmptyMessageDelayed(20001, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        } else {
                            y1Var.f212297u.sendEmptyMessageDelayed(20001, 3000);
                        }
                        y1Var.mo100684c(y1Var.f212288l, y1Var.f212292p);
                        SuggestEmoiconStruct suggestEmoiconStruct = y1Var.f212291o;
                        suggestEmoiconStruct.f79168d = 0;
                        suggestEmoiconStruct.mo86054n();
                        y1Var.f212292p = y1Var.f212288l.size();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$b */
    public class C72845b implements C72847f {
        public C72845b() {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$d */
    public class C72846d extends RecyclerView.C0130p {
        public C72846d() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C72843y1.this.mo100684c((List<C32482o>) null, 0);
                SuggestEmoiconStruct suggestEmoiconStruct = C72843y1.this.f212291o;
                suggestEmoiconStruct.f79168d = 2;
                suggestEmoiconStruct.mo86054n();
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$f */
    public interface C72847f {
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$g */
    public class C72848g extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public LinkedList<C32482o> f212304d = new LinkedList<>();

        public C72848g() {
        }

        public int getItemCount() {
            LinkedList<C32482o> linkedList = this.f212304d;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size() + C72843y1.this.f212296t;
        }

        public int getItemViewType(int i) {
            LinkedList<C32482o> linkedList = this.f212304d;
            return (linkedList == null || i != linkedList.size()) ? 0 : 1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            LinkedList<C32482o> linkedList = this.f212304d;
            C32482o oVar = (linkedList == null || linkedList.size() <= i) ? null : this.f212304d.get(i);
            if (getItemViewType(i) == 1) {
                C72843y1 y1Var = C72843y1.this;
                if (!y1Var.f212294r) {
                    y1Var.f212294r = true;
                    int j = zVar.mo17363j();
                    StringBuilder sb = new StringBuilder();
                    SuggestEmoiconStruct suggestEmoiconStruct = new SuggestEmoiconStruct();
                    sb.append(j);
                    suggestEmoiconStruct.f79172h = suggestEmoiconStruct.mo86045b("md5", "emoticon_search_more", true);
                    suggestEmoiconStruct.f79176l = suggestEmoiconStruct.mo86045b("IsLocalSearch", "1", true);
                    suggestEmoiconStruct.f79174j = suggestEmoiconStruct.mo86045b("Index", sb.toString(), true);
                    suggestEmoiconStruct.f79169e = suggestEmoiconStruct.mo86045b("Word", y1Var.f212285i.replace(",", ""), true);
                    suggestEmoiconStruct.f79171g = (long) j;
                    suggestEmoiconStruct.f79168d = 3;
                    suggestEmoiconStruct.f79183s = Util.milliSecondsToNow(y1Var.f212293q);
                    suggestEmoiconStruct.mo86054n();
                    suggestEmoiconStruct.f79171g = 0;
                }
                zVar.f44854d.setOnClickListener(new y1$g$$a(this, zVar));
            }
            if (oVar != null && (zVar instanceof C72849h)) {
                C72849h hVar = (C72849h) zVar;
                hVar.f212306A = oVar;
                EmojiInfo emojiInfo = oVar.f86293a;
                hVar.f212308z.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                String T = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(emojiInfo.getMd5());
                if (Util.isNullOrNil(T)) {
                    hVar.f212308z.setContentDescription(C72843y1.this.f212277a.getString(C0966R.string.c_3));
                } else {
                    hVar.f212308z.setContentDescription(T);
                }
                hVar.f212308z.setEmojiInfo(emojiInfo);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new y1$g$$b(this, LayoutInflater.from(C72843y1.this.f212277a).inflate(C0966R.C0971layout.d95, viewGroup, false));
            }
            return new C72849h(LayoutInflater.from(C72843y1.this.f212277a).inflate(C0966R.C0971layout.f6845q4, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$h */
    public class C72849h extends RecyclerView.C16631z {

        /* renamed from: A */
        public C32482o f212306A;

        /* renamed from: z */
        public EmojiStatusView f212308z;

        /* renamed from: com.tencent.mm.pluginsdk.ui.chat.y1$h$a */
        public class C72850a implements View.OnClickListener {
            public C72850a(C72843y1 y1Var) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C72849h hVar = C72849h.this;
                C72847f fVar = C72843y1.this.f212298v;
                int j = hVar.mo17363j();
                C32482o oVar = C72849h.this.f212306A;
                C72845b bVar = (C72845b) fVar;
                if (oVar != null) {
                    C72843y1 y1Var = C72843y1.this;
                    if (!(y1Var.f212283g == null || y1Var.f212284h == null)) {
                        EmojiInfo emojiInfo = oVar.f86293a;
                        if (C30790w2.m39221h().mo57717d().mo142044TO(emojiInfo.field_md5) == null) {
                            C30790w2.m39221h().mo57717d().insert(emojiInfo);
                        }
                        C72843y1.this.f212283g.mo65586X1(emojiInfo);
                        C72843y1.this.f212284h.clear();
                        C72843y1.this.mo100684c(Collections.singletonList(oVar), 0);
                        C72843y1 y1Var2 = C72843y1.this;
                        SuggestEmoiconStruct suggestEmoiconStruct = y1Var2.f212291o;
                        suggestEmoiconStruct.f79171g = (long) j;
                        suggestEmoiconStruct.f79168d = 1;
                        suggestEmoiconStruct.f79183s = Util.milliSecondsToNow(y1Var2.f212293q);
                        C72843y1.this.f212291o.mo86054n();
                        C72843y1.this.f212291o.f79171g = 0;
                    }
                }
                C72843y1.this.f212281e.dismiss();
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C72849h(View view) {
            super(view);
            EmojiStatusView emojiStatusView = (EmojiStatusView) view.findViewById(C0966R.C0970id.k_q);
            this.f212308z = emojiStatusView;
            emojiStatusView.setOnClickListener(new C72850a(C72843y1.this));
        }
    }

    public C72843y1(Context context, View view, View view2, View view3) {
        this.f212277a = context;
        this.f212290n = new C46566c<>();
        View inflate = View.inflate(this.f212277a, C0966R.C0971layout.f6844q3, (ViewGroup) null);
        this.f212278b = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.k_r);
        this.f212287k = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f212277a, 0, false));
        C72848g gVar = new C72848g();
        this.f212289m = gVar;
        this.f212287k.setAdapter(gVar);
        this.f212287k.mo17092j0(this.f212299w);
        this.f212287k.mo17043c(this.f212300x);
        this.f212279c = C76577a.m92157h(this.f212277a, C0966R.dimen.f3766df) + C76577a.m92157h(this.f212277a, C0966R.dimen.a4v);
        this.f212280d = C76577a.m92157h(this.f212277a, C0966R.dimen.f3723cd);
        View view4 = this.f212278b;
        int i = (this.f212280d * 2) + this.f212279c;
        C76901s0 s0Var = new C76901s0(view4, i, i, true);
        this.f212281e = s0Var;
        s0Var.setBackgroundDrawable(new ColorDrawable(0));
        this.f212281e.setOutsideTouchable(true);
        this.f212281e.setFocusable(false);
        this.f212281e.setAnimationStyle(C0966R.style.f8707rx);
        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f212296t = 1;
        }
    }

    /* renamed from: a */
    public void mo100682a(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            this.f212297u.removeMessages(20003);
            this.f212297u.sendEmptyMessage(20001);
            this.f212285i = str;
            C46566c<C9486a> cVar = this.f212290n;
            if (cVar != null) {
                cVar.dead();
                this.f212290n = null;
                return;
            }
            return;
        }
        if (!str.equals(this.f212285i)) {
            mo100683b();
            C46566c<C9486a> cVar2 = this.f212290n;
            if (cVar2 != null) {
                cVar2.dead();
                this.f212290n = null;
            }
            this.f212290n = new C46566c<>();
            String valueOf = String.valueOf(Util.nowMilliSecond());
            SuggestEmoiconStruct suggestEmoiconStruct = this.f212291o;
            suggestEmoiconStruct.f79175k = suggestEmoiconStruct.mo86045b("SessionId", valueOf, true);
            SuggestEmoiconStruct suggestEmoiconStruct2 = this.f212291o;
            suggestEmoiconStruct2.f79181q = suggestEmoiconStruct2.mo86045b("ChatId", str2, true);
            this.f212288l.clear();
            this.f212292p = 0;
            C32471d dVar = new C32471d(this.f212290n);
            C87412m.m108594g(valueOf, "sessionId");
            C32476i iVar = dVar.f86275g;
            iVar.getClass();
            iVar.f86283b = str2;
            iVar.f86284c = valueOf;
            C30702e eVar = new C30702e(Util.nowMilliSecond());
            C115669n.INSTANCE.mo175913w(1418, (long) 0, 1);
            C61926c.m72657B("EmojiSuggest_searchSuggest", true, new C32470c(dVar, str, eVar));
        }
        this.f212285i = str;
    }

    /* renamed from: b */
    public void mo100683b() {
        Log.m105924i("MicroMsg.emoji.SuggestEmoticonBubble", "hide: ");
        C76901s0 s0Var = this.f212281e;
        if (s0Var != null) {
            if (s0Var.isShowing()) {
                this.f212281e.dismiss();
            }
            this.f212297u.removeCallbacksAndMessages((Object) null);
            C46566c<C9486a> cVar = this.f212290n;
            if (cVar != null) {
                cVar.dead();
                this.f212290n = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo100684c(List<C32482o> list, int i) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        if (list != null) {
            for (int i2 = i; i2 < list.size(); i2++) {
                C32482o oVar = list.get(i2);
                if (i2 != i) {
                    sb.append("#");
                    sb4.append("#");
                    sb5.append("#");
                }
                sb.append(oVar.f86293a.field_md5);
                sb4.append(oVar.f86294b);
                sb5.append(oVar.f86295c);
            }
        }
        SuggestEmoiconStruct suggestEmoiconStruct = this.f212291o;
        suggestEmoiconStruct.f79172h = suggestEmoiconStruct.mo86045b("md5", sb.toString(), true);
        SuggestEmoiconStruct suggestEmoiconStruct2 = this.f212291o;
        suggestEmoiconStruct2.f79176l = suggestEmoiconStruct2.mo86045b("IsLocalSearch", sb4.toString(), true);
        SuggestEmoiconStruct suggestEmoiconStruct3 = this.f212291o;
        suggestEmoiconStruct3.f79174j = suggestEmoiconStruct3.mo86045b("Index", sb5.toString(), true);
        SuggestEmoiconStruct suggestEmoiconStruct4 = this.f212291o;
        suggestEmoiconStruct4.f79169e = suggestEmoiconStruct4.mo86045b("Word", this.f212285i.replace(",", ""), true);
    }
}
