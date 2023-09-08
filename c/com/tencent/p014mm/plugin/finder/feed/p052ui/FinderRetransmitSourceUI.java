package com.tencent.p014mm.plugin.finder.feed.p052ui;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.FinderRetransmitSourceContract$Loader;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import kf1.C10003u8;
import kf1.C10027w8;
import kf1.C9854m5;
import kotlin.Metadata;
import p629ny.C76979h;
import rs1.C13442s8;
import tf1.C13908i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRetransmitSourceUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/FinderRetransmitSourceContract$Loader;", "Lkf1/w8;", "Lkf1/u8;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRetransmitSourceUI */
public final class FinderRetransmitSourceUI extends FinderLoaderFeedUI<FinderRetransmitSourceContract$Loader, C10027w8, C10003u8> {

    /* renamed from: s */
    public C10003u8 f14765s;

    /* renamed from: t */
    public C10027w8 f14766t;

    /* renamed from: u */
    public FinderRetransmitSourceContract$Loader f14767u;

    /* renamed from: v */
    public String f14768v;

    /* renamed from: w */
    public String f14769w;

    /* renamed from: x */
    public long f14770x;

    /* renamed from: y */
    public String f14771y = "";

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        FinderRetransmitSourceContract$Loader finderRetransmitSourceContract$Loader = this.f14767u;
        if (finderRetransmitSourceContract$Loader != null) {
            return finderRetransmitSourceContract$Loader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C10003u8 u8Var = this.f14765s;
        if (u8Var != null) {
            return u8Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C10027w8 w8Var = this.f14766t;
        if (w8Var != null) {
            return w8Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: S7 */
    public void mo2941S7() {
        String stringExtra = getIntent().getStringExtra("KEY_TARGET_USERNAME");
        C87412m.m108591d(stringExtra);
        this.f14768v = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("KEY_TARGET_NICKNAME");
        C87412m.m108591d(stringExtra2);
        this.f14769w = stringExtra2;
        this.f14770x = getIntent().getLongExtra("KEY_REF_OBJ_ID", 0);
        String stringExtra3 = getIntent().getStringExtra("KEY_REF_OBJ_NONCE_ID");
        C87412m.m108591d(stringExtra3);
        this.f14771y = stringExtra3;
        String str = this.f14768v;
        if (str != null) {
            if (Util.isNullOrNil(str) || this.f14770x == 0) {
                finish();
            }
            C10003u8 u8Var = new C10003u8(this);
            this.f14765s = u8Var;
            this.f14766t = new C10027w8(this, u8Var, 2, 4);
            String str2 = this.f14768v;
            if (str2 != null) {
                this.f14767u = new FinderRetransmitSourceContract$Loader(str2, this.f14770x, this.f14771y, C13908i.FEED_RETRANSMIT_SOURCE, ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                AppCompatActivity context = getContext();
                String str3 = this.f14769w;
                if (str3 != null) {
                    setMMTitle((CharSequence) hVar.mo107057T1(context, str3));
                } else {
                    C87412m.m108603p("targetNickname");
                    throw null;
                }
            } else {
                C87412m.m108603p("targetUsername");
                throw null;
            }
        } else {
            C87412m.m108603p("targetUsername");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aov;
    }
}
