package com.tencent.p014mm.kara.feature.feature.comm;

import a22.C67001a;
import android.text.TextUtils;
import b22.C28250a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f30.C86704a;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import o30.C89112b;
import q30.C101015r;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.SomeoneTagsFeatureGroup */
public class SomeoneTagsFeatureGroup extends C89112b {
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
    public float proportionOfStared;
    @C86704a
    public int sumOfMessages;
    @C86704a
    public int sumOfMyMessages;
    private String userName;

    public SomeoneTagsFeatureGroup(String str) {
        this.userName = str;
    }

    public void build() {
        Class cls = C75700k0.class;
        super.build();
        if (!TextUtils.isEmpty(this.userName)) {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.userName);
            Iterator<String> it = Util.stringsToList(z1Var.mo73974r2().split(",")).iterator();
            int i = 0;
            boolean z = 0;
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
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                Iterator<String> it4 = it;
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    Iterator it5 = ((C67001a) C28250a.m38138a()).mo90973k(next).iterator();
                    i16 = i16;
                    while (it5.hasNext()) {
                        Iterator it6 = it5;
                        String str = (String) it5.next();
                        if (TextUtils.isEmpty(str)) {
                            it5 = it6;
                        } else {
                            C86709a0.m107528h();
                            Class cls2 = cls;
                            C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
                            int i19 = i + 1;
                            C101015r rVar = C101015r.f295805e;
                            int i25 = (z ? 1 : 0) + (rVar.mo140502b(str) ? 1 : 0);
                            i2 += z1Var2.mo62846A3() ? 1 : 0;
                            int i26 = i25;
                            i5 += z1Var2.mo62943y3() ^ true ? 1 : 0;
                            i6 += rVar.mo140504d(str) ^ true ? 1 : 0;
                            i7 += C45628s0.m50746K(z1Var2) ? 1 : 0;
                            i15 += z1Var2.mo62846A3() ^ true ? 1 : 0;
                            i16 += z1Var2.mo62934u3() ? 1 : 0;
                            i9 += rVar.mo140503c(z1Var2) ? 1 : 0;
                            i18 += rVar.mo140505e(str);
                            i17 += rVar.mo140506f(str);
                            i8 += z1Var2.mo62927s3() ? 1 : 0;
                            int i27 = z1Var.f149500H;
                            if (i27 == 1) {
                                i4++;
                            } else if (i27 == 2) {
                                i3++;
                            }
                            i = i19;
                            it5 = it6;
                            cls = cls2;
                            z = i26;
                        }
                    }
                }
                it = it4;
            }
            int i28 = i16;
            this.count = i;
            this.numberOfChatAlert = z ? 1 : 0;
            this.numberOfChatOnlyPrivacy = i2;
            this.numberOfFemales = i3;
            this.numberOfMales = i4;
            this.numberOfHideMyPost = i5;
            this.numberOfHideItsPost = i6;
            this.numberOfMuteNotifications = i7;
            this.numberOfMyContacts = i8;
            this.numberOfSessionsStickyOnTop = i9;
            this.numberOfNormalPrivacy = i15;
            this.numberOfStarred = i16;
            int i29 = i17;
            this.sumOfMyMessages = i29;
            int i35 = i18;
            this.sumOfMessages = i35;
            if (i > 0) {
                float f = (float) i;
                this.proportionOfChatAlert = (z ? 1.0f : 0.0f) / f;
                this.proportionOfChatOnlyPrivacy = ((float) i2) / f;
                this.proportionOfFemales = ((float) i3) / f;
                this.proportionOfHideItsPost = ((float) i6) / f;
                this.proportionOfHideMyPost = ((float) i5) / f;
                this.proportionOfMales = ((float) i4) / f;
                this.proportionOfMuteNotifications = ((float) i7) / f;
                this.proportionOfMyContacts = ((float) i8) / f;
                this.proportionOfNormalPrivacy = ((float) i15) / f;
                this.proportionOfSessionsStickyOnTop = ((float) i9) / f;
                this.proportionOfStared = ((float) i16) / f;
            }
            if (i35 > 0) {
                this.proportionOfMyMessages = ((float) i29) / ((float) i35);
            }
        }
    }

    public String getName() {
        return "tag";
    }
}
