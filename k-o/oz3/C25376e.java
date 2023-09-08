package oz3;

/* renamed from: oz3.e */
public final class C25376e {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1.f65638e == false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m32539a(wy3.C26447e r8, oz3.C25405z<?> r9) {
        /*
            java.lang.String r0 = "klass"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = r9.mo52543a(r8)
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            wy3.k r0 = r8.mo51892b()
            java.lang.String r1 = "klass.containingDeclaration"
            gy3.C87412m.m108593f(r0, r1)
            vz3.f r1 = r8.getName()
            if (r1 == 0) goto L_0x0027
            vz3.f r2 = vz3.C26409h.f73647a
            boolean r2 = r1.f65638e
            if (r2 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            vz3.f r1 = vz3.C26409h.f73649c
        L_0x0029:
            java.lang.String r1 = r1.mo35996c()
            java.lang.String r2 = "safeIdentifier(klass.name).identifier"
            gy3.C87412m.m108593f(r1, r2)
            boolean r2 = r0 instanceof wy3.C26465i0
            if (r2 == 0) goto L_0x006c
            wy3.i0 r0 = (wy3.C26465i0) r0
            vz3.c r8 = r0.mo53444d()
            boolean r9 = r8.mo35975d()
            if (r9 == 0) goto L_0x0043
            goto L_0x006b
        L_0x0043:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.mo35973b()
            java.lang.String r8 = "fqName.asString()"
            gy3.C87412m.m108593f(r2, r8)
            r3 = 46
            r4 = 47
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r8 = z04.C112551y.m153815o(r2, r3, r4, r5, r6, r7)
            r9.append(r8)
            r8 = 47
            r9.append(r8)
            r9.append(r1)
            java.lang.String r1 = r9.toString()
        L_0x006b:
            return r1
        L_0x006c:
            boolean r2 = r0 instanceof wy3.C26447e
            if (r2 == 0) goto L_0x0074
            r2 = r0
            wy3.e r2 = (wy3.C26447e) r2
            goto L_0x0075
        L_0x0074:
            r2 = 0
        L_0x0075:
            if (r2 == 0) goto L_0x0096
            java.lang.String r8 = r9.mo52547e(r2)
            if (r8 != 0) goto L_0x0081
            java.lang.String r8 = m32539a(r2, r9)
        L_0x0081:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r8 = 36
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            return r8
        L_0x0096:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected container: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25376e.m32539a(wy3.e, oz3.z):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0196, code lost:
        if (r4 != false) goto L_0x01aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0126  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m32540b(n04.C25143j0 r21, oz3.C25388m<T> r22, oz3.C25365b0 r23, oz3.C25405z<? extends T> r24, oz3.C25382j<T> r25, fy3.C32228q<? super n04.C25143j0, ? super T, ? super oz3.C25365b0, rx3.C13598b0> r26) {
        /*
            r0 = r21
            r6 = r22
            r2 = r23
            r3 = r24
            r5 = r26
            java.lang.String r1 = "kotlinType"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "factory"
            gy3.C87412m.m108594g(r6, r1)
            java.lang.String r1 = "mode"
            gy3.C87412m.m108594g(r2, r1)
            java.lang.String r1 = "typeMappingConfiguration"
            gy3.C87412m.m108594g(r3, r1)
            java.lang.String r1 = "writeGenericType"
            gy3.C87412m.m108594g(r5, r1)
            n04.j0 r1 = r3.mo52546d(r0)
            if (r1 == 0) goto L_0x0039
            r0 = r1
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x0039:
            boolean r1 = ty3.C26335g.m33823i(r21)
            if (r1 == 0) goto L_0x00e4
            zy3.c0 r1 = ty3.C26345m.f73437a
            ty3.C26335g.m33823i(r21)
            ty3.h r7 = r04.C26094c.m33425e(r21)
            xy3.h r8 = r21.getAnnotations()
            n04.j0 r9 = ty3.C26335g.m33820f(r21)
            java.util.List r10 = ty3.C26335g.m33818d(r21)
            java.util.List r1 = ty3.C26335g.m33821g(r21)
            java.util.ArrayList r4 = new java.util.ArrayList
            r11 = 10
            int r11 = sx3.C36907w.m41090l(r1, r11)
            r4.<init>(r11)
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x007b
            java.lang.Object r11 = r1.next()
            n04.m1 r11 = (n04.C25158m1) r11
            n04.j0 r11 = r11.getType()
            r4.add(r11)
            goto L_0x0067
        L_0x007b:
            n04.g1$a r1 = n04.C25122g1.f71557e
            r1.getClass()
            n04.g1 r11 = n04.C25122g1.f71558f
            zy3.c0 r1 = ty3.C26345m.f73437a
            n04.j1 r12 = r1.mo36110l()
            java.lang.String r1 = "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor"
            gy3.C87412m.m108593f(r12, r1)
            ty3.C26335g.m33822h(r21)
            java.util.List r1 = r21.mo37079I0()
            java.lang.Object r1 = sx3.C110818d0.m150923U(r1)
            n04.m1 r1 = (n04.C25158m1) r1
            n04.j0 r1 = r1.getType()
            java.lang.String r13 = "arguments.last().type"
            gy3.C87412m.m108593f(r1, r13)
            n04.m1 r1 = r04.C26094c.m33421a(r1)
            java.util.List r13 = sx3.C26236u.m33719b(r1)
            r1 = 0
            r15 = 0
            r16 = 16
            r17 = 0
            r14 = 0
            n04.s0 r11 = n04.C25146k0.m31961g(r11, r12, r13, r14, r15, r16, r17)
            java.util.List r11 = sx3.C110818d0.m150934f0(r4, r11)
            r12 = 0
            ty3.h r4 = r04.C26094c.m33425e(r21)
            n04.s0 r13 = r4.mo53324p()
            java.lang.String r4 = "suspendFunType.builtIns.nullableAnyType"
            gy3.C87412m.m108593f(r13, r4)
            r14 = r1
            n04.s0 r1 = ty3.C26335g.m33816b(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r21.mo37082L0()
            n04.s0 r0 = r1.mo37084O0(r0)
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x00e4:
            o04.o r1 = o04.C25335o.f71846a
            q04.n r4 = o04.C25315b.C25316a.m32269l0(r1, r0)
            boolean r7 = o04.C25315b.C25316a.m32228I(r1, r4)
            r8 = 91
            r9 = 0
            r10 = 1
            r11 = 0
            if (r7 != 0) goto L_0x00f7
            goto L_0x01aa
        L_0x00f7:
            ty3.j r7 = o04.C25315b.C25316a.m32283u(r1, r4)
            if (r7 == 0) goto L_0x0129
            java.lang.Object r4 = r6.mo52583c(r7)
            boolean r7 = o04.C25315b.C25316a.m32238S(r1, r0)
            if (r7 != 0) goto L_0x0117
            vz3.c r7 = fz3.C24503f0.f70045p
            java.lang.String r9 = "ENHANCED_NULLABILITY_ANNOTATION"
            gy3.C87412m.m108593f(r7, r9)
            boolean r1 = r1.mo52481u0(r0, r7)
            if (r1 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r1 = 0
            goto L_0x0118
        L_0x0117:
            r1 = 1
        L_0x0118:
            java.lang.String r7 = "possiblyPrimitiveType"
            gy3.C87412m.m108594g(r4, r7)
            if (r1 == 0) goto L_0x0126
            java.lang.Object r1 = r6.mo52585e(r4)
            r9 = r1
            goto L_0x01aa
        L_0x0126:
            r9 = r4
            goto L_0x01aa
        L_0x0129:
            ty3.j r7 = o04.C25315b.C25316a.m32282t(r1, r4)
            if (r7 == 0) goto L_0x0158
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.util.Map<ty3.j, e04.e> r4 = e04.C20506e.f57720u
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            java.lang.Object r4 = r4.get(r7)
            e04.e r4 = (e04.C20506e) r4
            if (r4 == 0) goto L_0x0153
            java.lang.String r4 = r4.mo32069c()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Object r9 = r6.mo52581a(r1)
            goto L_0x01aa
        L_0x0153:
            r0 = 4
            e04.C20506e.m22187a(r0)
            throw r9
        L_0x0158:
            boolean r7 = o04.C25315b.C25316a.m32244Y(r1, r4)
            if (r7 == 0) goto L_0x01aa
            vz3.d r1 = o04.C25315b.C25316a.m32278q(r1, r4)
            vy3.c r4 = vy3.C26384c.f73585a
            vz3.b r1 = r4.mo53374g(r1)
            if (r1 == 0) goto L_0x01aa
            boolean r4 = r2.f71880g
            if (r4 != 0) goto L_0x0199
            java.util.List<vy3.c$a> r4 = vy3.C26384c.f73599o
            boolean r7 = r4 instanceof java.util.Collection
            if (r7 == 0) goto L_0x017b
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x017b
            goto L_0x0195
        L_0x017b:
            java.util.Iterator r4 = r4.iterator()
        L_0x017f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0195
            java.lang.Object r7 = r4.next()
            vy3.c$a r7 = (vy3.C26384c.C26385a) r7
            vz3.b r7 = r7.f73600a
            boolean r7 = gy3.C87412m.m108589b(r7, r1)
            if (r7 == 0) goto L_0x017f
            r4 = 1
            goto L_0x0196
        L_0x0195:
            r4 = 0
        L_0x0196:
            if (r4 == 0) goto L_0x0199
            goto L_0x01aa
        L_0x0199:
            e04.d r1 = e04.C24469d.m30612b(r1)
            java.lang.String r1 = r1.mo51171e()
            java.lang.String r4 = "byClassId(classId).internalName"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.Object r9 = r6.mo52582b(r1)
        L_0x01aa:
            if (r9 == 0) goto L_0x01b8
            boolean r1 = r2.f71874a
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r9 = r6.mo52585e(r9)
        L_0x01b4:
            r5.invoke(r0, r9, r2)
            return r9
        L_0x01b8:
            n04.j1 r1 = r21.mo37081K0()
            boolean r4 = r1 instanceof n04.C25124h0
            if (r4 == 0) goto L_0x01df
            n04.h0 r1 = (n04.C25124h0) r1
            n04.j0 r0 = r1.f71560a
            if (r0 != 0) goto L_0x01cc
            java.util.LinkedHashSet<n04.j0> r0 = r1.f71561b
            n04.j0 r0 = r3.mo52548f(r0)
        L_0x01cc:
            n04.j0 r0 = r04.C26094c.m33433m(r0)
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x01df:
            wy3.h r1 = r1.mo37094o()
            if (r1 == 0) goto L_0x0375
            boolean r4 = p04.C25417j.m32699f(r1)
            if (r4 == 0) goto L_0x01f7
            java.lang.String r2 = "error/NonExistentClass"
            java.lang.Object r2 = r6.mo52582b(r2)
            wy3.e r1 = (wy3.C26447e) r1
            r3.mo52545c(r0, r1)
            return r2
        L_0x01f7:
            boolean r4 = r1 instanceof wy3.C26447e
            if (r4 == 0) goto L_0x0280
            boolean r7 = ty3.C26336h.m33842z(r21)
            if (r7 == 0) goto L_0x0280
            java.util.List r1 = r21.mo37079I0()
            int r1 = r1.size()
            if (r1 != r10) goto L_0x0278
            java.util.List r0 = r21.mo37079I0()
            java.lang.Object r0 = r0.get(r11)
            n04.m1 r0 = (n04.C25158m1) r0
            n04.j0 r1 = r0.getType()
            java.lang.String r4 = "memberProjection.type"
            gy3.C87412m.m108593f(r1, r4)
            n04.z1 r4 = r0.mo52295a()
            n04.z1 r7 = n04.C25202z1.IN_VARIANCE
            if (r4 != r7) goto L_0x022d
            java.lang.String r0 = "java/lang/Object"
            java.lang.Object r0 = r6.mo52582b(r0)
            goto L_0x0260
        L_0x022d:
            n04.z1 r0 = r0.mo52295a()
            java.lang.String r4 = "memberProjection.projectionKind"
            gy3.C87412m.m108593f(r0, r4)
            boolean r4 = r2.f71876c
            if (r4 == 0) goto L_0x023b
            goto L_0x0253
        L_0x023b:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x024d
            if (r0 == r10) goto L_0x0248
            oz3.b0 r0 = r2.f71879f
            if (r0 != 0) goto L_0x0252
            goto L_0x0253
        L_0x0248:
            oz3.b0 r0 = r2.f71881h
            if (r0 != 0) goto L_0x0252
            goto L_0x0253
        L_0x024d:
            oz3.b0 r0 = r2.f71882i
            if (r0 != 0) goto L_0x0252
            goto L_0x0253
        L_0x0252:
            r2 = r0
        L_0x0253:
            r0 = r1
            r1 = r22
            r3 = r24
            r4 = r25
            r5 = r26
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)
        L_0x0260:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r0 = r6.mo52586f(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r6.mo52581a(r0)
            return r0
        L_0x0278:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "arrays must have one type argument"
            r0.<init>(r1)
            throw r0
        L_0x0280:
            if (r4 == 0) goto L_0x031a
            boolean r4 = zz3.C26798j.m35239b(r1)
            if (r4 == 0) goto L_0x02cb
            boolean r4 = r2.f71875b
            if (r4 != 0) goto L_0x02cb
            o04.o r4 = o04.C25335o.f71846a
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            q04.i r4 = n04.C25106b0.m31835a(r4, r0, r7)
            n04.j0 r4 = (n04.C25143j0) r4
            if (r4 == 0) goto L_0x02cb
            oz3.b0 r20 = new oz3.b0
            boolean r8 = r2.f71874a
            boolean r10 = r2.f71876c
            boolean r11 = r2.f71877d
            boolean r12 = r2.f71878e
            oz3.b0 r13 = r2.f71879f
            boolean r14 = r2.f71880g
            oz3.b0 r15 = r2.f71881h
            oz3.b0 r0 = r2.f71882i
            r9 = 1
            r17 = 0
            r18 = 512(0x200, float:7.175E-43)
            r19 = 0
            r7 = r20
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r4
            r1 = r22
            r2 = r20
            r3 = r24
            r4 = r25
            r5 = r26
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x02cb:
            boolean r4 = r2.f71876c
            if (r4 == 0) goto L_0x02df
            r4 = r1
            wy3.e r4 = (wy3.C26447e) r4
            vz3.d r7 = ty3.C26343l.C26344a.f73397Q
            boolean r4 = ty3.C26336h.m33838c(r4, r7)
            if (r4 == 0) goto L_0x02df
            java.lang.Object r1 = r22.mo52584d()
            goto L_0x0316
        L_0x02df:
            wy3.e r1 = (wy3.C26447e) r1
            wy3.e r4 = r1.mo36109a()
            java.lang.String r7 = "descriptor.original"
            gy3.C87412m.m108593f(r4, r7)
            java.lang.Object r4 = r3.mo52544b(r4)
            if (r4 != 0) goto L_0x0315
            wy3.f r4 = r1.mo51796f()
            wy3.f r7 = wy3.C26453f.ENUM_ENTRY
            if (r4 != r7) goto L_0x0303
            wy3.k r1 = r1.mo51892b()
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            gy3.C87412m.m108592e(r1, r4)
            wy3.e r1 = (wy3.C26447e) r1
        L_0x0303:
            wy3.e r1 = r1.mo36109a()
            java.lang.String r4 = "enumClassIfEnumEntry.original"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.String r1 = m32539a(r1, r3)
            java.lang.Object r1 = r6.mo52582b(r1)
            goto L_0x0316
        L_0x0315:
            r1 = r4
        L_0x0316:
            r5.invoke(r0, r1, r2)
            return r1
        L_0x031a:
            boolean r4 = r1 instanceof wy3.C26446d1
            if (r4 == 0) goto L_0x033e
            wy3.d1 r1 = (wy3.C26446d1) r1
            n04.j0 r1 = r04.C26094c.m33426f(r1)
            boolean r0 = r21.mo37082L0()
            if (r0 == 0) goto L_0x032f
            n04.j0 r0 = r04.C26094c.m33430j(r1)
            goto L_0x0330
        L_0x032f:
            r0 = r1
        L_0x0330:
            fy3.q<java.lang.Object, java.lang.Object, java.lang.Object, rx3.b0> r5 = w04.C37951d.f100406b
            r4 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)
            return r0
        L_0x033e:
            boolean r4 = r1 instanceof wy3.C26443c1
            if (r4 == 0) goto L_0x035e
            boolean r4 = r2.f71883j
            if (r4 == 0) goto L_0x035e
            wy3.c1 r1 = (wy3.C26443c1) r1
            n04.s0 r0 = r1.mo51918E()
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            java.lang.Object r0 = m32540b(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x035b }
            return r0
        L_0x035b:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x035e:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0375:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no descriptor for type constructor of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25376e.m32540b(n04.j0, oz3.m, oz3.b0, oz3.z, oz3.j, fy3.q):java.lang.Object");
    }
}
