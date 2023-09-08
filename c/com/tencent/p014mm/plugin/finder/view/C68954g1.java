package com.tencent.p014mm.plugin.finder.view;

import android.text.Editable;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.finder.view.g1 */
public final class C68954g1 implements PasterEditText.C74990a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentEditText f198154a;

    public C68954g1(FinderCommentEditText finderCommentEditText) {
        this.f198154a = finderCommentEditText;
    }

    /* renamed from: a */
    public void mo94888a(Editable editable, CharSequence charSequence, int i, int i2) {
        if (charSequence != null && editable != null) {
            if (this.f198154a.getPastedList().get(Long.valueOf(this.f198154a.getFeedId())) == null) {
                this.f198154a.getPastedList().put(Long.valueOf(this.f198154a.getFeedId()), new LinkedList());
            }
            LinkedList linkedList = this.f198154a.getPastedList().get(Long.valueOf(this.f198154a.getFeedId()));
            if (linkedList != null) {
                linkedList.add(charSequence.toString());
            }
        }
    }
}
