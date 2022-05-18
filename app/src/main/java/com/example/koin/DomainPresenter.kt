package com.example.koin

class DomainPresenter(val repository: DomainRepository) {

    fun presentDomain():String = "${repository.createDomain()} from $this"
}