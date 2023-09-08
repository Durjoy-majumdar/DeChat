package k10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;

/* renamed from: k10.c */
public class C88051c {

    /* renamed from: a */
    public final BinaryMessenger f254687a;

    public C88051c(BinaryMessenger binaryMessenger) {
        this.f254687a = binaryMessenger;
    }

    /* renamed from: a */
    public void mo122497a(String str, Long l, Long l2, Long l3, Long l4, c$$d<Void> c__d) {
        new BasicMessageChannel(this.f254687a, "dev.flutter.pigeon.MagicBrushResponse.onViewStyleChanged", C88052d.f254691a).send(new ArrayList(Arrays.asList(new Serializable[]{str, l, l2, l3, l4})), new c$$a(c__d));
    }
}
