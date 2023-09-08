package com.tencent.p014mm.emoji.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p008bq.C28372e1;
import p1072al.C92042f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u000201B'\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8F@FX\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/emoji/view/AbsEmojiView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "", "status", "Lrx3/b0;", "setStatusNotify", "Lcom/tencent/mm/emoji/view/AbsEmojiView$a;", "n", "Lcom/tencent/mm/emoji/view/AbsEmojiView$a;", "getDelegate", "()Lcom/tencent/mm/emoji/view/AbsEmojiView$a;", "delegate", "o", "I", "getStatus", "()I", "setStatus", "(I)V", "Lcom/tencent/mm/emoji/view/AbsEmojiView$b;", "p", "Lcom/tencent/mm/emoji/view/AbsEmojiView$b;", "getStatusListener", "()Lcom/tencent/mm/emoji/view/AbsEmojiView$b;", "setStatusListener", "(Lcom/tencent/mm/emoji/view/AbsEmojiView$b;)V", "statusListener", "", "q", "Z", "getGameUseCover", "()Z", "setGameUseCover", "(Z)V", "gameUseCover", "Lcom/tencent/mm/api/IEmojiInfo;", "value", "getEmojiInfo", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emojiInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "emojisdk-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.view.AbsEmojiView */
public abstract class AbsEmojiView extends MMAnimateView {

    /* renamed from: n */
    public final C92683a f266729n;

    /* renamed from: o */
    public int f266730o;

    /* renamed from: p */
    public C92684b f266731p;

    /* renamed from: q */
    public boolean f266732q;

    /* renamed from: com.tencent.mm.emoji.view.AbsEmojiView$a */
    public interface C92683a extends C92042f {
        /* renamed from: b */
        IEmojiInfo mo126731b();

        /* renamed from: c */
        void mo126732c(IEmojiInfo iEmojiInfo);

        void destroy();
    }

    /* renamed from: com.tencent.mm.emoji.view.AbsEmojiView$b */
    public interface C92684b {
        /* renamed from: a */
        void mo126734a(int i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbsEmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbsEmojiView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public C92683a getDelegate() {
        return this.f266729n;
    }

    public final IEmojiInfo getEmojiInfo() {
        return getDelegate().mo126731b();
    }

    public final boolean getGameUseCover() {
        return this.f266732q;
    }

    public final int getStatus() {
        return this.f266730o;
    }

    public final C92684b getStatusListener() {
        return this.f266731p;
    }

    public void onDetachedFromWindow() {
        getDelegate().destroy();
        super.onDetachedFromWindow();
    }

    public final void setEmojiInfo(IEmojiInfo iEmojiInfo) {
        getDelegate().mo126732c(iEmojiInfo);
    }

    public final void setGameUseCover(boolean z) {
        this.f266732q = z;
    }

    public final void setStatus(int i) {
        this.f266730o = i;
    }

    public final void setStatusListener(C92684b bVar) {
        this.f266731p = bVar;
    }

    public final void setStatusNotify(int i) {
        this.f266730o = i;
        C92684b bVar = this.f266731p;
        if (bVar != null) {
            bVar.mo126734a(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C7335d c = C86312j.m106911c(C28372e1.class);
        C87412m.m108591d(c);
        C92683a c002 = ((C28372e1) c).c00(this);
        C87412m.m108593f(c002, "getService(IEmojiViewDel…a)!!.createDelegate(this)");
        this.f266729n = c002;
        this.f266732q = true;
    }
}
