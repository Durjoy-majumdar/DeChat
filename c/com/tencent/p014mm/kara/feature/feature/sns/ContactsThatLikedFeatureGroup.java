package com.tencent.p014mm.kara.feature.feature.sns;

import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f30.C86704a;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import o30.C89112b;
import q30.C101015r;
import te3.w64;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.ContactsThatLikedFeatureGroup */
public class ContactsThatLikedFeatureGroup extends C89112b {
    @C86704a
    public int containsPOI;
    @C86704a
    public int count;
    @C86704a
    public int numberOfChatAlert;
    @C86704a
    public int numberOfChatOnlyPrivacy;
    @C86704a
    public int numberOfFemales;
    @C86704a
    public int numberOfHideItsPost;
    @C86704a
    public int numberOfHideMyPost;
    @C86704a
    public int numberOfMales;
    @C86704a
    public int numberOfMuteNotifications;
    @C86704a
    public int numberOfMyContacts;
    @C86704a
    public int numberOfNormalPrivacy;
    @C86704a
    public int numberOfSessionsStickyOnTop;
    @C86704a
    public int numberOfStarred;
    @C86704a
    public float proportionOfChatAlert;
    @C86704a
    public float proportionOfChatOnlyPrivacy;
    @C86704a
    public float proportionOfFemales;
    @C86704a
    public float proportionOfHideItsPost;
    @C86704a
    public float proportionOfHideMyPost;
    @C86704a
    public float proportionOfMales;
    @C86704a
    public float proportionOfMuteNotifications;
    @C86704a
    public float proportionOfMyContacts;
    @C86704a
    public float proportionOfMyMessages;
    @C86704a
    public float proportionOfNormalPrivacy;
    @C86704a
    public float proportionOfSessionsStickyOnTop;
    @C86704a
    public float proportionOfStarred;
    private SnsInfo snsInfo;
    @C86704a
    public int sumOfMessages;
    @C86704a
    public int sumOfMyMessages;

    public ContactsThatLikedFeatureGroup(SnsInfo snsInfo2) {
        this.snsInfo = snsInfo2;
    }

    public void build() {
        super.build();
        SnsInfo snsInfo2 = this.snsInfo;
        if (snsInfo2 != null) {
            SnsObject e = C94897n1.m120367e(snsInfo2);
            LinkedList<w64> linkedList = e.LikeUserList;
            int size = linkedList.size();
            Iterator<w64> it = linkedList.iterator();
            boolean z = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i15 = 0;
            int i16 = 0;
            while (it.hasNext()) {
                Iterator<w64> it4 = it;
                String str = it.next().f299703d;
                C86709a0.m107528h();
                int i17 = size;
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                C101015r rVar = C101015r.f295805e;
                int i18 = z + (rVar.mo140502b(str) ? 1 : 0);
                i7 += rVar.mo140504d(str) ^ true ? 1 : 0;
                i += z1Var.mo62846A3() ? 1 : 0;
                i6 += z1Var.mo62943y3() ^ true ? 1 : 0;
                i8 += C45628s0.m50746K(z1Var) ? 1 : 0;
                i5 += z1Var.mo62846A3() ^ true ? 1 : 0;
                i4 += z1Var.mo62934u3() ? 1 : 0;
                i9 += rVar.mo140503c(z1Var) ? 1 : 0;
                i15 += rVar.mo140505e(str);
                i16 += rVar.mo140506f(str);
                int i19 = z1Var.f149500H;
                if (i19 == 1) {
                    i3++;
                } else if (i19 == 2) {
                    i2++;
                }
                it = it4;
                size = i17;
                z = i18;
            }
            int i25 = e.LikeCount;
            this.count = i25;
            int i26 = size;
            this.numberOfMyContacts = i26;
            this.numberOfChatAlert = z ? 1 : 0;
            this.numberOfChatOnlyPrivacy = i;
            this.numberOfFemales = i2;
            this.numberOfMales = i3;
            this.numberOfStarred = i4;
            this.numberOfNormalPrivacy = i5;
            this.numberOfHideMyPost = i6;
            this.numberOfHideItsPost = i7;
            this.numberOfMuteNotifications = i8;
            this.numberOfSessionsStickyOnTop = i9;
            this.sumOfMessages = i15;
            this.sumOfMyMessages = i16;
            if (i26 > 0) {
                float f = (float) i26;
                this.proportionOfChatAlert = (z ? 1.0f : 0.0f) / f;
                this.proportionOfChatOnlyPrivacy = ((float) i) / f;
                this.proportionOfFemales = ((float) i2) / f;
                this.proportionOfMales = ((float) i3) / f;
                this.proportionOfHideMyPost = ((float) i6) / f;
                this.proportionOfHideItsPost = ((float) i7) / f;
                this.proportionOfMuteNotifications = ((float) i8) / f;
                this.proportionOfMyContacts = f / f;
                this.proportionOfNormalPrivacy = ((float) i5) / f;
                this.proportionOfSessionsStickyOnTop = ((float) i9) / f;
                this.proportionOfStarred = ((float) i4) / f;
            }
            if (i15 > 0) {
                this.proportionOfMyMessages = ((float) i16) / ((float) i15);
                return;
            }
            return;
        }
    }

    public String getName() {
        return "contactsThatLiked";
    }
}
