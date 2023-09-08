package io0;

import io0.C87779d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: io0.a */
public class C87776a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f254132d;

    /* renamed from: e */
    public final /* synthetic */ C87779d.C87780a f254133e;

    public C87776a(String str, C87779d.C87780a aVar) {
        this.f254132d = str;
        this.f254133e = aVar;
    }

    public void run() {
        if (!((HashMap) C87779d.f254141b).containsKey(this.f254132d)) {
            ((HashMap) C87779d.f254141b).put(this.f254132d, new ArrayList());
        }
        ((List) ((HashMap) C87779d.f254141b).get(this.f254132d)).add(this.f254133e);
    }
}
