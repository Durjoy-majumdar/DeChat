package com.google.protobuf;

import com.google.protobuf.C23845j1;
import com.google.protobuf.C24025t;

/* renamed from: com.google.protobuf.g1 */
public interface C23836g1 extends C23845j1, C23896m1 {

    /* renamed from: com.google.protobuf.g1$a */
    public interface C23837a extends C23845j1.C23846a, C23896m1 {
        C23837a addRepeatedField(C24025t.C24035g gVar, Object obj);

        C23836g1 build();

        C23836g1 buildPartial();

        C23837a clearField(C24025t.C24035g gVar);

        C24025t.C24027b getDescriptorForType();

        C23837a mergeFrom(C23836g1 g1Var);

        C23837a mergeFrom(C16994k kVar);

        C23837a mergeFrom(C16994k kVar, C23806a0 a0Var);

        C23837a newBuilderForField(C24025t.C24035g gVar);

        C23837a setField(C24025t.C24035g gVar, Object obj);

        C23837a setUnknownFields(C24020s2 s2Var);
    }

    C23837a newBuilderForType();

    C23837a toBuilder();
}
