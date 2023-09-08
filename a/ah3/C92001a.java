package ah3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p171il.C98703a0;
import p171il.C98706b0;
import p171il.C98710c0;
import p171il.C98713d0;
import p171il.C98716e0;
import p171il.C98734m;
import p171il.C98744t;
import p171il.C98746w;
import p171il.C98748z;
import p813fl.C97904g;
import p813fl.C97906h;
import p813fl.C97927q0;
import p813fl.C97937v0;
import sx3.C36907w;
import te3.C101800k70;
import te3.C50572no3;
import u61.C101964h;

/* renamed from: ah3.a */
public class C92001a extends C98734m implements C98746w {

    /* renamed from: g */
    public boolean f263381g;

    /* renamed from: h */
    public boolean f263382h = true;

    /* renamed from: i */
    public int f263383i;

    public C92001a() {
        super((C97906h) null, 1, (C8480h) null);
    }

    /* renamed from: A */
    public void mo125847A(boolean z) {
        this.f263381g = z;
    }

    /* renamed from: G4 */
    public void onBindViewHolder(C98748z<?> zVar, int i) {
        C87412m.m108594g(zVar, "holder");
        if (getItemViewType(i) == 100) {
            ((C98710c0) zVar).f289451B = this.f263381g;
        }
        if (getItemViewType(i) == 103) {
            ((C98713d0) zVar).f289459B = this.f263382h;
        }
        if (getItemViewType(i) == 102) {
            ((C98713d0) zVar).f289459B = this.f263382h;
        }
        if (i > this.f263383i) {
            this.f263383i = i;
        }
        super.onBindViewHolder(zVar, i);
    }

    /* renamed from: O4 */
    public C98748z<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 100:
                View inflate = from.inflate(C0966R.C0971layout.f359982c01, viewGroup, false);
                C87412m.m108593f(inflate, "itemView");
                return new C98710c0(inflate, this.f263381g, this.f289521f);
            case 101:
                View inflate2 = from.inflate(C0966R.C0971layout.bzy, viewGroup, false);
                C87412m.m108593f(inflate2, "itemView");
                return new C98703a0(inflate2, this.f289521f);
            case 103:
                View inflate3 = from.inflate(C0966R.C0971layout.f359981c00, viewGroup, false);
                C87412m.m108593f(inflate3, "itemView");
                return new C98713d0(inflate3, this.f263382h, this.f289521f);
            case 104:
                View inflate4 = from.inflate(C0966R.C0971layout.bzw, viewGroup, false);
                C87412m.m108593f(inflate4, "itemView");
                return new C98703a0(inflate4, (C98744t) null);
            case 105:
                View inflate5 = from.inflate(C0966R.C0971layout.bzx, viewGroup, false);
                C87412m.m108593f(inflate5, "itemView");
                return new C98706b0(inflate5, C0966R.C0970id.g2x);
            case 106:
                View inflate6 = from.inflate(C0966R.C0971layout.bzx, viewGroup, false);
                C87412m.m108593f(inflate6, "itemView");
                return new C98706b0(inflate6, C0966R.C0970id.f359089is1);
            case 107:
                View inflate7 = from.inflate(C0966R.C0971layout.f359983c02, viewGroup, false);
                C87412m.m108593f(inflate7, "itemView");
                return new C98716e0(inflate7);
            default:
                View inflate8 = from.inflate(C0966R.C0971layout.bzz, viewGroup, false);
                C87412m.m108593f(inflate8, "itemView");
                return new C98713d0(inflate8, this.f263382h, this.f289521f);
        }
    }

    /* renamed from: d3 */
    public void mo125850d3() {
        mo138123F4(getItemCount(), new C97937v0(105));
    }

    /* renamed from: e0 */
    public int mo125851e0() {
        return this.f263383i;
    }

    public int getItemViewType(int i) {
        if (getItem(i) == null) {
            return 100;
        }
        if (getItem(i) instanceof C97904g) {
            C97927q0 item = getItem(i);
            C87412m.m108592e(item, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiItem");
            return ((C97904g) item).f287201c;
        }
        C97927q0 item2 = getItem(i);
        C87412m.m108591d(item2);
        return item2.f287255a;
    }

    /* renamed from: j3 */
    public void mo125852j3() {
        mo138123F4(getItemCount(), new C97937v0(106));
    }

    /* renamed from: t3 */
    public void mo125853t3(List<? extends C50572no3> list) {
        C87412m.m108594g(list, "list");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C50572no3 no32 : list) {
            EmojiInfo emojiInfo = new EmojiInfo();
            C101800k70 k702 = no32.f138703d;
            String str = no32.f138704e;
            C101964h.m134219a(k702, emojiInfo);
            emojiInfo.f284129U1 = str;
            int i = no32.f138705f;
            if ((i & 1) == 0) {
                emojiInfo.f284128T1 = 1;
            }
            if ((i & 1) == 0 && (i & 16) == 0) {
                emojiInfo.f284127S1 = 1;
            }
            emojiInfo.field_catalog = 65;
            emojiInfo.field_groupId = no32.f138703d.f298592j;
            arrayList.add(new C97904g(emojiInfo, 102, (String) null, 0, 12, (C8480h) null));
        }
        mo138125c(arrayList);
    }

    /* renamed from: u2 */
    public void mo125854u2(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        mo138123F4(0, new C97904g(iEmojiInfo, 100, (String) null, 0, 12, (C8480h) null));
    }

    /* renamed from: y */
    public void mo125855y(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        mo138123F4(0, new C97904g(iEmojiInfo, 107, (String) null, 0, 12, (C8480h) null));
    }
}
