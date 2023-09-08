package com.tencent.p014mm.plugin.emoji.p040ui;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emoji.model.C93114k;
import com.tencent.p014mm.plugin.emoji.model.C93115l;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p490dl.C97491p;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiSortUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortUI */
public final class EmojiSortUI extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f268549f = 0;

    /* renamed from: d */
    public final int f268550d = View.generateViewId();

    /* renamed from: e */
    public final C13601g f268551e = C36568h.m40985a(new C93152a(this));

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortUI$a */
    public static final class C93152a extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ EmojiSortUI f268552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93152a(EmojiSortUI emojiSortUI) {
            super(0);
            this.f268552d = emojiSortUI;
        }

        public Object invoke() {
            FrameLayout frameLayout = new FrameLayout(this.f268552d);
            frameLayout.setId(this.f268552d.f268550d);
            return frameLayout;
        }
    }

    public int getLayoutId() {
        return 1;
    }

    public View getLayoutView() {
        return (FrameLayout) ((C36570n) this.f268551e).getValue();
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("type");
        if (stringExtra == null) {
            stringExtra = "type_sort_all";
        }
        String stringExtra2 = getIntent().getStringExtra("ip_set_key");
        if (C87412m.m108589b(stringExtra, "type_sort_all")) {
            fragment = new EmojiSortFragment(new C93115l(C97491p.f286143a.mo136775d()));
        } else if (C87412m.m108589b(stringExtra, "type_list_ip_set") && stringExtra2 != null) {
            fragment = new EmojiMineListFragment(new C93114k(stringExtra2), stringExtra2);
        } else if (!C87412m.m108589b(stringExtra, "type_sort_ip_set") || stringExtra2 == null) {
            finish();
            return;
        } else {
            fragment = new EmojiSortFragment(new C93114k(stringExtra2));
        }
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165200l(this.f268550d, fragment);
        beginTransaction.mo165162d();
    }
}
