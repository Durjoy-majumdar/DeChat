package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import pe3.C47465a;
import py1.C47564d2;

/* renamed from: com.tencent.mm.plugin.game.model.j0 */
public class C42068j0 extends C42056f0 {

    /* renamed from: a */
    public C47564d2 f113347a;

    public C42068j0(C47465a aVar) {
        if (aVar == null) {
            this.f113347a = new C47564d2();
        } else {
            this.f113347a = (C47564d2) aVar;
        }
    }

    public C42068j0(byte[] bArr) {
        C47564d2 d2Var = new C47564d2();
        this.f113347a = d2Var;
        if (bArr != null && bArr.length != 0) {
            try {
                d2Var.parseFrom(bArr);
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GamePBDataDownloadGuidance", "Parsing Failed: %s", e.getMessage());
            }
        }
    }
}
