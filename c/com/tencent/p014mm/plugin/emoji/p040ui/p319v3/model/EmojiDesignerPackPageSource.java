package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.Metadata;
import nr3.C89059e;
import p490dl.C45410f;
import rx3.C13598b0;
import te3.C101824o80;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012 \u0010\u000e\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiDesignerPackPageSource;", "Landroidx/lifecycle/e;", "Ljp3/c;", "Ljp3/a;", "lifecycle", "", "designerUIN", "Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreDesignerPackList;", "lastData", "Lkotlin/Function2;", "", "Lte3/o80;", "", "Lrx3/b0;", "dataCallback", "<init>", "(Ljp3/c;ILcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreDesignerPackList;Lfy3/p;)V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource */
public final class EmojiDesignerPackPageSource implements C103757e {

    /* renamed from: d */
    public final C46566c<C9486a> f269069d;

    /* renamed from: e */
    public int f269070e;

    /* renamed from: f */
    public final EmojiStoreDesignerPackList f269071f;

    /* renamed from: g */
    public final C32227p<List<? extends C101824o80>, Boolean, C13598b0> f269072g;

    /* renamed from: h */
    public final String f269073h;

    /* renamed from: i */
    public boolean f269074i;

    /* renamed from: j */
    public byte[] f269075j;

    /* renamed from: n */
    public boolean f269076n;

    /* renamed from: o */
    public boolean f269077o;

    /* renamed from: p */
    public boolean f269078p;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource$a */
    public static final class C93270a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ EmojiDesignerPackPageSource f269079a;

        public C93270a(EmojiDesignerPackPageSource emojiDesignerPackPageSource) {
            this.f269079a = emojiDesignerPackPageSource;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
            r2 = r2.f132149i;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r5) {
            /*
                r4 = this;
                ob0.b$c r5 = (ob0.C89132b.C89134c) r5
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource r0 = r4.f269079a
                java.lang.String r0 = r0.f269073h
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "load: "
                r1.append(r2)
                int r2 = r5.f256793a
                r1.append(r2)
                java.lang.String r2 = ", "
                r1.append(r2)
                int r2 = r5.f256794b
                r1.append(r2)
                java.lang.String r2 = ", count:"
                r1.append(r2)
                T r2 = r5.f256796d
                te3.d62 r2 = (te3.C49103d62) r2
                r3 = 0
                if (r2 == 0) goto L_0x0039
                java.util.LinkedList<te3.o80> r2 = r2.f132149i
                if (r2 == 0) goto L_0x0039
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x003a
            L_0x0039:
                r2 = r3
            L_0x003a:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                int r0 = r5.f256793a
                if (r0 == 0) goto L_0x004b
                r1 = 4
                if (r0 != r1) goto L_0x0069
            L_0x004b:
                int r0 = r5.f256794b
                if (r0 == 0) goto L_0x0062
                r1 = 2
                if (r0 == r1) goto L_0x0053
                goto L_0x0069
            L_0x0053:
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource r0 = r4.f269079a
                T r1 = r5.f256796d
                te3.d62 r1 = (te3.C49103d62) r1
                te3.qv3 r1 = r1.f132150j
                byte[] r1 = sf0.C48374j0.m53715d(r1)
                r0.f269075j = r1
                goto L_0x0069
            L_0x0062:
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource r0 = r4.f269079a
                r0.f269075j = r3
                r1 = 1
                r0.f269077o = r1
            L_0x0069:
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource r0 = r4.f269079a
                r1 = 0
                r0.f269076n = r1
                fy3.p<java.util.List<? extends te3.o80>, java.lang.Boolean, rx3.b0> r0 = r0.f269072g
                T r5 = r5.f256796d
                te3.d62 r5 = (te3.C49103d62) r5
                java.util.LinkedList<te3.o80> r5 = r5.f132149i
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.invoke(r5, r2)
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource r5 = r4.f269079a
                boolean r0 = r5.f269078p
                if (r0 == 0) goto L_0x0086
                r5.f269078p = r1
                r5.mo127920a()
            L_0x0086:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiDesignerPackPageSource.C93270a.call(java.lang.Object):java.lang.Object");
        }
    }

    public EmojiDesignerPackPageSource(C46566c<C9486a> cVar, int i, EmojiStoreDesignerPackList emojiStoreDesignerPackList, C32227p<? super List<? extends C101824o80>, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(cVar, "lifecycle");
        C87412m.m108594g(pVar, "dataCallback");
        this.f269069d = cVar;
        this.f269070e = i;
        this.f269071f = emojiStoreDesignerPackList;
        this.f269072g = pVar;
        this.f269073h = "MicroMsg.EmojiDesignerPackPageSource";
        Log.m105924i("MicroMsg.EmojiDesignerPackPageSource", "create: " + emojiStoreDesignerPackList + ", " + Util.getStack());
    }

    /* renamed from: a */
    public final void mo127920a() {
        if (!this.f269074i && this.f269071f != null) {
            this.f269074i = true;
            String str = this.f269073h;
            Log.m105924i(str, "load: first page, " + this.f269071f.getDataList().size());
            byte[] reqBuffer = this.f269071f.getReqBuffer();
            this.f269075j = reqBuffer;
            this.f269077o = reqBuffer == null;
            this.f269072g.invoke(this.f269071f.getDataList(), Boolean.TRUE);
        }
        if (this.f269071f == null) {
            this.f269075j = null;
            this.f269077o = true;
            this.f269072g.invoke(null, Boolean.FALSE);
        }
        String str2 = this.f269073h;
        Log.m105924i(str2, "load: " + this.f269077o + ", " + this.f269076n);
        if (!this.f269077o) {
            if (this.f269076n) {
                this.f269078p = true;
                return;
            }
            this.f269076n = true;
            C89059e i = new C45410f(this.f269070e, this.f269075j).mo9225i();
            i.mo11397F(this.f269069d);
            i.mo123420E(new C93270a(this));
        }
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    public /* synthetic */ void onDestroy(C0125s sVar) {
    }

    public /* synthetic */ void onPause(C0125s sVar) {
    }

    public /* synthetic */ void onResume(C0125s sVar) {
    }

    public /* synthetic */ void onStart(C0125s sVar) {
    }

    public /* synthetic */ void onStop(C0125s sVar) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmojiDesignerPackPageSource(C46566c cVar, int i, EmojiStoreDesignerPackList emojiStoreDesignerPackList, C32227p pVar, int i2, C8480h hVar) {
        this(cVar, i, (i2 & 4) != 0 ? null : emojiStoreDesignerPackList, pVar);
    }
}
