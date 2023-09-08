package com.tencent.p014mm.plugin.emoji.p040ui;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bq3.C92295a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p260wk.C102457e;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$l */
public class EmojiStoreDetailUI$$l extends BaseAdapter implements C92295a {

    /* renamed from: d */
    public final List<EmojiInfo> f268651d = new ArrayList();

    /* renamed from: e */
    public final /* synthetic */ EmojiStoreDetailUI f268652e;

    public EmojiStoreDetailUI$$l(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268652e = emojiStoreDetailUI;
    }

    /* renamed from: a */
    public boolean mo126280a(int i) {
        return true;
    }

    /* renamed from: b */
    public boolean mo126281b(int i) {
        return false;
    }

    public int getCount() {
        return ((ArrayList) this.f268651d).size();
    }

    public Object getItem(int i) {
        return ((ArrayList) this.f268651d).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        EmojiStoreDetailUI$$m emojiStoreDetailUI$$m;
        if (view == null || view.getTag() == null) {
            view = LayoutInflater.from(this.f268652e.f268595d).inflate(C0966R.C0971layout.a2g, (ViewGroup) null);
            emojiStoreDetailUI$$m = new EmojiStoreDetailUI$$m(this.f268652e, view);
            view.setTag(emojiStoreDetailUI$$m);
        } else {
            emojiStoreDetailUI$$m = (EmojiStoreDetailUI$$m) view.getTag();
        }
        if (this.f268652e.f268567K.f285650x) {
            emojiStoreDetailUI$$m.f268653a.setBackgroundResource(C0966R.C0969drawable.smiley_item_bg2);
        } else {
            emojiStoreDetailUI$$m.f268653a.setBackgroundDrawable((Drawable) null);
        }
        Object item = getItem(i);
        if (item instanceof EmojiInfo) {
            C102457e eVar = C102457e.f301712a;
            EmojiInfo emojiInfo = (EmojiInfo) item;
            SquareImageView squareImageView = emojiStoreDetailUI$$m.f268653a;
            C87412m.m108594g(emojiInfo, "emojiInfo");
            C87412m.m108594g(squareImageView, "view");
            eVar.mo142072d(emojiInfo, squareImageView, (Drawable) null);
            emojiStoreDetailUI$$m.f268653a.setContentDescription(String.format(MMApplicationContext.getString(C0966R.string.c64), new Object[]{Integer.valueOf(i + 1)}));
        }
        return view;
    }
}
