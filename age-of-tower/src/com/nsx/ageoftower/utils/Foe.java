package com.nsx.ageoftower.utils;

public class Foe {

	private int _life;
	private float _speed;
	private float _armor;
	private float _actualLife;
	
	public Foe(){}

	public Foe(int _life, float _speed, float _armor, float _actualLife) {
		this._life = _life;
		this._speed = _speed;
		this._armor = _armor;
		this._actualLife = _actualLife;
	}

	public int get_life() {
		return _life;
	}

	public void set_life(int _life) {
		this._life = _life;
	}

	public float get_speed() {
		return _speed;
	}

	public void set_speed(float _speed) {
		this._speed = _speed;
	}

	public float get_armor() {
		return _armor;
	}

	public void set_armor(float _armor) {
		this._armor = _armor;
	}

	public float get_actualLife() {
		return _actualLife;
	}

	public void set_actualLife(float _actualLife) {
		this._actualLife = _actualLife;
	}
	
	
	
	
}