//
//  claseDibujar.h
//  LSD
//
//  Created by juani on 12/29/11.
//  Copyright (c) 2011 pablofloresguridi@gmail.com. All rights reserved.
//

#import <UIKit/UIKit.h>

bool iPhone;
int wSize,hSize;

@interface claseDibujar : UIView

@property(nonatomic, readwrite) int cantidadSegmentos;
@property(nonatomic, readwrite) double* segmentos;
@property(nonatomic, readwrite) int cantidadEsquinas;
@property(nonatomic, readwrite) double** esquinas;
@property(nonatomic, readwrite) double** esquinasRep;
@property(nonatomic, readwrite) bool bandera;
@property(nonatomic, readwrite) int dealloc;

- (id)initWithFrame:(CGRect)frame;

-(void)drawRect:(CGRect)rect; //cantidadSeg:(int) cantidadSeg segmentos: (double*) segmentos;

@end
