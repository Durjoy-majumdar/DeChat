package p813fl;

import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fl.s */
public final class C97930s extends C97923p {

    /* renamed from: b */
    public final EmojiIPSetInfo f287257b;

    /* renamed from: c */
    public final LinkedList<EmojiGroupInfo> f287258c = new LinkedList<>();

    /* renamed from: d */
    public String f287259d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97930s(EmojiIPSetInfo emojiIPSetInfo) {
        super(4);
        C87412m.m108594g(emojiIPSetInfo, "info");
        this.f287257b = emojiIPSetInfo;
    }

    /* renamed from: a */
    public boolean mo137247a(String str) {
        boolean z;
        C87412m.m108594g(str, "groupId");
        if (super.mo137247a(str)) {
            return true;
        }
        LinkedList<EmojiGroupInfo> linkedList = this.f287258c;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C87412m.m108589b(((EmojiGroupInfo) it.next()).field_productID, str)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    /* renamed from: b */
    public boolean mo137248b(Object obj) {
        boolean z;
        boolean z2;
        if (super.mo137248b(obj) && (obj instanceof C97930s)) {
            LinkedList<EmojiGroupInfo> linkedList = ((C97930s) obj).f287258c;
            LinkedList<EmojiGroupInfo> linkedList2 = this.f287258c;
            C87412m.m108594g(linkedList, "newList");
            C87412m.m108594g(linkedList2, "oldList");
            if (linkedList.size() != linkedList2.size()) {
                z = false;
            } else {
                Iterator<EmojiGroupInfo> it = linkedList.iterator();
                Iterator<EmojiGroupInfo> it4 = linkedList2.iterator();
                while (true) {
                    if (it.hasNext() && it4.hasNext()) {
                        EmojiGroupInfo next = it.next();
                        EmojiGroupInfo next2 = it4.next();
                        if (!C87412m.m108589b(next.field_productID, next2.field_productID) || next.field_idx != next2.field_idx) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (!z2) {
                            break;
                        }
                    } else {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String mo137249c() {
        String str = this.f287257b.field_key;
        C87412m.m108593f(str, "info.field_key");
        return str;
    }

    /* renamed from: d */
    public String mo137250d() {
        String str = this.f287257b.field_panelUrl;
        return str == null ? "" : str;
    }

    /* renamed from: e */
    public String mo137251e() {
        String str = this.f287257b.field_title;
        return str == null ? "" : str;
    }
}
