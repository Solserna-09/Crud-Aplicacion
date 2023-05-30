PGDMP                         {            prueba    15.2    15.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16411    prueba    DATABASE     |   CREATE DATABASE prueba WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE prueba;
                postgres    false                       0    0    DATABASE prueba    COMMENT     g   COMMENT ON DATABASE prueba IS 'Base de Datos de Prueba - Curso: Persistencia y Datos Transaccionales';
                   postgres    false    3351            �            1259    24576    departamentos    TABLE     v   CREATE TABLE public.departamentos (
    id integer NOT NULL,
    nombre text NOT NULL,
    ubicacion text NOT NULL
);
 !   DROP TABLE public.departamentos;
       public         heap    postgres    false            �            1259    24595    empleado_proyecto    TABLE     n   CREATE TABLE public.empleado_proyecto (
    empleado_id integer NOT NULL,
    proyecto_id integer NOT NULL
);
 %   DROP TABLE public.empleado_proyecto;
       public         heap    postgres    false            �            1259    16412 	   empleados    TABLE     �   CREATE TABLE public.empleados (
    id integer NOT NULL,
    nombre text NOT NULL,
    apellido text NOT NULL,
    email text NOT NULL,
    telefono text,
    salario real NOT NULL,
    departamento_id integer
);
    DROP TABLE public.empleados;
       public         heap    postgres    false            �            1259    24765 	   pacientes    TABLE     �   CREATE TABLE public.pacientes (
    pac_identificacion character varying(40) NOT NULL,
    pac_nombres character varying(40),
    pac_apellidos character varying(40),
    pac_fechanacimiento character varying(40),
    pac_sexo character varying(40)
);
    DROP TABLE public.pacientes;
       public         heap    postgres    false            �            1259    24583 	   proyectos    TABLE     �   CREATE TABLE public.proyectos (
    id integer NOT NULL,
    nombre text NOT NULL,
    fecha_inicio date NOT NULL,
    fecha_fin date
);
    DROP TABLE public.proyectos;
       public         heap    postgres    false                      0    24576    departamentos 
   TABLE DATA           >   COPY public.departamentos (id, nombre, ubicacion) FROM stdin;
    public          postgres    false    215   c                 0    24595    empleado_proyecto 
   TABLE DATA           E   COPY public.empleado_proyecto (empleado_id, proyecto_id) FROM stdin;
    public          postgres    false    217   �                 0    16412 	   empleados 
   TABLE DATA           d   COPY public.empleados (id, nombre, apellido, email, telefono, salario, departamento_id) FROM stdin;
    public          postgres    false    214                    0    24765 	   pacientes 
   TABLE DATA           r   COPY public.pacientes (pac_identificacion, pac_nombres, pac_apellidos, pac_fechanacimiento, pac_sexo) FROM stdin;
    public          postgres    false    218   k                 0    24583 	   proyectos 
   TABLE DATA           H   COPY public.proyectos (id, nombre, fecha_inicio, fecha_fin) FROM stdin;
    public          postgres    false    216   �       w           2606    24582    departamentos departments_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.departamentos
    ADD CONSTRAINT departments_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.departamentos DROP CONSTRAINT departments_pkey;
       public            postgres    false    215            u           2606    16418    empleados employees_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.empleados
    ADD CONSTRAINT employees_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.empleados DROP CONSTRAINT employees_pkey;
       public            postgres    false    214            {           2606    24769    pacientes pacientes_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.pacientes
    ADD CONSTRAINT pacientes_pkey PRIMARY KEY (pac_identificacion);
 B   ALTER TABLE ONLY public.pacientes DROP CONSTRAINT pacientes_pkey;
       public            postgres    false    218            y           2606    24589    proyectos projects_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.proyectos
    ADD CONSTRAINT projects_pkey PRIMARY KEY (id);
 A   ALTER TABLE ONLY public.proyectos DROP CONSTRAINT projects_pkey;
       public            postgres    false    216            }           2606    24598 4   empleado_proyecto Empleado_Proyecto_empleado_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado_proyecto
    ADD CONSTRAINT "Empleado_Proyecto_empleado_id_fkey" FOREIGN KEY (empleado_id) REFERENCES public.empleados(id);
 `   ALTER TABLE ONLY public.empleado_proyecto DROP CONSTRAINT "Empleado_Proyecto_empleado_id_fkey";
       public          postgres    false    3189    217    214            ~           2606    24603 4   empleado_proyecto Empleado_Proyecto_proyecto_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleado_proyecto
    ADD CONSTRAINT "Empleado_Proyecto_proyecto_id_fkey" FOREIGN KEY (proyecto_id) REFERENCES public.proyectos(id);
 `   ALTER TABLE ONLY public.empleado_proyecto DROP CONSTRAINT "Empleado_Proyecto_proyecto_id_fkey";
       public          postgres    false    3193    216    217            |           2606    24590 (   empleados Empleados_departamento_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.empleados
    ADD CONSTRAINT "Empleados_departamento_id_fkey" FOREIGN KEY (departamento_id) REFERENCES public.departamentos(id);
 T   ALTER TABLE ONLY public.empleados DROP CONSTRAINT "Empleados_departamento_id_fkey";
       public          postgres    false    3191    214    215               b   x�3�JM.-*�/V�(�M��/�tM�L�L��Wp�2�t��K̫JDu�2��M,�N-��KG;s�p��� +u�2�IM����O?�6!������ %W(Y         7   x�ȹ�0��,��}�Ջ���0�p(�X�*��[�����"�,��!�c�$�         ?  x�m�Mj�0�ף���ٵ�Ͷ��Q[2J�En�eY��XgP��ƞ7��=�jD[�c�N4�A���N�:#k�C��Y^��"�8��#ؠuw�%ښ�=�eC��	�f��V���O�'�f��/��E�zb�R6HE��CY�nzO8j�G��j6���\����3gX}u����/dC�f�� F/`=��k���F�,;3�� �P<�����VY�����I�]Z=3|%d���9�����gs�����gu�p�,ݣ'�����34����8�5�aG��#'g)��Մ��?��K
!~�ñ         Z   x�3��*��L�J,J,I�40�70�7204�L�2�t�K���/H��K%�9RS��9}�J2�@�Fp�\.�l@j���P*F��� �38         \   x�3�(ʯLM.�Wp�4202�50"(�L�؀���	*n�Pb�kl�e�P�7F(� )1A(q��� �X�,2E(q����L����� ��'�     