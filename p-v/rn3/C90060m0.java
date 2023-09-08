package rn3;

import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import java.util.LinkedList;
import qo3.C89779i0;

/* renamed from: rn3.m0 */
public class C90060m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f258722d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f258723e;

    /* renamed from: f */
    public final /* synthetic */ int f258724f;

    /* renamed from: g */
    public final /* synthetic */ SendAppMessageWrapperUI f258725g;

    public C90060m0(SendAppMessageWrapperUI sendAppMessageWrapperUI, String str, LinkedList linkedList, int i) {
        this.f258725g = sendAppMessageWrapperUI;
        this.f258722d = str;
        this.f258723e = linkedList;
        this.f258724f = i;
    }

    public void run() {
        C89779i0 i0Var = this.f258725g.f250368j;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f258725g.mo119870N7(this.f258722d, this.f258723e, this.f258724f);
    }
}
