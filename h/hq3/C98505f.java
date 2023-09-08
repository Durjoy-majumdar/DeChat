package hq3;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.view.popview.AbstractPopView;
import com.tencent.p014mm.view.popview.EmojiPopView;
import com.tencent.p014mm.view.popview.SmileyPopView;
import gy3.C8480h;
import gy3.C87412m;
import p490dl.C58320u;
import p813fl.C97904g;
import p813fl.C97939w0;

/* renamed from: hq3.f */
public class C98505f {
    /* renamed from: a */
    public static AbstractPopView m127959a(Context context, Object obj) {
        if (!(obj instanceof C58320u) && !(obj instanceof C97939w0)) {
            return ((obj instanceof C97904g) || (obj instanceof EmojiInfo)) ? new EmojiPopView(context, (AttributeSet) null) : new EmojiPopView(context, (AttributeSet) null);
        }
        C87412m.m108594g(context, "context");
        return new SmileyPopView(context, (AttributeSet) null, 0, 6, (C8480h) null);
    }

    /* renamed from: b */
    public static void m127960b(AbstractPopView abstractPopView, Object obj) {
        if (abstractPopView instanceof EmojiPopView) {
            if (obj instanceof EmojiInfo) {
                ((EmojiPopView) abstractPopView).setEmojiInfo((EmojiInfo) obj);
            } else if (obj instanceof C97904g) {
                ((EmojiPopView) abstractPopView).setEmojiInfo((EmojiInfo) ((C97904g) obj).f287200b);
            }
        } else if (!(abstractPopView instanceof SmileyPopView)) {
        } else {
            if (obj instanceof C58320u) {
                ((SmileyPopView) abstractPopView).setSmileyItem((C58320u) obj);
            } else if (obj instanceof C97939w0) {
                ((SmileyPopView) abstractPopView).setSmileyItem(((C97939w0) obj).f287274b);
            }
        }
    }
}
