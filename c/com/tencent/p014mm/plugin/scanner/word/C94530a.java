package com.tencent.p014mm.plugin.scanner.word;

import android.util.Pair;
import androidx.lifecycle.C0120a0;
import xl2.C102690c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.word.a */
public class C94530a implements C0120a0<Pair<String, C102690c>> {

    /* renamed from: d */
    public final /* synthetic */ ImageWordScanDetailEngine f273354d;

    public C94530a(ImageWordScanDetailEngine imageWordScanDetailEngine) {
        this.f273354d = imageWordScanDetailEngine;
    }

    public void onChanged(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            ImageWordScanDetailEngine imageWordScanDetailEngine = this.f273354d;
            String str = (String) pair.first;
            C102690c cVar = (C102690c) pair.second;
            imageWordScanDetailEngine.getClass();
            if (str != null && cVar != null) {
                ((C119157j) C119157j.f356862d).mo183876g(new C94531c(imageWordScanDetailEngine, str, cVar), "WordDetectThread");
            }
        }
    }
}
