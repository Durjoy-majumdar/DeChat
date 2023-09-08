package com.tencent.p014mm.kara.feature.feature.comm;

import android.text.TextUtils;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f30.C86704a;
import f40.C86709a0;
import f62.C75700k0;
import o30.C89112b;
import q30.C101015r;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.SomeoneRelationshipFeatureGroup */
public class SomeoneRelationshipFeatureGroup extends C89112b {
    @C86704a
    public int chatAlert;
    @C86704a
    public int hideItsPost;
    @C86704a
    public int hideMyPost;
    @C86704a
    public int isMyContact;
    @C86704a
    public int isSessionStickyOnTop;
    @C86704a
    public int isStared;
    @C86704a
    public int muteNotifications;
    @C86704a
    public int numberOfMessages;
    @C86704a
    public int numberOfMyMessages;
    @C86704a
    public int[] privacy;
    @C86704a
    public float proportionOfMyMessages;
    @C86704a
    public int[] sex;
    private String userName;

    public SomeoneRelationshipFeatureGroup(String str) {
        this.userName = str;
    }

    public void build() {
        super.build();
        if (!TextUtils.isEmpty(this.userName)) {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.userName);
            if (z1Var != null) {
                C101015r rVar = C101015r.f295805e;
                this.chatAlert = rVar.mo140502b(this.userName) ? 1 : 0;
                this.hideItsPost = rVar.mo140504d(this.userName) ^ true ? 1 : 0;
                this.hideMyPost = z1Var.mo62943y3() ^ true ? 1 : 0;
                this.isMyContact = z1Var.mo62927s3() ? 1 : 0;
                this.isSessionStickyOnTop = rVar.mo140503c(z1Var) ? 1 : 0;
                this.muteNotifications = C45628s0.m50746K(z1Var) ? 1 : 0;
                this.numberOfMyMessages = rVar.mo140506f(this.userName);
                int e = rVar.mo140505e(this.userName);
                this.numberOfMessages = e;
                if (e > 0) {
                    this.proportionOfMyMessages = ((float) this.numberOfMyMessages) / ((float) e);
                }
            }
        }
    }

    public String getName() {
        return "sender";
    }
}
